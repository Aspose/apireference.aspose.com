---
title: "System::Security::Cryptography::ToBase64Transform::TransformBlock method"
linktitle: "TransformBlock"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::ToBase64Transform::TransformBlock method. Memproses blok data dan menyalin data ke array keluaran di C++."
type: docs
weight: 800
url: /id/cpp/system.security.cryptography/tobase64transform/transformblock/
---
## ToBase64Transform::TransformBlock method


Memproses blok data dan menyalin data ke array keluaran.

```cpp
int32_t System::Security::Cryptography::ToBase64Transform::TransformBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount, System::ArrayPtr<uint8_t> outputBuffer, int32_t outputOffset)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) untuk membaca data dari. |
| inputOffset | int32_t | Offset buffer input. |
| inputCount | int32_t | Jumlah byte yang akan diproses. |
| outputBuffer | System::ArrayPtr\<uint8_t\> | Buffer output untuk menyalin data ke dalamnya; nullptr untuk tidak menyalin. |
| outputOffset | int32_t | Offset buffer output. |

### ReturnValue

Jumlah byte yang ditulis.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
