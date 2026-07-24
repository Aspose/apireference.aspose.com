---
title: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock metode"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock metode. Memproses blok data terakhir dan menghitung nilai keluaran di C++."
type: docs
weight: 400
url: /id/cpp/system.security.cryptography/icryptotransform/transformfinalblock/
---
## ICryptoTransform::TransformFinalBlock method


Memproses blok data terakhir dan menghitung nilai output.

```cpp
virtual ArrayPtr<uint8_t> System::Security::Cryptography::ICryptoTransform::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) untuk membaca data dari. |
| inputOffset | int | Offset buffer input. |
| inputCount | int | Jumlah byte yang akan diproses. |

### ReturnValue

Keluaran dihitung untuk seluruh urutan masukan.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
