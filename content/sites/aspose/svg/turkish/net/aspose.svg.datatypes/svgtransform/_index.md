---
title: SVGTransform
second_title: Aspose.SVG for .NET API Referansı
description: SVGTransform bir SVGTransformList içindeki bileşen dönüşümlerinden birinin arabirimidir bu nedenle bir SVGTransform nesnesi bir dönüştürme öznitelik belirtimi içindeki tek bir bileşene örneğin ölçek veya matris karşılık gelir.
type: docs
weight: 320
url: /tr/net/aspose.svg.datatypes/svgtransform/
---
## SVGTransform class

SVGTransform, bir SVGTransformList içindeki bileşen dönüşümlerinden birinin arabirimidir; bu nedenle, bir SVGTransform nesnesi, bir 'dönüştürme' öznitelik belirtimi içindeki tek bir bileşene (örneğin, 'ölçek(…)' veya 'matris(…)') karşılık gelir.

```csharp
public class SVGTransform : SVGValueType
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Angle](../../aspose.svg.datatypes/svgtransform/angle) { get; } | SVG_TRANSFORM_ROTATE, SVG_TRANSFORM_SKEWX ve SVG_TRANSFORM_SKEWY için bir kolaylık özelliği. Belirtilen açıyı tutar. SVG_TRANSFORM_MATRIX, SVG_TRANSFORM_TRANSLATE ve SVG_TRANSFORM_SCALE için açı sıfır olacaktır. |
| [Matrix](../../aspose.svg.datatypes/svgtransform/matrix) { get; } | Bu dönüşümü temsil eden matris. Matris nesnesi canlıdır, yani SVGTransform nesnesinde yapılan herhangi bir değişiklik anında matris nesnesine yansıtılır ve bunun tersi de geçerlidir. Matris nesnesinin doğrudan değiştirilmesi durumunda (yani, SVGTransform arayüzündeki yöntemleri kullanmadan), SVGTransform'un türü SVG_TRANSFORM_MATRIX. olarak değişir SVG_TRANSFORM_MATRIX için, matris a, b, c, d, e, f'yi içerir. kullanıcı tarafından sağlanan değerler. SVG_TRANSFORM_TRANSLATE için e ve f çeviri miktarlarını temsil eder(a= 1, b= 0, c= 0 ve d = 1). SVG_TRANSFORM_SCALE için a ve d ölçek miktarlarını temsil eder(b= 0 , c= 0, e= 0 ve f = 0). SVG_TRANSFORM_SKEWX ve SVG_TRANSFORM_SKEWY için, a, b, c ve d verilen çarpıklıkla sonuçlanacak matrisi temsil eder(e= 0 ve f = 0). SVG_TRANSFORM_ROTATE için , a, b, c, d, e ve f birlikte verilen dönüşle sonuçlanacak matrisi temsil eder.Dönüş merkez noktası (0, 0) etrafında olduğunda, e ve f sıfır olacaktır. |
| [Type](../../aspose.svg.datatypes/svgtransform/type) { get; } | Bu arabirimde tanımlanan SVG_TRANSFORM_* sabitlerinden biri tarafından belirtilen değerin türü. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose)() | Yönetilmeyen ve isteğe bağlı olarak yönetilen kaynakları serbest bırakır. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Bu yöntem, ECMAScript nesnesini almak için kullanılırType . |
| [SetMatrix](../../aspose.svg.datatypes/svgtransform/setmatrix)(SVGMatrix) | Yeni dönüşümü tanımlayan parametre matrisi ile dönüştürme türünü SVG_TRANSFORM_MATRIX olarak ayarlar. Parametre matrisindeki değerler kopyalanır, matris parametresi SVGTransform::matrix. yerini almaz |
| [SetRotate](../../aspose.svg.datatypes/svgtransform/setrotate)(float, float, float) | Dönüştürme türünü SVG_TRANSFORM_ROTATE olarak ayarlar, parametre açısı dönüş açısını tanımlar ve cx ve cy parametreleri isteğe bağlı dönüş merkezini tanımlar. |
| [SetScale](../../aspose.svg.datatypes/svgtransform/setscale)(float, float) | Dönüştürme türünü SVG_TRANSFORM_SCALE olarak ayarlar, sx ve sy parametreleri ölçek miktarlarını tanımlar. |
| [SetSkewX](../../aspose.svg.datatypes/svgtransform/setskewx)(float) | Dönüştürme türünü SVG_TRANSFORM_SKEWX olarak ayarlar, parametre açısı eğriltme miktarını tanımlar. |
| [SetSkewY](../../aspose.svg.datatypes/svgtransform/setskewy)(float) | Dönüştürme türünü SVG_TRANSFORM_SKEWY olarak ayarlar, parametre açısı eğriltme miktarını tanımlar. |
| [SetTranslate](../../aspose.svg.datatypes/svgtransform/settranslate)(float, float) | Dönüştürme türünü SVG_TRANSFORM_TRANSLATE olarak ayarlar, tx ve ty parametreleri çeviri miktarlarını tanımlar. |
| override [ToString](../../aspose.svg.datatypes/svgtransform/tostring)() | Bir döndürürString bu, bu örneği temsil eder. |

## Alanlar

| İsim | Tanım |
| --- | --- |
| const [SVG_TRANSFORM_MATRIX](../../aspose.svg.datatypes/svgtransform/svg_transform_matrix) | Bir 'matris(…)' dönüşümü. |
| const [SVG_TRANSFORM_ROTATE](../../aspose.svg.datatypes/svgtransform/svg_transform_rotate) | Bir 'döndürme(…)' dönüşümü. |
| const [SVG_TRANSFORM_SCALE](../../aspose.svg.datatypes/svgtransform/svg_transform_scale) | Bir 'ölçek(…)' dönüşümü. |
| const [SVG_TRANSFORM_SKEWX](../../aspose.svg.datatypes/svgtransform/svg_transform_skewx) | Bir 'skewX(…)' dönüşümü. |
| const [SVG_TRANSFORM_SKEWY](../../aspose.svg.datatypes/svgtransform/svg_transform_skewy) | Bir 'skewY(…)' dönüşümü. |
| const [SVG_TRANSFORM_TRANSLATE](../../aspose.svg.datatypes/svgtransform/svg_transform_translate) | Bir 'çeviri(…)' dönüşümü. |
| const [SVG_TRANSFORM_UNKNOWN](../../aspose.svg.datatypes/svgtransform/svg_transform_unknown) | Birim türü, önceden tanımlanmış türlerden biri değil. Bu türde yeni bir değer tanımlamaya veya mevcut bir değeri bu türe değiştirmeye çalışmak geçersizdir. |

### Ayrıca bakınız

* class [SVGValueType](../svgvaluetype)
* ad alanı [Aspose.Svg.DataTypes](../../aspose.svg.datatypes)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
