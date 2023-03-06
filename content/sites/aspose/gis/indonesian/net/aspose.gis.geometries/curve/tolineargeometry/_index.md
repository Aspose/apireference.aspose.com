---
title: Curve.ToLinearGeometry
second_title: Aspose.GIS untuk Referensi .NET API
description: Curve metode. Mendapat versi nonkurva perkiraan atau ekuivalen dari geometri ini menggunakan defaulttoleransi .
type: docs
weight: 70
url: /id/net/aspose.gis.geometries/curve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Mendapat versi non-kurva perkiraan atau ekuivalen dari geometri ini menggunakan default`toleransi` .

```csharp
public ILineString ToLinearGeometry()
```

### Nilai Pengembalian

A[`ILineString`](../../ilinestring/) yang mendekati atau setara dengan kurva ini. Ini setara dengan[`ToLinearGeometry`](../../icurve/tolineargeometry/) dengan default`toleransi` . Bawaan`toleransi` nilai s bergantung pada[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) dari geometri ini:  Untuk Toleransi SRS yang diproyeksikan adalah 0,001 meter (dalam satuan SRS) Untuk Toleransi SRS geografis adalah`1e-5` derajat (dalam satuan SRS) Untuk Toleransi SRS tidak diketahui`1e-5` Untuk detail lebih lanjut tentang transformasi apa yang diterapkan, lihat[`ToLinearGeometry`](../../icurve/tolineargeometry/) spesifikasi.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| InvalidOperationException | Geometri ini tidak valid sedemikian rupa, sehingga operasi tidak dapat diselesaikan. |

### Lihat juga

* interface [ILineString](../../ilinestring/)
* class [Curve](../)
* ruang nama [Aspose.Gis.Geometries](../../curve/)
* perakitan [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Mendapatkan perkiraan atau versi non-kurva yang setara dari geometri ini menggunakan yang ditentukan`toleransi` .

```csharp
public ILineString ToLinearGeometry(double tolerance)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| tolerance | Double | Itu`toleransi`menggunakan. Hasilnya dijamin kurang dari`toleransi` jauh dari geometri lengkung , kecuali jumlah titik yang diperlukan untuk linierisasi geometri melebihi maksimum per kuadran, saat ini sama dengan 10.000 titik. |

### Nilai Pengembalian

A[`ILineString`](../../ilinestring/) yang mendekati atau setara dengan kurva ini:  Jika objek ini[`ILineString`](../../ilinestring/) sendiri hasilnya setara dengan objek ini Jika objek ini[`ICircularString`](../../icircularstring/) hasilnya adalah string melingkar yang dilinierkan dengan yang ditentukan*tolerance* Jika objek ini[`ICompoundCurve`](../../icompoundcurve/) - semua kurva darinya dilinierkan dan kemudian digabungkan[`ILineString`](../../ilinestring/)

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | `toleransi` kurang dari atau sama dengan`0` . |
| InvalidOperationException | Geometri ini tidak valid sedemikian rupa, sehingga operasi tidak dapat diselesaikan. |

### Lihat juga

* interface [ILineString](../../ilinestring/)
* class [Curve](../)
* ruang nama [Aspose.Gis.Geometries](../../curve/)
* perakitan [Aspose.GIS](../../../)


