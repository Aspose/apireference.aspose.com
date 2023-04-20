---
title: Class BezierPathBuilder
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.ImageVectorization.BezierPathBuilder kelas. ItuSplinePathBuilder kelas bertanggung jawab untuk membangun segmen jalanSVGPathSeg dari daftar titik jejak. Pembuat jalur ini didasarkan pada penggunaan metode kuadrat terkecil untuk menemukan titik kontrol Bezier untuk jejak titik.
type: docs
weight: 2080
url: /id/net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

Itu[`SplinePathBuilder`](../splinepathbuilder/) kelas bertanggung jawab untuk membangun segmen jalan[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) dari daftar titik jejak. Pembuat jalur ini didasarkan pada penggunaan metode kuadrat terkecil untuk menemukan titik kontrol Bezier untuk jejak titik.

```csharp
public class BezierPathBuilder : IPathBuilder
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | Menginisialisasi instance baru dari`BezierPathBuilder` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | Mendapat atau menyetel ambang kesalahan. Parameter ini menentukan deviasi maksimum poin ke kurva yang dipasang. Secara default adalah 30. |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | Mendapat atau menyetel ambang kesalahan. Parameter ini menentukan jumlah iterasi untuk metode pendekatan kuadrat-terkecil. Secara default adalah 30. |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | Mendapatkan atau menyetel pelacakan dengan lebih lancar. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Membuat segmen jalur dari daftar titik pelacakan. |

### Lihat juga

* interface [IPathBuilder](../ipathbuilder/)
* ruang nama [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* perakitan [Aspose.SVG](../../)


