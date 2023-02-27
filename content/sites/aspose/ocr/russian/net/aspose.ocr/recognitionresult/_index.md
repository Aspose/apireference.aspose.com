---
title: Class RecognitionResult
second_title: Справочник по Aspose.OCR для .NET API
description: Aspose.OCR.RecognitionResult сорт. Результаты распознавания изображений. Содержит элементы с информацией о распознавании и методы экспорта результатов.
type: docs
weight: 220
url: /ru/net/aspose.ocr/recognitionresult/
---
## RecognitionResult class

Результаты распознавания изображений. Содержит элементы с информацией о распознавании и методы экспорта результатов.

```csharp
public class RecognitionResult
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [Image](../../aspose.ocr/recognitionresult/image/) { get; set; } | Получает или задает изображение для создания PDF. |
| [RecognitionAreasRectangles](../../aspose.ocr/recognitionresult/recognitionareasrectangles/) { get; } | Получает координаты прямоугольников. |
| [RecognitionAreasText](../../aspose.ocr/recognitionresult/recognitionareastext/) { get; } | Получает результаты распознавания списка областей (прямоугольников). |
| [RecognitionCharactersList](../../aspose.ocr/recognitionresult/recognitioncharacterslist/) { get; } | Набор символов, найденных алгоритмом распознавания и расположенных в порядке убывания вероятности. |
| [RecognitionLinesResult](../../aspose.ocr/recognitionresult/recognitionlinesresult/) { get; } | Получает список результатов распознавания со списком строк (Прямоугольники). |
| [RecognitionText](../../aspose.ocr/recognitionresult/recognitiontext/) { get; } | Получить результат распознавания одной строкой. |
| [Skew](../../aspose.ocr/recognitionresult/skew/) { get; } | Получает угол наклона. |
| [Warnings](../../aspose.ocr/recognitionresult/warnings/) { get; } | Получает список предупреждающих сообщений, описывающих некритические ошибки, возникшие во время генерации. |

## Методы

| Имя | Описание |
| --- | --- |
| [GetJson](../../aspose.ocr/recognitionresult/getjson/)(bool) | Форма JSON-строки с результатами распознавания. |
| [GetSpellCheckCorrectedText](../../aspose.ocr/recognitionresult/getspellcheckcorrectedtext/)(SpellCheckLanguage, string) | Исправляет текст (заменяет слова с ошибками). |
| [GetSpellCheckErrorList](../../aspose.ocr/recognitionresult/getspellcheckerrorlist/)(SpellCheckLanguage, string) | Найдите слова с ошибками с предложенными вариантами написания для заданного входного текста. |
| [GetXml](../../aspose.ocr/recognitionresult/getxml/)() | Строка XML формы с результатами распознавания. |
| [Save](../../aspose.ocr/recognitionresult/save/#save)(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) | Сохраняет документ как обычный текст, PDF или документ Microsoft Word. |
| [Save](../../aspose.ocr/recognitionresult/save/#save_1)(string, SaveFormat, bool, SpellCheckLanguage, string) | Сохраняет документ как обычный текст, PDF или документ Microsoft Word. |
| [operator +](../../aspose.ocr/recognitionresult/op_addition/) | Для завершения полного результата из распознанных фрагментов (строк). |

## Другие члены

| Имя | Описание |
| --- | --- |
| class [LinesResult](recognitionresult.linesresult/) | Распознанный текст из строки с координатами строки. |

### Смотрите также

* пространство имен [Aspose.OCR](../../aspose.ocr/)
* сборка [Aspose.OCR](../../)


