---
title: Class Metered
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Metered クラス. メータリング キーを設定するメソッドを提供します
type: docs
weight: 2200
url: /ja/net/aspose.svg/metered/
---
## Metered class

メータリング キーを設定するメソッドを提供します。

```csharp
public class Metered
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Metered](metered/)() | このクラスの新しいインスタンスを初期化します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [SetMeteredKey](../../aspose.svg/metered/setmeteredkey/)(string, string) | 従量制の公開鍵と秘密鍵を設定します。 従量制ライセンスを購入した場合、アプリ起動時にこの API を呼び出す必要がありますが、通常はこれで十分です。 ただし、常に消費データのアップロードに失敗し、24 時間を超えると、ライセンスは評価ステータスに設定されます. そのような場合を避けるために、定期的にライセンスステータスを確認し、評価ステータスである場合は、この API を再度呼び出す必要があります. |
| static [GetConsumptionCredit](../../aspose.svg/metered/getconsumptioncredit/)() | 消費クレジットを取得 |
| static [GetConsumptionQuantity](../../aspose.svg/metered/getconsumptionquantity/)() | 消費ファイルサイズを取得 |

### 例

この例では、従量制の公開鍵と秘密鍵を設定しようとします

```csharp
[C#]

Metered matered = new Metered();
matered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Dim matered As Metered = New Metered
matered.SetMeteredKey("PublicKey", "PrivateKey")
```

コンポーネント jar ファイル:

```csharp
Metered matered = new Metered();
matered.setMeteredKey("PublicKey", "PrivateKey");
```

### 関連項目

* 名前空間 [Aspose.Svg](../../aspose.svg/)
* 組み立て [Aspose.SVG](../../)


