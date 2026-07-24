---
title: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock metode"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock metode. Memproses blok data terakhir dan menghitung hash dalam C++."
type: docs
weight: 900
url: /id/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


Memproses blok data terakhir dan menghitung hash.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) untuk membaca data dari. |
| inputOffset | int | Offset buffer input. |
| inputCount | int | Jumlah byte yang akan diproses. |

### ReturnValue

Hash yang dihitung untuk seluruh urutan data.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
