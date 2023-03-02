---
title: Class FileGdbCoordinatePrecisionGrid
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Formats.FileGdb.FileGdbCoordinatePrecisionGrid クラス. FileGDB レイヤー内の座標精度グリッド
type: docs
weight: 250
url: /ja/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/
---
## FileGdbCoordinatePrecisionGrid class

FileGDB レイヤー内の座標精度グリッド。

```csharp
public sealed class FileGdbCoordinatePrecisionGrid
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [FileGdbCoordinatePrecisionGrid](filegdbcoordinateprecisiongrid/)() | デフォルトのコンストラクター。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [MOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/morigin/) { get; set; } | M 座標の原点を取得または設定します。に設定した場合`null`デフォルトが使用されます。 |
| [MScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/mscale/) { get; set; } | M 座標のスケールを取得または設定します。に設定した場合`null`デフォルトが使用されます。 |
| [XOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xorigin/) { get; set; } | X 座標の原点を取得または設定します。に設定した場合`null`デフォルトが使用されます。 |
| [XYScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/) { get; set; } | X 座標と Y 座標のスケールを取得または設定します。に設定した場合`null`デフォルトが使用されます。 |
| [YOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/yorigin/) { get; set; } | Y 座標の原点を取得または設定します。に設定した場合`null`デフォルトが使用されます。 |
| [ZOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zorigin/) { get; set; } | Z 座標の原点を取得または設定します。に設定した場合`null`デフォルトが使用されます。 |
| [ZScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zscale/) { get; set; } | Z 座標のスケールを取得または設定します。に設定した場合`null`デフォルトが使用されます。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [CreateFromRectangle](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/)(IPoint, IPoint) | 新規作成`FileGdbCoordinatePrecisionGrid`長方形内のすべての値が表現可能であるように. |

### 備考

座標精度グリッドは、FileGDB レイヤーの座標の有効なドメインと解像度を定義します。 Origin は、空間内の座標精度グリッドへのパスを定義します。スケールは解像度を定義します ( スケールが大きいほど、より正確な値が書き込まれます). 精度グリッドは、座標の有効な値の範囲を指定します: 内のすべての座標[`VectorLayer`](../../aspose.gis/vectorlayer/)この範囲内にある必要があります. 範囲外の座標は、後で読み取りエラーを引き起こす可能性があり、ArcGIS によって間違って処理されます. プロパティを指定しない場合 (それらを保持します)`null` ) デフォルト値が使用されます。 デフォルト値は、[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/)の[`VectorLayer`](../../aspose.gis/vectorlayer/). 地理的[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/)デフォルトは次のとおりです: 投影用[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/)デフォルトは次のとおりです: ここで`XY公差`、`公差`と`M公差`からの値です[`FileGdbOptions`](../filegdboptions/) .

```csharp
XMin = XOrigin
YMin = YOrigin
ZMin = ZOrigin
MMin = MOrigin
XMax = XOrigin + 9e+15 / XYScale
YMax = YOrigin + 9e+15 / XYScale
ZMax = ZOrigin + 9e+15 / ZScale
MMax = MOrigin + 9e+15 / MScale
```

```csharp
XOrigin = -400
YOrigin = -400
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1e9
ZScale  = 1 / ZTolerance * 10
MScale  = 1 / MTolerance * 10
```

```csharp
XOrigin = -2147483647
YOrigin = -2147483647
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1 / XYTolerance * 10
ZScale  = 1 / ZTolerance  * 10
MScale  = 1 / MTolerance  * 10
```

### 関連項目

* 名前空間 [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* 組み立て [Aspose.GIS](../../)


