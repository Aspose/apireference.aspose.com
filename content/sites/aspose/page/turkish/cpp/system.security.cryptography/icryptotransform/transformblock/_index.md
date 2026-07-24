---
title: "System::Security::Cryptography::ICryptoTransform::TransformBlock yöntemi"
linktitle: "TransformBlock"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformBlock yöntemi. C++'da RTTI bilgisi."
type: docs
weight: 300
url: /tr/cpp/system.security.cryptography/icryptotransform/transformblock/
---
## ICryptoTransform::TransformBlock method


RTTI bilgisi.

```cpp
virtual int System::Security::Cryptography::ICryptoTransform::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset)=0
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
## Açıklamalar


Veri bloğunu işler ve veriyi çıktı dizisine kopyalar.
## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
