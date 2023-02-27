---
title: RecognitionResult.GetSpellCheckErrorList
second_title: Aspose.OCR for .NET API リファレンス
description: RecognitionResult 方法. 与えられた入力テキストのスペルミスのある単語とスペルの候補を見つけます
type: docs
weight: 110
url: /ja/net/aspose.ocr/recognitionresult/getspellcheckerrorlist/
---
## RecognitionResult.GetSpellCheckErrorList method

与えられた入力テキストのスペルミスのある単語と、スペルの候補を見つけます。

```csharp
public List<SpellCheckError> GetSpellCheckErrorList(
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| language | SpellCheckLanguage | 使用する辞書。 |
| dictionaryPath | String | 必要に応じて。ユーザー辞書 (頻度辞書) へのフルパス。 辞書ファイル形式: UTF-8 エンコードのプレーン テキスト ファイル。 単語と単語頻度は、スペースまたはタブで区切られています。デフォルトでは、単語は最初の列に、頻度は 2 列目にあると予想されます。 すべての単語-別の行の周波数ペア。行は、一連の文字の後に改行 ("\n")、キャリッジ リターン ("\r")、 、またはキャリッジ リターンの直後に改行が続くものとして定義されます。 ("\r\n"). すべての単語は小文字であることが期待されます. |

### 戻り値

スペルミスのある単語を表す SpellCheckError オブジェクトのリストと、スペルミスのある単語ごとに推奨される正しいスペルのリスト と、編集距離。

### 関連項目

* struct [SpellCheckError](../../../aspose.ocr.spellchecker/spellcheckerror/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* 名前空間 [Aspose.OCR](../../recognitionresult/)
* 組み立て [Aspose.OCR](../../../)


