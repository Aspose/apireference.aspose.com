---
title: "طريقة Aspose::Page::License::SetLicense"
linktitle: "SetLicense"
second_title: "Aspose.Page لـ C++"
description: "طريقة Aspose::Page::License::SetLicense. تُرخص المكوّن في C++."
type: docs
weight: 400
url: /ar/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


يرخص المكوّن.

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| دفق | System::SharedPtr\<System::IO::Stream\> | دفق يحتوي على الترخيص. |
## ملاحظات



استخدم هذه الطريقة لتحميل الترخيص من تدفق.

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


يرخص المكوّن.

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## ملاحظات


يحاول العثور على الترخيص في المواقع التالية:

1. مسار صريح.

<ms>

2. مجلد تجميع المكوّن.

3. مجلد تجميع الاستدعاء الخاص بالعميل.

4. مجلد تجميع الدخول.

5. مورد مدمج في تجميع الاستدعاء الخاص بالعميل.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. مسار صريح.

2. مورد مدمج في تجميع الاستدعاء الخاص بالعميل.

</ms>

<java>

2. مجلد ملف jar الخاص بالمكوّن.

</java>
## انظر أيضًا

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
