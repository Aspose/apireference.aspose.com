---
title: "System::Security::Cryptography::RC2Managed::CreateEncryptor methode"
linktitle: "CreateEncryptor"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RC2Managed::CreateEncryptor methode. Maakt een encryptor‑object aan met parameters die zijn gedefinieerd door het algoritme‑object in C++."
type: docs
weight: 200
url: /nl/cpp/system.security.cryptography/rc2managed/createencryptor/
---
## RC2Managed::CreateEncryptor() method


Maakt een encryptor-object aan met parameters gedefinieerd door het algoritme-object.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RC2Managed::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Maakt een encryptor-object aan met expliciete parameters.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RC2Managed::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Encryptiesleutel in byte-array vorm. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Initiële waarde in byte-array vorm. |

### ReturnValue

Nieuw aangemaakt encryptor-object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
