---
title: "System::Security::Cryptography::RSA::Decrypt メソッド"
linktitle: "Decrypt"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSA::Decrypt メソッド。指定されたパディングモードを使用して入力データを C++ で復号化します。"
type: docs
weight: 100
url: /ja/cpp/system.security.cryptography/rsa/decrypt/
---
## RSA::Decrypt method


指定されたパディングモードを使用して入力データを復号化します。

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| data | ByteArrayPtr | 復号するための [Byte](../../../system/byte/) 配列。 |
| パディング | SharedPtr\<RSAEncryptionPadding\> | パディングモード。 |

### ReturnValue

バイト配列形式の復号済みデータ。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
