---
title: Class InvoiceRecognitionSettings
second_title: Aspose.OCR for .NET API リファレンス
description: Aspose.OCR.InvoiceRecognitionSettings クラス. 請求書認識の設定 認識プロセスをカスタマイズできる要素が含まれています
type: docs
weight: 100
url: /ja/net/aspose.ocr/invoicerecognitionsettings/
---
## InvoiceRecognitionSettings class

請求書認識の設定。 認識プロセスをカスタマイズできる要素が含まれています。

```csharp
public class InvoiceRecognitionSettings : ReceiptRecognitionSettings
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [InvoiceRecognitionSettings](invoicerecognitionsettings/)(Language) | の新しいインスタンスを初期化します`InvoiceRecognitionSettings`プロパティの完全なセットを持つクラス. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/receiptrecognitionsettings/allowedcharacters/) { get; set; } | 許可された文字セット。認識結果に許可される文字の種類を決定します。 |
| [AutoSkew](../../aspose.ocr/receiptrecognitionsettings/autoskew/) { set; } | 自動イメージ スキュー補正を有効にするかどうかを示すフラグを取得または設定します。 デフォルトで有効 (true)。 |
| [IgnoredCharacters](../../aspose.ocr/receiptrecognitionsettings/ignoredcharacters/) { get; set; } | 認識シンボルのブラックリストを設定します。 |
| [Language](../../aspose.ocr/receiptrecognitionsettings/language/) { set; } | OCR に使用される言語を取得または設定します。  認識中に使用されるアルファベットを決定します。 デフォルトで多言語。 |
| [PreprocessingFilters](../../aspose.ocr/receiptrecognitionsettings/preprocessingfilters/) { get; set; } | 前処理方法を調整して、OCR 用の画像を準備できます。 |
| [ThreadsCount](../../aspose.ocr/receiptrecognitionsettings/threadscount/) { set; } | 処理するスレッドの数を取得または設定します。 デフォルトでは、0 はイメージがプロセッサの数と等しい数のスレッドで処理されることを意味します。 ThreadsCount = 1 は、イメージがメイン スレッドで処理されることを意味します。 |

### 関連項目

* class [ReceiptRecognitionSettings](../receiptrecognitionsettings/)
* 名前空間 [Aspose.OCR](../../aspose.ocr/)
* 組み立て [Aspose.OCR](../../)


