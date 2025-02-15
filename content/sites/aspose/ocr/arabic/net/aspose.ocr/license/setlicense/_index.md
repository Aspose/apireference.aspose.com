---
title: License.SetLicense
second_title: Aspose.OCR لمرجع .NET API
description: License طريقة. تراخيص المكون .
type: docs
weight: 30
url: /ar/net/aspose.ocr/license/setlicense/
---
## SetLicense(string) {#setlicense_1}

تراخيص المكون .

```csharp
public void SetLicense(string licenseName)
```

### ملاحظات

يحاول العثور على الترخيص في المواقع التالية:

1. مسار صريح.

2. المجلد الذي يحتوي على تجميع مكون Aspose.

3. المجلد الذي يحتوي على تجميع استدعاء العميل.

4. المجلد الذي يحتوي على دخول (بدء التشغيل) التجمع.

5. مورد مضمن في تجميع استدعاء العميل.

**ملحوظة:**في .NET Compact Framework ، يحاول العثور على الترخيص في هذه المواقع فقط:

1. مسار صريح.

2. مورد مضمن في تجميع استدعاء العميل.

### أمثلة

في هذا المثال ، سيتم إجراء محاولة للعثور على ملف ترخيص يسمى MyLicense.lic في المجلد الذي يحتوي على المكون ، في المجلد الذي يحتوي على التجميع الاستدعاء ، في مجلد تجميع الإدخال ثم في الموارد المضمنة للتجميع المتصل.يمكن أن يكون اسم ملف كامل أو قصير أو اسم مورد مضمن. استخدم سلسلة فارغة للتبديل إلى وضع التقييم.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### أنظر أيضا

* class [License](../)
* مساحة الاسم [Aspose.OCR](../../license/)
* المجسم [Aspose.OCR](../../../)

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
```

### أنظر أيضا

* class [License](../)
* مساحة الاسم [Aspose.OCR](../../license/)
* المجسم [Aspose.OCR](../../../)


