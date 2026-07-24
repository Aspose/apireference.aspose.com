---
title: "System::Net::Security::AuthenticationLevel 列挙型"
linktitle: "AuthenticationLevel"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Security::AuthenticationLevel 列挙型。C++ の WebRequest 固有の認証フラグ。"
type: docs
weight: 300
url: /ja/cpp/system.net.security/authenticationlevel/
---
## AuthenticationLevel enum


WebRequest 固有の認証フラグです。

```cpp
enum class AuthenticationLevel
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 | クライアントとサーバーの両方で認証は必要ありません。 |
| MutualAuthRequested | 1 | サーバーが認証されていなくても、リクエストは失敗しません。 |
| MutualAuthRequired | 2 | サーバーが認証されていない場合、現在のアプリケーションは 'IOException' を受け取ります。 |

## 参照

* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
