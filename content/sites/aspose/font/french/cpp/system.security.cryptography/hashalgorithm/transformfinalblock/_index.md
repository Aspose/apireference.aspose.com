---
title: "Méthode System::Security::Cryptography::HashAlgorithm::TransformFinalBlock"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Security::Cryptography::HashAlgorithm::TransformFinalBlock. Traite le dernier bloc de données et calcule le hachage en C++."
type: docs
weight: 900
url: /fr/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


Traite le dernier bloc de données et calcule le hachage.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) pour lire les données depuis. |
| inputOffset | int | Décalage du tampon d'entrée. |
| inputCount | int | Nombre d'octets à traiter. |

### ReturnValue

Hachage calculé pour l'ensemble de la séquence de données.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
