---
title: Class SplinePathBuilder
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.ImageVectorization.SplinePathBuilder kelas. ItuSplinePathBuilder kelas bertanggung jawab untuk membangun segmen jalanSVGPathSeg dari daftar titik jejak. Pembangun jalur ini didasarkan pada penerapan spline CatmullRoma ke serangkaian titik jalur yang diperhalus dan dikurangi..
type: docs
weight: 2160
url: /id/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

Itu`SplinePathBuilder` kelas bertanggung jawab untuk membangun segmen jalan[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) dari daftar titik jejak. Pembangun jalur ini didasarkan pada penerapan spline Catmull-Roma ke serangkaian titik jalur yang diperhalus dan dikurangi..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | Menginisialisasi instance baru dari`SplinePathBuilder` kelas. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | Menginisialisasi instance baru dari`SplinePathBuilder` kelas. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | Menginisialisasi instance baru dari`SplinePathBuilder` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | Nilai ketegangan mempengaruhi seberapa tajam kurva melengkung pada titik kontrol (interpolasi). Itu harus dalam kisaran dari 0 hingga 1. Setiap nilai yang lebih tinggi atau lebih rendah akan disejajarkan dengan nilai minimum dan maksimum dari kisaran ini, sesuai. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | Mendapatkan atau menyetel penyederhanaan pelacakan. |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | Mendapatkan atau menyetel pelacakan dengan lebih lancar. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Membuat segmen jalur dari daftar titik pelacakan. |

### Lihat juga

* interface [IPathBuilder](../ipathbuilder/)
* ruang nama [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* perakitan [Aspose.SVG](../../)


