---
title: RecognitionSettings.RecognitionSettings
second_title: Справочник по Aspose.OCR для .NET API
description: RecognitionSettings строитель. Инициализирует новый экземплярRecognitionSettingsкласс с полным набором свойств.
type: docs
weight: 10
url: /ru/net/aspose.ocr/recognitionsettings/recognitionsettings/
---
## RecognitionSettings constructor

Инициализирует новый экземпляр[`RecognitionSettings`](../)класс с полным набором свойств.

```csharp
public RecognitionSettings(Language language = Language.None, 
    List<Rectangle> recognitionAreas = null, bool detectAreas = true, bool autoSkew = true, 
    float skewAngle = 0, bool recognizeSingleLine = false, int threshold = 0)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| language | Language | Язык, используемый для OCR. |
| recognitionAreas | List`1 | Вручную установите области для распознавания. Null по умолчанию - означает, что обрабатывается все изображение. |
| detectAreas | Boolean | Включить автоматическое обнаружение текстовых областей. |
| autoSkew | Boolean | Включите автоматическую коррекцию перекоса изображения. |
| skewAngle | Single | Установите угол поворота изображения. |
| recognizeSingleLine | Boolean | Для однострочных изображений |
| threshold | Int32 | Пользовательский порог бинаризации изображения |

### Смотрите также

* enum [Language](../../language/)
* class [RecognitionSettings](../)
* пространство имен [Aspose.OCR](../../recognitionsettings/)
* сборка [Aspose.OCR](../../../)


