---
title: AsposeOcr.CompareImageTexts
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. 2 つの画像に同じテキストが含まれているかどうかを確認します
type: docs
weight: 50
url: /ja/net/aspose.ocr/asposeocr/compareimagetexts/
---
## AsposeOcr.CompareImageTexts method

2 つの画像に同じテキストが含まれているかどうかを確認します。

```csharp
public bool CompareImageTexts(string fullPath1, string fullPath2, 
    RecognitionSettings settings = null, bool ignoreCase = true)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullPath1 | String | 最初の画像へのパス。 |
| fullPath2 | String | 2 番目のイメージへのパス。 |
| settings | RecognitionSettings | 認識設定。 |
| ignoreCase | Boolean | True - 大文字と小文字を区別しない検索を意味します。 |

### 戻り値

画像のテキストが同じ場合は true (90% の類似性)。

### 関連項目

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


