---
title: "System::Security::Cryptography::ECDsa::VerifyData metode"
linktitle: "VerifyData"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::ECDsa::VerifyData metode. Memverifikasi bahwa tanda tangan data yang ditentukan valid dalam C++."
type: docs
weight: 900
url: /id/cpp/system.security.cryptography/ecdsa/verifydata/
---
## ECDsa::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Memverifikasi bahwa tanda tangan dari data yang ditentukan valid.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | const ByteArrayPtr\& | Data yang ditandatangani. |
| tanda tangan | const ByteArrayPtr\& | Data tanda tangan. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. mengembalikan true jika tanda tangan valid, jika tidak - false. |

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Memverifikasi bahwa tanda tangan dari data yang ditentukan valid.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | const ByteArrayPtr\& | Data yang ditandatangani. |
| offset | int32_t | Offset dalam **data**. |
| count | int32_t | Jumlah byte untuk dihash. |
| tanda tangan | const ByteArrayPtr\& | Data tanda tangan. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. mengembalikan true jika tanda tangan valid, jika tidak - false. |

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Memverifikasi bahwa tanda tangan dari aliran biner yang ditentukan valid.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | const StreamPtr\& | Data yang ditandatangani. |
| tanda tangan | const ByteArrayPtr\& | Data tanda tangan. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. mengembalikan true jika tanda tangan valid, jika tidak - false. |

## Lihat Juga

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
