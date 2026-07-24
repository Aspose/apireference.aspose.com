---
title: "System::Security::Cryptography::DSA::VerifySignature メソッド"
linktitle: "VerifySignature"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::DSA::VerifySignature メソッド。C++ で指定されたデータの DSA 署名を検証します。"
type: docs
weight: 800
url: /ja/cpp/system.security.cryptography/dsa/verifysignature/
---
## DSA::VerifySignature method


指定されたデータの [DSA](../) 署名を検証します。

```cpp
virtual bool System::Security::Cryptography::DSA::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) が **rgb_signature** で署名されています。 |
| rgb_signature | ByteArrayPtr | [DSA](../) 署名。 |

### ReturnValue

true - **rgb_signature** が **rgb_hash** 上で計算された [DSA](../) 署名と一致する場合は true、そうでない場合は false。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
