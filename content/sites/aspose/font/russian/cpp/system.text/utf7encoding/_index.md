---
title: "Класс System::Text::UTF7Encoding"
linktitle: "UTF7Encoding"
second_title: "Aspose.Font для C++"
description: "Класс System::Text::UTF7Encoding. Кодировка UTF-7. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 2700
url: /ru/cpp/system.text/utf7encoding/
---
## UTF7Encoding class


Кодировка UTF-7. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/) . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class UTF7Encoding : public System::Text::Encoding
```

## Методы

| Метод | Описание |
| --- | --- |
| [Clone](./clone/)() override | Клонирует объект кодировки. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Сравнивает с объектом. |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Получить количество символов, необходимых для кодирования буфера символов. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Получить количество символов, необходимых для кодирования буфера символов. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Получить количество символов, необходимых для кодирования буфера символов. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Получить количество символов, необходимых для кодирования буфера символов. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Получить количество символов, необходимых для кодирования строки. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Получить количество символов, необходимых для кодирования буфера символов. |
| [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Получить байты, полученные в результате кодирования буфера символов. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Получить байты, полученные в результате кодирования буфера символов. |
| [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) override | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Получить байты, полученные в результате кодирования буфера символов. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(const String\&) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Получить байты, полученные в результате кодирования буфера символов. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Получить байты, полученные в результате кодирования буфера символов. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Получить байты, полученные в результате кодирования буфера символов. |
| [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) override | Получить количество символов, необходимых для декодирования буфера байтов. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Получить количество символов, необходимых для декодирования буфера байтов. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Получить количество символов, необходимых для декодирования буфера байтов. |
| [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) override | Получить символы, полученные в результате декодирования буфера байтов. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Получить символы, полученные в результате декодирования буфера байтов. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Получить символы, полученные в результате декодирования буфера байтов. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Получить символы, полученные в результате декодирования буфера байтов. |
| [GetDecoder](./getdecoder/)() override | Получить декодер, который перенаправляет запросы к этому объекту. |
| [GetEncoder](./getencoder/)() override | Получить кодировщик, который перенаправляет запросы к этому объекту. |
| [GetHashCode](./gethashcode/)() const override | Получает хеш‑код кодировки. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Получить максимальное количество байтов, необходимое для кодирования указанного количества символов. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Получить максимальное количество символов, необходимое для декодирования указанного количества байтов. |
| [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) override | Декодирует буфер байтов в строку. |
| virtual [GetString](./getstring/)(uint8_t *, int) | Декодирует буфер байтов в строку. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Декодирует буфер байтов в строку. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Декодирует буфер байтов в строку. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Декодирует буфер байтов в строку. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Декодирует буфер байтов в строку. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Декодирует буфер байтов в строку. |
| [operator==](./operator==/)(const UTF7Encoding\&) const | Сравнивает параметры кодировок. |
| [UTF7Encoding](./utf7encoding/)() | Конструктор. |
| [UTF7Encoding](./utf7encoding/)(bool) | Конструктор. |
## Поля

| Поле | Описание |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Значение кодовой страницы по умолчанию. |
| static constexpr [UTF7_CODE_PAGE](./utf7_code_page/) | Магическое число, используемое [Windows](../../system.windows/) для идентификатора кодовой страницы UTF-7. |
## См. также

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
