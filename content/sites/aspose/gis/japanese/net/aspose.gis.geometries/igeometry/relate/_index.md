---
title: IGeometry.Relate
second_title: Aspose.GIS for .NET API リファレンス
description: IGeometry 方法. このジオメトリと指定されたジオメトリの DE9IM 交差行列が指定されたパターンと一致するかどうかを決定します
type: docs
weight: 290
url: /ja/net/aspose.gis.geometries/igeometry/relate/
---
## IGeometry.Relate method

このジオメトリと指定されたジオメトリの DE-9IM 交差行列が、指定されたパターンと一致するかどうかを決定します。

```csharp
public bool Relate(IGeometry other, string intersectionPatternMatrix)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | ジオメトリ。 |
| intersectionPatternMatrix | String | 一致するパターン。 これは、長さが 9 に等しい文字列である必要があります。 文字列の各文字は、交差の予想される寸法を表します: 文字 0 - ジオメトリの内部の間。文字 1 - このジオメトリの内部と別のジオメトリの境界の間。文字 2 - このジオメトリの内部と別のジオメトリの外部の間。文字 3 - このジオメトリの境界と別のジオメトリの内部の間。文字 4 - ジオメトリの境界間。文字 5 - このジオメトリの境界と別のジオメトリの外部の間。文字 6 - このジオメトリの外部と別のジオメトリの内部の間。文字 7 - このジオメトリの外部と別のジオメトリの境界の間。文字 8 - ジオメトリの外側の間。 各文字の可能な値は次のとおりです: * - 任意の値;F - 交点なし;T - 任意の交差点。0 - ポイント交差点 (共有ポイントなど)。1 - 線の交差 (例: 線の共有セグメント);2 - 領域の交差 (例: ポリゴンの共有部分); たとえば、交差パターン「F0*******」は、ジオメトリ間の交差があってはならない interiors と、ジオメトリ境界間の交差が点でなければならないことを意味します。 交差行列の詳細については、OpenGIS Simple Features Specification を参照してください。 pattern. |

### 戻り値

`true`この交差行列がパターンに一致する場合。`false`そうでなければ.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | *other*は`null`. |
| ArgumentException | ジオメトリの 1 つが無効であるため、操作を完了できません。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)のジオメトリが同等ではありません. を使用できます[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)ジオメトリを同じ spatial 参照系に変換するため. |

### 備考

このメソッドは、DE-9IM 交差行列を作成し、それを pattern と一致させます。DE-9IM 交差行列の詳細については、OpenGIS Simple Features Specification を参照してください。

### 例

次のコード:  は、ジオメトリが空間的に等しいかどうかを検出します.

```csharp
geometry.Relate(other, "T*F**FFF*");
```

### 関連項目

* interface [IGeometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../igeometry/)
* 組み立て [Aspose.GIS](../../../)


