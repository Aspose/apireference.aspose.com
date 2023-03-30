---
title: Class Metered
second_title: Aspose.OMR for .NET API リファレンス
description: Aspose.OMR.Metered クラス. メータリング キーを設定するメソッドを提供します
type: docs
weight: 780
url: /ja/net/aspose.omr/metered/
---
## Metered class

メータリング キーを設定するメソッドを提供します。

```csharp
public class Metered
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Metered](metered/)() | デフォルトのコンストラクター。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [SetMeteredKey](../../aspose.omr/metered/setmeteredkey/)(string, string) | 従量制の公開鍵と秘密鍵を設定します |
| static [GetConsumptionCredit](../../aspose.omr/metered/getconsumptioncredit/)() | 消費クレジットを取得 |
| static [GetConsumptionQuantity](../../aspose.omr/metered/getconsumptionquantity/)() | 消費ファイルサイズを取得 |

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

### 関連項目

* 名前空間 [Aspose.OMR](../../aspose.omr/)
* 組み立て [Aspose.OMR](../../)


