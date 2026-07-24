---
title: "System::Security::Cryptography::ICryptoTransform::TransformBlock metod"
linktitle: "TransformBlock"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformBlock metod. RTTI-information i C++."
type: docs
weight: 300
url: /sv/cpp/system.security.cryptography/icryptotransform/transformblock/
---
## ICryptoTransform::TransformBlock method


RTTI-information.

```cpp
virtual int System::Security::Cryptography::ICryptoTransform::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset)=0
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
## Anmärkningar


Bearbetar ett datablok och kopierar data till utmatningsarrayen.
## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
