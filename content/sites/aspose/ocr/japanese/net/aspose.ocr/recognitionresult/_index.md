---
title: Class RecognitionResult
second_title: Aspose.OCR for .NET API リファレンス
description: Aspose.OCR.RecognitionResult クラス. 画像認識の結果 認識情報を含む要素と結果のエクスポート方法が含まれています
type: docs
weight: 220
url: /ja/net/aspose.ocr/recognitionresult/
---
## RecognitionResult class

画像認識の結果。 認識情報を含む要素と結果のエクスポート方法が含まれています。

```csharp
public class RecognitionResult
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Image](../../aspose.ocr/recognitionresult/image/) { get; set; } | PDF 作成用の画像を取得または設定します。 |
| [RecognitionAreasRectangles](../../aspose.ocr/recognitionresult/recognitionareasrectangles/) { get; } | 長方形の座標を取得します。 |
| [RecognitionAreasText](../../aspose.ocr/recognitionresult/recognitionareastext/) { get; } | 領域のリスト（Rectangles）のリスト認識結果を取得します。 |
| [RecognitionCharactersList](../../aspose.ocr/recognitionresult/recognitioncharacterslist/) { get; } | 認識アルゴリズムによって検出され、確率の高い順に並べられた一連の文字. |
| [RecognitionLinesResult](../../aspose.ocr/recognitionresult/recognitionlinesresult/) { get; } | 行のリスト（Rectangles）で認識結果のリストを取得します。 |
| [RecognitionText](../../aspose.ocr/recognitionresult/recognitiontext/) { get; } | 認識結果を1文字列で取得します。 |
| [Skew](../../aspose.ocr/recognitionresult/skew/) { get; } | スキュー角度を取得します。 |
| [Warnings](../../aspose.ocr/recognitionresult/warnings/) { get; } | 生成中に表示された重大ではない障害を説明する警告メッセージのリストを取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [GetJson](../../aspose.ocr/recognitionresult/getjson/)(bool) | Form 認識結果を含む JSON 文字列。 |
| [GetSpellCheckCorrectedText](../../aspose.ocr/recognitionresult/getspellcheckcorrectedtext/)(SpellCheckLanguage, string) | テキストを修正します (スペルミスの単語を置き換えます). |
| [GetSpellCheckErrorList](../../aspose.ocr/recognitionresult/getspellcheckerrorlist/)(SpellCheckLanguage, string) | 与えられた入力テキストのスペルミスのある単語と、スペルの候補を見つけます。 |
| [GetXml](../../aspose.ocr/recognitionresult/getxml/)() | 認識結果を含むフォーム XML 文字列. |
| [Save](../../aspose.ocr/recognitionresult/save/#save)(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) | ドキュメントをプレーン テキスト、PDF、または Microsoft Word ドキュメントとして保存します。 |
| [Save](../../aspose.ocr/recognitionresult/save/#save_1)(string, SaveFormat, bool, SpellCheckLanguage, string) | ドキュメントをプレーン テキスト、PDF、または Microsoft Word ドキュメントとして保存します。 |
| [operator +](../../aspose.ocr/recognitionresult/op_addition/) | 認識されたフラグメント (行) から完全な結果を完成させる. |

## その他のメンバー

| 名前 | 説明 |
| --- | --- |
| class [LinesResult](recognitionresult.linesresult/) | 行座標の行から認識されたテキスト. |

### 関連項目

* 名前空間 [Aspose.OCR](../../aspose.ocr/)
* 組み立て [Aspose.OCR](../../)


