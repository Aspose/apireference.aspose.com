---
title: Class AsposeOcr
second_title: Справочник по Aspose.OCR для .NET API
description: Aspose.OCR.AsposeOcr сорт. Основной API для библиотеки Aspose OCR
type: docs
weight: 20
url: /ru/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

Основной API для библиотеки Aspose OCR

```csharp
public class AsposeOcr
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [AsposeOcr](asposeocr/#constructor)() | Инициализирует новый экземпляр`AsposeOcr` class. Пустой конструктор. |
| [AsposeOcr](asposeocr/#constructor_1)(string) | Инициализирует новый экземпляр`AsposeOcr` class. Установите разрешенные символы с помощью свойства алфавита. |

## Методы

| Имя | Описание |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew)(MemoryStream) | Вычисляет угол наклона изображения. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew_1)(string) | Вычисляет угол наклона изображения. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri/)(string) | Вычисляет угол наклона изображения из URI. |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts/)(string, string, RecognitionSettings, bool) | Проверить, содержат ли два изображения одинаковый текст. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling/)(string, SpellCheckLanguage, string) | Исправляет текст (заменяет слова с ошибками). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles)(MemoryStream, AreasType, bool) | Обнаруживает текстовые области на изображении.  Автоматическая коррекция перекоса изображения не применяется. Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles_1)(string, AreasType, bool) | Обнаруживает текстовые области на изображении.  Автоматическая коррекция перекоса изображения не применяется. Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext_1)(string, Regex, RecognitionSettings) | Проверить, соответствует ли текст изображения заданному регулярному выражению. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext)(string, string, RecognitionSettings, bool) | Проверить, содержит ли изображение предоставленный текстовый фрагмент. |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff/)(string, string, RecognitionSettings, bool) | Сравните тексты на двух изображениях и верните число, показывающее, насколько они похожи (от 0 до 1). |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage)(MemoryStream, PreprocessingFilter) | Используйте предварительную обработку изображения для повышения точности оптического распознавания символов. Создайте список фильтров, которые будут применяться к входному изображению в указанном вами порядке. пример создания фильтров: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter(6fScaleFilter. ), PreprocessingFilter.Dilate() }; Все они вам не нужны. Установите только то, что вам нужно. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage_1)(string, PreprocessingFilter) | Используйте предварительную обработку изображения для повышения точности оптического распознавания символов. Создайте список фильтров, которые будут применяться к входному изображению в указанном вами порядке. пример создания фильтров: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter(6fScaleFilter. ), PreprocessingFilter.Dilate() }; Все они вам не нужны. Установите только то, что вам нужно. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate)(MemoryStream, CarPlateRecognitionSettings) | Распознает номер автомобиля. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate_1)(string, CarPlateRecognitionSettings) | Распознает номер автомобиля. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu)(MemoryStream, DocumentRecognitionSettings) | Распознавание текста из многостраничного изображения DJVU.  Распознает файл DJVU с возможностью указать[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Поддерживает только DJVU. Не поддерживает другие типы изображений. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu_1)(string, DocumentRecognitionSettings) | Распознавание текста из многостраничного изображения DJVU.  Распознает файл DJVU с возможностью указать[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Поддерживает только DJVU. Не поддерживает другие типы изображений. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard)(MemoryStream, IDCardRecognitionSettings) | Распознает текст на удостоверении личности. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard_1)(string, IDCardRecognitionSettings) | Распознает текст на удостоверении личности. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_4)(MemoryStream) | Распознает текст на изображении. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_5)(string) | Распознает текст на изображении. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_2)(MemoryStream, RecognitionSettings) | Распознает текст на изображении.  Распознает изображение с возможностью указать[`RecognitionSettings`](../recognitionsettings/) . Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_3)(string, RecognitionSettings) | Распознает текст на изображении. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage)(Color[], int, int, RecognitionSettings) | Распознает текст на изображении. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_1)(byte[], int, int, PixelType, RecognitionSettings) | Распознает текст на изображении. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast)(MemoryStream) | Распознает текст на картинке с хорошим качеством. Не использует коррекцию перекоса и определение областей. Работает в быстром режиме. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast_1)(string) | Распознает текст на картинке с хорошим качеством. Не использует коррекцию перекоса и определение областей. Работает в быстром режиме. |
| [RecognizeImageFromBase64](../../aspose.ocr/asposeocr/recognizeimagefrombase64/)(string, RecognitionSettings) | Распознает текст на изображении в формате base64. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri/)(string, RecognitionSettings) | Распознает текст на изображении, предоставленном ссылкой URI. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice)(MemoryStream, InvoiceRecognitionSettings) | Распознает текст на изображении счета-фактуры. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice_1)(string, InvoiceRecognitionSettings) | Распознает текст на изображении счета-фактуры. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline)(MemoryStream) | Распознает изображение, содержащее одну строку текста.  Автоматическая коррекция перекоса изображения не применяется. Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline_1)(string) | Распознает изображение, содержащее одну строку текста.  Автоматическая коррекция перекоса изображения не применяется. Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages)(List&lt;string&gt;) | Распознает несколько изображений из списка с настройками по умолчанию.  Архивы и папки не поддерживаются. Максимальное количество обрабатываемых изображений 20. Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_2)(string) | Распознает несколько изображений, упакованных в ZIP-архив или из папки с настройками по умолчанию.  Вложенные архивы и папки не поддерживаются. Максимальное количество обрабатываемых изображений 20. Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Распознает несколько изображений из списка.  Архивы и папки не поддерживаются. Максимальное количество обрабатываемых изображений 20. Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_3)(string, RecognitionSettings) | Распознает несколько изображений, упакованных в ZIP-архив или из папки.  Вложенные архивы и папки не поддерживаются. Максимальное количество обрабатываемых изображений 20. Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport)(MemoryStream, PassportRecognitionSettings) | Распознает текст в паспортах. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport_1)(string, PassportRecognitionSettings) | Распознает текст в паспортах. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Распознать текст из отсканированного pdf (извлечь изображения).  Распознает pdf файл с возможностью указать[`RecognitionSettings`](../recognitionsettings/) . Поддерживает только отсканированные файлы PDF. Не поддерживает PDF с возможностью поиска. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf_1)(string, DocumentRecognitionSettings) | Распознать текст из отсканированного pdf (извлечь изображения).  Распознает pdf файл с возможностью указать[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Поддерживает только отсканированные файлы PDF. Не поддерживает PDF с возможностью поиска. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt)(MemoryStream, ReceiptRecognitionSettings) | Распознает текст на изображении. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt_1)(string, ReceiptRecognitionSettings) | Распознает текст на изображении. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff)(MemoryStream, DocumentRecognitionSettings) | Распознавание текста из многостраничного изображения TIFF.  Распознает файл TIFF с возможностью указать[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Поддерживает только формат TIFF (TIF). Не поддерживает другие типы изображений. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff_1)(string, DocumentRecognitionSettings) | Распознавание текста из многостраничного изображения TIFF.  Распознает файл TIFF с возможностью указать[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Поддерживает только формат TIFF (TIF). Не поддерживает другие типы изображений. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Позволяет получить многостраничный документ из списка объектов RecognitionResult |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Позволяет получить многостраничный документ из списка объектов RecognitionResult |

## События

| Имя | Описание |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress/) | Событие для отслеживания хода распознавания многостраничных изображений. |

### Смотрите также

* пространство имен [Aspose.OCR](../../aspose.ocr/)
* сборка [Aspose.OCR](../../)


