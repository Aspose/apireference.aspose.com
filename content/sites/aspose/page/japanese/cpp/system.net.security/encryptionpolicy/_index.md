---
title: "System::Net::Security::EncryptionPolicy 列挙体"
linktitle: "EncryptionPolicy"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Security::EncryptionPolicy 列挙型。C++ における暗号化ポリシーを列挙します。"
type: docs
weight: 400
url: /ja/cpp/system.net.security/encryptionpolicy/
---
## EncryptionPolicy enum


暗号化ポリシーを列挙します。

```cpp
enum class EncryptionPolicy
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| RequireEncryption | 0 | 暗号化を必須とし、'Null' 暗号は決して許可しません。 |
| AllowNoEncryption | 1 | 完全な暗号化の使用を優先しますが、サーバーが同意すれば 'Null' 暗号を使用できます。 |
| NoEncryption | 2 | 暗号化なしを許可し、相手側が 'Null' 暗号を処理できる場合は 'Null' 暗号の使用を要求します。 |

## 参照

* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
