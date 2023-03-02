---
title: Class Ellipsoid
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.SpatialReferencing.Ellipsoid クラス. Ellipsoid は地球に近似する楕円体を表します
type: docs
weight: 2070
url: /ja/net/aspose.gis.spatialreferencing/ellipsoid/
---
## Ellipsoid class

Ellipsoid は、地球に近似する楕円体を表します。

```csharp
public class Ellipsoid : IdentifiableObject
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Ellipsoid](ellipsoid/)(string, double, double, Identifier) | 新しい楕円体を作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| static [Airy](../../aspose.gis.spatialreferencing/ellipsoid/airy/) { get; } | エアリー楕円体. |
| static [Grs80](../../aspose.gis.spatialreferencing/ellipsoid/grs80/) { get; } | GRS 1980 楕円体. |
| static [Wgs72](../../aspose.gis.spatialreferencing/ellipsoid/wgs72/) { get; } | WGS 72 楕円体. |
| static [Wgs84](../../aspose.gis.spatialreferencing/ellipsoid/wgs84/) { get; } | WGS 84 楕円体. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | このオブジェクト識別子が EPSG 識別子の場合 - そのコードを返します。それ以外の場合 - -1. を返します |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | この識別可能なオブジェクトの識別子. |
| [InverseFlattening](../../aspose.gis.spatialreferencing/ellipsoid/inverseflattening/) { get; } | 楕円体の逆平坦化。これが球の場合は 0。 |
| [IsSphere](../../aspose.gis.spatialreferencing/ellipsoid/issphere/) { get; } | この楕円体が球体かどうかを検出します。 |
| [IsValid](../../aspose.gis.spatialreferencing/ellipsoid/isvalid/) { get; } | 楕円体が有効かどうかを検出します。長半径は 0 より大きく、逆平坦化は正または 0 です。 |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | このオブジェクトの名前. |
| [SemiMajorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semimajoraxis/) { get; } | 楕円体の半長軸。 |
| [SemiMinorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semiminoraxis/) { get; } | 楕円体の半短軸。これが球の場合、半長軸に等しくなります。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid) | 2 つの楕円体が等しいかどうかを判断します. 楕円体 A が楕円体 B と等しい場合、それらは同じ長半径と逆平坦化を持ちます. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 現在のオブジェクトを表す文字列を返します。 |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid, Ellipsoid) | 2 つの楕円体が等しいかどうかを判断します. 楕円体 A が楕円体 B と等しい場合、それらは同じ長半径と逆平坦化を持ちます. |

### 関連項目

* class [IdentifiableObject](../identifiableobject/)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 組み立て [Aspose.GIS](../../)


