---
title: Identifier.Epsg
second_title: Aspose.GIS untuk Referensi .NET API
description: Identifier metode. Membuat Pengenal baru yang mewakili pengenal EPSG dengan kodeepsgCode .
type: docs
weight: 20
url: /id/net/aspose.gis.spatialreferencing/identifier/epsg/
---
## Identifier.Epsg method

Membuat Pengenal baru yang mewakili pengenal EPSG dengan kode*epsgCode* .

```csharp
public static Identifier Epsg(int epsgCode)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| epsgCode | Int32 | Kode epsg. |

### Nilai Pengembalian

Pengidentifikasi baru dengan[`AuthorityName`](../authorityname/) "EPSG" dan[`AuthorityUniqueIdentifier`](../authorityuniqueidentifier/)*epsgCode* . Jika*epsgCode* kurang dari 0 - kembali`null` ;

### Lihat juga

* class [Identifier](../)
* ruang nama [Aspose.Gis.SpatialReferencing](../../identifier/)
* perakitan [Aspose.GIS](../../../)


