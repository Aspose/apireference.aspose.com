---
title: "System::Security::Cryptography::ICryptoTransform::TransformBlock metode"
linktitle: "TransformBlock"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformBlock metode. Informasi RTTI di C++."
type: docs
weight: 300
url: /id/cpp/system.security.cryptography/icryptotransform/transformblock/
---
## ICryptoTransform::TransformBlock method


Informasi RTTI.

```cpp
virtual int System::Security::Cryptography::ICryptoTransform::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) untuk membaca data dari. |
| inputOffset | int | Offset buffer input. |
| inputCount | int | Jumlah byte yang akan diproses. |
| outputBuffer | ArrayPtr\<uint8_t\> | Buffer output untuk menyalin data ke dalamnya; nullptr untuk tidak menyalin. |
| outputOffset | int | Offset buffer output. |

### ReturnValue

Jumlah byte yang ditulis.
## Catatan


Memproses blok data dan menyalin data ke array keluaran.
## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
