---
title: "System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor Methode"
linktitle: "CreateEncryptor"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor Methode. Erstellt einen Verschlüsseler mit Parametern, die mit dem Algorithmusobjekt verknüpft sind, in C++."
type: docs
weight: 200
url: /de/cpp/system.security.cryptography/symmetricalgorithm/createencryptor/
---
## SymmetricAlgorithm::CreateEncryptor() method


Erstellt einen Encryptor mit Parametern, die dem Algorithmusobjekt zugeordnet sind.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```


### ReturnValue

Neu erstelltes Verschlüsselungsobjekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## SymmetricAlgorithm::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Erstellt einen Verschlüsseler mit expliziten Parametern.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Schlüssel zum Verwenden. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Initialwert zum Verwenden. |

### ReturnValue

Neu erstelltes Verschlüsselungsobjekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
