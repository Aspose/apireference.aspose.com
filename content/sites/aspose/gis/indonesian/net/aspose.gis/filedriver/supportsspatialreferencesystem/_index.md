---
title: FileDriver.SupportsSpatialReferenceSystem
second_title: Aspose.GIS untuk Referensi .NET API
description: FileDriver metode. Menentukan apakah sistem referensi spasial yang ditentukan didukung oleh driver.
type: docs
weight: 100
url: /id/net/aspose.gis/filedriver/supportsspatialreferencesystem/
---
## FileDriver.SupportsSpatialReferenceSystem method

Menentukan, apakah sistem referensi spasial yang ditentukan didukung oleh driver.

```csharp
public abstract bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Sistem referensi spasial. |

### Nilai Pengembalian

Nilai Boolean, menunjukkan apakah sistem referensi spasial yang ditentukan didukung oleh driver. `null` dianggap didukung oleh driver apa pun.

### Perkataan

Jika sistem referensi spasial tidak didukung, dan Anda meneruskannya ke[`CreateLayer`](../createlayer/) metode, aNotSupportedException akan dilempar.

### Lihat juga

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)


