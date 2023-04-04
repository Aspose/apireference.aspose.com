---
title: License.SetLicense
second_title: Aspose.Page لمرجع NET API
description: License طريقة. تراخيص المكون .
type: docs
weight: 30
url: /ar/net/aspose.page/license/setlicense/
---
## SetLicense(string) {#setlicense_1}

تراخيص المكون .

```csharp
public void SetLicense(string licenseName)
```

### ملاحظات

يحاول العثور على الترخيص في المواقع التالية:

1. مسار صريح.

2. مجلد تجميع المكون.

3. مجلد استدعاء العميل.

4. مجلد دخول التجمع.

5. مورد مضمن في تجميع استدعاء العميل.

**ملحوظة:**في .NET Compact Framework ، يحاول العثور على الترخيص في هذه المواقع فقط:

1. مسار صريح.

2. مورد مضمن في تجميع استدعاء العميل.

2. مجلد ملف جرة المكون.

### أمثلة

في هذا المثال ، سيتم إجراء محاولة للعثور على ملف ترخيص باسم MyLicense.lic في المجلد الذي يحتوي على  المكون ، في المجلد الذي يحتوي على التجميع الاستدعاء ، في مجلد تجميع الإدخال ثم في الموارد المضمنة لتجميع الاستدعاء.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As License = New License
license.SetLicense("MyLicense.lic")
```

ملف جرة المكون:

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

يمكن أن يكون اسم ملف كامل أو قصير أو اسم مورد مضمن. استخدم سلسلة فارغة للتبديل إلى وضع التقييم.

### أنظر أيضا

* class [License](../)
* مساحة الاسم [Aspose.Page](../../license/)
* المجسم [Aspose.Page](../../../)

---

## SetLicense(Stream) {#setlicense}

تراخيص المكون .

```csharp
public void SetLicense(Stream stream)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| stream | Stream | دفق يحتوي على الترخيص. |

### ملاحظات

استخدم هذه الطريقة لتحميل ترخيص من دفق.

### أمثلة

```csharp
[C#]

License license = new License();
license.SetLicense(myStream);


[Visual Basic]

Dim license as License = new License
license.SetLicense(myStream)

License license = new License();
license.setLicense(myStream);
```

### أنظر أيضا

* class [License](../)
* مساحة الاسم [Aspose.Page](../../license/)
* المجسم [Aspose.Page](../../../)


