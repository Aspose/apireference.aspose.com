---
title: Class Metered
second_title: Aspose.OCR for .NET API リファレンス
description: Aspose.OCR.Metered クラス. メータリング キーを設定するメソッドを提供します
type: docs
weight: 150
url: /ja/net/aspose.ocr/metered/
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
| [SetMeteredKey](../../aspose.ocr/metered/setmeteredkey/)(string, string) | 従量制の公開鍵と秘密鍵を設定します |
| static [GetConsumptionCredit](../../aspose.ocr/metered/getconsumptioncredit/)() | 消費クレジットを取得 |
| static [GetConsumptionQuantity](../../aspose.ocr/metered/getconsumptionquantity/)() | 消費ファイルサイズを取得 |

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

* 名前空間 [Aspose.OCR](../../aspose.ocr/)
* 組み立て [Aspose.OCR](../../)


