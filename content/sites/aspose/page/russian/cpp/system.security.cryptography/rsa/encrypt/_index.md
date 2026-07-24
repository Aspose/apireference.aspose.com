---
title: "System::Security::Cryptography::RSA::Encrypt метод"
linktitle: "Encrypt"
second_title: "Aspose.Page для C++"
description: "System::Security::Cryptography::RSA::Encrypt метод. Шифрует входные данные, используя указанный режим заполнения в C++."
type: docs
weight: 300
url: /ru/cpp/system.security.cryptography/rsa/encrypt/
---
## RSA::Encrypt method


Шифрует входные данные, используя указанный режим заполнения.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) массив для шифрования. |
| padding | SharedPtr\<RSAEncryptionPadding\> | Режим отступа. |

### ReturnValue

Зашифрованные данные в формате массива байтов.

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
