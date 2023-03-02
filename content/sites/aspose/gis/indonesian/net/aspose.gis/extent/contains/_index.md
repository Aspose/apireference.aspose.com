---
title: Extent.Contains
second_title: Aspose.GIS untuk Referensi .NET API
description: Extent metode. Menentukan apakah jangkauan ini berisi koordinat yang ditentukan oleh argumen.
type: docs
weight: 120
url: /id/net/aspose.gis/extent/contains/
---
## Contains(double, double) {#contains_2}

Menentukan apakah jangkauan ini berisi koordinat yang ditentukan oleh argumen.

```csharp
public bool Contains(double x, double y)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| x | Double | X dari koordinat. |
| y | Double | Y dari koordinat. |

### Nilai Pengembalian

Nilai, menunjukkan apakah koordinat ada di dalam kotak pembatas.

### Perkataan

Koordinat terletak di batas ini[`Extent`](../) are dianggap terkandung oleh ini[`Extent`](../) .

### Lihat juga

* class [Extent](../)
* ruang nama [Aspose.Gis](../../extent/)
* perakitan [Aspose.GIS](../../../)

---

## Contains(Extent) {#contains}

Menentukan apakah sejauh ini berisi argumen.

```csharp
public bool Contains(Extent extent)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| extent | Extent | Tingkat lain. |

### Nilai Pengembalian

Nilai, menunjukkan apakah luasan ini mengandung argumen.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) sejauh ini dan argumen keduanya tidak`null` dan tidak sama satu sama lain. |

### Perkataan

Koordinat terletak di batas ini[`Extent`](../) are dianggap terkandung oleh ini[`Extent`](../) . Untuk alasan ini, luasan yang sama dianggap mengandung satu sama lain.

### Lihat juga

* class [Extent](../)
* ruang nama [Aspose.Gis](../../extent/)
* perakitan [Aspose.GIS](../../../)

---

## Contains(IGeometry) {#contains_1}

Menentukan apakah sejauh ini berisi argumen.

```csharp
public bool Contains(IGeometry geometry)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| geometry | IGeometry | Geometri untuk menguji penahanan. |

### Nilai Pengembalian

Nilai, menunjukkan apakah luasan ini mengandung argumen.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) sejauh ini dan argumen keduanya tidak`null` dan tidak sama satu sama lain. |

### Perkataan

Koordinat terletak di batas ini[`Extent`](../) are dianggap terkandung oleh ini[`Extent`](../) .

### Lihat juga

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* ruang nama [Aspose.Gis](../../extent/)
* perakitan [Aspose.GIS](../../../)


