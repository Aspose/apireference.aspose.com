---
title: RecognitionResult.GetSpellCheckErrorList
second_title: Справочник по Aspose.OCR для .NET API
description: RecognitionResult метод. Найдите слова с ошибками с предложенными вариантами написания для заданного входного текста.
type: docs
weight: 110
url: /ru/net/aspose.ocr/recognitionresult/getspellcheckerrorlist/
---
## RecognitionResult.GetSpellCheckErrorList method

Найдите слова с ошибками с предложенными вариантами написания для заданного входного текста.

```csharp
public List<SpellCheckError> GetSpellCheckErrorList(
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| language | SpellCheckLanguage | Словарь для использования. |
| dictionaryPath | String | Необязательно. Полный путь к пользовательскому словарю (частотному словарю). Формат файла словаря: Простой текстовый файл в кодировке UTF-8. Слово и частота слова разделены пробелом или табуляцией. По умолчанию слово ожидается в первом столбце, а частота во втором столбце. Каждое слово- частота-пара в отдельной строке. Строка определяется как последовательность символов, за которой следует перевод строки ("\n"), возврат каретки ("\r"), или возврат каретки, за которым сразу следует перевод строки ("\r\n"). Каждое слово должно быть в нижнем регистре. |

### Возвращаемое значение

Список объектов SpellCheckError, представляющих слова с ошибками, со списками предлагаемых правильных написаний для каждого слова с ошибкой, и с расстоянием редактирования.

### Смотрите также

* struct [SpellCheckError](../../../aspose.ocr.spellchecker/spellcheckerror/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* пространство имен [Aspose.OCR](../../recognitionresult/)
* сборка [Aspose.OCR](../../../)


