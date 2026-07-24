---
title: "System::Security::Cryptography::RSA::Encrypt method"
linktitle: "Şifrele"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::RSA::Encrypt yöntemi. Girdi verilerini belirtilen dolgu modunu kullanarak C++'ta şifreler."
type: docs
weight: 300
url: /tr/cpp/system.security.cryptography/rsa/encrypt/
---
## RSA::Encrypt method


Belirtilen dolgu modunu kullanarak girdi verilerini şifreler.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding)
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
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
