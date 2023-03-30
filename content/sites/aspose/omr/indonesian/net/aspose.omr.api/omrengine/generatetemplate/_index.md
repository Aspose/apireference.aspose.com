---
title: OmrEngine.GenerateTemplate
second_title: Aspose.OMR untuk Referensi .NET API
description: OmrEngine metode. Membuat template .omr dan gambar template berdasarkan MemoryStream
type: docs
weight: 40
url: /id/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) {#generatetemplate_2}

Membuat template (.omr) dan gambar template berdasarkan MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null, Encoding encoding = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| stream | MemoryStream | Aliran yang berisi baris markup |
| settings | GlobalPageSettings | Pengaturan global berlaku untuk semua elemen halaman |
| userImages | ImageCollection | Kumpulan gambar yang dapat digunakan untuk pembuatan template. Izinkan untuk menggunakan gambar dari MemoryStream alih-alih sistem file |
| encoding | Encoding | pengkodean baris markup, secara default UTF-8 digunakan |

### Nilai Pengembalian

Hasil generasi

### Lihat juga

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* ruang nama [Aspose.OMR.Api](../../omrengine/)
* perakitan [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection, Encoding) {#generatetemplate_1}

Membuat template (.omr) dan gambar template berdasarkan MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null, 
    Encoding encoding = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| stream | MemoryStream | Aliran yang berisi baris markup |
| userImages | ImageCollection | Kumpulan gambar yang dapat digunakan untuk pembuatan template. Izinkan untuk menggunakan gambar dari MemoryStream alih-alih sistem file |
| encoding | Encoding | pengkodean baris markup, secara default UTF-8 digunakan |

### Nilai Pengembalian

Hasil generasi

### Lihat juga

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* ruang nama [Aspose.OMR.Api](../../omrengine/)
* perakitan [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

Membuat template (.omr) dan gambar template berdasarkan array garis markup

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| markupLines | String[] | Array garis markup |
| settings | GlobalPageSettings | Pengaturan global berlaku untuk semua elemen halaman |
| userImages | ImageCollection | Kumpulan gambar yang dapat digunakan untuk pembuatan template. Izinkan untuk menggunakan gambar dari MemoryStream alih-alih sistem file |

### Nilai Pengembalian

Hasil generasi

### Lihat juga

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* ruang nama [Aspose.OMR.Api](../../omrengine/)
* perakitan [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

Membuat template (.omr) dan gambar template berdasarkan array garis markup

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| markupLines | String[] | Array garis markup |
| userImages | ImageCollection | Kumpulan gambar yang dapat digunakan untuk pembuatan template. Izinkan untuk menggunakan gambar dari MemoryStream alih-alih sistem file |

### Nilai Pengembalian

Hasil generasi

### Lihat juga

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* ruang nama [Aspose.OMR.Api](../../omrengine/)
* perakitan [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings, Encoding) {#generatetemplate_3}

Membuat template (.omr) dan gambar template berdasarkan markup teks

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings, 
    Encoding encoding = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| markupPath | String | Jalur ke file markup teks |
| settings | GlobalPageSettings | Pengaturan global berlaku untuk semua elemen halaman |
| encoding | Encoding | pengkodean file markup, secara default UTF-8 digunakan |

### Nilai Pengembalian

Hasil generasi

### Lihat juga

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [OmrEngine](../)
* ruang nama [Aspose.OMR.Api](../../omrengine/)
* perakitan [Aspose.OMR](../../../)

---

## GenerateTemplate(string, Encoding) {#generatetemplate_5}

Membuat template (.omr) dan gambar template berdasarkan markup teks

```csharp
public GenerationResult GenerateTemplate(string markupPath, Encoding encoding = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| markupPath | String | Jalur ke file markup teks |
| encoding | Encoding | pengkodean file markup, secara default UTF-8 digunakan |

### Nilai Pengembalian

Hasil generasi

### Lihat juga

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* ruang nama [Aspose.OMR.Api](../../omrengine/)
* perakitan [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[], Encoding) {#generatetemplate_4}

Membuat template (.omr) dan gambar template berdasarkan markup teks

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths, 
    Encoding encoding = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| markupPath | String | Jalur ke file markup teks |
| imagesPaths | String[] | Jalur lengkap ke gambar yang digunakan dalam pembuatan |
| encoding | Encoding | pengkodean file markup, secara default UTF-8 digunakan |

### Nilai Pengembalian

Hasil generasi

### Lihat juga

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* ruang nama [Aspose.OMR.Api](../../omrengine/)
* perakitan [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

Membuat template (.omr) dan gambar template berdasarkan objek Template

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| config | TemplateConfig | Objek template yang mewakili semua elemen |
| settings | GlobalPageSettings | pengaturan global yang digunakan di semua pembuatan template |
| userImages | ImageCollection | Kumpulan gambar yang dapat digunakan untuk pembuatan template. Izinkan untuk menggunakan gambar dari MemoryStream alih-alih sistem file |

### Nilai Pengembalian

Hasil generasi

### Lihat juga

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* ruang nama [Aspose.OMR.Api](../../omrengine/)
* perakitan [Aspose.OMR](../../../)


