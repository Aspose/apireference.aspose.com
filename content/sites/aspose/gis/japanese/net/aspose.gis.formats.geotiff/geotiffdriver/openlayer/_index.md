---
title: GeoTiffDriver.OpenLayer
second_title: Aspose.GIS for .NET API リファレンス
description: GeoTiffDriver 方法. 読み取り用にレイヤーを開きます
type: docs
weight: 20
url: /ja/net/aspose.gis.formats.geotiff/geotiffdriver/openlayer/
---
## OpenLayer(AbstractPath, RasterDriverOptions) {#openlayer_2}

読み取り用にレイヤーを開きます。

```csharp
public override RasterLayer OpenLayer(AbstractPath path, RasterDriverOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |
| options | RasterDriverOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| ArgumentNullException | パスは`null`. |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーがラスター レイヤーを開くことができません ([`CanOpenLayers`](../canopenlayers/)）。 |

### 関連項目

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [RasterDriverOptions](../../../aspose.gis/rasterdriveroptions/)
* class [GeoTiffDriver](../)
* 名前空間 [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* 組み立て [Aspose.GIS](../../../)

---

## OpenLayer(string, GeoTiffOptions) {#openlayer_4}

読み取り用にレイヤーを開きます。

```csharp
public RasterLayer OpenLayer(string path, GeoTiffOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | ファイルへのパス。 |
| options | GeoTiffOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### 関連項目

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [GeoTiffOptions](../../geotiffoptions/)
* class [GeoTiffDriver](../)
* 名前空間 [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* 組み立て [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, GeoTiffOptions) {#openlayer_1}

読み取り用にレイヤーを開きます。

```csharp
public RasterLayer OpenLayer(AbstractPath path, GeoTiffOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |
| options | GeoTiffOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### 関連項目

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [GeoTiffOptions](../../geotiffoptions/)
* class [GeoTiffDriver](../)
* 名前空間 [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* 組み立て [Aspose.GIS](../../../)


