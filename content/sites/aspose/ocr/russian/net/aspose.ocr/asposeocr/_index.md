---
title: AsposeOcr
second_title: Справочник по Aspose.OCR для .NET API
description: Основной API для библиотеки Aspose OCR
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
| [AsposeOcr](asposeocr#constructor)() | Инициализирует новый экземпляр[`AsposeOcr`](../asposeocr) class. Пустой конструктор. |
| [AsposeOcr](asposeocr#constructor_1)(string) | Инициализирует новый экземпляр[`AsposeOcr`](../asposeocr) class. Установите разрешенные символы с помощью свойства алфавита. |

## Методы

| Имя | Описание |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew)(MemoryStream) | Вычисляет угол наклона изображения. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew_1)(string) | Вычисляет угол наклона изображения. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri)(string) | Вычисляет угол наклона изображения из URI. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling)(string, SpellCheckLanguage, string) | Исправляет текст (заменяет слова с ошибками). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles)(MemoryStream, AreasType, bool) | Обнаруживает текстовые области на изображении.  Автоматическая коррекция перекоса изображения не применяется. Поддержка форматов GIF, PNG, JPEG, BMP, TIFF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles_1)(string, AreasType, bool) | Обнаруживает текстовые области на изображении.  Автоматическая коррекция перекоса изображения не применяется. Поддержка форматов GIF, PNG, JPEG, BMP, TIFF. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage)(MemoryStream, PreprocessingFilter) | Используйте предварительную обработку изображения для повышения точности оптического распознавания символов. Создайте список фильтров, которые будут применяться к входному изображению в указанном вами порядке. пример создания фильтров: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter(6fScale.Filter. ), PreprocessingFilter.Dilate() }; Все они вам не нужны. Установите только то, что вам нужно. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage_1)(string, PreprocessingFilter) | Используйте предварительную обработку изображения для повышения точности оптического распознавания символов. Создайте список фильтров, которые будут применяться к входному изображению в указанном вами порядке. пример создания фильтров: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter(6fScale.Filter. ), PreprocessingFilter.Dilate() }; Все они вам не нужны. Установите только то, что вам нужно. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu)(string, DocumentRecognitionSettings) | Распознавание текста из многостраничного изображения DJVU.  Распознает файл DJVU с возможностью указать[`DocumentRecognitionSettings`](../documentrecognitionsettings) . Поддерживает только DJVU. Не поддерживает другие типы изображений. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_4)(MemoryStream) | Распознает текст на изображении. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_6)(string) | Распознает текст на изображении. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage)(MemoryStream, RecognitionSettings) | Распознает текст на изображении.  Распознает изображение с возможностью указать[`RecognitionSettings`](../recognitionsettings) . Поддерживает GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_1)(string, RecognitionSettings) | Распознает текст на изображении. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast)(MemoryStream) | Распознает текст на картинке с хорошим качеством. Не использует коррекцию перекоса и определение областей. Работает в быстром режиме. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast_1)(string) | Распознает текст на картинке с хорошим качеством. Не использует коррекцию перекоса и определение областей. Работает в быстром режиме. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri_1)(string) | Распознает текст на изображении, предоставленном ссылкой URI. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri)(string, RecognitionSettings) | Распознает текст на изображении, предоставленном ссылкой URI. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline)(MemoryStream) | Распознает изображение, содержащее одну строку текста.  Автоматическая коррекция перекоса изображения не применяется. Поддерживает GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline_1)(string) | Распознает изображение, содержащее одну строку текста.  Автоматическая коррекция перекоса изображения не применяется. Поддерживает GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages)(List&lt;string&gt;) | Распознает несколько изображений из списка с настройками по умолчанию.  Архивы и папки не поддерживаются. Максимальное количество обрабатываемых изображений 20. Поддерживает GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_2)(string) | Распознает несколько изображений, упакованных в ZIP-архив или из папки с настройками по умолчанию.  Вложенные архивы и папки не поддерживаются. Максимальное количество обрабатываемых изображений 20. Поддерживает GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Распознает несколько изображений из списка.  Архивы и папки не поддерживаются. Максимальное количество обрабатываемых изображений 20. Поддерживает GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_3)(string, RecognitionSettings) | Распознает несколько изображений, упакованных в ZIP-архив или из папки.  Вложенные архивы и папки не поддерживаются. Максимальное количество обрабатываемых изображений 20. Поддерживает GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Распознать текст из отсканированного pdf (извлечь изображения).  Распознает pdf файл с возможностью указать[`RecognitionSettings`](../recognitionsettings) . Поддерживает только отсканированные файлы PDF. Не поддерживает PDF с возможностью поиска. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf_1)(string, DocumentRecognitionSettings) | Распознать текст из отсканированного pdf (извлечь изображения).  Распознает pdf файл с возможностью указать[`RecognitionSettings`](../recognitionsettings) . Поддерживает только отсканированные файлы PDF. Не поддерживает PDF с возможностью поиска. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff)(string, DocumentRecognitionSettings) | Распознавание текста из многостраничного изображения TIFF.  Распознает файл TIFF с возможностью указать[`DocumentRecognitionSettings`](../documentrecognitionsettings) . Поддерживает только формат TIFF (TIF). Не поддерживает другие типы изображений. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Позволяет получить многостраничный документ из списка объектов RecognitionResult |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Позволяет получить многостраничный документ из списка объектов RecognitionResult |

### Смотрите также

* пространство имен [Aspose.OCR](../../aspose.ocr)
* сборка [Aspose.OCR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
