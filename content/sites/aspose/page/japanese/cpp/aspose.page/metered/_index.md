---
title: "Aspose::Page::Metered クラス"
linktitle: "メータード"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::Metered クラス。C++ でメータードキーを設定するメソッドを提供します。"
type: docs
weight: 1400
url: /ja/cpp/aspose.page/metered/
---
## Metered class


メーターキーを設定するメソッドを提供します。

```cpp
class Metered : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [GetConsumptionCredit](./getconsumptioncredit/)() | 消費クレジットを取得します。 |
| static [GetConsumptionQuantity](./getconsumptionquantity/)() | 消費ファイルサイズを取得します。 |
| [Metered](./metered/)() | このクラスの新しいインスタンスを初期化します。 |
| [SetMeteredKey](./setmeteredkey/)(System::String, System::String) | メータードの公開鍵と秘密鍵を設定します。メータードライセンスを購入した場合、アプリケーション起動時にこの API を呼び出す必要があります。通常、これだけで十分です。ただし、消費データのアップロードが常に失敗し、24 時間を超えると、ライセンスが評価ステータスに設定されます。そのような事態を回避するために、ライセンスステータスを定期的に確認し、評価ステータスである場合は再度この API を呼び出す必要があります。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
