---
title: "Metode System::Security::Cryptography::RSA::SignData"
linktitle: "SignData"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Security::Cryptography::RSA::SignData. Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash dan padding yang ditentukan, serta menandatangani hasilnya di C++."
type: docs
weight: 1000
url: /id/cpp/system.security.cryptography/rsa/signdata/
---
## RSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash dan padding yang ditentukan, serta menandatangani hasilnya.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | const ByteArrayPtr\& | Array data masukan. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Mode padding. Mengembalikan tanda tangan [RSA](../) untuk data input. |

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash dan padding yang ditentukan, serta menandatangani hasilnya.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | const ByteArrayPtr\& | Array data masukan. |
| offset | int32_t | Offset dalam **data**. |
| count | int32_t | Jumlah byte yang akan digunakan sebagai data masukan. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Mode padding. Mengembalikan tanda tangan [RSA](../) untuk data input. |

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Menghitung nilai hash dari aliran biner yang ditentukan menggunakan algoritma hash dan padding yang ditentukan, serta menandatangani hasilnya.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | const StreamPtr\& | Aliran biner. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Mode padding. Mengembalikan tanda tangan [RSA](../) untuk data input. |

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
