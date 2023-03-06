---
title: Class FeaturesSequence
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.FeaturesSequence فصل. FeaturesSequence يمثل مجموعة من الميزات المتجهة.
type: docs
weight: 170
url: /ar/net/aspose.gis/featuressequence/
---
## FeaturesSequence class

`FeaturesSequence` يمثل مجموعة من الميزات المتجهة.

```csharp
public abstract class FeaturesSequence : IEnumerable<Feature>
```

## الخصائص

| اسم | وصف |
| --- | --- |
| abstract [Attributes](../../aspose.gis/featuressequence/attributes/) { get; } | يحصل على مجموعة السمات المخصصة للميزات الموجودة في هذا[`VectorLayer`](../vectorlayer/) . |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | يحصل على نظام الإسناد المكاني لتسلسل الميزات هذا. |

## طُرق

| اسم | وصف |
| --- | --- |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | إرجاع عداد يتكرر خلال المجموعة. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | يحصل على المدى المكاني لهذه الطبقة. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto)(AbstractPath, FileDriver) | يحفظ تسلسل المعالم إلى طبقة. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_2)(string, FileDriver) | يحفظ تسلسل المعالم إلى طبقة. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_1)(AbstractPath, FileDriver, SavingOptions) | يحفظ تسلسل المعالم إلى طبقة. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_3)(string, FileDriver, SavingOptions) | يحفظ تسلسل المعالم إلى طبقة. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | تقسيم الميزات حسب النوع الهندسي. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | يختار المعالم ذات قيمة السمة التي تساوي القيمة المقدمة. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | يختار المعالم ذات قيمة السمة أكبر من القيمة المقدمة. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | يختار المعالم ذات قيمة السمة أكبر من أو تساوي القيمة المقدمة. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects)(Extent) | ترشيح الميزات على أساس المدى. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_1)(FeaturesSequence) | ترشيح المعالم بناءً على اتحاد كل الأشكال الهندسية في تسلسل المعالم الأخرى. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_2)(IGeometry) | ترشيح الميزات بناءً على الهندسة المتوفرة. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | يختار المعالم ذات قيمة السمة التي لا تساوي القيمة المقدمة. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | يختار المعالم ذات السمة لا تساوي قيمة خالية. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | يختار الميزات ذات السمة التي تساوي قيمة خالية. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | يختار الميزات مع مجموعة السمات. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | يختار المعالم ذات قيمة السمة أصغر من القيمة المقدمة. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | يختار المعالم ذات قيمة السمة الأصغر أو المساوية للقيمة المقدمة. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | يختار الميزات حيث لم يتم تعيين السمة المحددة. |

### أنظر أيضا

* class [Feature](../feature/)
* مساحة الاسم [Aspose.Gis](../../aspose.gis/)
* المجسم [Aspose.GIS](../../)


