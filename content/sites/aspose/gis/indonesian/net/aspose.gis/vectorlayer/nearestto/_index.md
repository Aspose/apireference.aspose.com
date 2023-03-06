---
title: VectorLayer.NearestTo
second_title: Aspose.GIS untuk Referensi .NET API
description: VectorLayer metode. Mendapat fitur terdekat dengan koordinat yang disediakan.
type: docs
weight: 150
url: /id/net/aspose.gis/vectorlayer/nearestto/
---
## NearestTo(double, double) {#nearestto_1}

Mendapat fitur terdekat dengan koordinat yang disediakan.

```csharp
public Feature NearestTo(double x, double y)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| x | Double | X dari koordinat. |
| y | Double | Y dari koordinat. |

### Nilai Pengembalian

Fitur terdekat dengan koordinat yang disediakan.

### Lihat juga

* class [Feature](../../feature/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)

---

## NearestTo(IPoint) {#nearestto}

Mendapat fitur terdekat ke titik yang disediakan.

```csharp
public Feature NearestTo(IPoint point)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| point | IPoint | Inti nya. |

### Nilai Pengembalian

Fitur terdekat ke titik yang disediakan.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Intinya adalah`null`. |
| ArgumentException | Poin kosong atau tidak valid. |

### Lihat juga

* class [Feature](../../feature/)
* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)


