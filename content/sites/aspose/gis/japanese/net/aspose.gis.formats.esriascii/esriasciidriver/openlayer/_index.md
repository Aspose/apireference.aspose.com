---
title: EsriAsciiDriver.OpenLayer
second_title: Aspose.GIS for .NET API リファレンス
description: EsriAsciiDriver 方法. 読み取り用にレイヤーを開きます
type: docs
weight: 20
url: /ja/net/aspose.gis.formats.esriascii/esriasciidriver/openlayer/
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
* class [EsriAsciiDriver](../)
* 名前空間 [Aspose.Gis.Formats.EsriAscii](../../esriasciidriver/)
* 組み立て [Aspose.GIS](../../../)

---

## OpenLayer(string, EsriAsciiOptions) {#openlayer_4}

読み取り用にレイヤーを開きます。

```csharp
public RasterLayer OpenLayer(string path, EsriAsciiOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | ファイルへのパス。 |
| options | EsriAsciiOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### 関連項目

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [EsriAsciiOptions](../../esriasciioptions/)
* class [EsriAsciiDriver](../)
* 名前空間 [Aspose.Gis.Formats.EsriAscii](../../esriasciidriver/)
* 組み立て [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, EsriAsciiOptions) {#openlayer_1}

読み取り用にレイヤーを開きます。

```csharp
public RasterLayer OpenLayer(AbstractPath path, EsriAsciiOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |
| options | EsriAsciiOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### 関連項目

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [EsriAsciiOptions](../../esriasciioptions/)
* class [EsriAsciiDriver](../)
* 名前空間 [Aspose.Gis.Formats.EsriAscii](../../esriasciidriver/)
* 組み立て [Aspose.GIS](../../../)


