---
title: AsposeOcr.CorrectSpelling
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. テキストを修正します スペルミスの単語を置き換えます.
type: docs
weight: 60
url: /ja/net/aspose.ocr/asposeocr/correctspelling/
---
## AsposeOcr.CorrectSpelling method

テキストを修正します (スペルミスの単語を置き換えます).

```csharp
public string CorrectSpelling(string text, SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| text | String | 修正用テキスト。 |
| language | SpellCheckLanguage | 使用する辞書。 |
| dictionaryPath | String | 必要に応じて。ユーザー辞書 (頻度辞書) へのフルパス。 辞書ファイル形式: UTF-8 エンコードのプレーン テキスト ファイル。 単語と単語頻度は、スペースまたはタブで区切られています。デフォルトでは、単語は最初の列に、頻度は 2 列目にあると予想されます。 すべての単語-別の行の周波数ペア。行は、一連の文字の後に改行 ("\n")、キャリッジ リターン ("\r")、 、またはキャリッジ リターンの直後に改行が続くものとして定義されます。 ("\r\n"). すべての単語は小文字であることが期待されます. |

### 戻り値

単語を置き換えたテキスト。

### 関連項目

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


