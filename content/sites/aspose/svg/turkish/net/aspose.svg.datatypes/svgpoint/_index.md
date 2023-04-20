---
title: Class SVGPoint
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.DataTypes.SVGPoint sınıf. SVG DOM arabirimlerinin çoğu SVGPoint sınıfındaki nesnelere atıfta bulunur. Bir SVGPoint bir x y koordinat çiftidir. Matris işlemlerinde kullanıldığında bir SVGPoint şu biçimde bir vektör olarak ele alınır x y 1 bir istisnanın atılmasına neden olur.
type: docs
weight: 270
url: /tr/net/aspose.svg.datatypes/svgpoint/
---
## SVGPoint class

SVG DOM arabirimlerinin çoğu, SVGPoint sınıfındaki nesnelere atıfta bulunur. Bir SVGPoint, bir (x, y) koordinat çiftidir. Matris işlemlerinde kullanıldığında, bir SVGPoint şu biçimde bir vektör olarak ele alınır: [x] [y] [1] bir istisnanın atılmasına neden olur.

```csharp
public class SVGPoint : SVGValueType
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [X](../../aspose.svg.datatypes/svgpoint/x/) { get; set; } | X koordinatı. |
| [Y](../../aspose.svg.datatypes/svgpoint/y/) { get; set; } | Y koordinatı. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Yönetilmeyen ve - isteğe bağlı olarak - yönetilen kaynakları serbest bırakır. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Bu yöntem ECMAScript nesnesini almak için kullanılır.Type . |
| [MatrixTransform](../../aspose.svg.datatypes/svgpoint/matrixtransform/)(SVGMatrix) | Bu SVGPoint nesnesine 2x3 matris dönüşümü uygular ve yeni, dönüştürülmüş bir SVGPoint nesnesi döndürür: newpoint = matrix* thispoint |
| override [ToString](../../aspose.svg.datatypes/svgpoint/tostring/)() | a döndürürString bu örneği temsil eder. |

### Ayrıca bakınız

* class [SVGValueType](../svgvaluetype/)
* ad alanı [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* toplantı [Aspose.SVG](../../)


