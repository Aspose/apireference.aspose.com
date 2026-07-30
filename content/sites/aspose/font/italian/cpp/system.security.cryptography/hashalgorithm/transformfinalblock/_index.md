---
title: "Metodo System::Security::Cryptography::HashAlgorithm::TransformFinalBlock"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Font per C++"
description: "Metodo System::Security::Cryptography::HashAlgorithm::TransformFinalBlock. Elabora l'ultimo blocco di dati e calcola l'hash in C++."
type: docs
weight: 900
url: /it/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


Elabora l'ultimo blocco di dati e calcola l'hash.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) da cui leggere i dati. |
| inputOffset | int | Offset del buffer di input. |
| inputCount | int | Numero di byte da elaborare. |

### ReturnValue

Hash calcolato per l'intera sequenza di dati.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
