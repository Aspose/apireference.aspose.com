---
title: Projection.GetParameterValue
second_title: Aspose.GIS untuk Referensi .NET API
description: Projection metode. Mendapat parameter dengan nama tertentu dari proyeksi ini.
type: docs
weight: 40
url: /id/net/aspose.gis.spatialreferencing/projection/getparametervalue/
---
## Projection.GetParameterValue method

Mendapat parameter dengan nama tertentu dari proyeksi ini.

```csharp
public double GetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| name | String | Nama parameter. |
| type | ParameterType | Jenis parameter. Mendefinisikan faktor unit yang akan dihapus penerapannya: jika jenisnya adalahLinear Kemudian[`LinearParametersUnit`](../linearparametersunit/) akan diterapkan kembali dan hasilnya akan dalam meter. jika jenisnya adalahAngular Kemudian[`AngularParametersUnit`](../angularparametersunit/) akan diterapkan kembali dan hasilnya akan dalam radians. jika jenisnya adalahOthernilai parameter akan dikembalikan 'apa adanya'. |

### Nilai Pengembalian

Parameter dengan nama yang ditentukan.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah nol. |
| InvalidOperationException | Tidak ada parameter dengan nama ini. |

### Lihat juga

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* ruang nama [Aspose.Gis.SpatialReferencing](../../projection/)
* perakitan [Aspose.GIS](../../../)


