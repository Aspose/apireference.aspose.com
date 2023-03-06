---
title: SpatialReferenceSystem.CreateVertical
second_title: Aspose.GIS untuk Referensi .NET API
description: SpatialReferenceSystem metode. Buat SRS vertikal.
type: docs
weight: 390
url: /id/net/aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/
---
## SpatialReferenceSystem.CreateVertical method

Buat SRS vertikal.

```csharp
public static VerticalSpatialReferenceSystem CreateVertical(string name, 
    VerticalDatum verticalDatum, Unit verticalUnit = null, Axis verticalAxis = null, 
    Identifier identifier = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| name | String | Nama SRS. Jika`null` . |
| verticalDatum | VerticalDatum | Datum yang akan digunakan dalam SRS. |
| verticalUnit | Unit | Unit yang akan digunakan di SRS. Jika`null` ,[`Meter`](../../unit/meter/) akan digunakan. |
| verticalAxis | Axis | Sumbu dengan arah "naik" atau "turun", untuk digunakan dalam SRS. Jika`null` , sumbu dengan arah atas akan digunakan. |
| identifier | Identifier | Identifier, yang akan dilampirkan ke SRS. Melampirkan Pengenal tidak akan mengubah parameter SRS lainnya. Terserah Anda untuk memastikan konsistensi pengenal dan parameter SRS. |

### Nilai Pengembalian

SRS Vertikal Baru.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| InvalidOperationException | *verticalAxis* arahnya tidak ke atas atau ke bawah. |
| ArgumentNullException | Beberapa parameter yang diperlukan adalah nol. |

### Lihat juga

* class [VerticalSpatialReferenceSystem](../../verticalspatialreferencesystem/)
* class [VerticalDatum](../../verticaldatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* ruang nama [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* perakitan [Aspose.GIS](../../../)


