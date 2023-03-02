---
title: PrecisionModel.Rounding
second_title: Aspose.GIS for .NET API リファレンス
description: PrecisionModel 方法. 丸め精度モデルを返します 丸め精度モデルによると有効な桁数は限られています
type: docs
weight: 20
url: /ja/net/aspose.gis/precisionmodel/rounding/
---
## PrecisionModel.Rounding method

丸め精度モデルを返します。 丸め精度モデルによると、有効な桁数は限られています。

```csharp
public static PrecisionModel Rounding(int significantDigits)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| significantDigits | Int32 | 有効桁数。 |

### 戻り値

丸め精度モデル。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentOutOfRangeException | 有効桁数が 0 未満または 15 を超えています。 |

### 備考

座標に適用すると、次のコードを使用して精度が低下します:

```csharp
double rounded = Math.Round(value, significantDigits);
```

### 関連項目

* class [PrecisionModel](../)
* 名前空間 [Aspose.Gis](../../precisionmodel/)
* 組み立て [Aspose.GIS](../../../)


