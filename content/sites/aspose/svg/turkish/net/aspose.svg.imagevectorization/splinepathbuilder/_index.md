---
title: Class SplinePathBuilder
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.ImageVectorization.SplinePathBuilder sınıf. SplinePathBuilder sınıf yol segmentleri oluşturmaktan sorumludurSVGPathSeg izleme noktaları listesinden. Bu yol oluşturucu bir CatmullRoma eğri çizgisini bir dizi düzleştirilmiş ve azaltılmış yol noktasına uygulamaya dayalıdır..
type: docs
weight: 2160
url: /tr/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

`SplinePathBuilder` sınıf, yol segmentleri oluşturmaktan sorumludur[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) izleme noktaları listesinden. Bu yol oluşturucu, bir Catmull-Roma eğri çizgisini bir dizi düzleştirilmiş ve azaltılmış yol noktasına uygulamaya dayalıdır..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | Yeni bir örneğini başlatır.`SplinePathBuilder` sınıf. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | Yeni bir örneğini başlatır.`SplinePathBuilder` sınıf. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | Yeni bir örneğini başlatır.`SplinePathBuilder` sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | Gerilimlerin değeri, (interpolasyonlu) kontrol noktalarında eğrinin ne kadar keskin büküldüğünü etkiler. 0 ila 1 aralığında olmalıdır. Daha yüksek veya daha düşük değerler, bu aralığın minimum ve maksimum değerleri ile hizalanacaktır, buna göre. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | İzleme basitleştiricisini alır veya ayarlar. |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | İzi daha pürüzsüz hale getirir veya ayarlar. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | İzleme noktaları listesinden yol segmentleri oluşturur. |

### Ayrıca bakınız

* interface [IPathBuilder](../ipathbuilder/)
* ad alanı [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* toplantı [Aspose.SVG](../../)


