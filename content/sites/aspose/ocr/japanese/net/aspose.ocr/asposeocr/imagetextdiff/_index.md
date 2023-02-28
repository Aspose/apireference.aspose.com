---
title: AsposeOcr.ImageTextDiff
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. 2 つの画像のテキストを比較し類似度を表す数値 0 から 1 を返します
type: docs
weight: 90
url: /ja/net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

2 つの画像のテキストを比較し、類似度を表す数値 (0 から 1) を返します。

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullPath1 | String | 最初の画像へのパス。 |
| fullPath2 | String | 2 番目のイメージへのパス。 |
| settings | RecognitionSettings | 認識設定。 |
| ignoreCase | Boolean | True - 大文字と小文字を区別しない検索を意味します。 |

### 戻り値

0 は、テキストが完全に異なることを意味します。 1 は、テキストが同一であることを意味します。

### 関連項目

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


