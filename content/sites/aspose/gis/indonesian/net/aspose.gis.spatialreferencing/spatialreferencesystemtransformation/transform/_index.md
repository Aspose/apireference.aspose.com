---
title: SpatialReferenceSystemTransformation.Transform
second_title: Aspose.GIS untuk Referensi .NET API
description: SpatialReferenceSystemTransformation metode. Mengubah geometri dari sistem referensi spasial sumber menjadi sistem referensi spasial target.
type: docs
weight: 40
url: /id/net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/transform/
---
## SpatialReferenceSystemTransformation.Transform method

Mengubah geometri dari sistem referensi spasial sumber menjadi sistem referensi spasial target.

```csharp
public Geometry Transform(IGeometry geometry)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| geometry | IGeometry | Geometri untuk diubah. |

### Nilai Pengembalian

Geometri baru dalam sistem referensi spasial target.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Geometri adalah`null` . |
| ArgumentException | Geometri[`SpatialReferenceSystem`](../../../aspose.gis.geometries/igeometry/spatialreferencesystem/) tidak`null` dan tidak setara dengan [`Source`](../source/) |
| [TransformationException](../../transformationexception/) | Transformasi gagal. |

### Lihat juga

* class [Geometry](../../../aspose.gis.geometries/geometry/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SpatialReferenceSystemTransformation](../)
* ruang nama [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* perakitan [Aspose.GIS](../../../)


