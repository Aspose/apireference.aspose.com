---
title: Class GenerationResult
second_title: Aspose.OMR for .NET API リファレンス
description: Aspose.OMR.Generation.GenerationResult クラス. テンプレート生成の結果 テンプレート イメージとテンプレート イメージ上の要素の位置を記述する json が含まれます
type: docs
weight: 620
url: /ja/net/aspose.omr.generation/generationresult/
---
## GenerationResult class

テンプレート生成の結果。 テンプレート イメージとテンプレート (イメージ上の要素の位置を記述する json) が含まれます。

```csharp
public class GenerationResult
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [ErrorCode](../../aspose.omr.generation/generationresult/errorcode/) { get; set; } | エラー コードを取得または設定します。エラーが発生しなかった場合は 0 になります。 |
| [ErrorMessage](../../aspose.omr.generation/generationresult/errormessage/) { get; set; } | エラーを説明するメッセージを取得または設定します。エラーが発生しなかった場合は空. |
| [Template](../../aspose.omr.generation/generationresult/template/) { get; set; } | テンプレート JSON 文字列を取得または設定します |
| [TemplateImage](../../aspose.omr.generation/generationresult/templateimage/) { get; set; } | 生成されたテンプレート イメージを取得または設定します |
| [Warnings](../../aspose.omr.generation/generationresult/warnings/) { get; set; } | 生成中に表示された重大ではない障害を説明する警告メッセージのリストを取得または設定します |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Save](../../aspose.omr.generation/generationresult/save/)(string, string) | テンプレート画像とテンプレートを指定したフォルダに保存 |
| [SaveAsPdf](../../aspose.omr.generation/generationresult/saveaspdf/)(string, string) | テンプレート画像とテンプレートを指定したフォルダに保存 テンプレート画像をpdfとして保存 |

## 田畑

| 名前 | 説明 |
| --- | --- |
| [MultipageTemplateImages](../../aspose.omr.generation/generationresult/multipagetemplateimages/) | 複数ページのテンプレート 用に生成された画像のコレクションを取得または設定します |

### 関連項目

* 名前空間 [Aspose.OMR.Generation](../../aspose.omr.generation/)
* 組み立て [Aspose.OMR](../../)


