---
title: PreprocessingFilter.Scale
second_title: Справочник по Aspose.OCR для .NET API
description: PreprocessingFilter метод. Масштабирование изображения  увеличение или уменьшение разрешения изображения. InterpolationFilterType  Lanczos8
type: docs
weight: 120
url: /ru/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/
---
## Scale(float) {#scale}

Масштабирование изображения — увеличение или уменьшение разрешения изображения. InterpolationFilterType = Lanczos8

```csharp
public static PreprocessingFilter Scale(float ratio)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| ratio | Single | Коэффициент масштабирования.Рекомендуется от 0,1 до 1 для сжатия. От 1 до 10 увеличить. |

### Возвращаемое значение

Объект масштабного фильтра.

### Смотрите также

* class [PreprocessingFilter](../)
* пространство имен [Aspose.OCR.Models.PreprocessingFilters](../../preprocessingfilter/)
* сборка [Aspose.OCR](../../../)

---

## Scale(float, InterpolationFilterType) {#scale_1}

Изменить масштаб изображения — увеличение или уменьшение разрешения изображения.

```csharp
public static PreprocessingFilter Scale(float ratio, InterpolationFilterType type)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| ratio | Single | Коэффициент масштабирования.Рекомендуется от 0,1 до 1 для сжатия. От 1 до 10 увеличить. |
| type | InterpolationFilterType | [`InterpolationFilterType`](../../../aspose.ocr.filters/interpolationfiltertype/) |

### Возвращаемое значение

Объект масштабного фильтра.

### Смотрите также

* enum [InterpolationFilterType](../../../aspose.ocr.filters/interpolationfiltertype/)
* class [PreprocessingFilter](../)
* пространство имен [Aspose.OCR.Models.PreprocessingFilters](../../preprocessingfilter/)
* сборка [Aspose.OCR](../../../)


