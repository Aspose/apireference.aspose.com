---
title: Metered
second_title: Aspose.Drawing لمرجع NET API
description: يوفر طرقًا لتعيين المفتاح المقنن .
type: docs
weight: 20
url: /ar/net/aspose.drawing/metered/
---
## Metered class

يوفر طرقًا لتعيين المفتاح المقنن .

```csharp
public sealed class Metered : IDisposable
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Metered](metered)() | يقوم بتهيئة مثيل جديد لملف[`Metered`](../metered) فئة . |

## طُرق

| اسم | وصف |
| --- | --- |
| [Dispose](../../aspose.drawing/metered/dispose)() | تنفيذ مهام محددة بواسطة التطبيق مرتبطة بتحرير الموارد غير المُدارة أو تحريرها أو إعادة تعيينها. |
| [SetMeteredKey](../../aspose.drawing/metered/setmeteredkey)(string, string) | مجموعات المفاتيح العامة والخاصة التي تم قياسها |
| static [GetConsumptionCredit](../../aspose.drawing/metered/getconsumptioncredit)() | يحصل على ائتمان الاستهلاك. |
| static [GetConsumptionQuantity](../../aspose.drawing/metered/getconsumptionquantity)() | الحصول على حجم ملف الاستهلاك. |

### أمثلة

في هذا المثال ، ستُبذل محاولة لتعيين المفتاح العام والخاص المحسوب

```csharp
[C#]

Metered matered = new Metered();
matered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Dim matered As Metered = New Metered
matered.SetMeteredKey("PublicKey", "PrivateKey")
```

ملف جرة المكون:

```csharp
Metered matered = new Metered();
matered.setMeteredKey("PublicKey", "PrivateKey");
```

### أنظر أيضا

* مساحة الاسم [Aspose.Drawing](../../aspose.drawing)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
