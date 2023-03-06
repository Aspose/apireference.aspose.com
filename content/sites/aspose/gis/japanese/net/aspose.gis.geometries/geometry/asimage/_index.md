---
title: Geometry.AsImage
second_title: Aspose.GIS for .NET API リファレンス
description: Geometry 方法. このジオメトリを画像表現にエクスポートします
type: docs
weight: 120
url: /ja/net/aspose.gis.geometries/geometry/asimage/
---
## AsImage(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_1}

このジオメトリを画像表現にエクスポートします。

```csharp
public void AsImage(AbstractPath outputPath, Measurement width, Measurement height, 
    Renderer renderer, VectorSymbolizer symbolizer = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| outputPath | AbstractPath | 出力画像へのパス。 |
| width | Measurement | マップの幅。 |
| height | Measurement | マップの高さ。 |
| renderer | Renderer | 使用するレンダラー。 |
| symbolizer | VectorSymbolizer | レンダリングに使用するシンボライザー。もしも`null`、デフォルトのシンボライザーが使用されます。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 任意の引数`null`. |
| IOException | I/O エラーが発生しました。 |
| [GisException](../../../aspose.gis/gisexception/) | GIS データの処理中または読み取り中にエラーが発生しました。 |
| ArgumentException | 幅または高さの単位は!:Unit.MapUnits. |
| ArgumentOutOfRangeException | 幅または高さが負またはゼロです。 |

### 関連項目

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)

---

## AsImage(string, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_2}

このジオメトリを画像表現にエクスポートします。

```csharp
public void AsImage(string outputPath, Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| outputPath | String | 出力画像へのパス。 |
| width | Measurement | マップの幅。 |
| height | Measurement | マップの高さ。 |
| renderer | Renderer | 使用するレンダラー。 |
| symbolizer | VectorSymbolizer | レンダリングに使用するシンボライザー。もしも`null`、デフォルトのシンボライザーが使用されます。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 任意の引数`null`. |
| IOException | I/O エラーが発生しました。 |
| [GisException](../../../aspose.gis/gisexception/) | GIS データの処理中または読み取り中にエラーが発生しました。 |
| ArgumentException | 幅または高さの単位は!:Unit.MapUnits. |
| ArgumentOutOfRangeException | 幅または高さが負またはゼロです。 |

### 関連項目

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)

---

## AsImage(Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage}

このジオメトリを画像表現にエクスポートします。

```csharp
public Stream AsImage(Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| width | Measurement | マップの幅。 |
| height | Measurement | マップの高さ。 |
| renderer | Renderer | 使用するレンダラー。 |
| symbolizer | VectorSymbolizer | レンダリングに使用するシンボライザー。もしも`null`、デフォルトのシンボライザーが使用されます。 |

### 戻り値

ストリームとしての画像

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 任意の引数`null`. |
| IOException | I/O エラーが発生しました。 |
| [GisException](../../../aspose.gis/gisexception/) | GIS データの処理中または読み取り中にエラーが発生しました。 |
| ArgumentException | 幅または高さの単位は!:Unit.MapUnits. |
| ArgumentOutOfRangeException | 幅または高さが負またはゼロです。 |

### 関連項目

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)


