---
title: MultiCurve.ToLinearGeometry
second_title: Aspose.GIS untuk Referensi .NET API
description: MultiCurve metode. Mendapatkan perkiraan atau versi nonkurva yang setara dari geometri ini menggunakan yang ditentukantoleransi .
type: docs
weight: 70
url: /id/net/aspose.gis.geometries/multicurve/tolineargeometry/
---
## ToLinearGeometry(double) {#tolineargeometry_5}

Mendapatkan perkiraan atau versi non-kurva yang setara dari geometri ini menggunakan yang ditentukan`toleransi` .

```csharp
public IMultiLineString ToLinearGeometry(double tolerance)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| tolerance | Double | Itu`toleransi`menggunakan. Hasilnya dijamin kurang dari`toleransi` jauh dari geometri lengkung , kecuali jumlah titik yang diperlukan untuk linierisasi geometri melebihi maksimum per kuadran, saat ini sama dengan 10.000 titik. |

### Nilai Pengembalian

A[`IMultiLineString`](../../imultilinestring/) yang mendekati atau setara dengan ini[`IMultiCurve`](../../imulticurve/) :  Jika objek ini[`IMultiLineString`](../../imultilinestring/) sendiri hasilnya setara dengan objek ini Jika objek ini tidak[`IMultiLineString`](../../imultilinestring/) - semua kurva dilinearisasi dan baru`IMultiLineString` dibuat

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | `toleransi` kurang dari atau sama dengan`0` . |
| InvalidOperationException | Geometri ini tidak valid sedemikian rupa, sehingga operasi tidak dapat diselesaikan. |

### Lihat juga

* interface [IMultiLineString](../../imultilinestring/)
* class [MultiCurve](../)
* ruang nama [Aspose.Gis.Geometries](../../multicurve/)
* perakitan [Aspose.GIS](../../../)

---

## ToLinearGeometry() {#tolineargeometry_4}

Mendapat versi non-kurva perkiraan atau ekuivalen dari geometri ini menggunakan default`toleransi` .

```csharp
public IMultiLineString ToLinearGeometry()
```

### Nilai Pengembalian

A[`IMultiLineString`](../../imultilinestring/) yang mendekati atau setara dengan ini[`IMultiCurve`](../../imulticurve/). Ini setara dengan[`ToLinearGeometry`](../../imulticurve/tolineargeometry/) dengan default`toleransi` . Bawaan`toleransi` nilai s bergantung pada[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) dari geometri ini:  Untuk Toleransi SRS yang diproyeksikan adalah 0,001 meter (dalam satuan SRS) Untuk Toleransi SRS geografis adalah`1e-5` derajat (dalam satuan SRS) Untuk Toleransi SRS tidak diketahui`1e-5` Untuk detail lebih lanjut tentang transformasi apa yang diterapkan, lihat[`ToLinearGeometry`](../../imulticurve/tolineargeometry/) spesifikasi.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| InvalidOperationException | Geometri ini tidak valid sedemikian rupa, sehingga operasi tidak dapat diselesaikan. |

### Lihat juga

* interface [IMultiLineString](../../imultilinestring/)
* class [MultiCurve](../)
* ruang nama [Aspose.Gis.Geometries](../../multicurve/)
* perakitan [Aspose.GIS](../../../)


