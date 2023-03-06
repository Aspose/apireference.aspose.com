---
title: GeometryCollection.ToLinearGeometry
second_title: Aspose.GIS untuk Referensi .NET API
description: GeometryCollection metode. Mendapat versi nonkurva perkiraan atau ekuivalen dari geometri ini menggunakan defaulttoleransi .
type: docs
weight: 220
url: /id/net/aspose.gis.geometries/geometrycollection/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Mendapat versi non-kurva perkiraan atau ekuivalen dari geometri ini menggunakan default`toleransi` .

```csharp
public IGeometryCollection ToLinearGeometry()
```

### Nilai Pengembalian

Geometri, yang tidak memiliki geometri kurva. Ini setara dengan[`ToLinearGeometry`](../../igeometrycollection/tolineargeometry/) dengan default`toleransi` . Bawaan`toleransi` nilai s bergantung pada[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) dari geometri ini:  Untuk Toleransi SRS yang diproyeksikan adalah 0,001 meter (dalam satuan SRS) Untuk Toleransi SRS geografis adalah`1e-5` derajat (dalam satuan SRS) Untuk Toleransi SRS tidak diketahui`1e-5` Untuk detail lebih lanjut tentang transformasi apa yang diterapkan, lihat[`ToLinearGeometry`](../../igeometrycollection/tolineargeometry/) spesifikasi.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| InvalidOperationException | Geometri ini tidak valid sedemikian rupa, sehingga operasi tidak dapat diselesaikan. |

### Lihat juga

* interface [IGeometryCollection](../../igeometrycollection/)
* class [GeometryCollection](../)
* ruang nama [Aspose.Gis.Geometries](../../geometrycollection/)
* perakitan [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Mendapatkan perkiraan atau versi non-kurva yang setara dari geometri ini menggunakan yang ditentukan`toleransi` .

```csharp
public IGeometryCollection ToLinearGeometry(double tolerance)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| tolerance | Double | Itu`toleransi`menggunakan. Hasilnya dijamin kurang dari`toleransi` jauh dari geometri melengkung . |

### Nilai Pengembalian

Geometri, yang tidak memiliki geometri kurva. Transformasi berikut diterapkan: CircularString s dilinearisasi (diubah menjadiLineString s dengan ditentukan*tolerance* )CompoundCurve s bergabung menjadi`String Garis` SCurvePolygon s diubah menjadiPolygon SMultiCurve s diubah menjadiMultiCurve SMultiSurface s diubah menjadiMultiPolygon S Akibatnya,[`HasCurveGeometry`](../../igeometry/hascurvegeometry/) geometri keluaran adalah`false` .

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | `toleransi` kurang dari atau sama dengan`0` . |
| InvalidOperationException | Geometri ini tidak valid sedemikian rupa, sehingga operasi tidak dapat diselesaikan. |

### Lihat juga

* interface [IGeometryCollection](../../igeometrycollection/)
* class [GeometryCollection](../)
* ruang nama [Aspose.Gis.Geometries](../../geometrycollection/)
* perakitan [Aspose.GIS](../../../)


