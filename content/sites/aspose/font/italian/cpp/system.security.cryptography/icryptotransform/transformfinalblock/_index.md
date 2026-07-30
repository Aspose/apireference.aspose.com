---
title: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock metodo"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock metodo. Elabora l'ultimo blocco di dati e calcola il valore di output in C++."
type: docs
weight: 400
url: /it/cpp/system.security.cryptography/icryptotransform/transformfinalblock/
---
## ICryptoTransform::TransformFinalBlock method


Elabora l'ultimo blocco di dati e calcola il valore di output.

```cpp
virtual ArrayPtr<uint8_t> System::Security::Cryptography::ICryptoTransform::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) da cui leggere i dati. |
| inputOffset | int | Offset del buffer di input. |
| inputCount | int | Numero di byte da elaborare. |

### ReturnValue

Output calcolato per l'intera sequenza di input.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
