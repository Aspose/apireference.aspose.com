---
title: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock yöntemi"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock yöntemi. Verinin son bloğunu işler ve C++'da çıktı değerini hesaplar."
type: docs
weight: 400
url: /tr/cpp/system.security.cryptography/icryptotransform/transformfinalblock/
---
## ICryptoTransform::TransformFinalBlock method


Verinin son bloğunu işler ve çıktı değerini hesaplar.

```cpp
virtual ArrayPtr<uint8_t> System::Security::Cryptography::ICryptoTransform::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) okunacak veri kaynağı. |
| inputOffset | int | Giriş tamponu ofseti. |
| inputCount | int | İşlenecek bayt sayısı. |

### ReturnValue

Tüm giriş dizisi için çıktı hesaplandı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
