---
title: SetLicense
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: يرخص المكوّن.
type: docs
weight: 20
url: /ar/net/aspose.finance/license/setlicense/
---
## SetLicense(string) {#setlicense_1}

يرخص المكوّن.

```csharp
public void SetLicense(string licenseName)
```

### ملاحظات

يحاول العثور على الترخيص في المواقع التالية:

1. مسار صريح.

2. المجلد الذي يحتوي على تجميع مكوّن Aspose.

3. المجلد الذي يحتوي على تجميع استدعاء العميل.

4. المجلد الذي يحتوي على تجميع الدخول (بدء التشغيل).

5. مورد مدمج في تجميع استدعاء العميل.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. مسار صريح.

2. مورد مدمج في تجميع استدعاء العميل.

2. دليل العمل الحالي لتطبيق جافا.

3. المجلد الذي يحتوي على ملف JAR لمكوّن Aspose.

4. المجلد الذي يحتوي على ملف JAR لاستدعاء العميل.

### أمثلة

في هذا المثال، سيتم محاولة العثور على ملف رخصة يُدعى MyLicense.lic في المجلد الذي يحتوي على المكوّن، وفي المجلد الذي يحتوي على التجميع المستدعي، وفي مجلد التجميع الرئيسي، ثم في الموارد المدمجة للتجميع المستدعي.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As License = New License
license.SetLicense("MyLicense.lic")
```

ملف jar الخاص بالمكوّن:

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

يمكن أن يكون اسم ملف كامل أو مختصر أو اسم مورد مدمج. استخدم سلسلة فارغة للتبديل إلى وضع التقييم.

### انظر أيضًا

* class [License](../../license)
* namespace [Aspose.Finance](../../license)
* assembly [Aspose.Finance](../../../)

---

## SetLicense(Stream) {#setlicense}

يرخص المكوّن.

```csharp
public void SetLicense(Stream stream)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| تيار | تيار | تيار يحتوي على الترخيص. |

### ملاحظات

استخدم هذه الطريقة لتحميل الترخيص من تيار.

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

### انظر أيضًا

* class [License](../../license)
* namespace [Aspose.Finance](../../license)
* assembly [Aspose.Finance](../../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
