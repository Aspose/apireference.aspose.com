---
title: "System::Security::Cryptography::HashAlgorithm::ComputeHash metode"
linktitle: "ComputeHash"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::HashAlgorithm::ComputeHash metode. Menghash buffer dalam C++."
type: docs
weight: 200
url: /id/cpp/system.security.cryptography/hashalgorithm/computehash/
---
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&) method


Membuat hash buffer.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const ArrayPtr\<uint8_t\>\& | Buffer sumber. |

### ReturnValue

Nilai hash yang dihitung.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&, int, int) method


Membuat hash potongan buffer.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer, int offset, int count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const ArrayPtr\<uint8_t\>\& | Buffer sumber. |
| offset | int | Offset dalam buffer sumber. |
| count | int | Jumlah byte yang akan digunakan dari buffer sumber. |

### ReturnValue

Nilai hash yang dihitung.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## HashAlgorithm::ComputeHash(SharedPtr\<IO::Stream\> const\&) method


Membaca aliran hingga akhir dan menghitung hash untuk data yang dibaca.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(SharedPtr<IO::Stream> const &inputStream)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputStream | SharedPtr\<IO::Stream\> const\& | Stream untuk membaca data dari. |

### ReturnValue

Nilai hash yang dihitung untuk seluruh data stream.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
