---
title: "الفئة Metered"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "فئة Aspose.Font.Metered. توفر طرقًا لتعيين المفتاح المتدرج"
type: docs
weight: 540
url: /ar/net/aspose.font/metered/
---
## Metered class

يوفر طرقًا لتعيين المفتاح المقيس.

```csharp
public class Metered
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [Metered](metered/)() | يُهيئ نسخة جديدة من هذه الفئة. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| [SetMeteredKey](../../aspose.font/metered/setmeteredkey/)(string, string) | يضبط المفتاح العام والخاص المتدرج |
| static [GetConsumptionCredit](../../aspose.font/metered/getconsumptioncredit/)() | يحصل على رصيد الاستهلاك |
| static [GetConsumptionQuantity](../../aspose.font/metered/getconsumptionquantity/)() | يحصل على حجم ملف الاستهلاك |

## أمثلة

في هذا المثال، سيتم محاولة ضبط المفتاح العام والخاص المتدرج

```csharp
[C#]

Metered matered = new Metered();
matered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Dim matered As Metered = New Metered
matered.SetMeteredKey("PublicKey", "PrivateKey")
```

ملف jar المكوّن:

```csharp
Metered matered = new Metered();
matered.setMeteredKey("PublicKey", "PrivateKey");
```

### انظر أيضاً

* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


