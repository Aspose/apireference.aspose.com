---
title: Feature.CopyValues
second_title: Aspose.GIS untuk Referensi .NET API
description: Feature metode. Menyalin nilai atribut dari fitur lain.
type: docs
weight: 20
url: /id/net/aspose.gis/feature/copyvalues/
---
## Feature.CopyValues method

Menyalin nilai atribut dari fitur lain.

```csharp
public void CopyValues(Feature inputFeature)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| inputFeature | Feature | Fitur untuk menyalin nilai dari. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumennya adalah`null`. |
| ArgumentException | Atribut dengan nama ini tidak ada di lapisan ini. |
| InvalidOperationException | Atribut tidak terkunci. |
| InvalidOperationException | Nilai masukan adalah nol dan atribut dalam fitur ini tidak boleh nol. |
| [GisException](../../gisexception/) | Atribut memiliki nama yang sama tetapi tipe data berbeda dalam fitur. |

### Perkataan

Metode ini hanya menyalin atribut dengan nama yang cocok.

### Lihat juga

* class [Feature](../)
* ruang nama [Aspose.Gis](../../feature/)
* perakitan [Aspose.GIS](../../../)


