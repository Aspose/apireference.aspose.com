---
title: "Класс System::Text::UTF32Encoding"
linktitle: "UTF32Encoding"
second_title: "Aspose.Page для C++"
description: "Класс System::Text::UTF32Encoding. Кодировка UTF-32. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 2600
url: /ru/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


Кодировка UTF-32. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/) . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## Методы

| Метод | Описание |
| --- | --- |
| [Clone](./clone/)() override | Клонирует объект кодировки. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Сравнивает с объектом. |
| [GetHashCode](./gethashcode/)() const override | Получает хеш‑код кодировки. |
| [GetPreamble](./getpreamble/)() override | Получить преамбулу кодовой страницы. |
| [operator==](./operator==/)(const UTF32Encoding\&) const | Сравнивает параметры кодировок. |
| [UTF32Encoding](./utf32encoding/)() | Конструктор. |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | Конструктор. |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | Конструктор. |
## Поля

| Поле | Описание |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | Магическое число, используемое [Windows](../../system.windows/) для идентификатора кодовой страницы UTF-32 в большом порядке байтов. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Значение кодовой страницы по умолчанию. |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | Магическое число, используемое [Windows](../../system.windows/) для идентификатора кодовой страницы UTF-32 в маленьком порядке байтов. |
## См. также

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
