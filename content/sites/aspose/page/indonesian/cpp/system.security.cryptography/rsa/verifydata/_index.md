---
title: "Metode System::Security::Cryptography::RSA::VerifyData"
linktitle: "VerifyData"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Security::Cryptography::RSA::VerifyData. Memverifikasi bahwa tanda tangan data yang ditentukan valid di C++."
type: docs
weight: 1300
url: /id/cpp/system.security.cryptography/rsa/verifydata/
---
## RSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Memverifikasi bahwa tanda tangan dari data yang ditentukan valid.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | const ByteArrayPtr\& | Data yang ditandatangani. |
| tanda tangan | const ByteArrayPtr\& | Data tanda tangan. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Mode padding. mengembalikan true jika tanda tangan valid, jika tidak - false. |

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Memverifikasi bahwa tanda tangan dari data yang ditentukan valid.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | const ByteArrayPtr\& | Data yang ditandatangani. |
| offset | int32_t | Offset dalam **data**. |
| count | int32_t | Jumlah byte untuk dihash. |
| tanda tangan | const ByteArrayPtr\& | Data tanda tangan. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Mode padding. mengembalikan true jika tanda tangan valid, jika tidak - false. |

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Memverifikasi bahwa tanda tangan dari aliran biner yang ditentukan valid.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | const StreamPtr\& | Data yang ditandatangani. |
| tanda tangan | const ByteArrayPtr\& | Data tanda tangan. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Mode padding. mengembalikan true jika tanda tangan valid, jika tidak - false. |

## Lihat Juga

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
