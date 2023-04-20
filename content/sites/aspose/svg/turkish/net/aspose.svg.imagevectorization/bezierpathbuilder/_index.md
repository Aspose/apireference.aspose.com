---
title: Class BezierPathBuilder
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.ImageVectorization.BezierPathBuilder sınıf. SplinePathBuilder sınıf yol segmentleri oluşturmaktan sorumludurSVGPathSeg izleme noktaları listesinden. Bu yol oluşturucu noktaların izlenmesi için Bezier kontrol noktalarını bulmak üzere en küçük kareler yöntemini kullanmaya dayalıdır.
type: docs
weight: 2080
url: /tr/net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

[`SplinePathBuilder`](../splinepathbuilder/) sınıf, yol segmentleri oluşturmaktan sorumludur[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) izleme noktaları listesinden. Bu yol oluşturucu, noktaların izlenmesi için Bezier kontrol noktalarını bulmak üzere en küçük kareler yöntemini kullanmaya dayalıdır.

```csharp
public class BezierPathBuilder : IPathBuilder
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | Yeni bir örneğini başlatır.`BezierPathBuilder` sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | Hata eşiğini alır veya ayarlar. Bu parametre, noktaların uygun eğriye göre maksimum sapmasını tanımlar. Varsayılan olarak 30. 'dir. |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | Hata eşiğini alır veya ayarlar. Bu parametre, en küçük kareler yaklaşımı yöntemi için yineleme sayısını tanımlar. Varsayılan olarak 30. 'dir. |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | İzi daha pürüzsüz hale getirir veya ayarlar. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | İzleme noktaları listesinden yol segmentleri oluşturur. |

### Ayrıca bakınız

* interface [IPathBuilder](../ipathbuilder/)
* ad alanı [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* toplantı [Aspose.SVG](../../)


