---
title: Graphics.EnumerateMetafile
second_title: Aspose.Drawing untuk Referensi .NET API
description: Graphics metode. Mengirim catatan dalam yang ditentukanMetafile  satu per satu ke metode callback untuk ditampilkan pada titik tertentu menggunakan atribut gambar tertentu.
type: docs
weight: 460
url: /id/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

Mengirim catatan dalam yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu menggunakan atribut gambar tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoint | PointF | [`PointF`](../../pointf/) struktur yang menentukan lokasi sudut kiri atas metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) yang menentukan informasi atribut gambar untuk gambar yang digambar. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

Mengirim catatan dalam yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoint | PointF | [`PointF`](../../pointf/) struktur yang menentukan lokasi sudut kiri atas metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

Mengirim catatan dalam yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoints | PointF[] | Susunan tiga[`PointF`](../../pointf/) struktur yang mendefinisikan jajaran genjang yang menentukan ukuran dan lokasi metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

Mengirim catatan dalam yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoint | Point | [`Point`](../../point/) struktur yang menentukan lokasi sudut kiri atas metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

Mengirim catatan dalam yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoint | Point | [`Point`](../../point/) struktur yang menentukan lokasi sudut kiri atas metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

Mengirim catatan dalam yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) satu per satu, ke metode panggilan balik untuk ditampilkan pada titik tertentu menggunakan atribut gambar tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoint | Point | [`Point`](../../point/) struktur yang menentukan lokasi sudut kiri atas metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) yang menentukan informasi atribut gambar untuk gambar yang digambar. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

Mengirim catatan yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) struktur yang menentukan lokasi dan ukuran metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

Mengirim catatan yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) struktur yang menentukan lokasi dan ukuran metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

Mengirim catatan yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu menggunakan atribut gambar tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) struktur yang menentukan lokasi dan ukuran metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) yang menentukan informasi atribut gambar untuk gambar yang digambar. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

Mengirim catatan yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) struktur yang menentukan lokasi dan ukuran metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

Mengirim catatan dalam yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoint | PointF | [`PointF`](../../pointf/) struktur yang menentukan lokasi sudut kiri atas metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

Mengirim catatan dalam yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoints | PointF[] | Susunan tiga[`PointF`](../../pointf/) struktur yang mendefinisikan jajaran genjang yang menentukan ukuran dan lokasi metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

Mengirim catatan dalam yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoints | Point[] | Susunan tiga[`Point`](../../point/) struktur yang mendefinisikan jajaran genjang yang menentukan ukuran dan lokasi metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

Mengirim catatan dalam yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoints | Point[] | Susunan tiga[`Point`](../../point/) struktur yang mendefinisikan jajaran genjang yang menentukan ukuran dan lokasi metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang tertentu menggunakan atribut gambar tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoints | Point[] | Susunan tiga[`Point`](../../point/) struktur yang mendefinisikan jajaran genjang yang menentukan ukuran dan lokasi metafile yang digambar. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| unit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) yang menentukan informasi atribut gambar untuk gambar yang digambar. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoints | Point[] | Susunan tiga[`Point`](../../point/) struktur yang mendefinisikan jajaran genjang yang menentukan ukuran dan lokasi metafile yang digambar. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| srcUnit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoints | Point[] | Susunan tiga[`Point`](../../point/) struktur yang mendefinisikan jajaran genjang yang menentukan ukuran dan lokasi metafile yang digambar. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| srcUnit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang tertentu menggunakan atribut gambar tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoints | PointF[] | Susunan tiga[`PointF`](../../pointf/) struktur yang mendefinisikan jajaran genjang yang menentukan ukuran dan lokasi metafile yang digambar. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| unit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) yang menentukan informasi atribut gambar untuk gambar yang digambar. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoints | PointF[] | Susunan tiga[`PointF`](../../pointf/) struktur yang mendefinisikan jajaran genjang yang menentukan ukuran dan lokasi metafile yang digambar. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| srcUnit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

Mengirim catatan dalam kotak yang dipilih dari S[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoints | PointF[] | Susunan tiga[`PointF`](../../pointf/) struktur yang mendefinisikan jajaran genjang yang menentukan ukuran dan lokasi metafile yang digambar. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| srcUnit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

Mengirim rekaman persegi panjang yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu menggunakan atribut gambar tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) struktur yang menentukan lokasi dan ukuran metafile yang digambar. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| unit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) yang menentukan informasi atribut gambar untuk gambar yang digambar. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

Mengirim rekaman persegi panjang yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) struktur yang menentukan lokasi dan ukuran metafile yang digambar. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| srcUnit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

Mengirim rekaman persegi panjang yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) struktur yang menentukan lokasi dan ukuran metafile yang digambar. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| srcUnit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

Mengirim catatan dalam yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang tertentu menggunakan atribut gambar tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoints | PointF[] | Susunan tiga[`PointF`](../../pointf/) struktur yang mendefinisikan jajaran genjang yang menentukan ukuran dan lokasi metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) yang menentukan informasi atribut gambar untuk gambar yang digambar. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

Mengirim rekaman persegi panjang yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu menggunakan atribut gambar tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) struktur yang menentukan lokasi dan ukuran metafile yang digambar. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| unit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) yang menentukan informasi atribut gambar untuk gambar yang digambar. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

Mengirim rekaman persegi panjang yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) struktur yang menentukan lokasi dan ukuran metafile yang digambar. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| srcUnit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) satu per satu, ke metode panggilan balik untuk ditampilkan pada titik tertentu menggunakan atribut gambar tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoint | Point | [`Point`](../../point/) struktur yang menentukan lokasi sudut kiri atas metafile yang digambar. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| unit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) yang menentukan informasi atribut gambar untuk gambar yang digambar. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoint | Point | [`Point`](../../point/) struktur yang menentukan lokasi sudut kiri atas metafile yang digambar. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| srcUnit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoint | Point | [`Point`](../../point/) struktur yang menentukan lokasi sudut kiri atas metafile yang digambar. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| srcUnit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

Mengirim catatan yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destRect | Rectangle | [`RectangleF`](../../rectanglef/) struktur yang menentukan lokasi dan ukuran metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) satu per satu, ke metode panggilan balik untuk ditampilkan pada titik tertentu menggunakan atribut gambar tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoint | PointF | [`PointF`](../../pointf/) struktur yang menentukan lokasi sudut kiri atas metafile yang digambar. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| unit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) yang menentukan informasi atribut gambar untuk gambar yang digambar. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoint | PointF | [`PointF`](../../pointf/) struktur yang menentukan lokasi sudut kiri atas metafile yang digambar. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| srcUnit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoint | PointF | [`PointF`](../../pointf/) struktur yang menentukan lokasi sudut kiri atas metafile yang digambar. |
| srcRect | RectangleF | Struktur System.Drawing.RectangleF yang menentukan porsi metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| srcUnit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

Mengirim catatan dalam yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang tertentu menggunakan atribut gambar tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destPoints | Point[] | Susunan tiga[`Point`](../../point/) struktur yang mendefinisikan jajaran genjang yang menentukan ukuran dan lokasi metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) yang menentukan informasi atribut gambar untuk gambar yang digambar. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

Mengirim rekaman persegi panjang yang dipilih dari a[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) struktur yang menentukan lokasi dan ukuran metafile yang digambar. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) struktur yang menentukan bagian dari metafile, relatif terhadap sudut kiri atas, untuk menggambar. |
| srcUnit | GraphicsUnit | Anggota dari[`GraphicsUnit`](../../graphicsunit/) pencacahan yang menentukan satuan ukuran yang digunakan untuk menentukan bagian dari metafile yang ditentukan oleh persegi panjang*srcRect* parameter berisi. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

Mengirim catatan yang ditentukan[`Metafile`](../../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu menggunakan atribut gambar tertentu.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) untuk menghitung. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) struktur yang menentukan lokasi dan ukuran metafile yang digambar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) delegasi yang menentukan metode pengiriman catatan metafile. |
| callbackData | IntPtr | Penunjuk internal yang diperlukan, tetapi diabaikan. Anda bisa lewatZero untuk parameter ini. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) yang menentukan informasi atribut gambar untuk gambar yang digambar. |

### Lihat juga

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* ruang nama [System.Drawing](../../graphics/)
* perakitan [Aspose.Drawing](../../../)


