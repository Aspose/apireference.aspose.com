---
title: "Aspose::Page::Metered::SetMeteredKey メソッド"
linktitle: "SetMeteredKey"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::Metered::SetMeteredKey メソッド。メーター制の公開キーとプライベートキーを設定します。メーター制ライセンスを購入した場合、アプリケーション起動時にこの API を呼び出す必要があり、通常はこれだけで十分です。ただし、消費データのアップロードが常に失敗し 24 時間を超えると、ライセンスは評価ステータスに設定されます。そのような事態を防ぐため、ライセンスステータスを定期的に確認し、評価ステータスの場合は C++ で再度この API を呼び出すべきです。"
type: docs
weight: 200
url: /ja/cpp/aspose.page/metered/setmeteredkey/
---
## Metered::SetMeteredKey method


メータードの公開鍵と秘密鍵を設定します。メータードライセンスを購入した場合、アプリケーション起動時にこの API を呼び出す必要があります。通常、これだけで十分です。ただし、消費データのアップロードが常に失敗し、24 時間を超えると、ライセンスが評価ステータスに設定されます。そのような事態を回避するために、ライセンスステータスを定期的に確認し、評価ステータスである場合は再度この API を呼び出す必要があります。

```cpp
void Aspose::Page::Metered::SetMeteredKey(System::String publicKey, System::String privateKey)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| publicKey | System::String | 公開キー |
| privateKey | System::String | プライベートキー |

## 参照

* Class [String](../../../system/string/)
* Class [Metered](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
