---
title: Extent.GetTransformed
second_title: Aspose.GIS untuk Referensi .NET API
description: Extent metode. Mengembalikan tingkat baru yang ditentukanSpatialReferenceSystem yang berisi sejauh ini.
type: docs
weight: 150
url: /id/net/aspose.gis/extent/gettransformed/
---
## Extent.GetTransformed method

Mengembalikan tingkat baru yang ditentukan[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) yang berisi sejauh ini.

```csharp
public Extent GetTransformed(SpatialReferenceSystem targetSrs)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) untuk mengubah ke. |

### Nilai Pengembalian

Hasil transformasi sejauh ini ke SRS yang ditentukan.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null` . |
| NotSupportedException | Transformasi ke SRS yang disediakan tidak didukung. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Transformasi gagal. |
| InvalidOperationException | [`SpatialReferenceSystem`](../spatialreferencesystem/) sejauh ini adalah`null` . |

### Lihat juga

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Extent](../)
* ruang nama [Aspose.Gis](../../extent/)
* perakitan [Aspose.GIS](../../../)


