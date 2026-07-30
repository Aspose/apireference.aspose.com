---
title: "فئة TransformationMatrix"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "فئة Aspose.Font.TransformationMatrix. تمثل مصفوفة تحويل 3x3  A B 0   C D 0   TX TY 1 . تحول الإحداثيات بالطريقة التالية x1  Ax  Cy  TX y1  Bx  Dy  TY"
type: docs
weight: 810
url: /ar/net/aspose.font/transformationmatrix/
---
## TransformationMatrix class

يمثل مصفوفة تحويل 3x3 &#x7C; A B 0 &#x7C; &#x7C; C D 0 &#x7C; &#x7C; TX TY 1 &#x7C;. يحول الإحداثيات بالطريقة التالية: x1 = A*x + C*y + TX; y1 = B*x + D*y + TY.

```csharp
public class TransformationMatrix : ICloneable
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [TransformationMatrix](transformationmatrix/#constructor)() | ينشئ مصفوفة تحويل قياسية 1 إلى 1: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]. |
| [TransformationMatrix](transformationmatrix/#constructor_2)(double[]) | يقبل مصفوفة تحويل بالتمثيل الصفري التالي: [ A B C D TX TY ]. |
| [TransformationMatrix](transformationmatrix/#constructor_1)(double, double, double, double, double, double) | ينشئ مصفوفة تحويل [ A B C D TX TY ] |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [A](../../aspose.font/transformationmatrix/a/) { get; set; } | يحصل أو يضبط قيمة مصفوفة التحويل A. |
| [B](../../aspose.font/transformationmatrix/b/) { get; set; } | يحصل أو يضبط قيمة مصفوفة التحويل B. |
| [C](../../aspose.font/transformationmatrix/c/) { get; set; } | يحصل أو يضبط قيمة مصفوفة التحويل C. |
| [D](../../aspose.font/transformationmatrix/d/) { get; set; } | يحصل أو يعيّن قيمة مصفوفة التحويل D. |
| [Item](../../aspose.font/transformationmatrix/item/) { get; } | يوفر الوصول إلى المصفوفة الأساسية. |
| [TX](../../aspose.font/transformationmatrix/tx/) { get; set; } | يحصل أو يعيّن قيمة مصفوفة التحويل TX. |
| [TY](../../aspose.font/transformationmatrix/ty/) { get; set; } | يحصل أو يعيّن قيمة مصفوفة التحويل TY. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| [Multiply](../../aspose.font/transformationmatrix/multiply/)(TransformationMatrix) | يضرب مع مصفوفة تحويل أخرى. لا يغيّر مصفوفة التحويل الأصلية، ويعيد كائن TransformationMatrix جديد. |
| [Scale](../../aspose.font/transformationmatrix/scale/)(double, double, out double, out double) | يقوم بتكبير x و y باستخدام مصفوفة التحويل: x1 = A*x + C*y؛ y1 = B*x + D*y. |
| [ToArray](../../aspose.font/transformationmatrix/toarray/)() | يخصص مصفوفة جديدة، ينسخ مصفوفة التحويل ويعيدها. |
| [Transform](../../aspose.font/transformationmatrix/transform/)(double, double, out double, out double) | يحوّل x و y باستخدام مصفوفة التحويل: x1 = A*x + C*y + TX؛ y1 = B*x + D*y + TY. |
| [UnScale](../../aspose.font/transformationmatrix/unscale/)(double, double, out double, out double) | يعيد تكبير x1 و y1 ويعيد x و y قبل مصفوفة التحويل. |
| [UnTransform](../../aspose.font/transformationmatrix/untransform/)(double, double, out double, out double) | يعيد تحويل x1 و y1 ويعيد x و y قبل مصفوفة التحويل. |

### انظر أيضاً

* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


