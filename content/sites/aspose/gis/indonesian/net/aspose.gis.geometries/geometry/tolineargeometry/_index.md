---
title: Geometry.ToLinearGeometry
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Mendapat versi nonkurva perkiraan atau ekuivalen dari geometri ini menggunakan defaulttoleransi .
type: docs
weight: 400
url: /id/net/aspose.gis.geometries/geometry/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Mendapat versi non-kurva perkiraan atau ekuivalen dari geometri ini menggunakan default`toleransi` .

```csharp
public IGeometry ToLinearGeometry()
```

### Nilai Pengembalian

Geometri yang tidak memiliki geometri kurva. Ini setara dengan[`ToLinearGeometry`](../../igeometry/tolineargeometry/) dengan default`toleransi` . Bawaan`toleransi` didefinisikan oleh[`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) dari geometri ini:  Untuk Toleransi SRS yang diproyeksikan adalah 0,001 meter (dalam satuan SRS) Untuk Toleransi SRS geografis adalah`1e-5` derajat (dalam satuan SRS) Untuk Toleransi SRS tidak diketahui`1e-5` Untuk detail lebih lanjut tentang transformasi apa yang diterapkan, lihat[`ToLinearGeometry`](../../igeometry/tolineargeometry/) spesifikasi.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| InvalidOperationException | Geometri ini tidak valid sedemikian rupa, sehingga operasi tidak dapat diselesaikan. |

### Lihat juga

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Mendapatkan perkiraan atau versi non-kurva yang setara dari geometri ini menggunakan yang ditentukan`toleransi` .

```csharp
public IGeometry ToLinearGeometry(double tolerance)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| tolerance | Double | Itu`toleransi`menggunakan. Hasilnya dijamin kurang dari`toleransi` jauh dari geometri lengkung , kecuali jumlah titik yang diperlukan untuk linierisasi geometri melebihi maksimum per kuadran yang saat ini sama dengan 10.000 titik. |

### Nilai Pengembalian

Geometri, yang tidak memiliki geometri kurva. Transformasi berikut diterapkan: CircularString s dilinearisasi (diubah menjadiLineString s dengan ditentukan*tolerance* )CompoundCurve s bergabung menjadi`String Garis` SCurvePolygon s diubah menjadiPolygon SMultiCurve s diubah menjadiMultiLineString SMultiSurface s diubah menjadiMultiPolygon S Akibatnya,[`HasCurveGeometry`](../../igeometry/hascurvegeometry/) geometri keluaran adalah`false` .

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | `toleransi` kurang dari atau sama dengan`0` . |
| InvalidOperationException | Geometri ini tidak valid sedemikian rupa, sehingga operasi tidak dapat diselesaikan. |

### Lihat juga

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


