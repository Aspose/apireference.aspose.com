---
title: "System::Security::Cryptography::TripleDESManaged::CreateDecryptor methode"
linktitle: "CreateDecryptor"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::TripleDESManaged::CreateDecryptor methode. Maakt een decryptor-object aan met parameters gedefinieerd door het algorithm-object in C++."
type: docs
weight: 100
url: /nl/cpp/system.security.cryptography/tripledesmanaged/createdecryptor/
---
## TripleDESManaged::CreateDecryptor() method


Maakt een decryptor-object aan met parameters gedefinieerd door het algoritme-object.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## TripleDESManaged::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Maakt een decryptor-object aan met expliciete parameters.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::TripleDESManaged::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Encryptiesleutel in byte-array vorm. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Initiële waarde in byte-array vorm. |

### ReturnValue

Nieuw aangemaakt decryptor-object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
