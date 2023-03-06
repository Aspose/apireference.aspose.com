---
title: SpatialReferenceSystem.CreateProjected
second_title: Aspose.GIS untuk Referensi .NET API
description: SpatialReferenceSystem metode. Membuat proyeksi SRS dari parameter khusus.
type: docs
weight: 380
url: /id/net/aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/
---
## SpatialReferenceSystem.CreateProjected method

Membuat proyeksi SRS dari parameter khusus.

```csharp
public static ProjectedSpatialReferenceSystem CreateProjected(
    ProjectedSpatialReferenceSystemParameters parameters, Identifier identifier = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| parameters | ProjectedSpatialReferenceSystemParameters | Parameter untuk dibuat. |
| identifier | Identifier | Identifier, yang akan dilampirkan ke SRS. Melampirkan Pengenal tidak akan mengubah parameter SRS lainnya. Terserah Anda untuk memastikan konsistensi pengenal dan parameter SRS. |

### Nilai Pengembalian

Proyeksi SRS Baru.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| InvalidOperationException | Basis SRS dalam parameter adalah`null` . Metode proyeksi dalam parameter adalah`null` . |

### Lihat juga

* class [ProjectedSpatialReferenceSystem](../../projectedspatialreferencesystem/)
* class [ProjectedSpatialReferenceSystemParameters](../../projectedspatialreferencesystemparameters/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* ruang nama [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* perakitan [Aspose.GIS](../../../)


