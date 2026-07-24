---
title: "System::Security::Permissions::SecurityPermissionFlag 列挙体"
linktitle: "SecurityPermissionFlag"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Permissions::SecurityPermissionFlag 列挙体。C++ におけるセキュリティ権限のフラグです。"
type: docs
weight: 300
url: /ja/cpp/system.security.permissions/securitypermissionflag/
---
## SecurityPermissionFlag enum


セキュリティ許可のフラグです。

```cpp
enum class SecurityPermissionFlag
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| フラグなし | 0 | アクセスなし。 |
| アサーション | 1 | 権限が付与されていることをアサートします。 |
| アンマネージドコード | 2 | アンマネージドコードを呼び出します。 |
| 検証をスキップ | 4 | コードの検証をスキップします。 |
| 実行 | 8 | コードを実行します。 |
| スレッド制御 | 16 | スレッド上で操作を実行します。 |
| 証拠制御 | 32 | CLR の証拠を制御または変更します。 |
| ポリシー制御 | 64 | ポリシーを表示および変更します。 |
| シリアル化フォーマッタ | 128 | シリアル化します。 |
| ドメインポリシー制御 | 256 | ドメインポリシーを設定します。 |
| プリンシパル制御 | 512 | プリンシパルオブジェクトを制御します。 |
| アプリドメイン制御 | 1024 | アプリケーションドメインを制御します。 |
| リモーティング構成 | 2048 | リモーティングを構成します。 |
| インフラストラクチャ | 4096 | CLR インフラストラクチャに接続します。 |
| バインディングリダイレクト | 8192 | 明示的なバインディングリダイレクトを実行します。 |
| AllFlags | 16383 | 無制限です。 |

## 参照

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)
