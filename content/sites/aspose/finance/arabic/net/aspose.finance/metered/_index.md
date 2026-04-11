---
title: مقاس
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: يوفر طرقًا لتعيين المفتاح القائم على القياس.
type: docs
weight: 20
url: /ar/net/aspose.finance/metered/
---
## Metered class

يوفر طرقًا لتعيين المفتاح القائم على القياس.

```csharp
public class Metered
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [Metered](metered)() | يُنشئ مثيلاً جديدًا لهذه الفئة. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| [SetMeteredKey](../../aspose.finance/metered/setmeteredkey)(string, string) | يضبط المفتاح العام والخاص المقاس |
| static [GetConsumptionCredit](../../aspose.finance/metered/getconsumptioncredit)() | يحصل على رصيد الاستهلاك |
| static [GetConsumptionQuantity](../../aspose.finance/metered/getconsumptionquantity)() | يحصل على حجم ملف الاستهلاك |

### أمثلة

في هذا المثال، سيتم محاولة ضبط المفتاح العام والخاص المقاس

```csharp
[C#]

Metered matered = new Metered();
matered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Dim matered As Metered = New Metered
matered.SetMeteredKey("PublicKey", "PrivateKey")
```

ملف jar الخاص بالمكوّن:

```csharp
Metered matered = new Metered();
matered.setMeteredKey("PublicKey", "PrivateKey");
```

### انظر أيضًا

* namespace [Aspose.Finance](../../aspose.finance)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
