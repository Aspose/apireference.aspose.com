---
title: AsposeOcr.ImageHasText
second_title: Справочник по Aspose.OCR для .NET API
description: AsposeOcr метод. Проверить содержит ли изображение предоставленный текстовый фрагмент.
type: docs
weight: 80
url: /ru/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

Проверить, содержит ли изображение предоставленный текстовый фрагмент.

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| fullPath | String | Путь к изображению. |
| text | String | Фрагмент текста для поиска на изображении. |
| settings | RecognitionSettings | Настройки распознавания. |
| ignoreCase | Boolean | True - означает поиск без учета регистра. |

### Возвращаемое значение

Истинно, если изображение содержит фрагмент текста. False - изображение не содержит текстового фрагмента.

### Примечания

Распознает изображение с возможностью указать[`RecognitionSettings`](../../recognitionsettings/) . Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Смотрите также

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

Проверить, соответствует ли текст изображения заданному регулярному выражению.

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| fullPath | String | Путь к изображению. |
| regex | Regex | Объект System.Text.RegularExpressions с предоставленным шаблоном и параметрами. |
| settings | RecognitionSettings | Настройки распознавания. |

### Возвращаемое значение

Истинно, если текст изображения соответствует предоставленному регулярному выражению.

### Примечания

Распознает изображение с возможностью указать[`RecognitionSettings`](../../recognitionsettings/) . Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Смотрите также

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)


