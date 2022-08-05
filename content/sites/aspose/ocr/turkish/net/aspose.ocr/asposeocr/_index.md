---
title: AsposeOcr
second_title: Aspose.OCR for .NET API Referansı
description: Aspose OCR kitaplığı için ana API
type: docs
weight: 20
url: /tr/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

Aspose OCR kitaplığı için ana API

```csharp
public class AsposeOcr
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [AsposeOcr](asposeocr#constructor)() | Yeni bir örneğini başlatır[`AsposeOcr`](../asposeocr) class. Boş yapıcı. |
| [AsposeOcr](asposeocr#constructor_1)(string) | Yeni bir örneğini başlatır[`AsposeOcr`](../asposeocr) class. İzin verilen karakterleri alfabe özelliği ile ayarlayın. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew)(MemoryStream) | Bir görüntünün eğrilik açısını hesaplar. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew_1)(string) | Bir görüntünün eğrilik açısını hesaplar. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri)(string) | URI'den bir görüntünün eğrilik açısını hesaplar. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling)(string, SpellCheckLanguage, string) | Metni düzeltir (yanlış yazılmış sözcüklerin yerini alır). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles)(MemoryStream, AreasType, bool) | Resimdeki metin alanlarını algılar.  Otomatik görüntü eğriliği düzeltmesi uygulanmaz. GIF, PNG, JPEG, BMP, TIFF desteği. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles_1)(string, AreasType, bool) | Resimdeki metin alanlarını algılar.  Otomatik görüntü eğriliği düzeltmesi uygulanmaz. GIF, PNG, JPEG, BMP, TIFF desteği. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage)(MemoryStream, PreprocessingFilter) | OCR'nin doğruluğunu artırmak için görüntü ön işlemeyi kullanın. Girdi görüntüsüne belirttiğiniz sırada uygulanacak bir filtre listesi oluşturun. Filtre oluşturmak için örnek: ÖnişlemeFiltre filtreleri = yeni ÖnişlemeFiltresi { ÖnişlemeFiltresi.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilter000Typed.Box),_l ), PreprocessingFilter.Dilate() }; Hepsine ihtiyacınız yok. Yalnızca ihtiyacınız olanı ayarlayın. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage_1)(string, PreprocessingFilter) | OCR'nin doğruluğunu artırmak için görüntü ön işlemeyi kullanın. Girdi görüntüsüne belirttiğiniz sırada uygulanacak bir filtre listesi oluşturun. Filtre oluşturmak için örnek: ÖnişlemeFiltre filtreleri = yeni ÖnişlemeFiltresi { ÖnişlemeFiltresi.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilter000Typed.Box),_l ), PreprocessingFilter.Dilate() }; Hepsine ihtiyacınız yok. Yalnızca ihtiyacınız olanı ayarlayın. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu)(string, DocumentRecognitionSettings) | Çok sayfalı DJVU görüntüsündeki metni tanıyın.  Belirtme yeteneği ile DJVU dosyasını tanır[`DocumentRecognitionSettings`](../documentrecognitionsettings) . Yalnızca DJVU'yu destekler. Diğer resim türlerini desteklemez. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_4)(MemoryStream) | Resimdeki metni tanır. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_6)(string) | Resimdeki metni tanır. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage)(MemoryStream, RecognitionSettings) | Resimdeki metni tanır.  Resmi, belirtme yeteneğiyle tanır[`RecognitionSettings`](../recognitionsettings) . GIF, PNG, JPEG, BMP, TIFF'yi destekler. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_1)(string, RecognitionSettings) | Resimdeki metni tanır. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast)(MemoryStream) | Görüntüdeki metni iyi kalitede tanıyın. Eğrilik düzeltme ve alan algılamayı kullanmaz. Hızlı modda çalışır. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast_1)(string) | Görüntüdeki metni iyi kalitede tanıyın. Eğrilik düzeltme ve alan algılamayı kullanmaz. Hızlı modda çalışır. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri_1)(string) | URI bağlantısı tarafından sağlanan resimdeki metni tanır. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri)(string, RecognitionSettings) | URI bağlantısı tarafından sağlanan resimdeki metni tanır. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline)(MemoryStream) | Tek satır metin içeren resmi tanır.  Otomatik görüntü eğriliği düzeltmesi uygulanmaz. GIF, PNG, JPEG, BMP, TIFF'yi destekler. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline_1)(string) | Tek satır metin içeren resmi tanır.  Otomatik görüntü eğriliği düzeltmesi uygulanmaz. GIF, PNG, JPEG, BMP, TIFF'yi destekler. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages)(List&lt;string&gt;) | Varsayılan ayarlarla listeden birden çok görüntüyü tanır.  Arşivler ve klasörler desteklenmez. Maksimum işlenen resim miktarı 20. GIF, PNG, JPEG, BMP, TIFF'yi destekler. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_2)(string) | ZIP arşivinde veya varsayılan ayarlarla klasörden paketlenmiş birden çok görüntüyü tanır.  İç içe arşivler ve klasörler desteklenmez. Maksimum işlenen resim miktarı 20. GIF, PNG, JPEG, BMP, TIFF'yi destekler. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Listeden birden çok görüntüyü tanır.  Arşivler ve klasörler desteklenmez. Maksimum işlenen resim miktarı 20. GIF, PNG, JPEG, BMP, TIFF'yi destekler. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_3)(string, RecognitionSettings) | ZIP arşivinde veya klasörden paketlenmiş birden çok görüntüyü tanır.  İç içe arşivler ve klasörler desteklenmez. Maksimum işlenen resim miktarı 20. GIF, PNG, JPEG, BMP, TIFF'yi destekler. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Taranan pdf'deki metni tanıyın (görüntüleri ayıklayın).  Belirtme yeteneği ile pdf dosyasını tanır[`RecognitionSettings`](../recognitionsettings) . Yalnızca Taranan PDF'yi destekler. Aranabilir PDF'yi desteklemez. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf_1)(string, DocumentRecognitionSettings) | Taranan pdf'deki metni tanıyın (görüntüleri ayıklayın).  Belirtme yeteneği ile pdf dosyasını tanır[`RecognitionSettings`](../recognitionsettings) . Yalnızca Taranan PDF'yi destekler. Aranabilir PDF'yi desteklemez. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff)(string, DocumentRecognitionSettings) | Çok sayfalı TIFF görüntüsündeki metni tanıyın.  Belirtme yeteneği ile TIFF dosyasını tanır[`DocumentRecognitionSettings`](../documentrecognitionsettings) . Yalnızca TIFF'yi (TIF) destekler. Diğer resim türlerini desteklemez. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | RecognitionResult nesneleri listesinden çok sayfalı belge alınmasına izin verir |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | RecognitionResult nesneleri listesinden çok sayfalı belge alınmasına izin verir |

### Ayrıca bakınız

* ad alanı [Aspose.OCR](../../aspose.ocr)
* toplantı [Aspose.OCR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
