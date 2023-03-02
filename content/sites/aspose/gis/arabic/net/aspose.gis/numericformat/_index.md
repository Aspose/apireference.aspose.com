---
title: Class NumericFormat
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.NumericFormat فصل. NumericFormat تُستخدم لتنسيق الأنواع الرقمية الشائعة في النص.
type: docs
weight: 1290
url: /ar/net/aspose.gis/numericformat/
---
## NumericFormat class

`NumericFormat` تُستخدم لتنسيق الأنواع الرقمية الشائعة في النص.

```csharp
public abstract class NumericFormat
```

## الخصائص

| اسم | وصف |
| --- | --- |
| static [RoundTrip](../../aspose.gis/numericformat/roundtrip/) { get; } | تحويل ومحاولة التأكد من أن القيمة الرقمية التي يتم تحويلها إلى سلسلة يتم تحليلها مرة أخرى إلى نفس القيمة الرقمية. |

## طُرق

| اسم | وصف |
| --- | --- |
| static [Flat](../../aspose.gis/numericformat/flat/)(int) | تحويل رقم إلى نص ذي نقطة ثابتة بدون تدوين علمي. |
| static [General](../../aspose.gis/numericformat/general/)(int) | تحويل رقم إلى رقم مضغوط بدرجة أكبر إما للنقطة الثابتة أو الترميز العلمي ، اعتمادًا على نوع الرقم وما إذا كان محدد الدقة موجودًا أم لا. يوصى باستخدامه. |

### ملاحظات

هناك ثلاثة أنواع من ملفات`NumericFormat` :  عام - نقطة ثابتة أو تدوين علمي. بعض الأرقام مهمة. RoundTrip - نقطة ثابتة أو تدوين علمي. الحد الأقصى من الأرقام كبير. تدوين ثابت - نقطة ثابتة. بعض الأرقام مهمة. أ`NumericFormat` يمكن ضبطها على[`IGeometry`](../../aspose.gis.geometries/igeometry/) عبر[`AsText`](../../aspose.gis.geometries/igeometry/astext/) لتحديد التنسيق الرقمي عند ترجمة الهندسة إلى تمثيلها للنص المعروف جيدًا (WKT).

### أنظر أيضا

* مساحة الاسم [Aspose.Gis](../../aspose.gis/)
* المجسم [Aspose.GIS](../../)


