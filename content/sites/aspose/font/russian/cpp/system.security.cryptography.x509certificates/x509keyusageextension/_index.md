---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension класс"
linktitle: "X509KeyUsageExtension"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension класс. Объект расширения, содержащий дополнительную информацию об использовании ключа. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1600
url: /ru/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


Объект расширения, содержащий дополнительную информацию об использовании ключа. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/) . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## Методы

| Метод | Описание |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Копирует данные расширения из другого объекта. |
| [get_KeyUsages](./get_keyusages/)() | Получает назначения ключа. |
| [X509KeyUsageExtension](./x509keyusageextension/)() | Информация RTTI. |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | Конструктор. |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | Конструктор. |
## См. также

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
