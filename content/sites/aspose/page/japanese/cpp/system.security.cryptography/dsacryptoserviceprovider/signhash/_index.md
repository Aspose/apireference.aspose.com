---
title: "System::Security::Cryptography::DSACryptoServiceProvider::SignHash メソッド"
linktitle: "SignHash"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::DSACryptoServiceProvider::SignHash メソッド。C++ で指定された入力値の署名を計算します。"
type: docs
weight: 1600
url: /ja/cpp/system.security.cryptography/dsacryptoserviceprovider/signhash/
---
## DSACryptoServiceProvider::SignHash method


指定された入力値の署名を計算します。

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | 署名対象データのハッシュ値。 |
| str | const String\& | ハッシュ作成に使用されるハッシュアルゴリズム識別子。 |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
