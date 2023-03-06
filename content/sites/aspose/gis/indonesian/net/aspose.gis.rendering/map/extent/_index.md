---
title: Map.Extent
second_title: Aspose.GIS untuk Referensi .NET API
description: Map Properti. Menentukan batas peta yang akan dirender. Jika disetel kenull  jangkauan dihitung selama rendering untuk menyertakan semua geometri di semua lapisan.
type: docs
weight: 40
url: /id/net/aspose.gis.rendering/map/extent/
---
## Map.Extent property

Menentukan batas peta yang akan dirender. Jika disetel ke`null` , jangkauan dihitung selama rendering untuk menyertakan semua geometri di semua lapisan.

```csharp
public Extent Extent { get; set; }
```

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentException | [`IsValid`](../../../aspose.gis/extent/isvalid/) adalah`false`.[`Width`](../../../aspose.gis/extent/width/) kurang atau sama dengan nol.[`Height`](../../../aspose.gis/extent/height/) kurang atau sama dengan nol.[`SpatialReferenceSystem`](../../../aspose.gis/extent/spatialreferencesystem/) adalah`null`. |

### Perkataan

Jika sistem referensi spasial dari luasan tidak sama dengan sistem referensi spasial peta, luasan sedang diubah ke sistem referensi spasial target selama rendering.

### Lihat juga

* class [Extent](../../../aspose.gis/extent/)
* class [Map](../)
* ruang nama [Aspose.Gis.Rendering](../../map/)
* perakitan [Aspose.GIS](../../../)


