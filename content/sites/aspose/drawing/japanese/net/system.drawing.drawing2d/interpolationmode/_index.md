---
title: Enum InterpolationMode
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Drawing2D.InterpolationMode 列挙. InterpolationMode 列挙体は画像がスケーリングまたは回転されるときに使用されるアルゴリズムを指定します.
type: docs
weight: 310
url: /ja/net/system.drawing.drawing2d/interpolationmode/
---
## InterpolationMode enumeration

InterpolationMode 列挙体は、画像がスケーリングまたは回転されるときに使用されるアルゴリズムを指定します.

```csharp
public enum InterpolationMode
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| Invalid | `-1` | QualityMode 列挙体の Invalid 要素に相当します。 |
| Default | `0` | デフォルト モードを指定します。 |
| Low | `1` | 低品質の補間を指定します。 |
| High | `2` | 高品質補間を指定します。 |
| Bilinear | `3` | バイリニア補間を指定します。事前フィルタリングは行われません。このモードは、 イメージを元のサイズの 50% 未満に縮小する場合には適していません. |
| Bicubic | `4` | バイキュービック補間を指定します。事前フィルタリングは行われません。このモードは、 イメージを元のサイズの 25% 未満に縮小する場合には適していません. |
| NearestNeighbor | `5` | 最近傍補間を指定します。 |
| HighQualityBilinear | `6` | 高品質の双一次補間を指定します。高品質の縮小を保証するために、事前フィルタリングが実行されます。 |
| HighQualityBicubic | `7` | 高品質のバイキュービック補間を指定します。高品質の縮小を保証するために事前フィルタリングが実行されます. このモードは、最高品質の変換された画像を生成します. |

### 関連項目

* 名前空間 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 組み立て [Aspose.Drawing](../../)


