---
title: Class RecognitionSettings
second_title: Aspose.OCR for .NET API リファレンス
description: Aspose.OCR.RecognitionSettings クラス. 画像認識の設定. 認識プロセスをカスタマイズできる要素が含まれています.
type: docs
weight: 240
url: /ja/net/aspose.ocr/recognitionsettings/
---
## RecognitionSettings class

画像認識の設定. 認識プロセスをカスタマイズできる要素が含まれています.

```csharp
public class RecognitionSettings : BaseRecognitionSettings
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [RecognitionSettings](recognitionsettings/)(Language, List&lt;Rectangle&gt;, bool, bool, float, bool, int) | の新しいインスタンスを初期化します`RecognitionSettings`プロパティの完全なセットを持つクラス. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | 許可された文字セット。認識結果に許可される文字の種類を決定します。 |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | 認識前に画像に追加のコントラスト補正アルゴリズムを使用できます. |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | 追加のニューラル ネットワークを使用して画像を改善し、ノイズを減らします。 スキャン アーティファクト、歪み、スポット、フレア、グラデーション、異物を含む画像に役立ちます。 |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | 自動イメージ スキュー補正を有効にするかどうかを示すフラグを取得または設定します。 デフォルトで有効 (true)。 |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | ドキュメント タイプ領域に最適なモードを選択できます: ドキュメント、写真、プレーン テキスト、列、画像。 |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | 認識シンボルのブラックリストを設定します。 |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | OCR に使用される言語を取得または設定します。  認識中に使用されるアルファベットを決定します。 デフォルトで多言語。 |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | テーブル内のテキストを認識できるようにします (線で囲まれた領域). |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | 前処理方法を調整して、OCR 用の画像を準備できます。 |
| [RecognitionAreas](../../aspose.ocr/recognitionsettings/recognitionareas/) { set; } | 処理するテキスト領域のリストを取得または設定します。  より正確な認識のためにテキストで領域を手動で指定できます. カスタム領域が設定されている場合DetectAreasと!:AutoSkewプロパティは無視されます.  DetectAreas と AutoSkew を無効にします。 |
| [RecognizeSingleLine](../../aspose.ocr/recognitionsettings/recognizesingleline/) { set; } | 単線画像認識を設定します。 デフォルトでは無効 (false) です。 行への分割に関連するすべての処理ステップを無効にします。 画像に 1 行しか含まれていない場合は、このパラメーターを true に設定します。 RecognitionAreas 設定を無効にするため、すべての領域設定が無視されます. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | 画像の回転角度を度単位で取得または設定します。 この値を設定すると、[`AutoSkew`](../baserecognitionsettings/autoskew/)自動スキュー補正が適用されないようにします. デフォルトではゼロです. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | 処理するスレッドの数を取得または設定します。 デフォルトでは、0 はイメージがプロセッサの数と等しい数のスレッドで処理されることを意味します。 ThreadsCount = 1 は、イメージがメイン スレッドで処理されることを意味します。 |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | 画像の 2 値化のカスタムしきい値を取得または設定します。 範囲は 1 ～ 255 です。 |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | 小さいフォントの認識専用の追加アルゴリズムを使用できます。 小さいサイズの文字を含む画像に役立ちます。 |

### 関連項目

* class [BaseRecognitionSettings](../baserecognitionsettings/)
* 名前空間 [Aspose.OCR](../../aspose.ocr/)
* 組み立て [Aspose.OCR](../../)


