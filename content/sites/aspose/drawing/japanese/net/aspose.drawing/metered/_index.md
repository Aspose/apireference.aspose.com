---
title: Class Metered
second_title: Aspose.Drawing for .NET API リファレンス
description: Aspose.Drawing.Metered クラス. メータリング キーを設定するメソッドを提供します
type: docs
weight: 20
url: /ja/net/aspose.drawing/metered/
---
## Metered class

メータリング キーを設定するメソッドを提供します。

```csharp
public sealed class Metered : IDisposable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Metered](metered/)() | の新しいインスタンスを初期化します`Metered`class. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Dispose](../../aspose.drawing/metered/dispose/)() | アンマネージ リソースの解放、解放、またはリセットに関連するアプリケーション定義のタスクを実行します。 |
| [SetMeteredKey](../../aspose.drawing/metered/setmeteredkey/)(string, string) | 従量制の公開鍵と秘密鍵を設定します |
| static [GetConsumptionCredit](../../aspose.drawing/metered/getconsumptioncredit/)() | 消費クレジットを取得します。 |
| static [GetConsumptionQuantity](../../aspose.drawing/metered/getconsumptionquantity/)() | 消費ファイルサイズを取得します。 |

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

* 名前空間 [Aspose.Drawing](../../aspose.drawing/)
* 組み立て [Aspose.Drawing](../../)


