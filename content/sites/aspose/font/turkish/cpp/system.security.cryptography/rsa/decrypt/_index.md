---
title: "System::Security::Cryptography::RSA::Decrypt yöntemi"
linktitle: "Decrypt"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RSA::Decrypt yöntemi. Belirtilen dolgu modunu kullanarak giriş verilerini C++'ta çözer."
type: docs
weight: 100
url: /tr/cpp/system.security.cryptography/rsa/decrypt/
---
## RSA::Decrypt method


Belirtilen dolgu (padding) modunu kullanarak giriş verisini çözer.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) çözülecek dizi. |
| dolgu | SharedPtr\<RSAEncryptionPadding\> | Dolgu modu. |

### ReturnValue

Çözülen veri bayt dizi biçiminde.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
