---
title: System::Security::Cryptography::HashAlgorithm::TransformFinalBlock method
linktitle: TransformFinalBlock
second_title: Aspose.Page for C++
description: 'System::Security::Cryptography::HashAlgorithm::TransformFinalBlock method. Processes last block of data and calculates hash in C++.'
type: docs
weight: 700
url: /cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


Processes last block of data and calculates hash.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) to read data from. |
| inputOffset | int | Input buffer offset. |
| inputCount | int | Number of bytes to process. |

### ReturnValue

Hash calculated for the whole data sequence.

## See Also

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
