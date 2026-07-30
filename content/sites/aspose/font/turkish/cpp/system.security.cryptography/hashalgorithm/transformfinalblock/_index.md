---
title: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock yöntemi"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock yöntemi. Verinin son bloğunu işler ve C++'da hash'i hesaplar."
type: docs
weight: 900
url: /tr/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


Verinin son bloğunu işler ve hash hesaplar.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) veri okumak için. |
| inputOffset | int | Giriş tamponu ofseti. |
| inputCount | int | İşlenecek bayt sayısı. |

### ReturnValue

Tüm veri dizisi için hesaplanan hash.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
