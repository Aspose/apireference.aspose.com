---
title: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock methode"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock methode. Verwerkt het laatste gegevensblok en berekent de hash in C++."
type: docs
weight: 900
url: /nl/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


Verwerkt het laatste blok gegevens en berekent de hash.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) om gegevens van te lezen. |
| inputOffset | int | Offset van de invoerbuffer. |
| inputCount | int | Aantal bytes om te verwerken. |

### ReturnValue

Hash berekend voor de volledige gegevensreeks.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
