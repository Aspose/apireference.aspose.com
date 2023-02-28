---
title: Class RecognitionSettings
second_title: Справочник по Aspose.OCR для .NET API
description: Aspose.OCR.RecognitionSettings сорт. Настройки распознавания изображений. Содержит элементы позволяющие настроить процесс распознавания.
type: docs
weight: 240
url: /ru/net/aspose.ocr/recognitionsettings/
---
## RecognitionSettings class

Настройки распознавания изображений. Содержит элементы, позволяющие настроить процесс распознавания.

```csharp
public class RecognitionSettings : BaseRecognitionSettings
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [RecognitionSettings](recognitionsettings/)(Language, List&lt;Rectangle&gt;, bool, bool, float, bool, int) | Инициализирует новый экземпляр`RecognitionSettings`класс с полным набором свойств. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | Установлены допустимые символы. Определяет тип символов, разрешенных для результата распознавания. |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | Позволяет использовать дополнительный алгоритм коррекции контраста изображения перед распознаванием. |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | Позволяет использовать дополнительную нейронную сеть для улучшения изображения — уменьшения шума. Полезно для изображений с артефактами сканирования, искажениями, пятнами, бликами, градиентами, посторонними элементами. |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | Получает или задает флаг, указывающий, следует ли включить автоматическую коррекцию перекоса изображения. Включено (true) по умолчанию. |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | Позволяет выбрать оптимальный режим для областей типа документа: документ, фотография, обычный текст, столбец, изображение. |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | Устанавливает черный список для символов распознавания. |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | Получает или задает язык, используемый для OCR.  Определяет алфавит, используемый при распознавании. Многоязычный по умолчанию. |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | Позволяет распознавать текст в таблицах (области, окруженные строками). |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | Позволяет подготовить изображение к распознаванию путем настройки методов предварительной обработки. |
| [RecognitionAreas](../../aspose.ocr/recognitionsettings/recognitionareas/) { set; } | Получает или задает список текстовых областей для обработки.  Позволяет вручную указать области с текстом для более точного распознавания. Если заданы пользовательские областиDetectAreas и!:AutoSkew свойства будут игнорироваться.  Отключает DetectAreas и AutoSkew. |
| [RecognizeSingleLine](../../aspose.ocr/recognitionsettings/recognizesingleline/) { set; } | Устанавливает распознавание однострочного изображения. Отключено (false) по умолчанию. Отключить все этапы обработки, связанные с разбиением на строки. Установите для этого параметра значение true, если ваше изображение содержит только одну строку. Отключает настройки RecognitionAreas, поэтому все настройки областей будут игнорироваться. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | Получает или задает угол поворота изображения в градусах.  Установка этого значения отключит[`AutoSkew`](../baserecognitionsettings/autoskew/) свойство, чтобы автоматическая коррекция перекоса не применялась. По умолчанию ноль. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | Получает или задает количество потоков для обработки. По умолчанию 0 означает, что изображение будет обрабатываться количеством потоков, равным количеству ваших процессоров. ThreadsCount = 1 означает, что изображение будет обрабатываться в основном потоке. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | Получает или задает пользовательское пороговое значение для бинаризации изображения. Диапазон значений от 1 до 255. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | Позволяет использовать дополнительные алгоритмы специально для распознавания мелкого шрифта. Полезно для изображений с символами небольшого размера. |

### Смотрите также

* class [BaseRecognitionSettings](../baserecognitionsettings/)
* пространство имен [Aspose.OCR](../../aspose.ocr/)
* сборка [Aspose.OCR](../../)


