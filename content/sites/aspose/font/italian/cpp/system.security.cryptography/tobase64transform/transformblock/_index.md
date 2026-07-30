---
title: "System::Security::Cryptography::ToBase64Transform::TransformBlock metodo"
linktitle: "TransformBlock"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::ToBase64Transform::TransformBlock metodo. Elabora un blocco di dati e copia i dati nell'array di output in C++."
type: docs
weight: 800
url: /it/cpp/system.security.cryptography/tobase64transform/transformblock/
---
## ToBase64Transform::TransformBlock method


Elabora un blocco di dati e copia i dati nell'array di output.

```cpp
int32_t System::Security::Cryptography::ToBase64Transform::TransformBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount, System::ArrayPtr<uint8_t> outputBuffer, int32_t outputOffset)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) da cui leggere i dati. |
| inputOffset | int32_t | Offset del buffer di input. |
| inputCount | int32_t | Numero di byte da elaborare. |
| outputBuffer | System::ArrayPtr\<uint8_t\> | Buffer di output in cui copiare i dati; nullptr per non effettuare copie. |
| outputOffset | int32_t | Offset del buffer di output. |

### ReturnValue

Numero di byte scritti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
