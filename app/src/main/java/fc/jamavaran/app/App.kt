package fc.jamavaran.app

import android.app.Application
import com.google.firebase.messaging.FirebaseMessaging

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        // عضویت در تاپیک «all» برای دریافت اعلان‌های همگانی سایت
        try {
            FirebaseMessaging.getInstance().subscribeToTopic("all")
        } catch (_: Exception) {
            // فایربیس تنظیم نشده — اپ بدون پوش کار می‌کند
        }
    }
}