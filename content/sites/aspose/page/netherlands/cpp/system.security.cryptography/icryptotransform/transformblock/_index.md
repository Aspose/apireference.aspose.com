---
title: "System::Security::Cryptography::ICryptoTransform::TransformBlock methode"
linktitle: "TransformBlock"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformBlock methode. RTTI-informatie in C++."
type: docs
weight: 300
url: /nl/cpp/system.security.cryptography/icryptotransform/transformblock/
---
## ICryptoTransform::TransformBlock method


RTTI-informatie.

```cpp
virtual int System::Security::Cryptography::ICryptoTransform::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) om gegevens van te lezen. |
| inputOffset | int | Offset van de invoerbuffer. |
| inputCount | int | Aantal bytes om te verwerken. |
| outputBuffer | ArrayPtr\<uint8_t\> | Uitvoerbuffer om gegevens naar te kopiëren; nullptr om niets te kopiëren. |
| outputOffset | int | Offset van de uitvoerbuffer. |

### ReturnValue

Aantal geschreven bytes.
## Opmerkingen


Verwerkt een blok gegevens en kopieert de gegevens naar de uitvoerarray.
## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
