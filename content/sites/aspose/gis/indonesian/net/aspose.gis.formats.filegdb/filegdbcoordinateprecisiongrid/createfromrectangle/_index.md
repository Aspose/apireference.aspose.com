---
title: FileGdbCoordinatePrecisionGrid.CreateFromRectangle
second_title: Aspose.GIS untuk Referensi .NET API
description: FileGdbCoordinatePrecisionGrid metode. Membuat baruFileGdbCoordinatePrecisionGrid sehingga semua nilai dalam persegi panjang dapat direpresentasikan.
type: docs
weight: 20
url: /id/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/
---
## FileGdbCoordinatePrecisionGrid.CreateFromRectangle method

Membuat baru`FileGdbCoordinatePrecisionGrid` sehingga semua nilai dalam persegi panjang dapat direpresentasikan.

```csharp
public static FileGdbCoordinatePrecisionGrid CreateFromRectangle(IPoint p1, IPoint p2)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| p1 | IPoint | Salah satu sudut persegi panjang. |
| p2 | IPoint | Sudut berlawanan dari persegi panjang. Harus memiliki dimensi yang sama dengan*p1*. |

### Nilai Pengembalian

Itu`FileGdbCoordinatePrecisionGrid`sehingga semua nilai dalam persegi panjang dapat direpresentasikan. Nilai di luar persegi panjang tidak dapat direpresentasikan, sehingga semua koordinat yang akan ditulis ke layer FileGDB harus berada di dalam persegi panjang.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null` . |
| ArgumentException | *p1* Dan*p2* jangan membentuk persegi panjang tidak kosong yang valid: *p1* atau*p2* kosong. Bendera HasZ dari*p1* tidak sama dengan bendera 'HasZ'*p2* Bendera HasM dari*p1* tidak sama dengan bendera 'HasM'*p2* Koordinat X' dari*p1* sama dengan koordinat 'X' dari*p2* Koordinat Y dari*p1* sama dengan koordinat 'Y' dari*p2* Koordinat Z' dari*p1* sama dengan koordinat 'Z' dari*p2* Koordinat M' dari*p1* sama dengan 'M' koordinat*p2* Koordinat apa punNaN atau tak terhingga. |

### Lihat juga

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [FileGdbCoordinatePrecisionGrid](../)
* ruang nama [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* perakitan [Aspose.GIS](../../../)


