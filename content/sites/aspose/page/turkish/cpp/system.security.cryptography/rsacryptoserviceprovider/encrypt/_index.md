---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt yöntemi"
linktitle: "Şifrele"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt yöntemi. C++'ta belirtilen dolgu modunu kullanarak giriş verisini şifreler."
type: docs
weight: 400
url: /tr/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Belirtilen dolgu modunu kullanarak girdi verilerini şifreler.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| data | ByteArrayPtr | Şifrelemek için [Byte](../../../system/byte/) dizisi. |
| dolgu | SharedPtr\<RSAEncryptionPadding\> | Dolgu modu. |

### ReturnValue

Şifrelenmiş veri bayt dizisi biçiminde.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


Mesajı şifreler. Henüz uygulanmadı.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Veri](../../../system.data/) şifrelemek için. |
| use_oaep | bool | OAEP dolgu modunu kullanmak için true, PKCS#1 v1.5 dolgu modunu kullanmak için false. |

### ReturnValue

Şifrelenmiş veri dizisi.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
