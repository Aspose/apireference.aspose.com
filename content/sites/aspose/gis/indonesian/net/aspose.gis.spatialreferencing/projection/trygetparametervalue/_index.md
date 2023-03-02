---
title: Projection.TryGetParameterValue
second_title: Aspose.GIS untuk Referensi .NET API
description: Projection metode. Mendapat parameter dengan nama yang ditentukan dari proyeksi ini. Jika tidak ada parameter seperti itu  kembalinull .
type: docs
weight: 60
url: /id/net/aspose.gis.spatialreferencing/projection/trygetparametervalue/
---
## Projection.TryGetParameterValue method

Mendapat parameter dengan nama yang ditentukan dari proyeksi ini. Jika tidak ada parameter seperti itu - kembali`null` .

```csharp
public double? TryGetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| name | String | Nama parameter. |
| type | ParameterType | Jenis parameter. Mendefinisikan faktor unit yang akan dihapus penerapannya: jika jenisnya adalahLinear Kemudian[`LinearParametersUnit`](../linearparametersunit/) akan diterapkan kembali dan hasilnya akan dalam meter. jika jenisnya adalahAngular Kemudian[`AngularParametersUnit`](../angularparametersunit/) akan diterapkan kembali dan hasilnya akan dalam radians. jika jenisnya adalahOthernilai parameter akan dikembalikan 'apa adanya'. |

### Nilai Pengembalian

Parameter dengan nama tertentu atau`null` jika tidak hadir.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah nol. |

### Lihat juga

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* ruang nama [Aspose.Gis.SpatialReferencing](../../projection/)
* perakitan [Aspose.GIS](../../../)


