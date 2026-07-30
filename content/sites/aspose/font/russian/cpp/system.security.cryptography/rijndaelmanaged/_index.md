---
title: "Класс System::Security::Cryptography::RijndaelManaged"
linktitle: "RijndaelManaged"
second_title: "Aspose.Font для C++"
description: "Класс System::Security::Cryptography::RijndaelManaged. Управляемый алгоритм Rijndael. Поддерживает только режимы ECB и CFB с заполнением None и режим CBC с заполнениями None и Zeros. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 3100
url: /ru/cpp/system.security.cryptography/rijndaelmanaged/
---
## RijndaelManaged class


Управляемый алгоритм [Rijndael](../rijndael/). Поддерживает только режимы ECB и CFB с заполнением None и режим CBC с заполнениями None и Zeros. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class RijndaelManaged : public System::Security::Cryptography::Rijndael
```

## Методы

| Метод | Описание |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Создаёт объект дешифратора с явными параметрами. |
| virtual [CreateDecryptor](./createdecryptor/)() | Создаёт объект дешифратора с параметрами, определёнными объектом алгоритма. |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Создаёт объект шифратора с явными параметрами. |
| virtual [CreateEncryptor](./createencryptor/)() | Создаёт объект шифратора с параметрами, определёнными объектом алгоритма. |
| [GenerateIV](./generateiv/)() override | Создаёт случайное начальное значение и сохраняет его во внутренние данные алгоритма. |
| [GenerateKey](./generatekey/)() override | Создаёт случайный ключ и сохраняет его во внутренние данные алгоритма. |
## См. также

* Class [Rijndael](../rijndael/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
