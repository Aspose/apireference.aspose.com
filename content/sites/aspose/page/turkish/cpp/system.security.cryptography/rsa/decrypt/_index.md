---
title: "System::Security::Cryptography::RSA::Decrypt yöntemi"
linktitle: "Şifreyi Çöz"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::RSA::Decrypt yöntemi. Belirtilen dolgu modunu kullanarak C++'ta girdi verilerini şifre çözer."
type: docs
weight: 100
url: /tr/cpp/system.security.cryptography/rsa/decrypt/
---
## RSA::Decrypt method


Belirtilen dolgu modunu kullanarak girdi verilerini çözer.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding)
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
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
