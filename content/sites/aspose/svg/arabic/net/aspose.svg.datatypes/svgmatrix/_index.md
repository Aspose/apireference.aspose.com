---
title: Class SVGMatrix
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.DataTypes.SVGMatrix فصل. تستخدم العديد من عمليات رسومات SVG مصفوفات 2x3 بالشكل ace bdf والتي عند توسيعها إلى مصفوفة 3x3 لأغراض حساب المصفوفة  تصبح ace bdf 0 0 1
type: docs
weight: 240
url: /ar/net/aspose.svg.datatypes/svgmatrix/
---
## SVGMatrix class

تستخدم العديد من عمليات رسومات SVG مصفوفات 2x3 بالشكل: [ace] [bdf] والتي عند توسيعها إلى مصفوفة 3x3 لأغراض حساب المصفوفة ، تصبح: [ace] [bdf] [0 0 1]

```csharp
public class SVGMatrix : SVGValueType
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [A](../../aspose.svg.datatypes/svgmatrix/a/) { get; set; } | المكون "أ" في المصفوفة . |
| [B](../../aspose.svg.datatypes/svgmatrix/b/) { get; set; } | المكون B للمصفوفة . |
| [C](../../aspose.svg.datatypes/svgmatrix/c/) { get; set; } | المكون C للمصفوفة . |
| [D](../../aspose.svg.datatypes/svgmatrix/d/) { get; set; } | المكون D للمصفوفة . |
| [E](../../aspose.svg.datatypes/svgmatrix/e/) { get; set; } | المكون E للمصفوفة . |
| [F](../../aspose.svg.datatypes/svgmatrix/f/) { get; set; } | المكون F للمصفوفة . |

## طُرق

| اسم | وصف |
| --- | --- |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | الإصدارات غير المُدارة و- اختياريًا- الموارد المُدارة. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | تُستخدم هذه الطريقة لاسترداد كائن ECMAScriptType . |
| [Multiply](../../aspose.svg.datatypes/svgmatrix/multiply/)(SVGMatrix) | يقوم بضرب المصفوفة. يتم ضرب هذه المصفوفة لاحقًا بمصفوفة أخرى ، لإرجاع المصفوفة الجديدة الناتجة. |
| [Rotate](../../aspose.svg.datatypes/svgmatrix/rotate/)(float) | الضرب اللاحق لتحويل التدوير في المصفوفة الحالية وإرجاع المصفوفة الناتجة. |
| [Scale](../../aspose.svg.datatypes/svgmatrix/scale/)(float) | الضرب اللاحق لتحويل مقياس منتظم في المصفوفة الحالية وإرجاع المصفوفة الناتجة. |
| [ScaleNonUniform](../../aspose.svg.datatypes/svgmatrix/scalenonuniform/)(float, float) | الضرب اللاحق لتحويل المقياس غير المنتظم على المصفوفة الحالية وإرجاع المصفوفة الناتجة. |
| [SkewX](../../aspose.svg.datatypes/svgmatrix/skewx/)(float) | الضرب اللاحق لتحويل skewX على المصفوفة الحالية وإرجاع المصفوفة الناتجة. |
| [SkewY](../../aspose.svg.datatypes/svgmatrix/skewy/)(float) | يضاعف لاحقًا تحويلًا منحرفًا على المصفوفة الحالية ويعيد المصفوفة الناتجة. |
| override [ToString](../../aspose.svg.datatypes/svgmatrix/tostring/)() | إرجاع أString الذي يمثل هذا المثال. |
| [Translate](../../aspose.svg.datatypes/svgmatrix/translate/)(float, float) | الضرب اللاحق لتحويل الترجمة في المصفوفة الحالية وإرجاع المصفوفة الناتجة. |

### أنظر أيضا

* class [SVGValueType](../svgvaluetype/)
* مساحة الاسم [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* المجسم [Aspose.SVG](../../)


