---
title: "System::Security::Cryptography::ICryptoTransform::TransformBlock metodo"
linktitle: "TransformBlock"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformBlock metodo. Informazioni RTTI in C++."
type: docs
weight: 300
url: /it/cpp/system.security.cryptography/icryptotransform/transformblock/
---
## ICryptoTransform::TransformBlock method


Informazioni RTTI.

```cpp
virtual int System::Security::Cryptography::ICryptoTransform::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) da cui leggere i dati. |
| inputOffset | int | Offset del buffer di input. |
| inputCount | int | Numero di byte da elaborare. |
| outputBuffer | ArrayPtr\<uint8_t\> | Buffer di output in cui copiare i dati; nullptr per non effettuare copie. |
| outputOffset | int | Offset del buffer di output. |

### ReturnValue

Numero di byte scritti.
## Osservazioni


Elabora un blocco di dati e copia i dati nell'array di output.
## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
