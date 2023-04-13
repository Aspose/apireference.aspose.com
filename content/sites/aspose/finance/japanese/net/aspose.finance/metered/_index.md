---
title: Class Metered
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Metered クラス. メータリング キーを設定するメソッドを提供します
type: docs
weight: 20
url: /ja/net/aspose.finance/metered/
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
| [SetMeteredKey](../../aspose.finance/metered/setmeteredkey/)(string, string) | 従量制の公開鍵と秘密鍵を設定します |
| static [GetConsumptionCredit](../../aspose.finance/metered/getconsumptioncredit/)() | 消費クレジットを取得 |
| static [GetConsumptionQuantity](../../aspose.finance/metered/getconsumptionquantity/)() | 消費ファイルサイズを取得 |

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

* 名前空間 [Aspose.Finance](../../aspose.finance/)
* 組み立て [Aspose.Finance](../../)


