# اپلیکیشن اندروید — ساخته‌شده با افزونه اپ‌ساز پرو

## روش ۱: بیلد رایگان با GitHub Actions (بدون نصب هیچ‌چیز)
1. این فایل‌ها را (محتویات پوشه، نه ZIP) در یک ریپازیتوری GitHub آپلود کنید.
2. تب Actions → بیلد خودکار اجرا می‌شود → از قسمت Artifacts فایل APK را دانلود کنید.

## روش ۲: بیلد با Android Studio
1. Android Studio را نصب و این پوشه را Open کنید.
2. Build → Build Bundle(s)/APK(s) → Build APK(s)

## امضای نسخه انتشار (برای استور)

    keytool -genkey -v -keystore keystore.jks -keyalg RSA -keysize 2048 -validity 10000 -alias upload

سپس در Android Studio: Build → Generate Signed Bundle/APK → Android App Bundle (AAB)

## پوش نوتیفیکیشن (اختیاری)
1. در کنسول فایربیس یک پروژه بسازید و اپ اندروید با همین Package Name اضافه کنید.
2. فایل google-services.json را داخل پوشه app/ بگذارید — همان لحظه پوش فعال می‌شود.

## نکات انتشار در استورها
- Package Name و Keystore را همیشه حفظ کنید.
- با هر انتشار، versionCode را +۱ کنید و نسخه جدید سورس را از افزونه بگیرید.
- Google Play: حساب توسعه‌دهنده ۲۵ دلاری + فایل AAB + سیاست حریم خصوصی + اسکرین‌شات.
- کافه‌بازار / مایکت: ثبت‌نام فروشنده و ارسال فایل APK/AAB + توضیحات فارسی.