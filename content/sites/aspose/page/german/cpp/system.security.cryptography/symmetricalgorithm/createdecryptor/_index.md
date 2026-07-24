---
title: "System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor-Methode"
linktitle: "CreateDecryptor"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor-Methode. Erstellt einen Entschlüsseler mit Parametern, die dem Algorithmusobjekt zugeordnet sind, in C++."
type: docs
weight: 100
url: /de/cpp/system.security.cryptography/symmetricalgorithm/createdecryptor/
---
## SymmetricAlgorithm::CreateDecryptor() method


Erstellt einen Entschlüsseler mit den dem Algorithmusobjekt zugehörigen Parametern.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```


### ReturnValue

Neu erstelltes Entschlüsselungsobjekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## SymmetricAlgorithm::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Erstellt einen Entschlüsseler mit expliziten Parametern.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Zu verwendender Schlüssel. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Zu verwendender Anfangswert. |

### ReturnValue

Neu erstelltes Entschlüsselungsobjekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
