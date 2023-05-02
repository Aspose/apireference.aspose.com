---
title: Bitmap.Bitmap
second_title: Aspose.Drawing untuk Referensi .NET API
description: Bitmap konstruktor. Menginisialisasi instance baru dariBitmap kelas dengan ukuran yang ditentukan.
type: docs
weight: 10
url: /id/net/system.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor}

Menginisialisasi instance baru dari[`Bitmap`](../) kelas dengan ukuran yang ditentukan.

```csharp
public Bitmap(int width, int height)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| width | Int32 | Lebar, dalam piksel, Bitmap baru. |
| height | Int32 | Tinggi, dalam piksel, dari Bitmap baru. |

### Perkataan

Satu-satunya format bitmap internal yang didukung saat ini setara dengan`PixelFormat.Format32bppPArgb` .

### Lihat juga

* class [Bitmap](../)
* ruang nama [System.Drawing](../../bitmap/)
* perakitan [Aspose.Drawing](../../../)

---

## Bitmap(string) {#constructor_8}

Menginisialisasi instance baru dari[`Bitmap`](../) kelas dari file yang ditentukan.

```csharp
public Bitmap(string filename)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| filename | String | Nama file bitmap. |

### Lihat juga

* class [Bitmap](../)
* ruang nama [System.Drawing](../../bitmap/)
* perakitan [Aspose.Drawing](../../../)

---

## Bitmap(string, bool) {#constructor_9}

Menginisialisasi instance baru dari[`Bitmap`](../) kelas dari file yang ditentukan.

```csharp
public Bitmap(string filename, bool useIcm)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| filename | String | Nama file bitmap. |
| useIcm | Boolean | benar menggunakan koreksi warna untuk iniBitmap; jika tidak, salah. |

### Lihat juga

* class [Bitmap](../)
* ruang nama [System.Drawing](../../bitmap/)
* perakitan [Aspose.Drawing](../../../)

---

## Bitmap(Stream) {#constructor_6}

Menginisialisasi instance baru dari[`Bitmap`](../) kelas dari aliran data yang ditentukan.

```csharp
public Bitmap(Stream stream)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| stream | Stream | Aliran data yang digunakan untuk memuat gambar. |

### Lihat juga

* class [Bitmap](../)
* ruang nama [System.Drawing](../../bitmap/)
* perakitan [Aspose.Drawing](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

Menginisialisasi instance baru dari[`Bitmap`](../) kelas dari aliran data yang ditentukan.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| stream | Stream | Aliran data yang digunakan untuk memuat gambar. |
| useIcm | Boolean | `BENAR` untuk menggunakan koreksi warna untuk iniBitmap ; jika tidak,`PALSU`. |

### Lihat juga

* class [Bitmap](../)
* ruang nama [System.Drawing](../../bitmap/)
* perakitan [Aspose.Drawing](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_2}

Menginisialisasi instance baru dari[`Bitmap`](../) kelas dengan ukuran dan format yang ditentukan.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| width | Int32 | Lebar, dalam piksel, yang baruBitmap. |
| height | Int32 | Ketinggian, dalam piksel, dari yang baruBitmap. |
| format | PixelFormat | ItuPixelFormat enumerasi untuk yang baruBitmap. |

### Lihat juga

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* ruang nama [System.Drawing](../../bitmap/)
* perakitan [Aspose.Drawing](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_1}

Menginisialisasi instance baru dari[`Bitmap`](../) kelas dengan data ukuran dan piksel yang ditentukan.

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| width | Int32 | Lebar, dalam piksel, yang baruBitmap. |
| height | Int32 | Ketinggian, dalam piksel, dari yang baruBitmap. |
| stride | Int32 | Offset byte antara awal satu baris pemindaian dan berikutnya, harus kelipatan empat. |
| format | PixelFormat | ItuPixelFormat enumerasi untuk yang baruBitmap. |
| data | Int32[] | Data piksel. |

### Lihat juga

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* ruang nama [System.Drawing](../../bitmap/)
* perakitan [Aspose.Drawing](../../../)

---

## Bitmap(Image) {#constructor_3}

Menginisialisasi instance baru dari[`Bitmap`](../) kelas dari gambar yang sudah ditentukan.

```csharp
public Bitmap(Image original)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| original | Image | ItuImage dari mana untuk membuat yang baruBitmap. |

### Lihat juga

* class [Image](../../image/)
* class [Bitmap](../)
* ruang nama [System.Drawing](../../bitmap/)
* perakitan [Aspose.Drawing](../../../)

---

## Bitmap(Image, Size) {#constructor_5}

Menginisialisasi instance baru dari[`Bitmap`](../)kelas dari gambar yang ada yang ditentukan, diskalakan ke ukuran yang ditentukan.

```csharp
public Bitmap(Image original, Size newSize)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| original | Image | ItuImage dari mana untuk membuat yang baruBitmap |
| newSize | Size | ItuSize struktur yang mewakili ukuran yang baruBitmap. |

### Lihat juga

* class [Image](../../image/)
* struct [Size](../../size/)
* class [Bitmap](../)
* ruang nama [System.Drawing](../../bitmap/)
* perakitan [Aspose.Drawing](../../../)

---

## Bitmap(Image, int, int) {#constructor_4}

Menginisialisasi instance baru dari[`Bitmap`](../) kelas dari gambar yang ada ditentukan, diskalakan ke ukuran yang ditentukan.

```csharp
public Bitmap(Image original, int width, int height)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| original | Image | ItuImage dari mana untuk membuat yang baruBitmap. |
| width | Int32 | Lebar, dalam piksel, yang baruBitmap. |
| height | Int32 | Ketinggian, dalam piksel, dari yang baruBitmap. |

### Lihat juga

* class [Image](../../image/)
* class [Bitmap](../)
* ruang nama [System.Drawing](../../bitmap/)
* perakitan [Aspose.Drawing](../../../)


