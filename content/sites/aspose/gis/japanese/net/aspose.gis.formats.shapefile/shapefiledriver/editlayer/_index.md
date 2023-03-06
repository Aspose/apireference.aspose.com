---
title: ShapefileDriver.EditLayer
second_title: Aspose.GIS for .NET API リファレンス
description: ShapefileDriver 方法. レイヤーを編集用に開きます
type: docs
weight: 50
url: /ja/net/aspose.gis.formats.shapefile/shapefiledriver/editlayer/
---
## EditLayer(AbstractPath, DriverOptions) {#editlayer}

レイヤーを編集用に開きます。

```csharp
public override VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |
| options | DriverOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| ArgumentNullException | パスは`null`. |
| [GisException](../../../aspose.gis/gisexception/) | ファイルからのフィーチャの読み取り中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [ShapefileDriver](../)
* 名前空間 [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* 組み立て [Aspose.GIS](../../../)

---

## EditLayer(string, ShapefileOptions) {#editlayer_3}

レイヤーを編集用に開きます。

```csharp
public VectorLayer EditLayer(string path, ShapefileOptions options = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | ファイルへのパス。 |
| options | ShapefileOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### 関連項目

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [ShapefileOptions](../../shapefileoptions/)
* class [ShapefileDriver](../)
* 名前空間 [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* 組み立て [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, ShapefileOptions) {#editlayer_1}

レイヤーを編集用に開きます。

```csharp
public VectorLayer EditLayer(AbstractPath path, ShapefileOptions options = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |
| options | ShapefileOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### 関連項目

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [ShapefileOptions](../../shapefileoptions/)
* class [ShapefileDriver](../)
* 名前空間 [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* 組み立て [Aspose.GIS](../../../)


