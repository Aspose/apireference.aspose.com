---
title: Geometry.Intersects
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Menentukan apakah geometri ini memotong batas tertentu.
type: docs
weight: 280
url: /id/net/aspose.gis.geometries/geometry/intersects/
---
## Intersects(Extent) {#intersects}

Menentukan apakah geometri ini memotong batas tertentu.

```csharp
public bool Intersects(Extent extent)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| extent | Extent | Luasnya. |

### Nilai Pengembalian

`true` jika geometri ini berpotongan dengan luasnya;`false` sebaliknya.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |

### Lihat juga

* method [Intersects](../../../aspose.gis/extent/intersects/)
* class [Extent](../../../aspose.gis/extent/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

Menentukan apakah geometri ini dan geometri tertentu berpotongan.

```csharp
public bool Intersects(IGeometry other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri. |

### Nilai Pengembalian

`true` jika geometri ini "berpotongan spasial" dengan geometri lain.`false` sebaliknya.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | Salah satu geometri tidak valid sehingga operasi tidak dapat diselesaikan. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Perkataan

Metode ini setara dengan: Ini adalah negasi dari[`Disjoint`](../../igeometry/disjoint/) . Melihat[`Disjoint`](../../igeometry/disjoint/) untuk lebih jelasnya.

```csharp
!this.Disjoint(other);
```

### Lihat juga

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


