---
title: Interface ICurve
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Geometries.ICurve インターフェース. AICurveポイントのシーケンスです.
type: docs
weight: 980
url: /ja/net/aspose.gis.geometries/icurve/
---
## ICurve interface

A`ICurve`ポイントのシーケンスです.

```csharp
public interface ICurve : IGeometry
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [EndPoint](../../aspose.gis.geometries/icurve/endpoint/) { get; } | 曲線の終点のコピーを返します。 |
| [IsClosed](../../aspose.gis.geometries/icurve/isclosed/) { get; } | 曲線が閉じているかどうかを示す値を取得します。 始点が終点と等しい場合、曲線は閉じています。 |
| [StartPoint](../../aspose.gis.geometries/icurve/startpoint/) { get; } | 曲線の始点のコピーを返します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icurve/toeditable/)() | このジオメトリの編集可能なコピーを取得します. |
| [ToLinearGeometry](../../aspose.gis.geometries/icurve/tolineargeometry/#tolineargeometry)() | デフォルトを使用して、このジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します`許容範囲` . |
| [ToLinearGeometry](../../aspose.gis.geometries/icurve/tolineargeometry/#tolineargeometry_1)(double) | 指定された値を使用して、このジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します`許容範囲`. |

### 関連項目

* interface [IGeometry](../igeometry/)
* 名前空間 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 組み立て [Aspose.GIS](../../)


