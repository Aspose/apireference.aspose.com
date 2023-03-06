---
title: Map.Render
second_title: Aspose.GIS for .NET API リファレンス
description: Map 方法. マップをファイルにレンダリングします
type: docs
weight: 140
url: /ja/net/aspose.gis.rendering/map/render/
---
## Render(string, Renderer) {#render_1}

マップをファイルにレンダリングします。

```csharp
public void Render(string outputPath, Renderer renderer)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| outputPath | String | 出力ファイルへのパス。 |
| renderer | Renderer | 使用するレンダラー。 |

### 関連項目

* class [Renderer](../../renderer/)
* class [Map](../)
* 名前空間 [Aspose.Gis.Rendering](../../map/)
* 組み立て [Aspose.GIS](../../../)

---

## Render(AbstractPath, Renderer) {#render}

マップをファイルにレンダリングします。

```csharp
public void Render(AbstractPath outputPath, Renderer renderer)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| outputPath | AbstractPath | 出力ファイルへのパス。 |
| renderer | Renderer | 使用するレンダラー。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 任意の引数`null`. |
| IOException | I/O エラーが発生しました。 |
| [GisException](../../../aspose.gis/gisexception/) | GIS データの処理中または読み取り中にエラーが発生しました。 |

### 関連項目

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [Renderer](../../renderer/)
* class [Map](../)
* 名前空間 [Aspose.Gis.Rendering](../../map/)
* 組み立て [Aspose.GIS](../../../)


