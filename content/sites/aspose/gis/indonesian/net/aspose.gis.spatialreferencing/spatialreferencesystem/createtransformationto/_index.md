---
title: SpatialReferenceSystem.CreateTransformationTo
second_title: Aspose.GIS untuk Referensi .NET API
description: SpatialReferenceSystem metode. Membuat transformasi dari iniSistem Referensi Spasial ke yang lainSistem Referensi Spasial .
type: docs
weight: 180
url: /id/net/aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/
---
## SpatialReferenceSystem.CreateTransformationTo method

Membuat transformasi dari ini`Sistem Referensi Spasial` ke yang lain`Sistem Referensi Spasial` .

```csharp
public SpatialReferenceSystemTransformation CreateTransformationTo(SpatialReferenceSystem targetSrs)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | Lain`Sistem Referensi Spasial`. |

### Nilai Pengembalian

Transformasi dari ini`Sistem Referensi Spasial` ke yang lain`Sistem Referensi Spasial`.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| NotSupportedException | Transformasi antara ini`Sistem Referensi Spasial` dan argumen tidak didukung. Hal ini dapat terjadi, karena salah satu proyeksi tidak didukung, atau salah satu sistem[`VerticalSpatialReferenceSystem`](../../verticalspatialreferencesystem/) or [`LocalSpatialReferenceSystem`](../../localspatialreferencesystem/) . |
| [TransformationException](../../transformationexception/) | Transformasi gagal dibuat karena salah parameter di dalamnya`Sistem Referensi Spasial` . |

### Lihat juga

* method [TryCreateTransformationTo](../trycreatetransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* ruang nama [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* perakitan [Aspose.GIS](../../../)


