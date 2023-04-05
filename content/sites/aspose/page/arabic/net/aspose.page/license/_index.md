---
title: Class License
second_title: Aspose.Page لمرجع NET API
description: Aspose.Page.License فصل. يوفر طرقًا لترخيص المكون.
type: docs
weight: 270
url: /ar/net/aspose.page/license/
---
## License class

يوفر طرقًا لترخيص المكون.

```csharp
public class License
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [License](license/)() | تهيئة مثيل جديد لهذه الفئة. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Embedded](../../aspose.page/license/embedded/) { get; set; } | تمت إضافة رقم الترخيص كمورد مضمن . |

## طُرق

| اسم | وصف |
| --- | --- |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense)(Stream) | تراخيص المكون . |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense_1)(string) | تراخيص المكون . |

### أمثلة

في هذا المثال ، سيتم إجراء محاولة للعثور على ملف ترخيص باسم MyLicense.lic في المجلد الذي يحتوي على  المكون ، في المجلد الذي يحتوي على التجميع الاستدعاء ، في مجلد تجميع الإدخال ثم في الموارد المضمنة لتجميع الاستدعاء.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

ملف جرة المكون:

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

### أنظر أيضا

* مساحة الاسم [Aspose.Page](../../aspose.page/)
* المجسم [Aspose.Page](../../)


