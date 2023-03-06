---
title: SpatialReferenceSystem.CreateLocal
second_title: Aspose.GIS untuk Referensi .NET API
description: SpatialReferenceSystem metode. Buat SRS. lokal
type: docs
weight: 370
url: /id/net/aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/
---
## SpatialReferenceSystem.CreateLocal method

Buat SRS. lokal

```csharp
public static LocalSpatialReferenceSystem CreateLocal(string name, LocalDatum datum, Unit unit, 
    ICollection<Axis> axises, Identifier identifier = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| name | String | Nama SRS. |
| datum | LocalDatum | Datum yang akan digunakan dalam SRS. |
| unit | Unit | Unit yang akan digunakan dalam SRS. |
| axises | ICollection`1 | Sumbu yang akan digunakan dalam SRS. Harus tidak kosong |
| identifier | Identifier | Identifier, yang akan dilampirkan ke SRS. Melampirkan Pengenal tidak akan mengubah parameter SRS lainnya. Terserah Anda untuk memastikan konsistensi pengenal dan parameter SRS. |

### Nilai Pengembalian

SRS Lokal Baru.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| InvalidOperationException | *axises* kosong. |
| ArgumentNullException | Argumen apapun, kecuali*identifier* adalah nol. |

### Lihat juga

* class [LocalSpatialReferenceSystem](../../localspatialreferencesystem/)
* class [LocalDatum](../../localdatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* ruang nama [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* perakitan [Aspose.GIS](../../../)


