---
title: Class AsposeOcr
second_title: Aspose.OCR for .NET API Referansı
description: Aspose.OCR.AsposeOcr sınıf. Aspose OCR library için Ana API
type: docs
weight: 20
url: /tr/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

Aspose OCR library için Ana API

```csharp
public class AsposeOcr
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [AsposeOcr](asposeocr/#constructor)() | Yeni bir örneğini başlatır.`AsposeOcr` class. Boş yapıcı. |
| [AsposeOcr](asposeocr/#constructor_1)(string) | Yeni bir örneğini başlatır.`AsposeOcr` class. Alphabet özelliği ile izin verilen karakterleri ayarlayın. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew)(MemoryStream) | Bir görüntünün eğim açısını hesaplar. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew_1)(string) | Bir görüntünün eğim açısını hesaplar. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri/)(string) | Bir görüntünün eğrilik açısını URI'den hesaplar. |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts/)(string, string, RecognitionSettings, bool) | İki görüntünün aynı metni içerip içermediğini kontrol edin. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling/)(string, SpellCheckLanguage, string) | Metni düzeltir (yanlış yazılmış sözcükleri değiştirir). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles)(MemoryStream, AreasType, bool) | Görüntüdeki metin alanlarını algılar.  Otomatik görüntü eğriliği düzeltmesi uygulanmaz. GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles_1)(string, AreasType, bool) | Görüntüdeki metin alanlarını algılar.  Otomatik görüntü eğriliği düzeltmesi uygulanmaz. GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext_1)(string, Regex, RecognitionSettings) | Resim metninin sağlanan normal ifadeyle eşleşip eşleşmediğini kontrol edin. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext)(string, string, RecognitionSettings, bool) | Görüntünün sağlanan metin parçasını içerip içermediğini kontrol edin. |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff/)(string, string, RecognitionSettings, bool) | İki resimdeki metinleri karşılaştırın ve ne kadar benzer olduklarını gösteren bir sayı döndürün (0'dan 1'e). |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage)(MemoryStream, PreprocessingFilter) | OCR'nin doğruluğunu artırmak için görüntü ön işlemeyi kullanın. Girdi görüntüsüne sizin belirlediğiniz sırayla uygulanacak filtrelerin bir listesini oluşturun. filtre oluşturma örneği: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingSilter(filter) ), PreprocessingFilter.Dilate() }; Bunların hepsine ihtiyacınız yok. Yalnızca ihtiyacınız olanı ayarlayın. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage_1)(string, PreprocessingFilter) | OCR'nin doğruluğunu artırmak için görüntü ön işlemeyi kullanın. Girdi görüntüsüne sizin belirlediğiniz sırayla uygulanacak filtrelerin bir listesini oluşturun. filtre oluşturma örneği: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingSilter(filter) ), PreprocessingFilter.Dilate() }; Bunların hepsine ihtiyacınız yok. Yalnızca ihtiyacınız olanı ayarlayın. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate)(MemoryStream, CarPlateRecognitionSettings) | Araba plakasını tanır. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate_1)(string, CarPlateRecognitionSettings) | Araba plakasını tanır. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu)(MemoryStream, DocumentRecognitionSettings) | Çok sayfalı DJVU görüntüsündeki metni tanıyın.  Belirtme yeteneği ile DJVU dosyasını tanır[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Yalnızca DJVU'yu destekler. Diğer resim türlerini desteklemiyor. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu_1)(string, DocumentRecognitionSettings) | Çok sayfalı DJVU görüntüsündeki metni tanıyın.  Belirtme yeteneği ile DJVU dosyasını tanır[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Yalnızca DJVU'yu destekler. Diğer resim türlerini desteklemiyor. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard)(MemoryStream, IDCardRecognitionSettings) | Kimlik Kartındaki metni tanır. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard_1)(string, IDCardRecognitionSettings) | Kimlik Kartındaki metni tanır. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_4)(MemoryStream) | Resimdeki metni tanır. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_5)(string) | Resimdeki metni tanır. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_2)(MemoryStream, RecognitionSettings) | Resimdeki metni tanır.  Belirtme yeteneği ile görüntüyü tanır[`RecognitionSettings`](../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_3)(string, RecognitionSettings) | Resimdeki metni tanır. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage)(Color[], int, int, RecognitionSettings) | Resimdeki metni tanır. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_1)(byte[], int, int, PixelType, RecognitionSettings) | Resimdeki metni tanır. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast)(MemoryStream) | Görüntüdeki metni iyi kalitede tanır. Eğim düzeltme ve alan algılama kullanmaz. Hızlı modda çalışır. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast_1)(string) | Görüntüdeki metni iyi kalitede tanır. Eğim düzeltme ve alan algılama kullanmaz. Hızlı modda çalışır. |
| [RecognizeImageFromBase64](../../aspose.ocr/asposeocr/recognizeimagefrombase64/)(string, RecognitionSettings) | Base64 type. 'de sağlanan resimdeki metni tanır. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri/)(string, RecognitionSettings) | URI bağlantısı tarafından sağlanan resimdeki metni tanır. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice)(MemoryStream, InvoiceRecognitionSettings) | Fatura resmindeki metni tanır. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice_1)(string, InvoiceRecognitionSettings) | Fatura resmindeki metni tanır. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline)(MemoryStream) | Tek satırlık metin içeren görüntüyü tanır.  Otomatik görüntü eğriliği düzeltmesi uygulanmaz. GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline_1)(string) | Tek satırlık metin içeren görüntüyü tanır.  Otomatik görüntü eğriliği düzeltmesi uygulanmaz. GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages)(List&lt;string&gt;) | Varsayılan ayarlarla listedeki birden çok görüntüyü tanır.  Arşivler ve klasörler desteklenmez. Maksimum işlenen görüntü miktarı 20'dir. GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_2)(string) | ZIP arşivinde veya varsayılan ayarlarla klasörden paketlenmiş birden çok görüntüyü tanır.  İç içe geçmiş arşivler ve klasörler desteklenmez. Maksimum işlenen görüntü miktarı 20'dir. GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Listedeki birden çok görüntüyü tanır.  Arşivler ve klasörler desteklenmez. Maksimum işlenen görüntü miktarı 20'dir. GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_3)(string, RecognitionSettings) | ZIP arşivinde veya klasörden paketlenmiş birden çok görüntüyü tanır.  İç içe geçmiş arşivler ve klasörler desteklenmez. Maksimum işlenen görüntü miktarı 20'dir. GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport)(MemoryStream, PassportRecognitionSettings) | Pasaportlardaki metni tanır. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport_1)(string, PassportRecognitionSettings) | Pasaportlardaki metni tanır. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Taranan pdf'den metni tanıyın (resimleri çıkarın).  Belirtme yeteneği ile pdf dosyasını tanır[`RecognitionSettings`](../recognitionsettings/) . Yalnızca Taranan PDF'yi destekler. Aranabilir PDF'yi desteklemiyor. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf_1)(string, DocumentRecognitionSettings) | Taranan pdf'den metni tanıyın (resimleri çıkarın).  Belirtme yeteneği ile pdf dosyasını tanır[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Yalnızca Taranan PDF'yi destekler. Aranabilir PDF'yi desteklemiyor. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt)(MemoryStream, ReceiptRecognitionSettings) | Resimdeki metni tanır. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt_1)(string, ReceiptRecognitionSettings) | Resimdeki metni tanır. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff)(MemoryStream, DocumentRecognitionSettings) | Çok sayfalı TIFF görüntüsündeki metni tanıyın.  TIFF dosyasını belirleme yeteneği ile tanır[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Yalnızca TIFF'i (TIF) destekler. Diğer resim türlerini desteklemiyor. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff_1)(string, DocumentRecognitionSettings) | Çok sayfalı TIFF görüntüsündeki metni tanıyın.  TIFF dosyasını belirleme yeteneği ile tanır[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Yalnızca TIFF'i (TIF) destekler. Diğer resim türlerini desteklemiyor. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | RecognitionResult nesneleri listesinden çok sayfalı belge almayı sağlar |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | RecognitionResult nesneleri listesinden çok sayfalı belge almayı sağlar |

## Olaylar

| İsim | Tanım |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress/) | Çok sayfalı görüntü tanımanın ilerlemesini izlemek için bir olay. |

### Ayrıca bakınız

* ad alanı [Aspose.OCR](../../aspose.ocr/)
* toplantı [Aspose.OCR](../../)


