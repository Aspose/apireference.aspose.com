---
title: Class Unit
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.SpatialReferencing.Unit クラス. 測定単位を表します
type: docs
weight: 2290
url: /ja/net/aspose.gis.spatialreferencing/unit/
---
## Unit class

測定単位を表します。

```csharp
public class Unit : IdentifiableObject
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Unit](unit/)(string, double, Identifier) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| static [Degree](../../aspose.gis.spatialreferencing/unit/degree/) { get; } | 度を表す単位を取得します。 |
| static [Meter](../../aspose.gis.spatialreferencing/unit/meter/) { get; } | メートルを表す Unit を取得します。 |
| static [Radian](../../aspose.gis.spatialreferencing/unit/radian/) { get; } | ラジアンを表す単位を取得します。 |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | このオブジェクト識別子が EPSG 識別子の場合 - そのコードを返します。それ以外の場合 - -1. を返します |
| [Factor](../../aspose.gis.spatialreferencing/unit/factor/) { get; } | 長さ単位の場合はメートルに因数を、角度単位の場合はラジアンに因数をとります。 |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | この識別可能なオブジェクトの識別子. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | このオブジェクトの名前. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Apply](../../aspose.gis.spatialreferencing/unit/apply/)(double) | 引数をこのインスタンスで記述された単位に変換します. |
| [Deapply](../../aspose.gis.spatialreferencing/unit/deapply/)(double) | このインスタンスで記述された単位から引数をラジアンまたはメートルに変換します。 |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 現在のオブジェクトを表す文字列を返します。 |

### 関連項目

* class [IdentifiableObject](../identifiableobject/)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 組み立て [Aspose.GIS](../../)


