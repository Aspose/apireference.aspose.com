---
title: Class License
second_title: Aspose.OCR لمرجع .NET API
description: Aspose.OCR.License فصل. يوفر طرقًا لترخيص المكون.
type: docs
weight: 120
url: /ar/net/aspose.ocr/license/
---
## License class

يوفر طرقًا لترخيص المكون.

```csharp
public class License
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [License](license/)() | Default_Constructor |

## الخصائص

| اسم | وصف |
| --- | --- |
| [IsLicensed](../../aspose.ocr/license/islicensed/) { get; } | يحصل على قيمة تشير إلى ما إذا كان المنتج مرخصًا . |

## طُرق

| اسم | وصف |
| --- | --- |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense)(Stream) | تراخيص المكون . |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense_1)(string) | تراخيص المكون . |

### أمثلة

في هذا المثال ، سيتم إجراء محاولة للعثور على ملف ترخيص يسمى MyLicense.lic في المجلد الذي يحتوي على المكون ، في المجلد الذي يحتوي على التجميع الاستدعاء ، في مجلد تجميع الإدخال ثم في الموارد المضمنة للتجميع المتصل.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### أنظر أيضا

* مساحة الاسم [Aspose.OCR](../../aspose.ocr/)
* المجسم [Aspose.OCR](../../)


