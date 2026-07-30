---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter класс"
linktitle: "RSAPKCS1SignatureDeformatter"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter класс. Класс для проверки подписи RSA PKCS # 1 v1.5. Объекты этого класса должны быть выделены только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 3700
url: /ru/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/
---
## RSAPKCS1SignatureDeformatter class


Класс для проверки подписи [RSA](../rsa/) PKCS # 1 v1.5. Объекты этого класса должны быть выделены только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class RSAPKCS1SignatureDeformatter : public System::Security::Cryptography::AsymmetricSignatureDeformatter
```

## Методы

| Метод | Описание |
| --- | --- |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)() | Информация RTTI. |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | Конструктор. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | Устанавливает используемый алгоритм хеширования. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | Устанавливает значение ключа. Не реализовано. |
| [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Проверяет подпись хеша данных. |
## См. также

* Class [AsymmetricSignatureDeformatter](../asymmetricsignaturedeformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
