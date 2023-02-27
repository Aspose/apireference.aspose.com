---
title: RecognitionResult.Save
second_title: Aspose.OCR for .NET API リファレンス
description: RecognitionResult 方法. ドキュメントをプレーン テキストPDFまたは Microsoft Word ドキュメントとして保存します
type: docs
weight: 130
url: /ja/net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string) {#save_1}

ドキュメントをプレーン テキスト、PDF、または Microsoft Word ドキュメントとして保存します。

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullFileName | String | 認識結果を選択した形式で保存するためのパスを含むファイル名。 |
| saveFormat | SaveFormat | ドキュメント形式 (Docx、Txt、Pdf)。 |
| applySpellingCorrection | Boolean | 認識結果にスペルミスがある場合に備えて、スペルミスの単語を修正するには、true に設定します。 |
| language | SpellCheckLanguage | スペル チェック用の辞書 (オプション)。 |
| dictionaryPath | String | 必要に応じて。 .txt 形式のユーザー辞書へのフル パス。形式は [単語 - スペース - 頻度 (数値)]. 例: 23135851162\n3400031103\n |

### 関連項目

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* 名前空間 [Aspose.OCR](../../recognitionresult/)
* 組み立て [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) {#save}

ドキュメントをプレーン テキスト、PDF、または Microsoft Word ドキュメントとして保存します。

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | 認識結果を選択した形式で保存するための MemoryStream。 |
| saveFormat | SaveFormat | ドキュメント形式 (Docx、Txt、Pdf)。 |
| applySpellingCorrection | Boolean | 認識結果にスペルミスがある場合に備えて、スペルミスの単語を修正するには、true に設定します。 |
| language | SpellCheckLanguage | スペル チェック用の辞書 (オプション)。 |
| dictionaryPath | String | 必要に応じて。 .txt 形式のユーザー辞書へのフル パス。形式は [単語 - スペース - 頻度 (数値)]. 例: 23135851162\n3400031103\n |

### 関連項目

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* 名前空間 [Aspose.OCR](../../recognitionresult/)
* 組み立て [Aspose.OCR](../../../)


