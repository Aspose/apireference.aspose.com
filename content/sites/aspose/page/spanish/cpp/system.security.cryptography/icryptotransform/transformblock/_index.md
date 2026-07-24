---
title: "System::Security::Cryptography::ICryptoTransform::TransformBlock método"
linktitle: "TransformBlock"
second_title: "Aspose.Page para C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformBlock método. Información RTTI en C++."
type: docs
weight: 300
url: /es/cpp/system.security.cryptography/icryptotransform/transformblock/
---
## ICryptoTransform::TransformBlock method


Información RTTI.

```cpp
virtual int System::Security::Cryptography::ICryptoTransform::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset)=0
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
## Observaciones


Procesa un bloque de datos y copia los datos al arreglo de salida.
## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
