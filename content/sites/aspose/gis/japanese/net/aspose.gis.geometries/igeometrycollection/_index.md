---
title: Interface IGeometryCollection
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Geometries.IGeometryCollection インターフェース. AIGeometryCollectionですIGeometryこれは1 つ以上のジオメトリのコレクションです
type: docs
weight: 1010
url: /ja/net/aspose.gis.geometries/igeometrycollection/
---
## IGeometryCollection interface

A`IGeometryCollection`です[`IGeometry`](../igeometry/)これは、1 つ以上のジオメトリのコレクションです。

```csharp
public interface IGeometryCollection : IEnumerable<IGeometry>, IEquatable<IGeometryCollection>, 
    IGeometry
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Count](../../aspose.gis.geometries/igeometrycollection/count/) { get; } | このコレクション内のジオメトリの数を取得します. |
| [Item](../../aspose.gis.geometries/igeometrycollection/item/) { get; } | を取得します[`IGeometry`](../igeometry/)指定されたインデックスで. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [GetPointOnSurface](../../aspose.gis.geometries/igeometrycollection/getpointonsurface/)() | このコレクション内のサーフェスの 1 つにあることが保証されているポイントを見つけます。 |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/)() | このジオメトリのラインとして表されるポリゴンを取得します. |
| [ToEditable](../../aspose.gis.geometries/igeometrycollection/toeditable/)() | このジオメトリの編集可能なコピーを取得します. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry)() | デフォルトを使用して、このジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します`許容範囲` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry_1)(double) | 指定された値を使用して、このジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します`許容範囲` . |

### 関連項目

* interface [IGeometry](../igeometry/)
* 名前空間 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 組み立て [Aspose.GIS](../../)


