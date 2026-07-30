---
title: "System::Security::Cryptography::HashAlgorithm::TransformBlock metodo"
linktitle: "TransformBlock"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformBlock metodo. Elabora un blocco di dati e copia i dati nell'array di output in C++."
type: docs
weight: 800
url: /it/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


Elabora un blocco di dati e copia i dati nell'array di output.

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
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

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
