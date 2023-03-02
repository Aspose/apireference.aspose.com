---
title: OsmXmlDriver.CreateLayer
second_title: Aspose.GIS for .NET API リファレンス
description: OsmXmlDriver 方法. レイヤーを作成しそれを開いて新しいフィーチャを追加します
type: docs
weight: 40
url: /ja/net/aspose.gis.formats.osmxml/osmxmldriver/createlayer/
---
## CreateLayer(string, OsmXmlOptions) {#createlayer_7}

レイヤーを作成し、それを開いて新しいフィーチャを追加します。

```csharp
public VectorLayer CreateLayer(string path, OsmXmlOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | ファイルへのパス。 |
| options | OsmXmlOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### 例外

| 例外 | 調子 |
| --- | --- |
| InvalidOperationException | レイヤーは既に存在します。 |

### 関連項目

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [OsmXmlOptions](../../osmxmloptions/)
* class [OsmXmlDriver](../)
* 名前空間 [Aspose.Gis.Formats.OsmXml](../../osmxmldriver/)
* 組み立て [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

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

### 関連項目

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [OsmXmlDriver](../)
* 名前空間 [Aspose.Gis.Formats.OsmXml](../../osmxmldriver/)
* 組み立て [Aspose.GIS](../../../)

---

## CreateLayer(string, OsmXmlOptions, SpatialReferenceSystem) {#createlayer_8}

レイヤーを作成し、それを開いて新しいフィーチャを追加します。

```csharp
public VectorLayer CreateLayer(string path, OsmXmlOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | ファイルへのパス。 |
| options | OsmXmlOptions | ドライバー固有のオプション。 |
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
* class [OsmXmlOptions](../../osmxmloptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [OsmXmlDriver](../)
* 名前空間 [Aspose.Gis.Formats.OsmXml](../../osmxmldriver/)
* 組み立て [Aspose.GIS](../../../)


