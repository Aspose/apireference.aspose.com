---
title: Surface.ToLinearGeometry
second_title: Aspose.GIS untuk Referensi .NET API
description: Surface metode. Mendapat versi nonkurva perkiraan atau ekuivalen dari geometri ini menggunakan defaulttoleransi .
type: docs
weight: 40
url: /id/net/aspose.gis.geometries/surface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Mendapat versi non-kurva perkiraan atau ekuivalen dari geometri ini menggunakan default`toleransi` .

```csharp
public IPolygon ToLinearGeometry()
```

### Nilai Pengembalian

A[`IPolygon`](../../ipolygon/) yang mendekati atau setara dengan ini`Permukaan`. Ini setara dengan[`ToLinearGeometry`](../../isurface/tolineargeometry/) dengan default`toleransi` . Bawaan`toleransi` nilai s bergantung pada[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) dari geometri ini:  Untuk Toleransi SRS yang diproyeksikan adalah 0,001 meter (dalam satuan SRS) Untuk Toleransi SRS geografis adalah`1e-5` derajat (dalam satuan SRS) Untuk Toleransi SRS tidak diketahui`1e-5` Untuk detail lebih lanjut tentang transformasi apa yang diterapkan, lihat[`ToLinearGeometry`](../../isurface/tolineargeometry/) spesifikasi.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| InvalidOperationException | Geometri ini tidak valid sedemikian rupa, sehingga operasi tidak dapat diselesaikan. |

### Lihat juga

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* ruang nama [Aspose.Gis.Geometries](../../surface/)
* perakitan [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Mendapatkan perkiraan atau versi non-kurva yang setara dari geometri ini menggunakan yang ditentukan`toleransi` .

```csharp
public IPolygon ToLinearGeometry(double tolerance)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| tolerance | Double | Itu`toleransi`menggunakan. Hasilnya dijamin kurang dari`toleransi` jauh dari geometri lengkung , kecuali jumlah titik yang diperlukan untuk linierisasi geometri melebihi maksimum per kuadran, saat ini sama dengan 10.000 titik. |

### Nilai Pengembalian

A[`IPolygon`](../../ipolygon/) yang mendekati atau setara dengan ini`Permukaan` :  Jika objek ini[`IPolygon`](../../ipolygon/) sendiri hasilnya setara dengan objek ini Jika objek ini tidak[`IPolygon`](../../ipolygon/) itu dilinearisasi dan[`IPolygon`](../../ipolygon/) dibuat

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | `toleransi` kurang dari atau sama dengan`0` . |
| InvalidOperationException | Geometri ini tidak valid sedemikian rupa, sehingga operasi tidak dapat diselesaikan. |

### Lihat juga

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* ruang nama [Aspose.Gis.Geometries](../../surface/)
* perakitan [Aspose.GIS](../../../)


