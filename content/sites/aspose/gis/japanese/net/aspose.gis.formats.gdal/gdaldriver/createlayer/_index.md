---
title: GdalDriver.CreateLayer
second_title: Aspose.GIS for .NET API リファレンス
description: GdalDriver 方法. レイヤーを作成しそれを開いて新しいフィーチャを追加します
type: docs
weight: 40
url: /ja/net/aspose.gis.formats.gdal/gdaldriver/createlayer/
---
## GdalDriver.CreateLayer method

レイヤーを作成し、それを開いて新しいフィーチャを追加します。

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |
| options | DriverOptions | ドライバー固有のオプション。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空間参照系。 |

### 戻り値

のインスタンス[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### 例外

| 例外 | 調子 |
| --- | --- |
| InvalidOperationException | レイヤーは既に存在します。 |
| NotSupportedException | ドライバーは空間参照システムをサポートしていません。 |

### 関連項目

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GdalDriver](../)
* 名前空間 [Aspose.Gis.Formats.GDAL](../../gdaldriver/)
* 組み立て [Aspose.GIS](../../../)


