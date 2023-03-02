---
title: Interface IGeometryCollection
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Geometries.IGeometryCollection antarmuka. AIGeometryCollection adalahIGeometry itu adalah kumpulan dari satu atau lebih geometri.
type: docs
weight: 1010
url: /id/net/aspose.gis.geometries/igeometrycollection/
---
## IGeometryCollection interface

A`IGeometryCollection` adalah[`IGeometry`](../igeometry/) itu adalah kumpulan dari satu atau lebih geometri.

```csharp
public interface IGeometryCollection : IEnumerable<IGeometry>, IEquatable<IGeometryCollection>, 
    IGeometry
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Count](../../aspose.gis.geometries/igeometrycollection/count/) { get; } | Mendapat jumlah geometri dalam koleksi ini. |
| [Item](../../aspose.gis.geometries/igeometrycollection/item/) { get; } | Mendapat a[`IGeometry`](../igeometry/) pada indeks yang ditentukan. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [GetPointOnSurface](../../aspose.gis.geometries/igeometrycollection/getpointonsurface/)() | Menemukan titik yang dijamin berada di salah satu permukaan dalam koleksi ini. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/)() | Mendapat poligon yang direpresentasikan sebagai garis geometri ini. |
| [ToEditable](../../aspose.gis.geometries/igeometrycollection/toeditable/)() | Mendapatkan salinan geometri ini yang dapat diedit. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry)() | Mendapat versi non-kurva perkiraan atau ekuivalen dari geometri ini menggunakan default`toleransi` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry_1)(double) | Mendapatkan perkiraan atau versi non-kurva yang setara dari geometri ini menggunakan yang ditentukan`toleransi` . |

### Lihat juga

* interface [IGeometry](../igeometry/)
* ruang nama [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* perakitan [Aspose.GIS](../../)


