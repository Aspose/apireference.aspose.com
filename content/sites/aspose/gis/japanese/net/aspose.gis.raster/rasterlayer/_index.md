---
title: Class RasterLayer
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Raster.RasterLayer クラス. ラスター レイヤーを表します
type: docs
weight: 1390
url: /ja/net/aspose.gis.raster/rasterlayer/
---
## RasterLayer class

ラスター レイヤーを表します。

```csharp
public abstract class RasterLayer : IDisposable
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| abstract [BandCount](../../aspose.gis.raster/rasterlayer/bandcount/) { get; } | ラスター レイヤーのバンド数を取得します。 |
| [Bounds](../../aspose.gis.raster/rasterlayer/bounds/) { get; } | ラスター境界を取得します。 |
| abstract [CellSize](../../aspose.gis.raster/rasterlayer/cellsize/) { get; } | ラスターのセル サイズまたはピクセル サイズを取得します。 |
| abstract [Driver](../../aspose.gis.raster/rasterlayer/driver/) { get; } | を取得します[`Driver`](./driver/)このレイヤーをインスタンス化した. |
| abstract [Height](../../aspose.gis.raster/rasterlayer/height/) { get; } | ラスターの高さをピクセル単位で取得します。行数とも呼ばれます。 |
| abstract [NoDataValues](../../aspose.gis.raster/rasterlayer/nodatavalues/) { get; } | ラスターの背景または「データなし」を表す値を取得します。 |
| abstract [SpatialReferenceSystem](../../aspose.gis.raster/rasterlayer/spatialreferencesystem/) { get; } | ラスターの空間参照系を取得します。`null`不明な場合. |
| abstract [UpperLeftX](../../aspose.gis.raster/rasterlayer/upperleftx/) { get; } | ラスターの左上隅の x 座標を取得します。 |
| abstract [UpperLeftY](../../aspose.gis.raster/rasterlayer/upperlefty/) { get; } | ラスターの左上隅の y 座標を取得します。 |
| abstract [Width](../../aspose.gis.raster/rasterlayer/width/) { get; } | ラスターの幅をピクセル単位で取得します。列数とも呼ばれます。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop_1)(double[]) | バンド マスクを使用してラスター レイヤーをトリミングします。 |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop)(IGeometry, double[]) | シェイプ フォーム (およびバンド マスク) を使用してラスター レイヤーをトリミングします。 |
| [Dispose](../../aspose.gis.raster/rasterlayer/dispose/)() | によって使用されるリソースを解放します。`RasterLayer`. |
| abstract [GetBand](../../aspose.gis.raster/rasterlayer/getband/)(int) | 指定されたインデックスでバンドを取得します。 |
| virtual [GetExtent](../../aspose.gis.raster/rasterlayer/getextent/)() | このレイヤーの空間範囲を計算します。 |
| [GetSpatialPoint](../../aspose.gis.raster/rasterlayer/getspatialpoint/)(int, int) | 指定された列と行を空間座標に変換します。 |
| [GetStatistics](../../aspose.gis.raster/rasterlayer/getstatistics/)(int, bool) | カウント、合計、平均、最小、最大で構成される要約統計量を計算します。 |
| [GetValues](../../aspose.gis.raster/rasterlayer/getvalues/)(int, int) | 指定されたセルの値を読み取ります。 |
| [GetValuesDump](../../aspose.gis.raster/rasterlayer/getvaluesdump/)(RasterRect) | 指定したブロックの値を 1 次元配列として読み取ります。 |
| [GetValuesOnExpression](../../aspose.gis.raster/rasterlayer/getvaluesonexpression/)(RasterRect, RasterReadExpression) | 式でバンド値を読み取り、処理します。 |
| override [ToString](../../aspose.gis.raster/rasterlayer/tostring/)() | 現在のオブジェクトを表す文字列を返します。 |
| [Warp](../../aspose.gis.raster/rasterlayer/warp/)(WarpOptions) | ラスター レイヤーを別のレイヤーにワープします。 |

### 関連項目

* 名前空間 [Aspose.Gis.Raster](../../aspose.gis.raster/)
* 組み立て [Aspose.GIS](../../)


