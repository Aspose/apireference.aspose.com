---
title: "System::Security::Cryptography::HashAlgorithm::TransformBlock method"
linktitle: "TransformBlock"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformBlock method. Bearbetar ett block av data och kopierar data till utmatningsarrayen i C++."
type: docs
weight: 800
url: /sv/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


Bearbetar ett datablok och kopierar data till utmatningsarrayen.

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) att läsa data från. |
| inputOffset | int | Inmatningsbuffertens offset. |
| inputCount | int | Antal byte att bearbeta. |
| outputBuffer | ArrayPtr\<uint8_t\> | Utmatningsbuffert att kopiera data till; nullptr för att inte kopiera. |
| outputOffset | int | Utmatningsbuffertens offset. |

### ReturnValue

Antal byte skrivna.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
