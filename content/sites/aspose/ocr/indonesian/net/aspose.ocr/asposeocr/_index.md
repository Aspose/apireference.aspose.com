---
title: Class AsposeOcr
second_title: Aspose.OCR untuk .NET API Referensi
description: Aspose.OCR.AsposeOcr kelas. API Utama untuk pustaka Aspose OCR
type: docs
weight: 20
url: /id/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

API Utama untuk pustaka Aspose OCR

```csharp
public class AsposeOcr
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [AsposeOcr](asposeocr/#constructor)() | Menginisialisasi instance baru dari`AsposeOcr` class. Konstruktor kosong. |
| [AsposeOcr](asposeocr/#constructor_1)(string) | Menginisialisasi instance baru dari`AsposeOcr` class. Tetapkan karakter yang diizinkan dengan properti alfabet. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew)(MemoryStream) | Menghitung sudut kemiringan gambar. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew_1)(string) | Menghitung sudut kemiringan gambar. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri/)(string) | Menghitung sudut kemiringan gambar dari URI. |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts/)(string, string, RecognitionSettings, bool) | Periksa apakah dua gambar berisi teks yang sama. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling/)(string, SpellCheckLanguage, string) | Memperbaiki teks (mengganti kata yang salah eja). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles)(MemoryStream, AreasType, bool) | Mendeteksi area teks pada gambar.  Koreksi kemiringan gambar otomatis tidak diterapkan. Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles_1)(string, AreasType, bool) | Mendeteksi area teks pada gambar.  Koreksi kemiringan gambar otomatis tidak diterapkan. Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext_1)(string, Regex, RecognitionSettings) | Periksa apakah teks gambar cocok dengan ekspresi reguler yang diberikan. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext)(string, string, RecognitionSettings, bool) | Periksa apakah gambar berisi fragmen teks yang disediakan. |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff/)(string, string, RecognitionSettings, bool) | Bandingkan teks pada kedua gambar dan kembalikan angka yang menunjukkan seberapa mirip keduanya (0 hingga 1). |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage)(MemoryStream, PreprocessingFilter) | Gunakan preprocessing gambar untuk meningkatkan akurasi OCR. Buat daftar filter yang akan diterapkan ke gambar input dalam urutan yang Anda tentukan. contoh untuk membuat filter: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), ScaleFilter(setelah. ), PreprocessingFilter.Dilate() }; Anda tidak membutuhkan semuanya. Tetapkan hanya yang Anda butuhkan. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage_1)(string, PreprocessingFilter) | Gunakan preprocessing gambar untuk meningkatkan akurasi OCR. Buat daftar filter yang akan diterapkan ke gambar input dalam urutan yang Anda tentukan. contoh untuk membuat filter: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), ScaleFilter(setelah. ), PreprocessingFilter.Dilate() }; Anda tidak membutuhkan semuanya. Tetapkan hanya yang Anda butuhkan. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate)(MemoryStream, CarPlateRecognitionSettings) | Mengenal plat mobil. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate_1)(string, CarPlateRecognitionSettings) | Mengenal plat mobil. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu)(MemoryStream, DocumentRecognitionSettings) | Mengenali teks dari gambar DJVU multi-halaman.  Mengenali file DJVU dengan kemampuan untuk menentukan[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Hanya mendukung DJVU. Tidak mendukung jenis gambar lain. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu_1)(string, DocumentRecognitionSettings) | Mengenali teks dari gambar DJVU multi-halaman.  Mengenali file DJVU dengan kemampuan untuk menentukan[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Hanya mendukung DJVU. Tidak mendukung jenis gambar lain. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard)(MemoryStream, IDCardRecognitionSettings) | Mengenali teks pada KTP. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard_1)(string, IDCardRecognitionSettings) | Mengenali teks pada KTP. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_4)(MemoryStream) | Mengenali teks pada gambar. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_5)(string) | Mengenali teks pada gambar. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_2)(MemoryStream, RecognitionSettings) | Mengenali teks pada gambar.  Mengenali gambar dengan kemampuan untuk menentukan[`RecognitionSettings`](../recognitionsettings/) . Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_3)(string, RecognitionSettings) | Mengenali teks pada gambar. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage)(Color[], int, int, RecognitionSettings) | Mengenali teks pada gambar. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_1)(byte[], int, int, PixelType, RecognitionSettings) | Mengenali teks pada gambar. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast)(MemoryStream) | Kenali teks pada gambar dengan kualitas yang baik. Tidak menggunakan koreksi kemiringan dan deteksi area. Bekerja dalam mode cepat. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast_1)(string) | Kenali teks pada gambar dengan kualitas yang baik. Tidak menggunakan koreksi kemiringan dan deteksi area. Bekerja dalam mode cepat. |
| [RecognizeImageFromBase64](../../aspose.ocr/asposeocr/recognizeimagefrombase64/)(string, RecognitionSettings) | Mengenali teks pada gambar yang disediakan dalam tipe base64. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri/)(string, RecognitionSettings) | Mengenali teks pada gambar yang disediakan oleh tautan URI. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice)(MemoryStream, InvoiceRecognitionSettings) | Mengenali teks pada gambar faktur. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice_1)(string, InvoiceRecognitionSettings) | Mengenali teks pada gambar faktur. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline)(MemoryStream) | Mengenali gambar yang berisi satu baris teks.  Koreksi kemiringan gambar otomatis tidak diterapkan. Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline_1)(string) | Mengenali gambar yang berisi satu baris teks.  Koreksi kemiringan gambar otomatis tidak diterapkan. Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages)(List&lt;string&gt;) | Mengenali banyak gambar dari daftar dengan pengaturan default.  Arsip dan folder tidak didukung. Jumlah maksimum gambar yang diproses adalah 20. Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_2)(string) | Mengenali banyak gambar yang dikemas dalam arsip ZIP atau dari folder dengan pengaturan default.  Arsip dan folder bersarang tidak didukung. Jumlah maksimum gambar yang diproses adalah 20. Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Mengenali banyak gambar dari daftar.  Arsip dan folder tidak didukung. Jumlah maksimum gambar yang diproses adalah 20. Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_3)(string, RecognitionSettings) | Mengenali banyak gambar yang dikemas dalam arsip ZIP atau dari folder.  Arsip dan folder bersarang tidak didukung. Jumlah maksimum gambar yang diproses adalah 20. Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport)(MemoryStream, PassportRecognitionSettings) | Mengenali teks pada paspor. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport_1)(string, PassportRecognitionSettings) | Mengenali teks pada paspor. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Kenali teks dari pdf yang dipindai (ekstrak gambar).  Mengenali file pdf dengan kemampuan untuk menentukan[`RecognitionSettings`](../recognitionsettings/) . Hanya mendukung PDF yang dipindai. Tidak mendukung PDF yang Dapat Ditelusuri. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf_1)(string, DocumentRecognitionSettings) | Kenali teks dari pdf yang dipindai (ekstrak gambar).  Mengenali file pdf dengan kemampuan untuk menentukan[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Hanya mendukung PDF yang dipindai. Tidak mendukung PDF yang Dapat Ditelusuri. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt)(MemoryStream, ReceiptRecognitionSettings) | Mengenali teks pada gambar. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt_1)(string, ReceiptRecognitionSettings) | Mengenali teks pada gambar. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff)(MemoryStream, DocumentRecognitionSettings) | Mengenali teks dari gambar TIFF multi-halaman.  Mengenali file TIFF dengan kemampuan untuk menentukan[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Hanya mendukung TIFF (TIF). Tidak mendukung jenis gambar lain. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff_1)(string, DocumentRecognitionSettings) | Mengenali teks dari gambar TIFF multi-halaman.  Mengenali file TIFF dengan kemampuan untuk menentukan[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Hanya mendukung TIFF (TIF). Tidak mendukung jenis gambar lain. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Memungkinkan untuk mendapatkan dokumen multi halaman dari daftar objek RecognitionResult |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Memungkinkan untuk mendapatkan dokumen multi halaman dari daftar objek RecognitionResult |

## Acara

| Nama | Keterangan |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress/) | Acara untuk melacak progres pengenalan gambar multi-halaman. |

### Lihat juga

* ruang nama [Aspose.OCR](../../aspose.ocr/)
* perakitan [Aspose.OCR](../../)


