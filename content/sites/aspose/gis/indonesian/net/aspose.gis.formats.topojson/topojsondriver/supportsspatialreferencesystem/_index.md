---
title: TopoJsonDriver.SupportsSpatialReferenceSystem
second_title: Aspose.GIS untuk Referensi .NET API
description: TopoJsonDriver metode. Menentukan apakah sistem referensi spasial yang ditentukan didukung oleh driver.
type: docs
weight: 60
url: /id/net/aspose.gis.formats.topojson/topojsondriver/supportsspatialreferencesystem/
---
## TopoJsonDriver.SupportsSpatialReferenceSystem method

Menentukan, apakah sistem referensi spasial yang ditentukan didukung oleh driver.

```csharp
public override bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Sistem referensi spasial. |

### Nilai Pengembalian

Nilai Boolean, menunjukkan apakah sistem referensi spasial yang ditentukan didukung oleh driver.

### Perkataan

Untuk TopoJSON, satu-satunya sistem referensi spasial yang didukung adalah 'null', karena tidak ada cara untuk menyimpan informasi sistem referensi spasial dalam file TopoJSON dan spesifikasi TopoJSON tidak menentukan apa sistem referensi spasial geometri dalam file TopoJSON.

### Lihat juga

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [TopoJsonDriver](../)
* ruang nama [Aspose.Gis.Formats.TopoJson](../../topojsondriver/)
* perakitan [Aspose.GIS](../../../)


