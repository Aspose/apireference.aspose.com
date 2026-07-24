---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash metode"
linktitle: "VerifyHash"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash metode. Memverifikasi bahwa tanda tangan hash yang ditentukan valid di C++."
type: docs
weight: 1900
url: /id/cpp/system.security.cryptography/rsacryptoserviceprovider/verifyhash/
---
## RSACryptoServiceProvider::VerifyHash(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) method


Memverifikasi bahwa tanda tangan dari hash yang ditentukan valid.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| hash | ByteArrayPtr | Nilai hash dari data yang ditandatangani. |
| tanda tangan | ByteArrayPtr | Data tanda tangan. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. |
| padding | SharedPtr\\<RSASignaturePadding\\> | Mode padding. mengembalikan true jika tanda tangan valid, jika tidak - false. |

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) method


Memeriksa tanda tangan data.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Hash yang dihitung untuk data yang diterima. |
| str | const String\& | Nama algoritma hash yang digunakan. |
| rgb_signature | const ByteArrayPtr\& | Tanda tangan sebagaimana diterima. |

### ReturnValue

True jika tanda tangan valid, false jika tidak.

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
