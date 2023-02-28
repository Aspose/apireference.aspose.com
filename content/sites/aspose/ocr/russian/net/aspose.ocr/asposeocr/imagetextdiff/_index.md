---
title: AsposeOcr.ImageTextDiff
second_title: Справочник по Aspose.OCR для .NET API
description: AsposeOcr метод. Сравните тексты на двух изображениях и верните число показывающее насколько они похожи от 0 до 1.
type: docs
weight: 90
url: /ru/net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

Сравните тексты на двух изображениях и верните число, показывающее, насколько они похожи (от 0 до 1).

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| fullPath1 | String | Путь к первому изображению. |
| fullPath2 | String | Путь ко второму изображению. |
| settings | RecognitionSettings | Настройки распознавания. |
| ignoreCase | Boolean | True - означает поиск без учета регистра. |

### Возвращаемое значение

0 означает, что тексты совершенно разные; 1 означает, что тексты идентичны.

### Смотрите также

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)


