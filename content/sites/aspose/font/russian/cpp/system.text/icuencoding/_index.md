---
title: "System::Text::ICUEncoding класс"
linktitle: "ICUEncoding"
second_title: "Aspose.Font для C++"
description: "Класс System::Text::ICUEncoding. Реализация кодировки на основе ICU. ДЛЯ ВНУТРЕННЕГО ИСПОЛЬЗОВАНИЯ. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 2200
url: /ru/cpp/system.text/icuencoding/
---
## ICUEncoding class


ICU-based encoding implementation. ДЛЯ ВНУТРЕННЕГО ИСПОЛЬЗОВАНИЯ. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUEncoding : public System::Text::Encoding
```

## Методы

| Метод | Описание |
| --- | --- |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Получить количество символов, необходимых для кодирования буфера символов. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | RTTI. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | RTTI. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Получить байты, полученные в результате кодирования буфера символов. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(const String\&) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Получить байты, полученные в результате кодирования буфера символов. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Получить байты, полученные в результате кодирования буфера символов. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Получить количество символов, необходимых для декодирования буфера байтов. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Получить количество символов, необходимых для декодирования буфера байтов. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Получить количество символов, необходимых для декодирования буфера байтов. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Получить символы, полученные в результате декодирования буфера байтов. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Получить символы, полученные в результате декодирования буфера байтов. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Получить символы, полученные в результате декодирования буфера байтов. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Получить символы, полученные в результате декодирования буфера байтов. |
| [GetDecoder](./getdecoder/)() override | Получить декодер, который перенаправляет запросы к этому объекту. |
| [GetEncoder](./getencoder/)() override | Получить кодировщик, который перенаправляет запросы к этому объекту. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Получить максимальное количество байтов, необходимое для кодирования указанного количества символов. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Получить максимальное количество символов, необходимое для декодирования указанного количества байтов. |
| [GetPreamble](./getpreamble/)() override | Возвращает последовательность байтов, обозначающую кодировку (например, BOM). |
| [ICUEncoding](./icuencoding/)(const Details::EncodingInfoInternal *) | Конструктор. |
| [operator==](./operator==/)(const ICUEncoding\&) const | Сравнивает кодировки, используя кодовые страницы. |
## Поля

| Поле | Описание |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Значение кодовой страницы по умолчанию. |
## См. также

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
