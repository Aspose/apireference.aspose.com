---
title: "System::Security::Cryptography::RSA::Encrypt yöntemi"
linktitle: "Encrypt"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RSA::Encrypt yöntemi. Belirtilen dolgu modunu kullanarak giriş verilerini C++'ta şifreler."
type: docs
weight: 300
url: /tr/cpp/system.security.cryptography/rsa/encrypt/
---
## RSA::Encrypt method


Belirtilen dolgu (padding) modunu kullanarak giriş verisini şifreler.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding)
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
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
