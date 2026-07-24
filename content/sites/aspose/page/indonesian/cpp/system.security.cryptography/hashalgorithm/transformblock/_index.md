---
title: "System::Security::Cryptography::HashAlgorithm::TransformBlock metode"
linktitle: "TransformBlock"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformBlock metode. Memproses blok data dan menyalin data ke array output dalam C++."
type: docs
weight: 800
url: /id/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


Memproses blok data dan menyalin data ke array keluaran.

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
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

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
