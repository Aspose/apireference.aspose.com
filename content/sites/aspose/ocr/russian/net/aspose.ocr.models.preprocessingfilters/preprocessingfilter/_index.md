---
title: Class PreprocessingFilter
second_title: Справочник по Aspose.OCR для .NET API
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter сорт. Базовый класс для команд обработки изображений.
type: docs
weight: 170
url: /ru/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

Базовый класс для команд обработки изображений.

Базовый класс для команд обработки изображений.

```csharp
public class PreprocessingFilter : IEnumerable
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | Конструктор по умолчанию. |

## Методы

| Имя | Описание |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | Позволяет использовать дополнительную нейронную сеть для улучшения изображения — уменьшения шума. Полезно для изображений с артефактами сканирования, искажениями, пятнами, бликами, градиентами, посторонними элементами. |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | Позволяет использовать дополнительную нейросеть для улучшения части изображения — уменьшения шума. Полезно для изображений с артефактами сканирования, искажениями, пятнами, бликами, градиентами, посторонними элементами. |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | Автоматически корректирует геометрические искажения изображения. Чрезвычайно ресурсоемкий! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | Включает автоматическую коррекцию перекоса изображения. |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | Включает автоматическую коррекцию перекоса части изображения. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | Преобразует изображение в черно-белое. Двоичные изображения — это изображения, пиксели которых имеют только два возможных значения интенсивности. Обычно они отображаются черно-белыми. Численно эти два значения часто равны 0 для черного и 255 для белого. Бинарные изображения создаются путем автоматического определения порога изображения. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | Преобразует часть изображения в черно-белое изображение. Бинарные изображения — это изображения, пиксели которых имеют только два возможных значения интенсивности. Обычно они отображаются черно-белыми. Численно эти два значения часто равны 0 для черного и 255 для белого. Бинарные изображения создаются путем автоматического определения порога изображения. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | Фильтр коррекции контраста. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | Фильтр коррекции контраста для части изображения. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | Расширение добавляет пиксели к границам объектов на изображении. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | Дилатация добавляет пиксели к границам объектов в части изображения. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | Автоматически инвертирует цвета в изображении документа. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | Автоматически инвертирует цвета в части изображения. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | Медианный фильтр просматривает каждый элемент изображения и заменяет каждый пиксель медианой соседних пикселей. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | Медианный фильтр проходит через каждый элемент части изображения и заменяет каждый пиксель медианой соседних пикселей. |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | Масштабирование изображения — увеличение или уменьшение разрешения изображения. InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | Изменить масштаб изображения — увеличение или уменьшение разрешения изображения. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | Повернуть исходное изображение. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | Повернуть часть изображения. |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | Масштабирование изображения — увеличение или уменьшение разрешения изображения. InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | Изменить масштаб изображения — увеличение или уменьшение разрешения изображения. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | Создать бинарное изображение на основе установки порогового значения интенсивности пикселей исходного изображения. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | Создать бинарную часть изображения на основе установки порогового значения интенсивности пикселей исходной части изображения. |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | Преобразует изображение в изображение в градациях серого. Изображение в градациях серого имеет 256 уровней освещенности в изображении (от 0 до 255). |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | Добавьте новый фильтр в коллекцию для дальнейшего выполнения всех операций. Согласованность в коллекции имеет значение. |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | Для реализации интерфейса IEnumarable. |

### Смотрите также

* пространство имен [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* сборка [Aspose.OCR](../../)


