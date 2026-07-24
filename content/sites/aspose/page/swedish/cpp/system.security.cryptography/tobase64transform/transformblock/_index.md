---
title: "System::Security::Cryptography::ToBase64Transform::TransformBlock‑metod"
linktitle: "TransformBlock"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::ToBase64Transform::TransformBlock‑metod. Bearbetar ett block med data och kopierar data till utdataarrayen i C++."
type: docs
weight: 800
url: /sv/cpp/system.security.cryptography/tobase64transform/transformblock/
---
## ToBase64Transform::TransformBlock method


Bearbetar ett datablok och kopierar data till utmatningsarrayen.

```cpp
int32_t System::Security::Cryptography::ToBase64Transform::TransformBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount, System::ArrayPtr<uint8_t> outputBuffer, int32_t outputOffset)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) att läsa data från. |
| inputOffset | int32_t | Inmatningsbuffertens offset. |
| inputCount | int32_t | Antal byte att bearbeta. |
| outputBuffer | System::ArrayPtr\<uint8_t\> | Utmatningsbuffert att kopiera data till; nullptr för att inte kopiera. |
| outputOffset | int32_t | Utmatningsbuffertens offset. |

### ReturnValue

Antal byte skrivna.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
