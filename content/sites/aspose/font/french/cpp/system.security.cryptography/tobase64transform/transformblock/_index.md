---
title: "System::Security::Cryptography::ToBase64Transform::TransformBlock méthode"
linktitle: "TransformBlock"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::ToBase64Transform::TransformBlock méthode. Traite un bloc de données et copie les données dans le tableau de sortie en C++."
type: docs
weight: 800
url: /fr/cpp/system.security.cryptography/tobase64transform/transformblock/
---
## ToBase64Transform::TransformBlock method


Traite un bloc de données et copie les données dans le tableau de sortie.

```cpp
int32_t System::Security::Cryptography::ToBase64Transform::TransformBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount, System::ArrayPtr<uint8_t> outputBuffer, int32_t outputOffset)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) pour lire les données depuis. |
| inputOffset | int32_t | Décalage du tampon d'entrée. |
| inputCount | int32_t | Nombre d'octets à traiter. |
| outputBuffer | System::ArrayPtr\<uint8_t\> | Tampon de sortie dans lequel copier les données ; nullptr pour ne pas copier. |
| outputOffset | int32_t | Décalage du tampon de sortie. |

### ReturnValue

Nombre d'octets écrits.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
