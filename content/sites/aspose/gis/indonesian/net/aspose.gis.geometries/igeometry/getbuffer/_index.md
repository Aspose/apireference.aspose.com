---
title: IGeometry.GetBuffer
second_title: Aspose.GIS untuk Referensi .NET API
description: IGeometry metode. Menghitung daerah penyangga di sekitar geometri ini.
type: docs
weight: 200
url: /id/net/aspose.gis.geometries/igeometry/getbuffer/
---
## IGeometry.GetBuffer method

Menghitung daerah penyangga di sekitar geometri ini.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| distance | Double | Lebar wilayah penyangga (dalam satuan Referensi Spasial). |
| quadrantSegments | Int32 | Jumlah segmen yang digunakan untuk memperkirakan kelengkungan 90 derajat. Semakin besar angka ini, semakin baik perkiraan kurva yang dihasilkan. Standarnya adalah 30. |

### Nilai Pengembalian

Geometri yang merepresentasikan semua titik yang berada dalam jarak tertentu dari geometri ini. Jenis hasilnya adalah salah satu[`Null`](../../geometry/null/) ,[`IPolygon`](../../ipolygon/) atau[`IMultiPolygon`](../../imultipolygon/) .

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| InvalidOperationException | Geometri ini tidak valid sehingga operasi tidak dapat diselesaikan. |
| ArgumentOutOfRangeException | Segmen kuadran kurang dari atau sama dengan 0. |

### Lihat juga

* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
* perakitan [Aspose.GIS](../../../)


