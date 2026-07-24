---
title: "metode System::Security::Cryptography::DSA::VerifyData"
linktitle: "VerifyData"
second_title: "Aspose.Page untuk C++"
description: "metode System::Security::Cryptography::DSA::VerifyData. Memverifikasi bahwa tanda tangan data yang ditentukan valid di C++."
type: docs
weight: 700
url: /id/cpp/system.security.cryptography/dsa/verifydata/
---
## DSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Memverifikasi bahwa tanda tangan dari data yang ditentukan valid.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | const ByteArrayPtr\& | Data yang ditandatangani. |
| tanda tangan | const ByteArrayPtr\& | Data tanda tangan. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. mengembalikan true jika tanda tangan valid, jika tidak - false. |

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Memverifikasi bahwa tanda tangan dari data yang ditentukan valid.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
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
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Memverifikasi bahwa tanda tangan dari aliran biner yang ditentukan valid.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | const StreamPtr\& | Data yang ditandatangani. |
| tanda tangan | const ByteArrayPtr\& | Data tanda tangan. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. mengembalikan true jika tanda tangan valid, jika tidak - false. |

## Lihat Juga

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
