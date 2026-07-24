---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt metode"
linktitle: "Encrypt"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt metode. Mengenkripsi data masukan menggunakan mode padding yang ditentukan dalam C++."
type: docs
weight: 400
url: /id/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Mengenkripsi data masukan menggunakan mode padding yang ditentukan.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | ByteArrayPtr | Array [Byte](../../../system/byte/) untuk dienkripsi. |
| padding | SharedPtr\<RSAEncryptionPadding\> | Mode padding. |

### ReturnValue

Data terenkripsi dalam format array byte.

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


Mengenkripsi pesan. Tidak diimplementasikan.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) untuk dienkripsi. |
| use_oaep | bool | True untuk menggunakan padding OAOP, false untuk menggunakan padding PKCS#1 v1.5. |

### ReturnValue

Array data terenkripsi.

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
