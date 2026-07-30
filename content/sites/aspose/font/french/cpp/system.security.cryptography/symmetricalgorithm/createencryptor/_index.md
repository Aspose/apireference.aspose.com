---
title: "System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor méthode"
linktitle: "CréerEncryptor"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor méthode. Crée un encryptor avec les paramètres associés à l'objet d'algorithme en C++."
type: docs
weight: 200
url: /fr/cpp/system.security.cryptography/symmetricalgorithm/createencryptor/
---
## SymmetricAlgorithm::CreateEncryptor() method


Crée un chiffreur avec les paramètres associés à l'objet algorithme.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```


### ReturnValue

Objet encryptor nouvellement créé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## SymmetricAlgorithm::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Crée un encryptor avec des paramètres explicites.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rgbClé | System::ArrayPtr\<uint8_t\> | Clé à utiliser. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Valeur initiale à utiliser. |

### ReturnValue

Objet encryptor nouvellement créé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
