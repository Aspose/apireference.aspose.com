---
title: "System::Security::Cryptography::HashAlgorithm::TransformBlock método"
linktitle: "TransformBlock"
second_title: "Aspose.Page para C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformBlock método. Procesa un bloque de datos y copia los datos al arreglo de salida en C++."
type: docs
weight: 800
url: /es/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


Procesa un bloque de datos y copia los datos al arreglo de salida.

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) para leer datos de. |
| inputOffset | int | Desplazamiento del búfer de entrada. |
| inputCount | int | Número de bytes a procesar. |
| outputBuffer | ArrayPtr\<uint8_t\> | Búfer de salida donde copiar los datos; nullptr para no copiar. |
| outputOffset | int | Desplazamiento del búfer de salida. |

### ReturnValue

Número de bytes escritos.

## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
