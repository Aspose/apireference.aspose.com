---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature メソッド"
linktitle: "VerifySignature"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature メソッド。C++ で指定されたデータの DSA 署名を検証します。"
type: docs
weight: 1900
url: /ja/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


指定されたデータの [DSA](../../dsa/) 署名を検証します。

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) が **rgb_signature** で署名されています。 |
| rgb_signature | ByteArrayPtr | [DSA](../../dsa/) 署名。 |

### ReturnValue

true - **rgb_signature** が **rgb_hash** に対して計算された [DSA](../../dsa/) 署名と一致する場合、そうでなければ false。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
