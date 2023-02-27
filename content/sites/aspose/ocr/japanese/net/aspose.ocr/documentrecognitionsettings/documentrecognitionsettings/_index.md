---
title: DocumentRecognitionSettings.DocumentRecognitionSettings
second_title: Aspose.OCR for .NET API リファレンス
description: DocumentRecognitionSettings コンストラクタ. の新しいインスタンスを初期化しますDocumentRecognitionSettingsプロパティの短いセットを持つクラス.
type: docs
weight: 10
url: /ja/net/aspose.ocr/documentrecognitionsettings/documentrecognitionsettings/
---
## DocumentRecognitionSettings(int, int) {#constructor}

の新しいインスタンスを初期化します[`DocumentRecognitionSettings`](../)プロパティの短いセットを持つクラス.

```csharp
public DocumentRecognitionSettings(int startPage = 0, int pagesNumber = 1)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| startPage | Int32 | 認識の最初のページを設定します。デフォルトでは 0 です。 |
| pagesNumber | Int32 | 複数ページの PDF ファイルを認識するためのページ数を設定します。 |

### 関連項目

* class [DocumentRecognitionSettings](../)
* 名前空間 [Aspose.OCR](../../documentrecognitionsettings/)
* 組み立て [Aspose.OCR](../../../)

---

## DocumentRecognitionSettings(int, int, Language, bool, bool, int) {#constructor_1}

の新しいインスタンスを初期化します[`DocumentRecognitionSettings`](../)プロパティの完全なセットを持つクラス.

```csharp
public DocumentRecognitionSettings(int startPage, int pagesNumber, 
    Language language = Language.None, bool detectAreas = true, bool autoSkew = true, 
    int threshold = 0)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| startPage | Int32 | 認識の最初のページを設定します。デフォルトでは 0 です。 |
| pagesNumber | Int32 | 複数ページの PDF ファイルを認識するためのページ数を設定します。 |
| language | Language | OCR に使用される言語。 |
| detectAreas | Boolean | テキスト領域の自動検出を有効にします。 |
| autoSkew | Boolean | 自動画像歪み補正を有効にします。 |
| threshold | Int32 | カスタム イメージの二値化しきい値。 |

### 関連項目

* enum [Language](../../language/)
* class [DocumentRecognitionSettings](../)
* 名前空間 [Aspose.OCR](../../documentrecognitionsettings/)
* 組み立て [Aspose.OCR](../../../)


