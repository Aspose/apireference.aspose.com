---
title: "System::Text::UTF8Encoding класс"
linktitle: "UTF8Encoding"
second_title: "Aspose.Font для C++"
description: "Класс System::Text::UTF8Encoding. Кодировка UTF-8. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 2800
url: /ru/cpp/system.text/utf8encoding/
---
## UTF8Encoding class


Кодировка UTF-8. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class UTF8Encoding : public System::Text::ICUEncoding
```

## Методы

| Метод | Описание |
| --- | --- |
| [Clone](./clone/)() override | Клонирует объект кодировки. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Сравнивает с объектом. |
| [GetHashCode](./gethashcode/)() const override | Получает хеш‑код кодировки. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Получить максимальное количество байтов, необходимое для кодирования указанного количества символов. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Получить максимальное количество символов, необходимое для декодирования указанного количества байтов. |
| [GetPreamble](./getpreamble/)() override | Получить преамбулу кодовой страницы. |
| [operator==](./operator==/)(const UTF8Encoding\&) const | Сравнивает параметры кодировок. |
| [UTF8Encoding](./utf8encoding/)() | Конструктор. |
| [UTF8Encoding](./utf8encoding/)(bool) | Конструктор. |
| [UTF8Encoding](./utf8encoding/)(bool, bool) | Конструктор. |
## Поля

| Поле | Описание |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Значение кодовой страницы по умолчанию. |
| static constexpr [UTF8_CODE_PAGE](./utf8_code_page/) | Информация RTTI. |
## См. также

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
