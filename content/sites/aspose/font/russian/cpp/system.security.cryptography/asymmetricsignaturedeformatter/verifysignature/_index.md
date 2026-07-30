---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature метод"
linktitle: "VerifySignature"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature метод. Проверяет подпись данных в C++."
type: docs
weight: 300
url: /ru/cpp/system.security.cryptography/asymmetricsignaturedeformatter/verifysignature/
---
## AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Проверяет подпись данных.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Данные](../../../system.data/) подписанные с **rgbSignature**. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Подпись, которую необходимо проверить для данных. |

### ReturnValue

True если проверка подписи успешна, false в противном случае.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) method


Проверяет подпись данных. Не реализовано.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr<HashAlgorithm> hash, System::ArrayPtr<uint8_t> rgbSignature)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | Алгоритм, используемый для хеширования. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Подпись, которую необходимо проверить для данных. |

### ReturnValue

True если проверка подписи успешна, false в противном случае.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
