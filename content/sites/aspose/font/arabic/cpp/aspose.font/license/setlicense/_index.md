---
title: "طريقة Aspose::Font::License::SetLicense"
linktitle: "SetLicense"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::License::SetLicense. تقوم بترخيص المكوّن في C++."
type: docs
weight: 400
url: /ar/cpp/aspose.font/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


يرخص المكوّن.

```cpp
void Aspose::Font::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | System::SharedPtr\<System::IO::Stream\> | دفق يحتوي على الترخيص. |
## ملاحظات



استخدم هذه الطريقة لتحميل الترخيص من دفق.

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## License::SetLicense(System::String) method


يرخص المكوّن.

```cpp
void Aspose::Font::License::SetLicense(System::String licenseName)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| licenseName | System::String | يمكن أن يكون اسم ملف كامل أو قصير<ms> أو اسم مورد مدمج</ms>. استخدم سلسلة فارغة للتبديل إلى وضع التقييم. |
## ملاحظات


يحاول العثور على الترخيص في المواقع التالية:

1. مسار صريح.

<ms>

2. المجلد الذي يحتوي على تجميع مكوّن **Aspose**.

3. المجلد الذي يحتوي على تجميع الاستدعاء الخاص بالعميل.

4. المجلد الذي يحتوي على تجميع الدخول (بدء التشغيل).

5. مورد مدمج في تجميع الاستدعاء الخاص بالعميل.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. مسار صريح.

2. مورد مدمج في تجميع الاستدعاء الخاص بالعميل.

</ms>

<java>

2. المجلد الذي يحتوي على ملف JAR لمكوّن **Aspose**.

3. المجلد الذي يحتوي على ملف JAR الخاص بالعميل.

</java>

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
