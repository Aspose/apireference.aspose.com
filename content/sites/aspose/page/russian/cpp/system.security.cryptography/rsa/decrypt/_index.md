---
title: "Метод System::Security::Cryptography::RSA::Decrypt"
linktitle: "Decrypt"
second_title: "Aspose.Page для C++"
description: "Метод System::Security::Cryptography::RSA::Decrypt. Расшифровывает входные данные, используя указанный режим заполнения (padding) в C++."
type: docs
weight: 100
url: /ru/cpp/system.security.cryptography/rsa/decrypt/
---
## RSA::Decrypt method


Расшифровывает входные данные, используя указанный режим заполнения.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| data | ByteArrayPtr | Массив [Byte](../../../system/byte/) для расшифровки. |
| padding | SharedPtr\<RSAEncryptionPadding\> | Режим отступа. |

### ReturnValue

Расшифрованные данные в формате массива байтов.

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
