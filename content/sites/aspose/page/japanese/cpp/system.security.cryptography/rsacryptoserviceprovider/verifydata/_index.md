---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData メソッド"
linktitle: "VerifyData"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData メソッド。データの署名を確認します（C++）。"
type: docs
weight: 1800
url: /ja/cpp/system.security.cryptography/rsacryptoserviceprovider/verifydata/
---
## RSACryptoServiceProvider::VerifyData method


データ署名をチェックします。

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg, const ByteArrayPtr &signature)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | 署名を確認する対象の [Data](../../../system.data/)。 |
| halg | const SharedPtr\<Object\>\& | 使用するハッシュアルゴリズム。 |
| 署名 | const ByteArrayPtr\& | 受信した署名。 |

### ReturnValue

署名が有効な場合は true、そうでない場合は false。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
