---
title: Class AsposeOcr
second_title: .NET API 참조용 Aspose.OCR
description: Aspose.OCR.AsposeOcr 수업. Aspose OCR용 기본 API library
type: docs
weight: 20
url: /ko/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

Aspose OCR용 기본 API library

```csharp
public class AsposeOcr
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [AsposeOcr](asposeocr/#constructor)() | 의 새 인스턴스를 초기화합니다.`AsposeOcr` class. 빈 생성자. |
| [AsposeOcr](asposeocr/#constructor_1)(string) | 의 새 인스턴스를 초기화합니다.`AsposeOcr` class. 허용되는 문자를 알파벳 속성으로 설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew)(MemoryStream) | 이미지의 기울기 각도를 계산합니다. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew_1)(string) | 이미지의 기울기 각도를 계산합니다. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri/)(string) | URI에서 이미지의 기울기 각도를 계산합니다. |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts/)(string, string, RecognitionSettings, bool) | 두 이미지에 동일한 텍스트가 포함되어 있는지 확인합니다. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling/)(string, SpellCheckLanguage, string) | 텍스트를 수정합니다(철자가 틀린 단어 교체). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles)(MemoryStream, AreasType, bool) | 이미지에서 텍스트 영역을 감지합니다.  자동 이미지 왜곡 보정이 적용되지 않습니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles_1)(string, AreasType, bool) | 이미지에서 텍스트 영역을 감지합니다.  자동 이미지 왜곡 보정이 적용되지 않습니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext_1)(string, Regex, RecognitionSettings) | 이미지 텍스트가 제공된 정규식과 일치하는지 확인합니다. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext)(string, string, RecognitionSettings, bool) | 이미지에 제공된 텍스트 조각이 포함되어 있는지 확인하십시오. |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff/)(string, string, RecognitionSettings, bool) | 두 이미지의 텍스트를 비교하고 얼마나 유사한지를 나타내는 숫자를 반환합니다(0에서 1). |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage)(MemoryStream, PreprocessingFilter) | 이미지 전처리를 사용하여 OCR의 정확도를 높입니다. 지정한 순서대로 입력 이미지에 적용될 필터 목록을 만듭니다. 필터를 만드는 예: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), ScalefilfilterFilterType. ), PreprocessingFilter.Dilate() }; 모두 필요하지는 않습니다. 필요한 것만 설정하세요. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage_1)(string, PreprocessingFilter) | 이미지 전처리를 사용하여 OCR의 정확도를 높입니다. 지정한 순서대로 입력 이미지에 적용될 필터 목록을 만듭니다. 필터를 만드는 예: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), ScalefilfilterFilterType. ), PreprocessingFilter.Dilate() }; 모두 필요하지는 않습니다. 필요한 것만 설정하세요. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate)(MemoryStream, CarPlateRecognitionSettings) | 자동차 번호판을 인식합니다. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate_1)(string, CarPlateRecognitionSettings) | 자동차 번호판을 인식합니다. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu)(MemoryStream, DocumentRecognitionSettings) | 다중 페이지 DJVU 이미지에서 텍스트를 인식합니다.  지정할 수 있는 기능으로 DJVU 파일을 인식합니다.[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . DJVU만 지원합니다. 다른 이미지 유형을 지원하지 않습니다. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu_1)(string, DocumentRecognitionSettings) | 다중 페이지 DJVU 이미지에서 텍스트를 인식합니다.  지정할 수 있는 기능으로 DJVU 파일을 인식합니다.[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . DJVU만 지원합니다. 다른 이미지 유형을 지원하지 않습니다. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard)(MemoryStream, IDCardRecognitionSettings) | ID 카드의 텍스트를 인식합니다. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard_1)(string, IDCardRecognitionSettings) | ID 카드의 텍스트를 인식합니다. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_4)(MemoryStream) | 이미지의 텍스트를 인식합니다. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_5)(string) | 이미지의 텍스트를 인식합니다. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_2)(MemoryStream, RecognitionSettings) | 이미지의 텍스트를 인식합니다.  지정하는 기능으로 이미지를 인식합니다.[`RecognitionSettings`](../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_3)(string, RecognitionSettings) | 이미지의 텍스트를 인식합니다. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage)(Color[], int, int, RecognitionSettings) | 이미지의 텍스트를 인식합니다. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_1)(byte[], int, int, PixelType, RecognitionSettings) | 이미지의 텍스트를 인식합니다. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast)(MemoryStream) | 이미지의 텍스트를 좋은 품질로 인식합니다. 왜곡 보정 및 영역 감지를 사용하지 않습니다. 빠른 모드에서 작동합니다. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast_1)(string) | 이미지의 텍스트를 좋은 품질로 인식합니다. 왜곡 보정 및 영역 감지를 사용하지 않습니다. 빠른 모드에서 작동합니다. |
| [RecognizeImageFromBase64](../../aspose.ocr/asposeocr/recognizeimagefrombase64/)(string, RecognitionSettings) | base64 형식으로 제공되는 이미지의 텍스트를 인식합니다. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri/)(string, RecognitionSettings) | URI 링크에서 제공하는 이미지의 텍스트를 인식합니다. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice)(MemoryStream, InvoiceRecognitionSettings) | 인보이스 이미지의 텍스트를 인식합니다. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice_1)(string, InvoiceRecognitionSettings) | 인보이스 이미지의 텍스트를 인식합니다. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline)(MemoryStream) | 한 줄의 텍스트가 포함된 이미지를 인식합니다.  자동 이미지 왜곡 보정이 적용되지 않습니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline_1)(string) | 한 줄의 텍스트가 포함된 이미지를 인식합니다.  자동 이미지 왜곡 보정이 적용되지 않습니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages)(List&lt;string&gt;) | 기본 설정으로 목록에서 여러 이미지를 인식합니다.  아카이브 및 폴더는 지원되지 않습니다. 최대 처리 이미지 수는 20입니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_2)(string) | ZIP 아카이브 또는 기본 설정으로 폴더에서 압축된 여러 이미지를 인식합니다.  중첩된 아카이브 및 폴더는 지원되지 않습니다. 처리된 이미지의 최대 양은 20입니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | 목록에서 여러 이미지를 인식합니다.  아카이브 및 폴더는 지원되지 않습니다. 최대 처리 이미지 수는 20입니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_3)(string, RecognitionSettings) | ZIP 아카이브 또는 폴더에서 압축된 여러 이미지를 인식합니다.  중첩된 아카이브 및 폴더는 지원되지 않습니다. 처리된 이미지의 최대 양은 20입니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport)(MemoryStream, PassportRecognitionSettings) | 여권의 텍스트를 인식합니다. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport_1)(string, PassportRecognitionSettings) | 여권의 텍스트를 인식합니다. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | 스캔한 PDF에서 텍스트를 인식합니다(이미지 추출).  지정하는 기능으로 pdf 파일을 인식합니다.[`RecognitionSettings`](../recognitionsettings/) . 스캔한 PDF만 지원합니다. 검색 가능한 PDF를 지원하지 않습니다. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf_1)(string, DocumentRecognitionSettings) | 스캔한 PDF에서 텍스트를 인식합니다(이미지 추출).  지정하는 기능으로 pdf 파일을 인식합니다.[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . 스캔한 PDF만 지원합니다. 검색 가능한 PDF를 지원하지 않습니다. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt)(MemoryStream, ReceiptRecognitionSettings) | 이미지의 텍스트를 인식합니다. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt_1)(string, ReceiptRecognitionSettings) | 이미지의 텍스트를 인식합니다. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff)(MemoryStream, DocumentRecognitionSettings) | 다중 페이지 TIFF 이미지에서 텍스트를 인식합니다.  지정하는 기능으로 TIFF 파일을 인식합니다.[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . TIFF(TIF)만 지원합니다. 다른 이미지 유형을 지원하지 않습니다. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff_1)(string, DocumentRecognitionSettings) | 다중 페이지 TIFF 이미지에서 텍스트를 인식합니다.  지정하는 기능으로 TIFF 파일을 인식합니다.[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . TIFF(TIF)만 지원합니다. 다른 이미지 유형을 지원하지 않습니다. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | RecognitionResult objects 목록에서 여러 페이지 문서를 가져올 수 있습니다. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | RecognitionResult objects 목록에서 여러 페이지 문서를 가져올 수 있습니다. |

## 이벤트

| 이름 | 설명 |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress/) | 다중 페이지 이미지 인식 진행 상황을 추적하는 이벤트입니다. |

### 또한보십시오

* 네임스페이스 [Aspose.OCR](../../aspose.ocr/)
* 집회 [Aspose.OCR](../../)


