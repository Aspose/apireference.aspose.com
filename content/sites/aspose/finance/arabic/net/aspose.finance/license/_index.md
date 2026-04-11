---
title: رخصة
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: يوفر طرقًا لترخيص المكوّن.
type: docs
weight: 10
url: /ar/net/aspose.finance/license/
---
## License class

يوفر طرقًا لترخيص المكوّن.

```csharp
public class License
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [License](license)() | يُنشئ مثيلاً جديدًا لهذه الفئة. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| [SetLicense](../../aspose.finance/license/setlicense#setlicense)(Stream) | يرخص المكوّن. |
| [SetLicense](../../aspose.finance/license/setlicense#setlicense_1)(string) | يرخص المكوّن. |

### أمثلة

في هذا المثال، سيتم محاولة العثور على ملف رخصة يُدعى MyLicense.lic في المجلد الذي يحتوي على المكوّن، وفي المجلد الذي يحتوي على التجميع المستدعي، وفي مجلد التجميع الرئيسي، ثم في الموارد المدمجة للتجميع المستدعي.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

ملف jar الخاص بالمكوّن:

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

### انظر أيضًا

* namespace [Aspose.Finance](../../aspose.finance)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
