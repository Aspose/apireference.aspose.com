---
title: "Класс System::Globalization::IdnMapping"
linktitle: "IdnMapping"
second_title: "Aspose.Font для C++"
description: "Класс System::Globalization::IdnMapping. IdnMapping используется для преобразования имён в Punycode. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1300
url: /ru/cpp/system.globalization/idnmapping/
---
## IdnMapping class


[IdnMapping](./) used to map names to Punycode. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IdnMapping : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Сравнивает два объекта [IdnMapping](./). |
| [get_AllowUnassigned](./get_allowunassigned/)() const | Получает флаг, указывающий, используются ли в операциях непредназначенные кодовые точки. |
| [get_UseStd3AsciiRules](./get_usestd3asciirules/)() const | Получает флаг, указывающий, используются ли в операциях стандартные правила именования. |
| [GetAscii](./getascii/)(const String\&) const | [Convert](../../system/convert/) unicode‑доменное имя в эквивалентный ASCII. |
| [GetAscii](./getascii/)(const String\&, int) const | [Convert](../../system/convert/) unicode‑доменное имя в эквивалентный ASCII. |
| [GetAscii](./getascii/)(const String\&, int, int) const | [Convert](../../system/convert/) unicode‑доменное имя в эквивалентный ASCII. |
| [GetHashCode](./gethashcode/)() const override | Получает хеш‑код текущего объекта [IdnMapping](./). |
| [GetUnicode](./getunicode/)(const String\&) const | [Convert](../../system/convert/) ascii‑доменное имя в эквивалентный Unicode. |
| [GetUnicode](./getunicode/)(const String\&, int) const | [Convert](../../system/convert/) ascii‑доменное имя в эквивалентный Unicode. |
| [GetUnicode](./getunicode/)(const String\&, int, int) const | [Convert](../../system/convert/) ascii‑доменное имя в эквивалентный Unicode. |
| [IdnMapping](./idnmapping/)() | Информация RTTI. |
| [IdnMapping](./idnmapping/)(const IdnMapping\&) |  |
| [operator=](./operator=/)(const IdnMapping\&) |  |
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | Устанавливает флаг, указывающий, используются ли в операциях непредназначенные кодовые точки. |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | Устанавливает флаг, указывающий, используются ли в операциях стандартные правила именования. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
