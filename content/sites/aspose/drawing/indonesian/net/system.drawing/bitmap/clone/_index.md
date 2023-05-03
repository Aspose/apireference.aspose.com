---
title: Bitmap.Clone
second_title: Aspose.Drawing untuk Referensi .NET API
description: Bitmap metode. Membuat salinan dari bagian iniBitmap didefinisikan olehRectangle structure dan dengan yang ditentukanPixelFormat pencacahan.
type: docs
weight: 100
url: /id/net/system.drawing/bitmap/clone/
---
## Clone(Rectangle, PixelFormat) {#clone}

Membuat salinan dari bagian iniBitmap didefinisikan olehRectangle structure dan dengan yang ditentukanPixelFormat pencacahan.

```csharp
public Bitmap Clone(Rectangle rect, PixelFormat format)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| rect | Rectangle | Menentukan porsi iniBitmap untuk menyalin. Koordinat relatif terhadap iniBitmap. |
| format | PixelFormat | MenentukanPixelFormat enumerasi untuk tujuan Bitmap. |

### Nilai Pengembalian

Yang baruBitmap yang dibuat oleh metode ini.

### Lihat juga

* struct [Rectangle](../../rectangle/)
* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* ruang nama [System.Drawing](../../bitmap/)
* perakitan [Aspose.Drawing](../../../)

---

## Clone(RectangleF, PixelFormat) {#clone_1}

Membuat salinan dari bagian iniBitmap ditentukan dengan ditentukanPixelFormat pencacahan.

```csharp
public Bitmap Clone(RectangleF rect, PixelFormat format)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| rect | RectangleF | Menentukan porsi iniBitmap untuk menyalin. |
| format | PixelFormat | MenentukanPixelFormat enumerasi untuk tujuanBitmap. |

### Nilai Pengembalian

ItuBitmap yang dibuat oleh metode ini.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| OutOfMemoryException | *rect* berada di luar batas bitmap sumber. |
| ArgumentException | Tinggi atau lebar dari*rect* adalah 0. |

### Lihat juga

* struct [RectangleF](../../rectanglef/)
* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* ruang nama [System.Drawing](../../bitmap/)
* perakitan [Aspose.Drawing](../../../)


