---
title: DataMatrixEncodeMode
second_title: Aspose.BarCode for.NETAPIリファレンス
description: DataMatrix エンコーダーのエンコード モードデフォルトは Auto
type: docs
weight: 880
url: /ja/net/aspose.barcode.generation/datamatrixencodemode/
---
## DataMatrixEncodeMode enumeration

DataMatrix エンコーダーのエンコード モード、デフォルトは Auto

```csharp
public enum DataMatrixEncodeMode
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| Auto | `0` | Datamatrix に最適なエンコード モードを自動的に選択します encoding |
| ASCII | `1` | 1 バイトあたり 1 文字の英数字または 2 文字の数字をエンコードします |
| Full | `6` | 8 ビット値をエンコード |
| Custom | `7` | BarcodeGenerator.Parameters.Barcode.DataMatrix.CodeTextEncoding で指定されたエンコーディングでエンコードします |
| C40 | `8` | C40 エンコーディングを使用します。大文字の英数字、小文字、および特殊文字をエンコード |
| Text | `9` | テキスト エンコーディングを使用します。小文字の英数字、大文字、特殊文字をエンコード |
| EDIFACT | `10` | EDIFACT エンコーディングを使用します。 1 文字あたり 6 ビットを使用し、数字、大文字、および多くの句読点をエンコードしますが、小文字はサポートしていません。 |
| ANSIX12 | `11` | ANSI X12 エンコードを使用します。 |
| ExtendedCodetext | `12` | ExtendedCodetext モードでは、codetext のエンコード方式を手動で切り替えることができます。 |

### 関連項目

* 名前空間 [Aspose.BarCode.Generation](../../aspose.barcode.generation/)
* 組み立て [Aspose.BarCode](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.BarCode.dll -->
