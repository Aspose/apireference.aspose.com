---
title: "System::Security::Cryptography::RSA::VerifyHash メソッド"
linktitle: "VerifyHash"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSA::VerifyHash メソッド。C++ で指定されたハッシュの署名が有効かどうかを検証します。"
type: docs
weight: 1400
url: /ja/cpp/system.security.cryptography/rsa/verifyhash/
---
## RSA::VerifyHash method


指定されたハッシュの署名が有効であることを検証します。

```cpp
virtual bool System::Security::Cryptography::RSA::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ハッシュ | ByteArrayPtr | 署名されたデータのハッシュ値。 |
| 署名 | ByteArrayPtr | 署名データ。 |
| hash_algorithm | const HashAlgorithmName\& | ハッシュアルゴリズム。 |
| パディング | SharedPtr\<RSASignaturePadding\> | パディングモード。署名が有効な場合は true を返し、そうでない場合は false を返します。 |

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
