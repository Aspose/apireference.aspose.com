---
title: "System::Security::Cryptography::TripleDESManaged::CreateEncryptor méthode"
linktitle: "CréerEncryptor"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::TripleDESManaged::CreateEncryptor method. Crée un objet encryptor avec les paramètres définis par l'objet algorithme en C++."
type: docs
weight: 200
url: /fr/cpp/system.security.cryptography/tripledesmanaged/createencryptor/
---
## TripleDESManaged::CreateEncryptor() method


Crée un objet chiffreur avec des paramètres définis par l'objet algorithme.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## TripleDESManaged::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Crée un objet chiffreur avec des paramètres explicites.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::TripleDESManaged::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rgbClé | System::ArrayPtr\<uint8_t\> | Clé de chiffrement sous forme de tableau d'octets. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Valeur initiale sous forme de tableau d'octets. |

### ReturnValue

Objet encryptor nouvellement créé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
