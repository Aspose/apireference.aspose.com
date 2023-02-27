---
title: AsposeOcr.ImageHasText
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. 画像に提供されたテキスト フラグメントが含まれているかどうかを確認します
type: docs
weight: 80
url: /ja/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

画像に提供されたテキスト フラグメントが含まれているかどうかを確認します。

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullPath | String | 画像へのパス。 |
| text | String | 画像を検索するためのテキスト フラグメント。 |
| settings | RecognitionSettings | 認識設定。 |
| ignoreCase | Boolean | True - 大文字と小文字を区別しない検索を意味します。 |

### 戻り値

画像にテキスト フラグメントが含まれている場合は true。 False - 画像にテキスト フラグメントが含まれていません。

### 備考

指定可能画像認識[`RecognitionSettings`](../../recognitionsettings/). GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

### 関連項目

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

画像テキストが提供された正規表現と一致するかどうかを確認します。

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullPath | String | 画像へのパス。 |
| regex | Regex | 指定されたパターンとオプションを持つ System.Text.RegularExpressions オブジェクト。 |
| settings | RecognitionSettings | 認識設定。 |

### 戻り値

画像テキストが指定された正規表現と一致する場合は true。

### 備考

指定可能画像認識[`RecognitionSettings`](../../recognitionsettings/). GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

### 関連項目

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


