---
title: LineString.Item
second_title: Aspose.GIS untuk Referensi .NET API
description: LineString Properti. Mendapat atau menyetelIPoint pada indeks yang ditentukan.
type: docs
weight: 80
url: /id/net/aspose.gis.geometries/linestring/item/
---
## LineString indexer

Mendapat atau menyetel[`IPoint`](../../ipoint/) pada indeks yang ditentukan.

```csharp
public IPoint this[int index] { get; set; }
```

| Parameter | Keterangan |
| --- | --- |
| index | Indeks. |

### Nilai properti

Itu[`IPoint`](../../ipoint/) .

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | Indeks berada di luar jangkauan. |
| ArgumentNullException | Nilainya adalah`null`. |
| ArgumentException | Titik kosong. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometri ini dan[`SpatialReferenceSystem`](../spatialreferencesystem/) argumen keduanya tidak`null` dan tidak sama satu sama lain. |

### Lihat juga

* interface [IPoint](../../ipoint/)
* class [LineString](../)
* ruang nama [Aspose.Gis.Geometries](../../linestring/)
* perakitan [Aspose.GIS](../../../)


