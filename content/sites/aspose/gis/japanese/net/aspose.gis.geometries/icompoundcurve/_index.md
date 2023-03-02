---
title: Interface ICompoundCurve
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Geometries.ICompoundCurve インターフェース. 隣接する曲線が終点で結合されるように連続する曲線のシーケンスを表す曲線
type: docs
weight: 970
url: /ja/net/aspose.gis.geometries/icompoundcurve/
---
## ICompoundCurve interface

隣接する曲線が終点で結合されるように、連続する曲線のシーケンスを表す曲線。

```csharp
public interface ICompoundCurve : ICurve, IEnumerable<ICurve>, IEquatable<ICompoundCurve>
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Count](../../aspose.gis.geometries/icompoundcurve/count/) { get; } | 内の曲線の数を取得します`ICompoundCurve` . |
| [Item](../../aspose.gis.geometries/icompoundcurve/item/) { get; } | を取得します[`ICurve`](../icurve/)指定されたインデックスで. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icompoundcurve/toeditable/)() | このジオメトリの編集可能なコピーを取得します. |

### 関連項目

* interface [ICurve](../icurve/)
* 名前空間 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 組み立て [Aspose.GIS](../../)


