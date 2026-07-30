---
title: "System::Security::Cryptography::RandomNumberGenerator класс"
linktitle: "RandomNumberGenerator"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::RandomNumberGenerator класс. Абстрактный класс для наследования генераторами случайных чисел. Объекты этого класса должны выделяться только с помощью функции System::MakeObject() function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 2600
url: /ru/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


Абстрактный класс для наследования генераторами случайных чисел. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/) function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| static [Create](./create/)() | Создаёт экземпляр реализации по умолчанию криптографического генератора случайных чисел, который можно использовать для генерации случайных данных. Не реализовано. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | Заполняет существующие элементы массива случайными байтами. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | Заполняет существующий срез массива случайными байтами. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | Заполняет существующие элементы представления массива случайными байтами. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | Заполняет существующий срез представления массива случайными байтами. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Заполняет существующие элементы стекового массива случайными байтами. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | Заполняет существующий срез стекового массива случайными байтами. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | Заполняет существующие элементы массива случайными ненулевыми байтами. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | Заполняет существующие элементы представления массива случайными ненулевыми байтами. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Заполняет существующие элементы стекового массива случайными ненулевыми байтами. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
