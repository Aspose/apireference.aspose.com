---
title: Class Metered
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Metered クラス. メータリング キーを設定するメソッドを提供します
type: docs
weight: 1280
url: /ja/net/aspose.gis/metered/
---
## Metered class

メータリング キーを設定するメソッドを提供します。

```csharp
public class Metered
```

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [GetConsumptionCredit](../../aspose.gis/metered/getconsumptioncredit/)() | 消費クレジットを取得 |
| static [GetConsumptionQuantity](../../aspose.gis/metered/getconsumptionquantity/)() | 消費ファイルサイズを取得 |
| static [ResetMeteredKey](../../aspose.gis/metered/resetmeteredkey/)() | 以前にセットアップしたライセンスを削除します |
| static [SetMeteredKey](../../aspose.gis/metered/setmeteredkey/)(string, string) | 従量制の公開鍵と秘密鍵を設定します |

### 例

この例では、従量制の公開鍵と秘密鍵を設定しようとします

```csharp
[C#]

Metered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Metered.SetMeteredKey("PublicKey", "PrivateKey")
```

### 関連項目

* 名前空間 [Aspose.Gis](../../aspose.gis/)
* 組み立て [Aspose.GIS](../../)


