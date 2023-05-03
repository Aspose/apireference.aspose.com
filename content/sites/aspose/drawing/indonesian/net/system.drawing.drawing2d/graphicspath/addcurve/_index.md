---
title: GraphicsPath.AddCurve
second_title: Aspose.Drawing untuk Referensi .NET API
description: GraphicsPath metode. Menambahkan kurva spline ke gambar saat ini. Kurva kardinal spline digunakan karena kurva melewati setiap titik dalam larik.
type: docs
weight: 110
url: /id/net/system.drawing.drawing2d/graphicspath/addcurve/
---
## AddCurve(Point[]) {#addcurve_3}

Menambahkan kurva spline ke gambar saat ini. Kurva kardinal spline digunakan karena kurva melewati setiap titik dalam larik.

```csharp
public void AddCurve(Point[] points)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| points | Point[] | Sebuah array dariPoint struktur yang mewakili titik-titik yang menentukan kurva. |

### Lihat juga

* struct [Point](../../../system.drawing/point/)
* class [GraphicsPath](../)
* ruang nama [System.Drawing.Drawing2D](../../graphicspath/)
* perakitan [Aspose.Drawing](../../../)

---

## AddCurve(PointF[]) {#addcurve}

Menambahkan kurva spline ke gambar saat ini. Kurva kardinal spline digunakan karena kurva melewati setiap titik dalam larik.

```csharp
public void AddCurve(PointF[] points)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| points | PointF[] | Sebuah array dariPointF struktur yang mewakili titik-titik yang menentukan kurva. |

### Lihat juga

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* ruang nama [System.Drawing.Drawing2D](../../graphicspath/)
* perakitan [Aspose.Drawing](../../../)

---

## AddCurve(PointF[], float) {#addcurve_2}

Menambahkan kurva spline ke gambar saat ini.

```csharp
public void AddCurve(PointF[] points, float tension)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| points | PointF[] | Array struktur PointF yang mewakili titik-titik yang menentukan kurva. |
| tension | Single | Nilai yang menentukan jumlah lengkungan kurva di antara titik kontrol. Nilai yang lebih besar dari 1 menghasilkan hasil yang tidak dapat diprediksi. |

### Lihat juga

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* ruang nama [System.Drawing.Drawing2D](../../graphicspath/)
* perakitan [Aspose.Drawing](../../../)

---

## AddCurve(PointF[], int, int, float) {#addcurve_1}

Menambahkan kurva spline ke gambar saat ini.

```csharp
public void AddCurve(PointF[] points, int offset, int numberOfSegments, float tension)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| points | PointF[] | Sebuah array dariPointF struktur yang mewakili titik-titik yang menentukan kurva. |
| offset | Int32 | Indeks elemen dalam*points* array yang digunakan sebagai titik pertama dalam kurva. |
| numberOfSegments | Int32 | Jumlah segmen yang digunakan untuk menggambar kurva. Segmen dapat dianggap sebagai garis yang menghubungkan dua titik. |
| tension | Single | Nilai yang menentukan jumlah lengkungan kurva di antara titik kontrol. Nilai yang lebih besar dari 1 menghasilkan hasil yang tidak dapat diprediksi. |

### Lihat juga

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* ruang nama [System.Drawing.Drawing2D](../../graphicspath/)
* perakitan [Aspose.Drawing](../../../)


