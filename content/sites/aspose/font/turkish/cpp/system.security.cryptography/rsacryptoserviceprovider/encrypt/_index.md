---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt yöntemi"
linktitle: "Encrypt"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt yöntemi. Girdi verilerini belirtilen dolgu modunu kullanarak C++'de şifreler."
type: docs
weight: 400
url: /tr/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Belirtilen dolgu (padding) modunu kullanarak giriş verisini şifreler.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) şifrelemek için dizi. |
| dolgu | SharedPtr\<RSAEncryptionPadding\> | Dolgu modu. |

### ReturnValue

Şifrelenmiş veri bayt dizi formatında.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


Mesajı şifreler. Henüz uygulanmadı.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) şifrelemek için. |
| use_oaep | bool | OAEP dolgu kullanmak için true, PKCS#1 v1.5 dolgu kullanmak için false. |

### ReturnValue

Şifrelenmiş veri dizisi.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
