---
title: "System::Security::Cryptography::X509Certificates::X509KeyStorageFlags 列挙型"
linktitle: "X509KeyStorageFlags"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X509KeyStorageFlags 列挙型。C++ でキーを保存する方法を定義します。"
type: docs
weight: 2100
url: /ja/cpp/system.security.cryptography.x509certificates/x509keystorageflags/
---
## X509KeyStorageFlags enum


キーの保存方法を定義します。

```cpp
enum class X509KeyStorageFlags : int32_t
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| DefaultKeySet | 0 | デフォルトのキーセットを使用します。 |
| UserKeySet | 1 | マシンローカルのストアではなく、ユーザー関連ストアを使用します。 |
| MachineKeySet | 2 | ローカルマシンストアを使用し、ユーザーのものではなく使用してください。 |
| エクスポート可能 | 4 | インポートされたキーをエクスポート可能としてマークします。 |
| ユーザー保護 | 8 | キーが使用中であることをユーザーに通知します。 |
| キーセットを永続化 | 16 | 証明書をインポートする際にキーが永続化されます。 |

## 参照

* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
