---
title: XpsDocument.CreatePathFigure
second_title: Aspose.Page untuk Referensi .NET API
description: XpsDocument metode. Membuat figur jalur baru.
type: docs
weight: 280
url: /id/net/aspose.page.xps/xpsdocument/createpathfigure/
---
## CreatePathFigure(PointF, bool) {#createpathfigure}

Membuat figur jalur baru.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, bool isClosed = false)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| startPoint | PointF | Titik awal untuk segmen pertama dari gambar jalur. |
| isClosed | Boolean | Menentukan apakah jalur ditutup. Jika disetel ke true, goresan digambar "tertutup", yaitu, titik terakhir di segmen terakhir dari gambar jalur dihubungkan dengan titik yang ditentukan dalam atribut StartPoint, jika tidak, goresan digambar "terbuka", dan yang terakhir titik tidak terhubung ke titik awal. Hanya berlaku jika figur path is digunakan dalam elemen {Path} yang menentukan coretan. |

### Nilai Pengembalian

Sosok jalan baru.

### Lihat juga

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsDocument](../)
* ruang nama [Aspose.Page.XPS](../../xpsdocument/)
* perakitan [Aspose.Page](../../../)

---

## CreatePathFigure(PointF, List&lt;XpsPathSegment&gt;, bool) {#createpathfigure_1}

Membuat figur jalur baru.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, List<XpsPathSegment> segments, 
    bool isClosed = false)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| startPoint | PointF | Titik awal untuk segmen pertama dari gambar jalur. |
| segments | List`1 | Daftar segmen jalur. |
| isClosed | Boolean | Menentukan apakah jalur ditutup. Jika disetel ke true, goresan digambar "tertutup", yaitu, titik terakhir di segmen terakhir dari gambar jalur dihubungkan dengan titik yang ditentukan dalam atribut StartPoint, jika tidak, goresan digambar "terbuka", dan yang terakhir titik tidak terhubung ke titik awal. Hanya berlaku jika figur path is digunakan dalam elemen {Path} yang menentukan coretan. |

### Nilai Pengembalian

Sosok jalan baru.

### Lihat juga

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* class [XpsDocument](../)
* ruang nama [Aspose.Page.XPS](../../xpsdocument/)
* perakitan [Aspose.Page](../../../)


