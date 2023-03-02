---
title: MultiSurface.ToLinearGeometry
second_title: Aspose.GIS untuk Referensi .NET API
description: MultiSurface metode. Mendapat versi nonkurva perkiraan atau ekuivalen dari geometri ini menggunakan defaulttoleransi .
type: docs
weight: 60
url: /id/net/aspose.gis.geometries/multisurface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_4}

Mendapat versi non-kurva perkiraan atau ekuivalen dari geometri ini menggunakan default`toleransi` .

```csharp
public IMultiPolygon ToLinearGeometry()
```

### Nilai Pengembalian

A[`IMultiPolygon`](../../imultipolygon/) yang mendekati atau setara dengan ini[`IMultiSurface`](../../imultisurface/). Ini setara dengan[`ToLinearGeometry`](../../imultisurface/tolineargeometry/) dengan default`toleransi` . Bawaan`toleransi` nilai s bergantung pada[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) dari geometri ini:  Untuk Toleransi SRS yang diproyeksikan adalah 0,001 meter (dalam satuan SRS) Untuk Toleransi SRS geografis adalah`1e-5` derajat (dalam satuan SRS) Untuk Toleransi SRS tidak diketahui`1e-5` Untuk detail lebih lanjut tentang transformasi apa yang diterapkan, lihat[`ToLinearGeometry`](../../imultisurface/tolineargeometry/) spesifikasi.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| InvalidOperationException | Geometri ini tidak valid sedemikian rupa, sehingga operasi tidak dapat diselesaikan. |

### Lihat juga

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* ruang nama [Aspose.Gis.Geometries](../../multisurface/)
* perakitan [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_5}

Mendapatkan perkiraan atau versi non-kurva yang setara dari geometri ini menggunakan yang ditentukan`toleransi` .

```csharp
public IMultiPolygon ToLinearGeometry(double tolerance)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| tolerance | Double | Itu`toleransi`menggunakan. Hasilnya dijamin kurang dari`toleransi` jauh dari geometri lengkung , kecuali jumlah titik yang diperlukan untuk linierisasi geometri melebihi maksimum per kuadran, saat ini sama dengan 10.000 titik. |

### Nilai Pengembalian

A[`IMultiPolygon`](../../imultipolygon/) yang mendekati atau setara dengan ini[`IMultiSurface`](../../imultisurface/) :  Jika objek ini[`IMultiPolygon`](../../imultipolygon/) sendiri hasilnya setara dengan objek ini Jika objek ini tidak[`IMultiPolygon`](../../imultipolygon/) - semua permukaan dilinearisasi dan baru`IMultiPoligon` dibuat

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | `toleransi` kurang dari atau sama dengan`0` . |
| InvalidOperationException | Geometri ini tidak valid sedemikian rupa, sehingga operasi tidak dapat diselesaikan. |

### Lihat juga

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* ruang nama [Aspose.Gis.Geometries](../../multisurface/)
* perakitan [Aspose.GIS](../../../)


