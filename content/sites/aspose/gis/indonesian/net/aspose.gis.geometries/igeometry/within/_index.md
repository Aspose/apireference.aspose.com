---
title: IGeometry.Within
second_title: Aspose.GIS untuk Referensi .NET API
description: IGeometry metode. Menentukan apakah geometri ini berada dalam batas tertentu.
type: docs
weight: 380
url: /id/net/aspose.gis.geometries/igeometry/within/
---
## Within(Extent) {#within}

Menentukan apakah geometri ini berada dalam batas tertentu.

```csharp
public bool Within(Extent extent)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| extent | Extent | Luasnya. |

### Nilai Pengembalian

`true` jika geometri ini berada dalam jangkauan;`false` sebaliknya.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |

### Lihat juga

* method [Contains](../../../aspose.gis/extent/contains/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
* perakitan [Aspose.GIS](../../../)

---

## Within(IGeometry) {#within_1}

Menentukan apakah geometri ini berada dalam geometri yang ditentukan.

```csharp
public bool Within(IGeometry other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri. |

### Nilai Pengembalian

`true` jika geometri ini "secara spasial di dalam" geometri lain.`false` sebaliknya.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | Salah satu geometri tidak valid sehingga operasi tidak dapat diselesaikan. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Perkataan

Metode ini menguji apakah satu geometri berada di dalam geometri lain dalam hal matriks persimpangan DE-9IM. Satu geometri berada di dalam geometri lain, jika geometri lain berisi setiap titik geometri dan geometri interior berpotongan. Metode ini setara dengan: Lihat Spesifikasi Fitur Sederhana OpenGIS untuk detail lebih lanjut tentang DE-9IM dan relasi "spasial dalam".

```csharp
this.Relate(other, "T*F**F***");
```

### Lihat juga

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
* perakitan [Aspose.GIS](../../../)


