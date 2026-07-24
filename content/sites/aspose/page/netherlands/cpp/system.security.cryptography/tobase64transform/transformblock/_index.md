---
title: "System::Security::Cryptography::ToBase64Transform::TransformBlock-methode"
linktitle: "TransformBlock"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::ToBase64Transform::TransformBlock-methode. Verwerkt een gegevensblok en kopieert de gegevens naar de uitvoerarray in C++."
type: docs
weight: 800
url: /nl/cpp/system.security.cryptography/tobase64transform/transformblock/
---
## ToBase64Transform::TransformBlock method


Verwerkt een blok gegevens en kopieert de gegevens naar de uitvoerarray.

```cpp
int32_t System::Security::Cryptography::ToBase64Transform::TransformBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount, System::ArrayPtr<uint8_t> outputBuffer, int32_t outputOffset)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) om gegevens van te lezen. |
| inputOffset | int32_t | Offset van de invoerbuffer. |
| inputCount | int32_t | Aantal bytes om te verwerken. |
| outputBuffer | System::ArrayPtr\<uint8_t\> | Uitvoerbuffer om gegevens naar te kopiëren; nullptr om niets te kopiëren. |
| outputOffset | int32_t | Offset van de uitvoerbuffer. |

### ReturnValue

Aantal geschreven bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
