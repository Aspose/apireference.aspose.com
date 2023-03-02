---
title: SpatialReferenceSystem.Validate
second_title: Aspose.GIS untuk Referensi .NET API
description: SpatialReferenceSystem metode. Tentukan apakah SRS ini valid.
type: docs
weight: 240
url: /id/net/aspose.gis.spatialreferencing/spatialreferencesystem/validate/
---
## SpatialReferenceSystem.Validate method

Tentukan apakah SRS ini valid.

```csharp
public abstract bool Validate(out string errorMessage)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| errorMessage | String& | Jika metode kembali`false` maka ini adalah deskripsi ketidakabsahan. |

### Nilai Pengembalian

`true` jika SRS valid,`false` jika tidak.

### Perkataan

SRS yang valid harus memiliki ellipsoid yang valid. - SRS Geografis harus memiliki tepat satu sumbu Timur/Barat, tepat satu sumbu Utara/Selatan, dan sumbu Atas/Bawah opsional (sumbu opsional ada ketika SRS geografis adalah gabungan dari SRS geografis 2D dan vertical SRS). - SRS yang diproyeksikan harus memiliki tepat satu sumbu Timur/Barat, tepat satu sumbu Utara/Selatan, dan sumbu Atas/Bawah opsional (sumbu opsional ada saat SRS yang diproyeksikan merupakan gabungan dari SRS geografis 2D dan SRS vertikal). - SRS geosentris harus memiliki tepat satu sumbu Timur/Barat, tepat satu sumbu Utara/Selatan, dan tepat satu sumbu Lainnya. - SRS Vertikal harus memiliki tepat satu sumbu Atas/Bawah. - SRS Lokal harus memiliki setidaknya satu sumbu. Arah sumbu tidak diukur. - SRS Gabungan harus berupa kombinasi Geografis/Diproyeksikan yang valid dan SRS Vertikal yang valid.

### Lihat juga

* class [SpatialReferenceSystem](../)
* ruang nama [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* perakitan [Aspose.GIS](../../../)


