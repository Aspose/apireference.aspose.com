---
title: "System::Security::Cryptography::ICryptoTransform::TransformBlock metodu"
linktitle: "TransformBlock"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformBlock metodu. C++'de RTTI bilgisi."
type: docs
weight: 300
url: /tr/cpp/system.security.cryptography/icryptotransform/transformblock/
---
## ICryptoTransform::TransformBlock method


RTTI bilgisi.

```cpp
virtual int System::Security::Cryptography::ICryptoTransform::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset)=0
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
## Açıklamalar


Veri bloğunu işler ve veriyi çıkış dizisine kopyalar.
## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
