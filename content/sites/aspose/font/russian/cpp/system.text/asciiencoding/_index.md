---
title: "Класс System::Text::ASCIIEncoding"
linktitle: "ASCIIEncoding"
second_title: "Aspose.Font для C++"
description: "Класс System::Text::ASCIIEncoding. Представляет кодировку ASCII. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 100
url: /ru/cpp/system.text/asciiencoding/
---
## ASCIIEncoding class


Представляет кодировку ASCII. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class ASCIIEncoding : public System::Text::ICUEncoding
```

## Методы

| Метод | Описание |
| --- | --- |
| [ASCIIEncoding](./asciiencoding/)() | Конструктор. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Возвращает максимальное количество байтов, которое может потребоваться для хранения строки с известным количеством символов. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Получить максимальное количество символов, необходимое для декодирования указанного количества байтов. |
## Поля

| Поле | Описание |
| --- | --- |
| static constexpr [ASCII_CODE_PAGE](./ascii_code_page/) | RTTI. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Значение кодовой страницы по умолчанию. |
## См. также

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
