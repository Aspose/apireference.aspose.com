---
title: "Класс System::Text::UTF32Encoding"
linktitle: "UTF32Encoding"
second_title: "Aspose.Font для C++"
description: "Класс System::Text::UTF32Encoding. UTF-32 encoding. Objects of this class should only be allocated using System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 2600
url: /ru/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


UTF-32 encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | Магическое число, используемое [Windows](../../system.windows/) для идентификатора кодовой страницы UTF-32 с большим порядком байтов. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Значение кодовой страницы по умолчанию. |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | Магическое число, используемое [Windows](../../system.windows/) для идентификатора кодовой страницы UTF-32 с маленьким порядком байтов. |
## См. также

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
