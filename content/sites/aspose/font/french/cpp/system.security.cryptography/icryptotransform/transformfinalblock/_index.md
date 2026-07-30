---
title: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock méthode"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock méthode. Traite le dernier bloc de données et calcule la valeur de sortie en C++."
type: docs
weight: 400
url: /fr/cpp/system.security.cryptography/icryptotransform/transformfinalblock/
---
## ICryptoTransform::TransformFinalBlock method


Traite le dernier bloc de données et calcule la valeur de sortie.

```cpp
virtual ArrayPtr<uint8_t> System::Security::Cryptography::ICryptoTransform::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) pour lire les données depuis. |
| inputOffset | int | Décalage du tampon d'entrée. |
| inputCount | int | Nombre d'octets à traiter. |

### ReturnValue

Sortie calculée pour l'ensemble de la séquence d'entrée.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
