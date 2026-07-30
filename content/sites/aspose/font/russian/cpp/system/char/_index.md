---
title: "Класс System::Char"
linktitle: "Char"
second_title: "Aspose.Font для C++"
description: "Класс System::Char. Предоставляет методы для работы с символами, представленными как кодовые единицы UTF-16. Это статический тип без сервисов экземпляра. Вы никогда не должны создавать его экземпляры какими бы то ни было способами в C++."
type: docs
weight: 1200
url: /ru/cpp/system/char/
---
## Char class


Предоставляет методы для манипуляции символами, представленными в виде кодовых единиц UTF‑16. Это статический тип без сервисов экземпляра. Вы никогда не должны создавать его экземпляры каким-либо способом.

```cpp
class Char
```

## Методы

| Метод | Описание |
| --- | --- |
| static [ConvertFromUtf32](./convertfromutf32/)(uint32_t) | Преобразует кодовую единицу UTF-32 в экземпляр класса [System::String](../string/). |
| static [ConvertToUtf32](./converttoutf32/)(char_t, char_t) | Преобразует указанную пару суррогатов UTF-16 в кодовую единицу UTF-32. |
| static [ConvertToUtf32](./converttoutf32/)(const String\&, int) | Преобразует значение символа UTF-16 или пары суррогатов, находящихся в указанной позиции строки, в кодовую единицу UTF-32. |
| static [GetNumericValue](./getnumericvalue/)(char_t) | Преобразует указанный символ UTF-16 в числовое значение двойной точности с плавающей запятой. |
| static [GetUnicodeCategory](./getunicodecategory/)(char_t) | Возвращает значение, представляющее категорию Unicode указанного символа. |
| static [IsAsciiWhiteSpace](./isasciiwhitespace/)(char_t) | Определяет, классифицируется ли указанный символ как пробельный символ ASCII. |
| static [IsControl](./iscontrol/)(const char_t *, int) | Определяет, классифицируется ли символ в указанном индексе указанного буфера символов как управляющий символ Unicode. |
| static [IsControl](./iscontrol/)(char_t) | Определяет, классифицируется ли указанный символ как управляющий символ Unicode. |
| static [IsDigit](./isdigit/)(const char_t *, int) | Определяет, классифицируется ли символ в указанном индексе в указанном буфере символов как десятичная цифра. |
| static [IsDigit](./isdigit/)(const String\&, const int32_t) | Определяет, классифицируется ли символ в указанном индексе в указанной строке как десятичная цифра. |
| static [IsDigit](./isdigit/)(char_t) | Определяет, классифицируется ли указанный символ как десятичная цифра. |
| static [IsHighSurrogate](./ishighsurrogate/)(const String\&, int) | Определяет, является ли символ в указанном индексе в указанной строке кодовой единицей UTF-16 высокого суррогата. |
| static [IsHighSurrogate](./ishighsurrogate/)(const char_t *, int) | Определяет, является ли символ в указанном индексе в указанном буфере символов высоким суррогатом. |
| static [IsHighSurrogate](./ishighsurrogate/)(char_t) | Определяет, является ли указанный символ высоким суррогатом. |
| static [IsLetter](./isletter/)(const char_t *, int) | Определяет, классифицируется ли символ в указанном индексе в указанном буфере символов как буква Unicode. |
| static [IsLetter](./isletter/)(char_t) | Определяет, классифицируется ли указанный символ как буква Unicode. |
| static [IsLetterOrDigit](./isletterordigit/)(const char_t *, int) | Определяет, классифицируется ли символ в указанном индексе в указанном буфере символов как буква Unicode или десятичная цифра. |
| static [IsLetterOrDigit](./isletterordigit/)(char_t) | Определяет, классифицируется ли указанный символ как буква Unicode или десятичная цифра. |
| static [IsLower](./islower/)(const char_t *, int) | Определяет, классифицируется ли символ в указанном индексе в указанном буфере символов как строчная буква. |
| static [IsLower](./islower/)(char_t) | Определяет, классифицируется ли указанный символ как строчная буква. |
| static [IsLower](./islower/)(const String\&, int) | Определяет, классифицируется ли символ в указанном индексе в указанной строке как строчная буква. |
| static [IsLowSurrogate](./islowsurrogate/)(const char_t *, int) | Определяет, является ли символ в указанном индексе в указанном буфере символов низким суррогатом. |
| static [IsLowSurrogate](./islowsurrogate/)(char_t) | Определяет, является ли указанный символ низким суррогатом. |
| static [IsNumber](./isnumber/)(const char_t *, int) | Определяет, классифицируется ли символ в указанном индексе в указанном буфере символов как число. |
| static [IsNumber](./isnumber/)(char_t) | Определяет, классифицируется ли указанный символ как число. |
| static [IsPunctuation](./ispunctuation/)(const char_t *, int) | Определяет, классифицируется ли символ в указанном индексе в указанном буфере символов как символ пунктуации. |
| static [IsPunctuation](./ispunctuation/)(char_t) | Определяет, классифицируется ли указанный символ как символ пунктуации. |
| static [IsSeparator](./isseparator/)(const char_t *, int) | Определяет, классифицируется ли символ в указанном индексе в указанном буфере символов как разделительный символ. |
| static [IsSeparator](./isseparator/)(char_t) | Определяет, классифицируется ли указанный символ как разделительный символ. |
| static [IsSurrogate](./issurrogate/)(char_t) | Определяет, является ли указанный символ кодовой единицей UTF-16 суррогата. |
| static [IsSurrogate](./issurrogate/)(const String\&, int) | Определяет, является ли символ в указанном индексе в указанной строке кодовой единицей UTF-16 суррогата. |
| static [IsSurrogatePair](./issurrogatepair/)(char_t, char_t) | Определяет, являются ли два указанных символа парой UTF-16 суррогатов. |
| static [IsSurrogatePair](./issurrogatepair/)(const String\&, int) | Определяет, являются ли два последовательных символа в указанном буфере символов парой суррогатов. |
| static [IsSymbol](./issymbol/)(const char_t *, int) | Определяет, классифицируется ли символ в указанном индексе заданного буфера символов как символ‑знак. |
| static [IsSymbol](./issymbol/)(char_t) | Определяет, классифицируется ли указанный символ как символ‑знак. |
| static [IsUpper](./isupper/)(const String\&, int) | Определяет, классифицируется ли символ в указанном индексе заданной строки как заглавная буква. |
| static [IsUpper](./isupper/)(const char_t *, int) | Определяет, классифицируется ли символ в указанном индексе заданного буфера символов как заглавная буква. |
| static [IsUpper](./isupper/)(char_t) | Определяет, классифицируется ли указанный символ как заглавная буква. |
| static [IsWhiteSpace](./iswhitespace/)(const char_t *, int) | Определяет, классифицируется ли символ в указанном индексе заданного буфера символов как пробельный символ. |
| static [IsWhiteSpace](./iswhitespace/)(char_t) | Определяет, классифицируется ли указанный символ как пробельный символ. |
| static [IsWhiteSpace](./iswhitespace/)(const String\&, int) | Определяет, классифицируется ли символ в указанном индексе заданной строки как пробельный символ. |
| static [Parse](./parse/)(const String\&) | Преобразует первый и единственный символ указанной строки в значение типа char_t. |
| static [ToLower](./tolower/)(char_t) | Преобразует указанный символ в нижний регистр. |
| static [ToLower](./tolower/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | Преобразует указанный символ в нижний регистр. |
| static [ToLowerInvariant](./tolowerinvariant/)(char_t) | Преобразует указанный символ в нижний регистр. |
| static [ToUpper](./toupper/)(char_t) | Преобразует указанный символ в верхний регистр. |
| static [ToUpper](./toupper/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | Преобразует указанный символ в верхний регистр. |
| static [ToUpperInvariant](./toupperinvariant/)(char_t) | Преобразует указанный символ в верхний регистр. |
| static [TryParse](./tryparse/)(const System::String\&, char_t\&) | Пытается преобразовать строку, состоящую из одного символа, в символ UTF-16. Функция завершается успешно только тогда, когда входная строка не равна null и имеет длину ровно один символ. |
## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
