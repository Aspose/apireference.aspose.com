---
title: RecognitionResult.GetSpellCheckCorrectedText
second_title: Справочник по Aspose.OCR для .NET API
description: RecognitionResult метод. Исправляет текст заменяет слова с ошибками.
type: docs
weight: 100
url: /ru/net/aspose.ocr/recognitionresult/getspellcheckcorrectedtext/
---
## RecognitionResult.GetSpellCheckCorrectedText method

Исправляет текст (заменяет слова с ошибками).

```csharp
public string GetSpellCheckCorrectedText(SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| language | SpellCheckLanguage | Словарь для использования. |
| dictionaryPath | String | Необязательно. Полный путь к пользовательскому словарю (частотному словарю). Формат файла словаря: Простой текстовый файл в кодировке UTF-8. Слово и частота слова разделены пробелом или табуляцией. По умолчанию слово ожидается в первом столбце, а частота во втором столбце. Каждое слово- частота-пара в отдельной строке. Строка определяется как последовательность символов, за которой следует перевод строки ("\n"), возврат каретки ("\r"), или возврат каретки, за которым сразу следует перевод строки ("\r\n"). Каждое слово должно быть в нижнем регистре. |

### Возвращаемое значение

Текст с замененными словами.

### Смотрите также

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* пространство имен [Aspose.OCR](../../recognitionresult/)
* сборка [Aspose.OCR](../../../)


