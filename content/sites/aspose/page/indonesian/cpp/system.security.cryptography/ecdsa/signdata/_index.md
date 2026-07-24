---
title: "System::Security::Cryptography::ECDsa::SignData metode"
linktitle: "SignData"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::ECDsa::SignData metode. Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash yang ditentukan, dan menandatangani hasilnya dalam C++."
type: docs
weight: 700
url: /id/cpp/system.security.cryptography/ecdsa/signdata/
---
## ECDsa::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash yang ditentukan, dan menandatangani hasilnya.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | const ByteArrayPtr\& | Array data masukan. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. mengembalikan tanda tangan ECDSA untuk data masukan. |

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash yang ditentukan, dan menandatangani hasilnya.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | const ByteArrayPtr\& | Array data masukan. |
| offset | int32_t | Offset dalam **data**. |
| count | int32_t | Jumlah byte yang akan digunakan sebagai data masukan. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. mengembalikan tanda tangan ECDSA untuk data masukan. |

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


Menghitung nilai hash dari aliran biner yang ditentukan menggunakan algoritma hash yang ditentukan, dan menandatangani hasilnya.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | const StreamPtr\& | Aliran biner. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. mengembalikan tanda tangan ECDSA untuk data masukan. |

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
