---
title: "System::Security::Cryptography::HashAlgorithm::TransformBlock method"
linktitle: "TransformBlock"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformBlock method. Verwerkt een blok gegevens en kopieert gegevens naar de uitvoerarray in C++."
type: docs
weight: 800
url: /nl/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


Verwerkt een blok gegevens en kopieert de gegevens naar de uitvoerarray.

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
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

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
