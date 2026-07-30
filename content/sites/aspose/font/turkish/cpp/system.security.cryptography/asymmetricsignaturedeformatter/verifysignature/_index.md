---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature metodu"
linktitle: "VerifySignature"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature metodu. C++'de verideki imzayı doğrular."
type: docs
weight: 300
url: /tr/cpp/system.security.cryptography/asymmetricsignaturedeformatter/verifysignature/
---
## AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Veri üzerindeki imzayı doğrular.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) **rgbSignature** ile imzalanmış. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Veri için doğrulanacak imza. |

### ReturnValue

İmza kontrolü başarılıysa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) method


Veri üzerindeki imzayı doğrular. Henüz uygulanmadı.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr<HashAlgorithm> hash, System::ArrayPtr<uint8_t> rgbSignature)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | Hashleme için kullanılacak algoritma. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Veri için doğrulanacak imza. |

### ReturnValue

İmza kontrolü başarılıysa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
