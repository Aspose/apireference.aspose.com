---
title: AsposeOcr.PreprocessImage
second_title: Справочник по Aspose.OCR для .NET API
description: AsposeOcr метод. Используйте предварительную обработку изображения для повышения точности оптического распознавания символов. Создайте список фильтров которые будут применяться к входному изображению в указанном вами порядке. пример создания фильтров PreprocessingFilter filter  new PreprocessingFilter  PreprocessingFilter.Invert  PreprocessingFilter.Threshold150 PreprocessingFilter.Binarize PreprocessingFilter.Rotate180 PreprocessingFilter.Resize30003000 Aspose.OCR.Filters.InterpolationFilterType.Box PreprocessingFilter6fScaleFilter.  PreprocessingFilter.Dilate  Все они вам не нужны. Установите только то что вам нужно.
type: docs
weight: 100
url: /ru/net/aspose.ocr/asposeocr/preprocessimage/
---
## PreprocessImage(string, PreprocessingFilter) {#preprocessimage_1}

Используйте предварительную обработку изображения для повышения точности оптического распознавания символов. Создайте список фильтров, которые будут применяться к входному изображению в указанном вами порядке. пример создания фильтров: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter(6fScaleFilter. ), PreprocessingFilter.Dilate() }; Все они вам не нужны. Установите только то, что вам нужно.

```csharp
public MemoryStream PreprocessImage(string fullPath, PreprocessingFilter filters)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| fullPath | String | Полный путь к образу. |
| filters | PreprocessingFilter | Фильтры оптимизации изображения[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Возвращаемое значение

Поток с измененным изображением, чтобы вы могли сохранить или распознать его.

### Смотрите также

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)

---

## PreprocessImage(MemoryStream, PreprocessingFilter) {#preprocessimage}

Используйте предварительную обработку изображения для повышения точности оптического распознавания символов. Создайте список фильтров, которые будут применяться к входному изображению в указанном вами порядке. пример создания фильтров: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter(6fScaleFilter. ), PreprocessingFilter.Dilate() }; Все они вам не нужны. Установите только то, что вам нужно.

```csharp
public MemoryStream PreprocessImage(MemoryStream stream, PreprocessingFilter filters)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | MemoryStream | Поток памяти, содержащий изображение. |
| filters | PreprocessingFilter | Фильтры оптимизации изображения[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Возвращаемое значение

Поток с измененным изображением, чтобы вы могли сохранить или распознать его.

### Смотрите также

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)


