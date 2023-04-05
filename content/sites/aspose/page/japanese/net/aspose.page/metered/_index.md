---
title: Class Metered
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.Metered クラス. メータリング キーを設定するメソッドを提供します
type: docs
weight: 290
url: /ja/net/aspose.page/metered/
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
| [SetMeteredKey](../../aspose.page/metered/setmeteredkey/)(string, string) | 従量制の公開鍵と秘密鍵を設定します |
| static [GetConsumptionCredit](../../aspose.page/metered/getconsumptioncredit/)() | 消費クレジットを取得 |
| static [GetConsumptionQuantity](../../aspose.page/metered/getconsumptionquantity/)() | 消費ファイルサイズを取得 |

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

* 名前空間 [Aspose.Page](../../aspose.page/)
* 組み立て [Aspose.Page](../../)


