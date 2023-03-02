---
title: SpatialReferenceSystem.CreateCompound
second_title: Aspose.GIS untuk Referensi .NET API
description: SpatialReferenceSystem metode. Buat gabungan SRS.
type: docs
weight: 340
url: /id/net/aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/
---
## SpatialReferenceSystem.CreateCompound method

Buat gabungan SRS.

```csharp
public static CompoundSpatialReferenceSystem CreateCompound(string name, 
    SpatialReferenceSystem head, SpatialReferenceSystem tail, Identifier identifier = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| name | String | Nama SRS baru. |
| head | SpatialReferenceSystem | Kepala SRS dari SRS baru. |
| tail | SpatialReferenceSystem | Ekor SRS dari SRS baru. |
| identifier | Identifier | Identifier, yang akan dilampirkan ke SRS. Melampirkan Pengenal tidak akan mengubah parameter SRS lainnya. Terserah Anda untuk memastikan konsistensi pengenal dan parameter SRS. |

### Nilai Pengembalian

SRS Senyawa Baru.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen apapun kecuali*identifier* adalah`null` . |
| InvalidOperationException | *head* atau*tail* adalah senyawa SRS sendiri. |

### Lihat juga

* class [CompoundSpatialReferenceSystem](../../compoundspatialreferencesystem/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* ruang nama [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* perakitan [Aspose.GIS](../../../)


