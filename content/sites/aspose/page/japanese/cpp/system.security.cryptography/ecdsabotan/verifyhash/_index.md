---
title: "System::Security::Cryptography::ECDsaBotan::VerifyHash メソッド"
linktitle: "VerifyHash"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::ECDsaBotan::VerifyHash メソッド。C++ でデータ署名を検証します。"
type: docs
weight: 1500
url: /ja/cpp/system.security.cryptography/ecdsabotan/verifyhash/
---
## ECDsaBotan::VerifyHash method


データ署名をチェックします。

```cpp
bool System::Security::Cryptography::ECDsaBotan::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ハッシュ | ByteArrayPtr | 受信データのハッシュが計算されます。 |
| 署名 | ByteArrayPtr | 受信した署名。 |

### ReturnValue

署名が有効な場合は true、そうでない場合は false。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
