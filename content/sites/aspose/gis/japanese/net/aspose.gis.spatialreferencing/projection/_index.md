---
title: Class Projection
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.SpatialReferencing.Projection クラス. 経度緯度 を x y. に変換するパラメータ付きの投影法を表します
type: docs
weight: 2240
url: /ja/net/aspose.gis.spatialreferencing/projection/
---
## Projection class

(経度、緯度) を (x, y). に変換するパラメータ付きの投影法を表します。

```csharp
public class Projection : IdentifiableObject
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AngularParametersUnit](../../aspose.gis.spatialreferencing/projection/angularparametersunit/) { get; } | 角度パラメータに使用される単位. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | このオブジェクト識別子が EPSG 識別子の場合 - そのコードを返します。それ以外の場合 - -1. を返します |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | この識別可能なオブジェクトの識別子. |
| [LinearParametersUnit](../../aspose.gis.spatialreferencing/projection/linearparametersunit/) { get; } | 線形パラメーターに使用される単位。 |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | このオブジェクトの名前. |
| [ParametersNames](../../aspose.gis.spatialreferencing/projection/parametersnames/) { get; } | この射影に与えられたパラメーターの名前の列挙可能なコレクションを取得します |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [GetParameterValue](../../aspose.gis.spatialreferencing/projection/getparametervalue/)(string, ParameterType) | この投影の指定された名前のパラメーターを取得します。 |
| [IsEquivalent](../../aspose.gis.spatialreferencing/projection/isequivalent/)(Projection) | 2 つの投影が等しいかどうかを判断します。同等の投影は、 と同じ方法で (経度、緯度) を (x, y) にマップします。 |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 現在のオブジェクトを表す文字列を返します。 |
| [TryGetParameterValue](../../aspose.gis.spatialreferencing/projection/trygetparametervalue/)(string, ParameterType) | このプロジェクションの指定された名前のパラメーターを取得します。そのようなパラメータがない場合 - を返します`null` . |

### 関連項目

* class [IdentifiableObject](../identifiableobject/)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 組み立て [Aspose.GIS](../../)


