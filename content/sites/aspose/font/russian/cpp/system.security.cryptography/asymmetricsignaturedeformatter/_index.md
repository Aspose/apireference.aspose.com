---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter класс"
linktitle: "AsymmetricSignatureDeformatter"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter класс. Базовый класс для асимметричных деформаторов подписи. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 300
url: /ru/cpp/system.security.cryptography/asymmetricsignaturedeformatter/
---
## AsymmetricSignatureDeformatter class


Базовый класс для асимметричных деформаторов подписи. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class AsymmetricSignatureDeformatter : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | Информация RTTI. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | Устанавливает ключ, используемый с алгоритмом. |
| virtual [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Проверяет подпись данных. |
| virtual [VerifySignature](./verifysignature/)(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) | Проверяет подпись данных. Не реализовано. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
