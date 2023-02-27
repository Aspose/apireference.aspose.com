---
title: RecognitionSettings.RecognitionSettings
second_title: Aspose.OCR for .NET API リファレンス
description: RecognitionSettings コンストラクタ. の新しいインスタンスを初期化しますRecognitionSettingsプロパティの完全なセットを持つクラス.
type: docs
weight: 10
url: /ja/net/aspose.ocr/recognitionsettings/recognitionsettings/
---
## RecognitionSettings constructor

の新しいインスタンスを初期化します[`RecognitionSettings`](../)プロパティの完全なセットを持つクラス.

```csharp
public RecognitionSettings(Language language = Language.None, 
    List<Rectangle> recognitionAreas = null, bool detectAreas = true, bool autoSkew = true, 
    float skewAngle = 0, bool recognizeSingleLine = false, int threshold = 0)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| language | Language | OCR に使用される言語。 |
| recognitionAreas | List`1 | 認識のための領域を手動で設定します。デフォルトでは Null - 画像全体が処理されることを意味します。 |
| detectAreas | Boolean | テキスト領域の自動検出を有効にします。 |
| autoSkew | Boolean | 自動画像歪み補正を有効にします。 |
| skewAngle | Single | 画像の回転角度を設定します。 |
| recognizeSingleLine | Boolean | 単線画像の場合 |
| threshold | Int32 | カスタム イメージの 2 値化しきい値 |

### 関連項目

* enum [Language](../../language/)
* class [RecognitionSettings](../)
* 名前空間 [Aspose.OCR](../../recognitionsettings/)
* 組み立て [Aspose.OCR](../../../)


