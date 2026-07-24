---
title: "System::Security::Cryptography::HashAlgorithm::TransformBlock method"
linktitle: "TransformBlock"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformBlock yöntemi. Verinin bir bloğunu işler ve C++'ta veriyi çıkış dizisine kopyalar."
type: docs
weight: 800
url: /tr/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


Veri bloğunu işler ve veriyi çıktı dizisine kopyalar.

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) okunacak veri kaynağı. |
| inputOffset | int | Giriş tamponu ofseti. |
| inputCount | int | İşlenecek bayt sayısı. |
| outputBuffer | ArrayPtr\<uint8_t\> | Veriyi kopyalamak için çıkış tamponu; kopyalama yapılmayacaksa nullptr. |
| outputOffset | int | Çıkış tamponu ofseti. |

### ReturnValue

Yazılan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
