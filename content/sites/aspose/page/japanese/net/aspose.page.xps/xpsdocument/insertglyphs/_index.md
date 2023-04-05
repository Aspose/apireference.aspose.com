---
title: XpsDocument.InsertGlyphs
second_title: Aspose.Page for .NET API リファレンス
description: XpsDocument 方法. のアクティブなページに新しいグリフを挿入しますindex位置.
type: docs
weight: 420
url: /ja/net/aspose.page.xps/xpsdocument/insertglyphs/
---
## InsertGlyphs(int, string, float, FontStyle, float, float, string) {#insertglyphs_1}

のアクティブなページに新しいグリフを挿入します*index*位置.

```csharp
public XpsGlyphs InsertGlyphs(int index, string fontFamily, float fontSize, FontStyle fontStyle, 
    float originX, float originY, string unicodeString)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| index | Int32 | 新しいグリフを挿入する位置。 |
| fontFamily | String | フォントファミリー。 |
| fontSize | Single | フォントサイズ。 |
| fontStyle | FontStyle | フォント スタイル。 |
| originX | Single | グリフの原点 X 座標。 |
| originY | Single | グリフの原点 Y 座標。 |
| unicodeString | String | 印刷する文字列。 |

### 戻り値

挿入されたグリフ。

### 関連項目

* class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* class [XpsDocument](../)
* 名前空間 [Aspose.Page.XPS](../../xpsdocument/)
* 組み立て [Aspose.Page](../../../)

---

## InsertGlyphs(int, XpsFont, float, float, float, string) {#insertglyphs}

のアクティブなページに新しいグリフを挿入します*index*位置.

```csharp
public XpsGlyphs InsertGlyphs(int index, XpsFont font, float fontSize, float originX, 
    float originY, string unicodeString)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| index | Int32 | 新しいグリフを挿入する位置。 |
| font | XpsFont | フォント リソース。 |
| fontSize | Single | フォントサイズ。 |
| originX | Single | グリフの原点 X 座標。 |
| originY | Single | グリフの原点 Y 座標。 |
| unicodeString | String | 印刷する文字列。 |

### 戻り値

挿入されたグリフ。

### 関連項目

* class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* class [XpsDocument](../)
* 名前空間 [Aspose.Page.XPS](../../xpsdocument/)
* 組み立て [Aspose.Page](../../../)


