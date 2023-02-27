---
title: AsposeOcr.RecognizeImage
second_title: Aspose.OCR untuk .NET API Referensi
description: AsposeOcr metode. Mengenali teks pada gambar.
type: docs
weight: 140
url: /id/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

Mengenali teks pada gambar.

```csharp
public string RecognizeImage(string fullPath)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| fullPath | String | Jalan ke gambar. |

### Nilai Pengembalian

Teks yang dikenali.

### Perkataan

Menggunakan koreksi kemiringan gambar otomatis dan deteksi area teks. Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Lihat juga

* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

Mengenali teks pada gambar.

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| fullPath | String | Jalan ke gambar. |
| settings | RecognitionSettings | Pengaturan pengenalan. |

### Nilai Pengembalian

Itu[`RecognitionResult`](../../recognitionresult/) objek dengan hasil pengenalan citra.

### Perkataan

Mengenali gambar dengan kemampuan untuk menentukan[`RecognitionSettings`](../../recognitionsettings/) . Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Lihat juga

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

Mengenali teks pada gambar.

```csharp
public string RecognizeImage(MemoryStream stream)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| stream | MemoryStream | Aliran memori yang berisi gambar. |

### Nilai Pengembalian

Teks yang dikenali.

### Perkataan

Menggunakan koreksi kemiringan gambar otomatis dan deteksi area teks. Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Lihat juga

* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

Mengenali teks pada gambar.  Mengenali gambar dengan kemampuan untuk menentukan[`RecognitionSettings`](../../recognitionsettings/) . Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| stream | MemoryStream | Aliran memori yang berisi gambar. |
| settings | RecognitionSettings | Pengaturan pengenalan. |

### Nilai Pengembalian

Itu[`RecognitionResult`](../../recognitionresult/) objek dengan hasil pengenalan citra.

### Lihat juga

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

Mengenali teks pada gambar.

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| imageData | Byte[] | Gambar yang didekodekan dalam array byte. Menggunakan teknologi pencahayaan RGB untuk bitsPerPixel &gt; 1. |
| width | Int32 | Lebar gambar. |
| height | Int32 | Tinggi gambar. |
| pixelFormat | PixelType | Mendukung byte, rgb, bgr, rgba. |
| settings | RecognitionSettings | Pengaturan pengenalan. |

### Nilai Pengembalian

Itu[`RecognitionResult`](../../recognitionresult/) objek dengan hasil pengenalan citra.

### Perkataan

Mengenali gambar dengan kemampuan untuk menentukan[`RecognitionSettings`](../../recognitionsettings/) . Mendukung baris data byte yang didekodekan.

### Lihat juga

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

Mengenali teks pada gambar.

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| imageData | Color[] | Gambar yang didekodekan dalam array Aspose.Drawing.Color. |
| width | Int32 | Lebar gambar. |
| height | Int32 | Tinggi gambar. |
| settings | RecognitionSettings | Pengaturan pengenalan. |

### Nilai Pengembalian

Itu[`RecognitionResult`](../../recognitionresult/) objek dengan hasil pengenalan citra.

### Perkataan

Mengenali gambar dengan kemampuan untuk menentukan[`RecognitionSettings`](../../recognitionsettings/) . Mendukung baris data byte yang didekodekan.

### Lihat juga

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)


