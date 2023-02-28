---
title: Class BaseRecognitionSettings
second_title: Справочник по Aspose.OCR для .NET API
description: Aspose.OCR.BaseRecognitionSettings сорт. Настройки распознавания изображений. Содержит элементы позволяющие настроить процесс распознавания.
type: docs
weight: 30
url: /ru/net/aspose.ocr/baserecognitionsettings/
---
## BaseRecognitionSettings class

Настройки распознавания изображений. Содержит элементы, позволяющие настроить процесс распознавания.

```csharp
public class BaseRecognitionSettings
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [BaseRecognitionSettings](baserecognitionsettings/)(Language, bool, float, int) | Инициализирует новый экземпляр[`RecognitionSettings`](../recognitionsettings/)класс с полным набором свойств. |

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
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | Получает или задает угол поворота изображения в градусах.  Установка этого значения отключит[`AutoSkew`](./autoskew/) свойство, чтобы автоматическая коррекция перекоса не применялась. По умолчанию ноль. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | Получает или задает количество потоков для обработки. По умолчанию 0 означает, что изображение будет обрабатываться количеством потоков, равным количеству ваших процессоров. ThreadsCount = 1 означает, что изображение будет обрабатываться в основном потоке. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | Получает или задает пользовательское пороговое значение для бинаризации изображения. Диапазон значений от 1 до 255. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | Позволяет использовать дополнительные алгоритмы специально для распознавания мелкого шрифта. Полезно для изображений с символами небольшого размера. |

### Смотрите также

* пространство имен [Aspose.OCR](../../aspose.ocr/)
* сборка [Aspose.OCR](../../)


