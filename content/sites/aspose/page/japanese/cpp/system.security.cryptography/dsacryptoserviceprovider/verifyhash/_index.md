---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash メソッド"
linktitle: "VerifyHash"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash メソッド。C++ でデータ署名をチェックします。"
type: docs
weight: 1800
url: /ja/cpp/system.security.cryptography/dsacryptoserviceprovider/verifyhash/
---
## DSACryptoServiceProvider::VerifyHash method


データ署名をチェックします。

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | 受信データのハッシュが計算されます。 |
| str | const String\& | 使用されているハッシュアルゴリズムの名前。 |
| rgb_signature | const ByteArrayPtr\& | 受信した署名。 |

### ReturnValue

署名が有効な場合は true、そうでない場合は false。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
