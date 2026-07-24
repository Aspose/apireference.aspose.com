---
title: "System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor method"
linktitle: "CreateDecryptor"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor method. C++'ta algoritma nesnesiyle ilişkili parametrelerle şifre çözücü oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.security.cryptography/symmetricalgorithm/createdecryptor/
---
## SymmetricAlgorithm::CreateDecryptor() method


Algoritma nesnesiyle ilişkili parametrelerle bir deşifreleyici oluşturur.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```


### ReturnValue

Yeni oluşturulmuş decryptor nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## SymmetricAlgorithm::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Açık parametrelerle bir deşifreleyici oluşturur.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Kullanılacak anahtar. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Kullanılacak başlangıç değeri. |

### ReturnValue

Yeni oluşturulmuş decryptor nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
