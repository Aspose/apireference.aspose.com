---
title: Interface ICircularString
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Geometries.ICircularString インターフェース. ポイント間の円形補間を使用する複数頂点の曲線
type: docs
weight: 960
url: /ja/net/aspose.gis.geometries/icircularstring/
---
## ICircularString interface

ポイント間の円形補間を使用する複数頂点の曲線。

```csharp
public interface ICircularString : ICurve, IEquatable<ICircularString>, IReadOnlyList<IPoint>
```

## メソッド

| 名前 | 説明 |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icircularstring/toeditable/)() | このジオメトリの編集可能なコピーを取得します. |

### 備考

`CircularString`端から端まで接続された 1 つまたは複数の円弧セグメントで構成されます。 最初の 3 点が最初のセグメントを定義します。最初の点は円弧の始点です。 2 番目の点は、始点または終点以外の円弧上の中間点です。 3 番目の点は円弧の終点です。後続の円弧は、中間点と終点のみによって定義されます. は、始点が前のセグメントの終点として暗黙的に定義されるためです.

### 関連項目

* interface [ICurve](../icurve/)
* interface [IPoint](../ipoint/)
* 名前空間 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 組み立て [Aspose.GIS](../../)


