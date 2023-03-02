---
title: VectorMapLayer.ImportSld
second_title: Aspose.GIS for .NET API リファレンス
description: VectorMapLayer 方法. 指定したパスにある Styled Layer Descriptor ファイルからスタイルをインポートします
type: docs
weight: 60
url: /ja/net/aspose.gis.rendering/vectormaplayer/importsld/
---
## ImportSld(string, SldImportOptions) {#importsld_1}

指定したパスにある Styled Layer Descriptor ファイルからスタイルをインポートします。

```csharp
public void ImportSld(string path, SldImportOptions options = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | スタイル付きレイヤー記述子ファイルへのパス。 |
| options | SldImportOptions | インポート オプション。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| XmlException | XML の解析中にエラーが発生しました。 |
| FormatException | XML に SLD スタイルが見つかりませんでした。 |

### 備考

このメソッドは、[`Symbolizer`](../symbolizer/)プロパティ.

### 関連項目

* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* 名前空間 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 組み立て [Aspose.GIS](../../../)

---

## ImportSld(AbstractPath, SldImportOptions) {#importsld}

指定したパスにある Styled Layer Descriptor ファイルからスタイルをインポートします。

```csharp
public void ImportSld(AbstractPath path, SldImportOptions options = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | スタイル付きレイヤー記述子ファイルへのパス。 |
| options | SldImportOptions | インポート オプション。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| XmlException | XML の解析中にエラーが発生しました。 |
| FormatException | XML に SLD スタイルが見つかりませんでした。 |

### 備考

このメソッドは、[`Symbolizer`](../symbolizer/)プロパティ.

### 関連項目

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* 名前空間 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 組み立て [Aspose.GIS](../../../)


