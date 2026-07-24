---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt metode"
linktitle: "Decrypt"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt metode. Mendekripsi data masukan menggunakan mode padding yang ditentukan dalam C++."
type: docs
weight: 200
url: /id/cpp/system.security.cryptography/rsacryptoserviceprovider/decrypt/
---
## RSACryptoServiceProvider::Decrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Mendekripsi data masukan menggunakan mode padding yang ditentukan.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) array untuk didekripsi. |
| padding | SharedPtr\<RSAEncryptionPadding\> | Mode padding. |

### ReturnValue

Data terdekripsi dalam format array byte.

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Decrypt(const ByteArrayPtr\&, bool) method


Mendekripsi pesan. Tidak diimplementasikan.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) untuk didekripsi. |
| use_oaep | bool | True untuk menggunakan padding OAOP, false untuk menggunakan padding PKCS#1 v1.5. |

### ReturnValue

Array data terdekripsi.

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
