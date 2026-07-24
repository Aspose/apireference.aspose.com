---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt yöntemi"
linktitle: "Şifreyi Çöz"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt yöntemi. C++'ta belirtilen dolgu modunu kullanarak giriş verisini çözer."
type: docs
weight: 200
url: /tr/cpp/system.security.cryptography/rsacryptoserviceprovider/decrypt/
---
## RSACryptoServiceProvider::Decrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Belirtilen dolgu modunu kullanarak girdi verilerini çözer.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) şifresi çözülecek dizi. |
| dolgu | SharedPtr\<RSAEncryptionPadding\> | Dolgu modu. |

### ReturnValue

Şifre çözülmüş veri bayt dizisi biçiminde.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Decrypt(const ByteArrayPtr\&, bool) method


Mesajı çözer. Henüz uygulanmadı.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Veri](../../../system.data/) çözmek için. |
| use_oaep | bool | OAEP dolgu modunu kullanmak için true, PKCS#1 v1.5 dolgu modunu kullanmak için false. |

### ReturnValue

Çözülmüş veri dizisi.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
