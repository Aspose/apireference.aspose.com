---
title: "System::Text::Encoding класс"
linktitle: "Encoding"
second_title: "Aspose.Font для C++"
description: "System::Text::Encoding класс. Сервисы кодирования в C++."
type: docs
weight: 1600
url: /ru/cpp/system.text/encoding/
---
## Encoding class


[Encoding](./) services.

```cpp
class Encoding : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [Clone](./clone/)() | Клонирует объект кодировки. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) | Преобразует байты между двумя кодировками. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) | Преобразует байты между двумя кодировками. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Сравнивает кодировки. |
| static [get_ASCII](./get_ascii/)() | Получает кодировку ASCII. |
| static [get_BigEndianUnicode](./get_bigendianunicode/)() | Получает объект стандартной кодировки Unicode с порядком байтов big-endian. |
| static [get_BigEndianUTF32](./get_bigendianutf32/)() | Получает объект стандартной кодировки UTF-32 с порядком байтов big-endian. |
| virtual [get_BodyName](./get_bodyname/)() | Получает имя кодировки, совместимой с телом почтового агента. |
| virtual [get_CodePage](./get_codepage/)() | Получает идентификатор кодовой страницы [Windows](../../system.windows/). |
| [get_DecoderFallback](./get_decoderfallback/)() const | Получает откат декодера. |
| static [get_Default](./get_default/)() | Получает кодировку по умолчанию. |
| [get_EncoderFallback](./get_encoderfallback/)() const | Получает резервный обработчик кодировщика. |
| virtual [get_EncodingName](./get_encodingname/)() | Получает человекочитаемое имя кодировки. |
| virtual [get_HeaderName](./get_headername/)() | Получает имя кодировки, совместимое с заголовком почтового агента. |
| virtual [get_IsBrowserDisplay](./get_isbrowserdisplay/)() | Проверяет, можно ли использовать кодировку в браузере для отображения содержимого. |
| virtual [get_IsBrowserSave](./get_isbrowsersave/)() | Проверяет, можно ли использовать кодировку в браузере для сохранения содержимого. |
| virtual [get_IsMailNewsDisplay](./get_ismailnewsdisplay/)() | Проверяет, можно ли использовать кодировку в почтовом клиенте для отображения содержимого. |
| virtual [get_IsMailNewsSave](./get_ismailnewssave/)() | Проверяет, можно ли использовать кодировку в почтовом клиенте для сохранения содержимого. |
| [get_IsReadOnly](./get_isreadonly/)() | Проверяет, является ли кодировка только для чтения. |
| virtual [get_IsSingleByte](./get_issinglebyte/)() | Проверяет, является ли кодировка однобайтовой. |
| static [get_Latin1](./get_latin1/)() | Получает кодировку Latin1. ДЛЯ ВНУТРЕННЕГО ИСПОЛЬЗОВАНИЯ. |
| static [get_Unicode](./get_unicode/)() | Получает стандартный объект кодировки Unicode. |
| static [get_UTF32](./get_utf32/)() |  |
| static [get_UTF7](./get_utf7/)() | Получает стандартный объект кодировки UTF-7. |
| static [get_UTF8](./get_utf8/)() | Получает стандартный объект кодировки UTF-8. |
| static [get_UTF8Unmarked](./get_utf8unmarked/)() | Только внутреннее, используется библиотеками классов: немаркированное и без проверки ввода. |
| virtual [get_WebName](./get_webname/)() | Получает имя кодировки, совместимое с IANA. |
| virtual [get_WindowsCodePage](./get_windowscodepage/)() | Получает идентификатор кодовой страницы [Windows](../../system.windows/). |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Получить количество символов, необходимых для кодирования буфера символов. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Получить количество символов, необходимых для кодирования буфера символов. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Получить количество символов, необходимых для кодирования буфера символов. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Получить количество символов, необходимых для кодирования строки. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Получить количество символов, необходимых для кодирования буфера символов. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int) | Получить количество символов, необходимых для кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Получить байты, полученные в результате кодирования буфера символов. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(const String\&) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Получить байты, полученные в результате кодирования буфера символов. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Получить количество символов, необходимых для декодирования буфера байтов. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Получить количество символов, необходимых для декодирования буфера байтов. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int) | Получить количество символов, необходимых для декодирования буфера байтов. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Получить символы, полученные в результате декодирования буфера байтов. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Получить символы, полученные в результате декодирования буфера байтов. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Получить символы, полученные в результате декодирования буфера байтов. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) | Получить символы, полученные в результате декодирования буфера байтов. |
| virtual [GetDecoder](./getdecoder/)() | Получить декодер, который перенаправляет запросы к этому объекту. |
| virtual [GetEncoder](./getencoder/)() | Получить кодировщик, который перенаправляет запросы к этому объекту. |
| static [GetEncoding](./getencoding/)(const String\&) | Получает кодировку по имени. |
| static [GetEncoding](./getencoding/)(int) | Получает кодировку по кодовой странице. |
| static [GetEncoding](./getencoding/)(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Получает кодировку по кодовой странице. |
| static [GetEncoding](./getencoding/)(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Получает кодировку по имени. |
| static [GetEncodings](./getencodings/)() | Получает список известных кодировок. |
| [GetHashCode](./gethashcode/)() const override | Создаёт хеш кодировки. |
| virtual [GetMaxByteCount](./getmaxbytecount/)(int) | Получить максимальное количество байтов, необходимое для кодирования указанного количества символов. |
| virtual [GetMaxCharCount](./getmaxcharcount/)(int) | Получить максимальное количество символов, необходимое для декодирования указанного количества байтов. |
| virtual [GetPreamble](./getpreamble/)() | Возвращает последовательность байтов, обозначающую кодировку (например, BOM). |
| virtual [GetString](./getstring/)(uint8_t *, int) | Декодирует буфер байтов в строку. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Декодирует буфер байтов в строку. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Декодирует буфер байтов в строку. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Декодирует буфер байтов в строку. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) | Декодирует буфер байтов в строку. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Декодирует буфер байтов в строку. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Декодирует буфер байтов в строку. |
| [set_DecoderFallback](./set_decoderfallback/)(const DecoderFallbackPtr\&) | Устанавливает резервный декодер. |
| [set_EncoderFallback](./set_encoderfallback/)(const EncoderFallbackPtr\&) | Устанавливает резервный кодировщик. |
## Поля

| Поле | Описание |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](./default_code_page/) | Значение кодовой страницы по умолчанию. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Ptr](./ptr/) | RTTI. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
