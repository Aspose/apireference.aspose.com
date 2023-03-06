---
title: FileGdbCoordinatePrecisionGrid.CreateFromRectangle
second_title: Aspose.GIS for .NET API リファレンス
description: FileGdbCoordinatePrecisionGrid 方法. 新規作成FileGdbCoordinatePrecisionGrid長方形内のすべての値が表現可能であるように.
type: docs
weight: 20
url: /ja/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/
---
## FileGdbCoordinatePrecisionGrid.CreateFromRectangle method

新規作成`FileGdbCoordinatePrecisionGrid`長方形内のすべての値が表現可能であるように.

```csharp
public static FileGdbCoordinatePrecisionGrid CreateFromRectangle(IPoint p1, IPoint p2)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| p1 | IPoint | 長方形の 1 つの角。 |
| p2 | IPoint | 長方形の対角。と同じ次元である必要があります*p1*. |

### 戻り値

`FileGdbCoordinatePrecisionGrid`長方形内のすべての値が表現可能であるように. 長方形の外側の値は表現できないため、FileGDB layer に書き込まれるすべての座標は長方形内にある必要があります.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | *p1*と*p2*有効な空でない四角形を形成しないでください: *p1*また*p2*空です。の HasZ' フラグ*p1*の「HasZ」フラグと等しくありません*p2*の HasM' フラグ*p1*の「HasM」フラグと等しくありません*p2*のX'座標*p1*の「X」座標に等しい*p2*Y' 座標*p1*の「Y」座標に等しい*p2*のZ'座標*p1*の「Z」座標に等しい*p2*M' 座標*p1*の「M」座標に等しい*p2*どんなコーディネートもNaNまたは無限。 |

### 関連項目

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [FileGdbCoordinatePrecisionGrid](../)
* 名前空間 [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* 組み立て [Aspose.GIS](../../../)


