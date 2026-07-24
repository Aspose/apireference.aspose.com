---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash metode"
linktitle: "SignHash"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash metode. Menghitung tanda tangan untuk nilai hash yang ditentukan dalam C++."
type: docs
weight: 1700
url: /id/cpp/system.security.cryptography/rsacryptoserviceprovider/signhash/
---
## RSACryptoServiceProvider::SignHash(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) method


Menghitung tanda tangan untuk nilai hash yang ditentukan.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| hash | ByteArrayPtr | Nilai hash. |
| hash_algorithm | HashAlgorithmName | Algoritma hash. |
| padding | SharedPtr\<RSASignaturePadding\> | Mode padding. mengembalikan tanda tangan [RSA](../../rsa/) untuk hash yang ditentukan. |

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignHash(const ByteArrayPtr\&, const String\&) method


Menghitung tanda tangan dari nilai input yang ditentukan. Tidak diimplementasikan.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Nilai hash dari data yang akan ditandatangani. |
| str | const String\& | Pengidentifikasi algoritma hash yang digunakan untuk membuat hash. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
