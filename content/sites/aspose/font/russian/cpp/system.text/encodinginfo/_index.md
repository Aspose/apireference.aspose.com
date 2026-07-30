---
title: "System::Text::EncodingInfo класс"
linktitle: "EncodingInfo"
second_title: "Aspose.Font для C++"
description: "System::Text::EncodingInfo класс. Краткая информация о кодировке. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1900
url: /ru/cpp/system.text/encodinginfo/
---
## EncodingInfo class


Краткая информация о кодировке. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class EncodingInfo : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [EncodingInfo](./encodinginfo/)(int, const String\&, const String\&) | Конструктор. |
| [get_CodePage](./get_codepage/)() const | Получает идентификатор кодовой страницы. |
| [get_DisplayName](./get_displayname/)() const | Получает полное локализованное имя кодировки. |
| [get_Name](./get_name/)() const | Получает короткое имя кодировки. |
| [GetEncoding](./getencoding/)() | Получает кодировку, описанную в информации. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
