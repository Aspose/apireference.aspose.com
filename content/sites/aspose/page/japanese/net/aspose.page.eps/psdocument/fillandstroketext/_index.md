---
title: PsDocument.FillAndStrokeText
second_title: Aspose.Page for .NET API リファレンス
description: PsDocument 方法. グリフの内部を塗りつぶしグリフの輪郭を描くことによりテキスト文字列を追加します
type: docs
weight: 110
url: /ja/net/aspose.page.eps/psdocument/fillandstroketext/
---
## FillAndStrokeText(string, Font, float, float, Brush, Brush, Pen) {#fillandstroketext_1}

グリフの内部を塗りつぶし、グリフの輪郭を描くことにより、テキスト文字列を追加します。

```csharp
public void FillAndStrokeText(string text, Font font, float x, float y, Brush fillPaint, 
    Brush strokePaint, Pen stroke)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| text | String | 追加するテキスト。 |
| font | Font | テキストの描画に使用されるシステム フォント。 |
| x | Single | テキスト原点の X 座標。 |
| y | Single | テキスト原点の Y 座標。 |
| fillPaint | Brush | グリフ内部の描画に使用される塗りつぶし。 |
| strokePaint | Brush | のBrushグリフの輪郭を描画するために使用されます。の任意のサブクラスにすることができますBrush.NET プラットフォームのクラス。 |
| stroke | Pen | グリフの輪郭の描画に使用されるストローク。 |

### 関連項目

* class [PsDocument](../)
* 名前空間 [Aspose.Page.EPS](../../psdocument/)
* 組み立て [Aspose.Page](../../../)

---

## FillAndStrokeText(string, float[], Font, float, float, Brush, Brush, Pen) {#fillandstroketext}

グリフの内部を塗りつぶし、グリフの輪郭を描くことにより、テキスト文字列を追加します。

```csharp
public void FillAndStrokeText(string text, float[] advances, Font font, float x, float y, 
    Brush fillPaint, Brush strokePaint, Pen stroke)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| text | String | 追加するテキスト。 |
| advances | Single[] | グリフ幅の配列。その長さは、文字列内のグリフの数に準拠する必要があります。 |
| font | Font | テキストの描画に使用されるシステム フォント。 |
| x | Single | テキスト原点の X 座標。 |
| y | Single | テキスト原点の Y 座標。 |
| fillPaint | Brush | グリフ内部の描画に使用される塗りつぶし。 |
| strokePaint | Brush | のBrushグリフの輪郭を描画するために使用されます。の任意のサブクラスにすることができますBrush.NET プラットフォームのクラス。 |
| stroke | Pen | グリフの輪郭の描画に使用されるストローク。 |

### 関連項目

* class [PsDocument](../)
* 名前空間 [Aspose.Page.EPS](../../psdocument/)
* 組み立て [Aspose.Page](../../../)


