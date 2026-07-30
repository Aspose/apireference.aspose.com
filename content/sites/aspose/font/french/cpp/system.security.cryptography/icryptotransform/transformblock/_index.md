---
title: "System::Security::Cryptography::ICryptoTransform::TransformBlock méthode"
linktitle: "TransformBlock"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformBlock méthode. Informations RTTI en C++."
type: docs
weight: 300
url: /fr/cpp/system.security.cryptography/icryptotransform/transformblock/
---
## ICryptoTransform::TransformBlock method


Informations RTTI.

```cpp
virtual int System::Security::Cryptography::ICryptoTransform::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset)=0
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
## Remarques


Traite un bloc de données et copie les données dans le tableau de sortie.
## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
