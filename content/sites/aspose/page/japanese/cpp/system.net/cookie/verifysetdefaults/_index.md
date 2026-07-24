---
title: "System::Net::Cookie::VerifySetDefaults メソッド"
linktitle: "VerifySetDefaults"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Cookie::VerifySetDefaults メソッド。C++ でデフォルト attribute''s の値を検証し、設定します。"
type: docs
weight: 4200
url: /ja/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


デフォルト属性の値を検証し、設定します。

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バリアント | CookieVariant | クッキーの仕様です。 |
| uri | System::SharedPtr\<Uri\> | 内部フィールドを初期化するために使用される Uri クラスのインスタンスです。 |
| isLocalDomain | bool | クッキーがローカルドメインにプッシュされるかどうかを示す値です。 |
| localDomain | String | ローカルドメイン名です。 |
| setDefault | bool | クッキーの属性をデフォルト値で初期化する必要があるかどうかを示す値です。 |
| shouldThrow | bool | 指定された値が無効な場合に例外をスローすべきかどうかを示す値です。 |

### ReturnValue

すべての値が有効な場合は true、そうでない場合は false です。

## 参照

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
