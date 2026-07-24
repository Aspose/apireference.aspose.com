---
title: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock‑metod"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock‑metod. Bearbetar sista datablocket och beräknar hash i C++."
type: docs
weight: 900
url: /sv/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


Bearbetar sista databloket och beräknar hash.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) att läsa data från. |
| inputOffset | int | Inmatningsbuffertens offset. |
| inputCount | int | Antal byte att bearbeta. |

### ReturnValue

Hash beräknad för hela datasekvensen.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
