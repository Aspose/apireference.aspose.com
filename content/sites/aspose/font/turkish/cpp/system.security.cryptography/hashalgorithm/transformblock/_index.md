---
title: "System::Security::Cryptography::HashAlgorithm::TransformBlock metodu"
linktitle: "TransformBlock"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformBlock metodu. Veri bloğunu işler ve C++'da veriyi çıktı dizisine kopyalar."
type: docs
weight: 800
url: /tr/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


Veri bloğunu işler ve veriyi çıkış dizisine kopyalar.

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) veri okumak için. |
| inputOffset | int | Giriş tamponu ofseti. |
| inputCount | int | İşlenecek bayt sayısı. |
| outputBuffer | ArrayPtr\<uint8_t\> | Veri kopyalanacak çıktı tamponu; kopyalama yapılmayacaksa nullptr. |
| outputOffset | int | Çıktı tamponu ofseti. |

### ReturnValue

Yazılan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
