---
title: AsposeOcr.GetRectangles
second_title: Aspose.OCR untuk .NET API Referensi
description: AsposeOcr metode. Mendeteksi area teks pada gambar.  Koreksi kemiringan gambar otomatis tidak diterapkan. Mendukung GIF PNG JPEG BMP TIFF JFIF.
type: docs
weight: 70
url: /id/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

Mendeteksi area teks pada gambar.  Koreksi kemiringan gambar otomatis tidak diterapkan. Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| fullPath | String | Jalan ke gambar. |
| areasType | AreasType | Menentukan persegi panjang mana yang akan ditampilkan - baris atau paragraf. |
| detectAreas | Boolean | Aktifkan deteksi area teks otomatis. |

### Nilai Pengembalian

Daftar area atau baris teks yang terdeteksi.

### Lihat juga

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

Mendeteksi area teks pada gambar.  Koreksi kemiringan gambar otomatis tidak diterapkan. Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| image | MemoryStream | Aliran memori yang berisi gambar. |
| areasType | AreasType | Menentukan persegi panjang mana yang akan ditampilkan - baris atau paragraf. |
| detectAreas | Boolean | Aktifkan deteksi area teks otomatis. |

### Nilai Pengembalian

Daftar area atau baris teks yang terdeteksi.

### Lihat juga

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)


