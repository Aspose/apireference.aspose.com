---
title: GeographicDatum.GeographicDatum
second_title: Aspose.GIS untuk Referensi .NET API
description: GeographicDatum konstruktor. Membuat instance baru.
type: docs
weight: 10
url: /id/net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

Membuat instance baru.

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| name | String | Nama datum ini. |
| ellipsoid | Ellipsoid | Ellipsoid dari datum ini. Tidak boleh nol. |
| toWgs84Parameters | BursaWolfParameters | Parameter, yang dapat diberikan ke rumus bursa wolf, untuk mengubah koordinat pada datum ini menjadi koordinat pada datum WGS84. Jika datum ini dekat dengan WGS84 dan tidak diperlukan transformasi, berikan parameter bursa wolf dengan semua nilai diatur ke 0. Jika null, ToWgs84 akan disetel ke[`IsNull`](../../bursawolfparameters/isnull/) parameter. |
| identifier | Identifier | Pengidentifikasi datum ini. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | ellipsoid adalah nol. |

### Lihat juga

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* ruang nama [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* perakitan [Aspose.GIS](../../../)


