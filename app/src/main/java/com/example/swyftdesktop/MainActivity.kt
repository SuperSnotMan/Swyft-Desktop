package com.example.swyftdesktop

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Simple model: represents one app on the device
    data class AppInfo(
        val name: String,
        val packageName: String
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Build UI
        val layout = createMainLayout()

        // Load apps and render them
        val apps = getLaunchableApps()
        renderApps(layout, apps)

        setContentView(layout)
    }

    // ---------------- UI SETUP ----------------

    private fun createMainLayout(): LinearLayout {
        return LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
        }
    }

    private fun renderApps(layout: LinearLayout, apps: List<AppInfo>) {
        apps.forEach { app ->
            layout.addView(createAppButton(app))
        }
    }

    private fun createAppButton(app: AppInfo): Button {
        return Button(this).apply {
            text = app.name

            setOnClickListener {
                launchApp(app.packageName)
            }
        }
    }

    // ---------------- APP LOGIC ----------------

    private fun getLaunchableApps(): List<AppInfo> {
        val intent = Intent(Intent.ACTION_MAIN, null).apply {
            addCategory(Intent.CATEGORY_LAUNCHER)
        }

        val resolveInfo = packageManager.queryIntentActivities(intent, 0)

        return resolveInfo.map {
            AppInfo(
                name = it.loadLabel(packageManager).toString(),
                packageName = it.activityInfo.packageName
            )
        }
    }

    private fun launchApp(packageName: String) {
        val intent = packageManager.getLaunchIntentForPackage(packageName)

        if (intent == null) {
            Toast.makeText(this, "Can't launch $packageName", Toast.LENGTH_SHORT).show()
            return
        }

        startActivity(intent)
    }
}