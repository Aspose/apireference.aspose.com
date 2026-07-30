---
title: "System::Security::Cryptography::HashAlgorithm::TransformBlock méthode"
linktitle: "TransformBlock"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformBlock méthode. Traite un bloc de données et copie les données dans le tableau de sortie en C++."
type: docs
weight: 800
url: /fr/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


Traite un bloc de données et copie les données dans le tableau de sortie.

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) pour lire les données depuis. |
| inputOffset | int | Décalage du tampon d'entrée. |
| inputCount | int | Nombre d'octets à traiter. |
| outputBuffer | ArrayPtr\<uint8_t\> | Tampon de sortie dans lequel copier les données ; nullptr pour ne pas copier. |
| outputOffset | int | Décalage du tampon de sortie. |

### ReturnValue

Nombre d'octets écrits.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
