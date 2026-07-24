---
title: "Méthode System::Security::Cryptography::RijndaelManaged::CreateDecryptor"
linktitle: "CreateDecryptor"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Security::Cryptography::RijndaelManaged::CreateDecryptor. Crée un objet décrypteur avec les paramètres définis par l'objet algorithme en C++."
type: docs
weight: 100
url: /fr/cpp/system.security.cryptography/rijndaelmanaged/createdecryptor/
---
## RijndaelManaged::CreateDecryptor() method


Crée un objet déchiffreur avec des paramètres définis par l'objet algorithme.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RijndaelManaged::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Crée un objet déchiffreur avec des paramètres explicites.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RijndaelManaged::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Clé de chiffrement sous forme de tableau d'octets. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Valeur initiale sous forme de tableau d'octets. |

### ReturnValue

Objet décryptor nouvellement créé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
