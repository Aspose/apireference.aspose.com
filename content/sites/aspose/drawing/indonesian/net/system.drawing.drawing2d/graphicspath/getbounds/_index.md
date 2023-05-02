---
title: GraphicsPath.GetBounds
second_title: Aspose.Drawing untuk Referensi .NET API
description: GraphicsPath metode. Mengembalikan persegi panjang yang membatasi iniGraphicsPath .
type: docs
weight: 260
url: /id/net/system.drawing.drawing2d/graphicspath/getbounds/
---
## GetBounds() {#getbounds}

Mengembalikan persegi panjang yang membatasi iniGraphicsPath .

```csharp
public RectangleF GetBounds()
```

### Nilai Pengembalian

ARectangleF yang mewakili persegi panjang yang bounds iniGraphicsPath.

### Lihat juga

* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [GraphicsPath](../)
* ruang nama [System.Drawing.Drawing2D](../../graphicspath/)
* perakitan [Aspose.Drawing](../../../)

---

## GetBounds(Matrix) {#getbounds_1}

Mengembalikan persegi panjang yang membatasi iniGraphicsPath ketika jalur ini diubah oleh yang ditentukanMatrix .

```csharp
public RectangleF GetBounds(Matrix matrix)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| matrix | Matrix | ItuMatrix yang menentukan transformasi untuk diterapkan ke jalur ini sebelum persegi panjang pembatas dihitung. Jalur ini tidak diubah secara permanen; transformasi hanya digunakan selama process menghitung persegi panjang pembatas. |

### Nilai Pengembalian

ARectangleF yang mewakili persegi panjang yang bounds iniGraphicsPath.

### Lihat juga

* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* ruang nama [System.Drawing.Drawing2D](../../graphicspath/)
* perakitan [Aspose.Drawing](../../../)

---

## GetBounds(Matrix, Pen) {#getbounds_2}

Mengembalikan persegi panjang yang membatasi iniGraphicsPath ketika jalur saat ini diubah oleh yang ditentukanMatrix dan digambar dengan yang ditentukanPen .

```csharp
public RectangleF GetBounds(Matrix matrix, Pen pen)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| matrix | Matrix | ItuMatrix yang menentukan transformasi untuk diterapkan ke path ini sebelum persegi panjang pembatas dihitung. Jalur ini tidak diubah secara permanen; transformasi hanya digunakan selama proses penghitungan persegi panjang pembatas. |
| pen | Pen | ItuPen yang dapat digunakan untuk menggambarGraphicsPath. |

### Nilai Pengembalian

ARectangleF yang mewakili persegi panjang yang membatasi this GraphicsPath.

### Lihat juga

* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* class [Pen](../../../system.drawing/pen/)
* class [GraphicsPath](../)
* ruang nama [System.Drawing.Drawing2D](../../graphicspath/)
* perakitan [Aspose.Drawing](../../../)


