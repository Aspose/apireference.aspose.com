---
title: AsposeOcr.GetRectangles
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. 画像上のテキスト領域を検出します.  自動画像傾き補正は適用されません GIFPNGJPEGBMPTIFFJFIF をサポートします
type: docs
weight: 70
url: /ja/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

画像上のテキスト領域を検出します.  自動画像傾き補正は適用されません。 GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullPath | String | 画像へのパス。 |
| areasType | AreasType | 返す四角形 (行または段落) を決定します。 |
| detectAreas | Boolean | テキスト領域の自動検出を有効にします。 |

### 戻り値

検出されたテキスト領域または行のリスト。

### 関連項目

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

画像上のテキスト領域を検出します.  自動画像傾き補正は適用されません。 GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| image | MemoryStream | イメージを含むメモリ ストリーム。 |
| areasType | AreasType | 返す四角形 (行または段落) を決定します。 |
| detectAreas | Boolean | テキスト領域の自動検出を有効にします。 |

### 戻り値

検出されたテキスト領域または行のリスト。

### 関連項目

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


