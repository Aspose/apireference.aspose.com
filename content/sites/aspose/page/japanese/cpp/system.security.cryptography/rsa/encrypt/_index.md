---
title: "System::Security::Cryptography::RSA::Encrypt メソッド"
linktitle: "暗号化"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSA::Encrypt メソッド。C++ で指定されたパディングモードを使用して入力データを暗号化します。"
type: docs
weight: 300
url: /ja/cpp/system.security.cryptography/rsa/encrypt/
---
## RSA::Encrypt method


指定されたパディングモードを使用して入力データを暗号化します。

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| data | ByteArrayPtr | 暗号化する [Byte](../../../system/byte/) 配列。 |
| パディング | SharedPtr\<RSAEncryptionPadding\> | パディングモード。 |

### ReturnValue

バイト配列形式の暗号化データ。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
