---
title: Class SimpleLabeling
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.Rendering.Labelings.SimpleLabeling فصل. وضع علامة بسيطة تسمية على كل ميزة.
type: docs
weight: 1700
url: /ar/net/aspose.gis.rendering.labelings/simplelabeling/
---
## SimpleLabeling class

وضع علامة بسيطة تسمية على كل ميزة.

```csharp
public class SimpleLabeling : Labeling
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [SimpleLabeling](simplelabeling/#constructor)() | يقوم بتهيئة مثيل جديد لملف`SimpleLabeling` فئة . |
| [SimpleLabeling](simplelabeling/#constructor_1)(SimpleLabeling) | يقوم بتهيئة مثيل جديد لملف`SimpleLabeling` فئة . |
| [SimpleLabeling](simplelabeling/#constructor_2)(string) | يقوم بتهيئة مثيل جديد لملف`SimpleLabeling` فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [FeatureBasedConfiguration](../../aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/) { get; set; } | رد اتصال يتم استخدامه لتكوين هذه التسمية قبل التعامل مع ميزة. |
| [FontColor](../../aspose.gis.rendering.labelings/simplelabeling/fontcolor/) { get; set; } | يحدد لون النص. |
| [FontFamily](../../aspose.gis.rendering.labelings/simplelabeling/fontfamily/) { get; set; } | مجموعة الخطوط التي سيتم استخدامها لعرض النص. القيمة الافتراضية هي القيمة المعتمدة على النظام. |
| [FontSize](../../aspose.gis.rendering.labelings/simplelabeling/fontsize/) { get; set; } | حجم النص. |
| [FontStyle](../../aspose.gis.rendering.labelings/simplelabeling/fontstyle/) { get; set; } | النمط المراد تطبيقه على النص . |
| [GeometryExpression](../../aspose.gis.rendering.labelings/simplelabeling/geometryexpression/) { get; set; } | يوفر طريقة لاستبدال هندسة الميزة بأخرى تم تعديلها من أجل وضع العلامات. يتم استدعاء رد الاتصال هذا في البداية بعد[`FeatureBasedConfiguration`](./featurebasedconfiguration/) . الافتراضي هو`null` (استخدم هندسة الميزة كما هي) . |
| [HaloColor](../../aspose.gis.rendering.labelings/simplelabeling/halocolor/) { get; set; } | لون الهالة (السكتة الدماغية) حول النص. |
| [HaloSize](../../aspose.gis.rendering.labelings/simplelabeling/halosize/) { get; set; } | حجم الهالة (السكتة الدماغية) حول النص. |
| [LabelAttribute](../../aspose.gis.rendering.labelings/simplelabeling/labelattribute/) { get; set; } | اسم السمة المراد استخدامه كمصدر للتسميات. إذا تجاهلتها[`LabelExpression`](./labelexpression/) تم تعيينه. إما[`LabelAttribute`](./labelattribute/) أو[`LabelExpression`](./labelexpression/) يجب تعيينها قبل التقديم ؛ InvalidOperationException يتم طرحها بخلاف ذلك. |
| [LabelExpression](../../aspose.gis.rendering.labelings/simplelabeling/labelexpression/) { get; set; } | يوفر طريقة لتخصيص نص التسمية وتنسيقه. في حالة الضبط ، يتم تجاوز[`LabelAttribute`](./labelattribute/) . إما[`LabelAttribute`](./labelattribute/) أو[`LabelExpression`](./labelexpression/) يجب تعيينها قبل التقديم ؛ InvalidOperationException يتم طرحها بخلاف ذلك. |
| [MultipartMode](../../aspose.gis.rendering.labelings/simplelabeling/multipartmode/) { get; set; } | تحديد سلوك العرض لأشكال هندسية متعددة الأجزاء. الافتراضي هوAll . |
| [Placement](../../aspose.gis.rendering.labelings/simplelabeling/placement/) { get; set; } | يحدد وضع الملصق كيفية وضع الملصقات نسبيًا في الأشكال الهندسية للميزة. |
| [Priority](../../aspose.gis.rendering.labelings/simplelabeling/priority/) { get; set; } | يشير إلى أولوية هذا التصنيف في حالة تداخله مع تسمية أخرى. لا يتم عرض التسمية ذات الأولوية الأقل . القيمة الافتراضية هي 1000. |

## طُرق

| اسم | وصف |
| --- | --- |
| [Clone](../../aspose.gis.rendering.labelings/simplelabeling/clone/)() | استنساخ هذا المثال . |

### أنظر أيضا

* class [Labeling](../labeling/)
* مساحة الاسم [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* المجسم [Aspose.GIS](../../)


