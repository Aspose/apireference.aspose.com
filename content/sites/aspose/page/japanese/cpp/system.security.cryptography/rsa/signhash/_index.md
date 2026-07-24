---
title: "System::Security::Cryptography::RSA::SignHash メソッド"
linktitle: "SignHash"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSA::SignHash メソッド。C++ で指定されたハッシュ値の署名を計算します。"
type: docs
weight: 1100
url: /ja/cpp/system.security.cryptography/rsa/signhash/
---
## RSA::SignHash method


指定されたハッシュ値の署名を計算します。

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ハッシュ | ByteArrayPtr | ハッシュ値。 |
| hash_algorithm | HashAlgorithmName | ハッシュアルゴリズム。 |
| padding | SharedPtr\<RSASignaturePadding\> | パディングモード。指定されたハッシュに対する [RSA](../) 署名を返します。 |

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
