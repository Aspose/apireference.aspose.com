---
title: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock yöntemi"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock yöntemi. C++'da verinin son bloğunu işler ve hash'i hesaplar."
type: docs
weight: 900
url: /tr/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


Verinin son bloğunu işler ve karmayı hesaplar.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) okunacak veri kaynağı. |
| inputOffset | int | Giriş tamponu ofseti. |
| inputCount | int | İşlenecek bayt sayısı. |

### ReturnValue

Tüm veri dizisi için hesaplanan karma.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
