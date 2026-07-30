---
title: "Класс System::Security::Cryptography::HMAC"
linktitle: "HMAC"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::HMAC class. Все реализации кодов аутентификации сообщений на основе хеша (HMAC) должны наследовать этот абстрактный класс. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1700
url: /ru/cpp/system.security.cryptography/hmac/
---
## HMAC class


Все реализации хеш-основного кода аутентификации сообщений [Authentication](../../system.security.authentication/) ([HMAC](./)) должны наследовать этот абстрактный класс. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/) . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class HMAC : public System::Security::Cryptography::HashAlgorithm
```

## Методы

| Метод | Описание |
| --- | --- |
| static [Create](./create/)() | НЕ РЕАЛИЗОВАНО. |
## См. также

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
