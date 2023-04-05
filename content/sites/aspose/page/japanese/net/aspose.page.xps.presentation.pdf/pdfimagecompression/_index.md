---
title: Enum PdfImageCompression
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.Presentation.Pdf.PdfImageCompression 列挙. PDF ファイル内の画像に適用される圧縮のタイプを指定します
type: docs
weight: 430
url: /ja/net/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enumeration

PDF ファイル内の画像に適用される圧縮のタイプを指定します。

```csharp
public enum PdfImageCompression
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| Auto | `0` | 各画像に最適な圧縮を自動的に選択します。 |
| None | `1` | 生の画像バイトを保存すると、PDF ファイルのサイズが大きくなります。 |
| Rle | `2` | ランレングス圧縮. |
| Flate | `3` | フラット圧縮. |
| LzwBaselinePredictor | `4` | 予測子の選択は、プロセスを高速化するために PNG Paeth 予測子に制限されています。実際には、 は驚くほど良いパフォーマンスを発揮します。より良いLzwOptimizedPredictor. |
| LzwOptimizedPredictor | `5` | 予測子の選択はより複雑で、画像サイズが小さくなるはずですが 時間がかかります. |
| Jpeg | `6` | JPEG 圧縮. 透過性をサポートしていません. |

### 関連項目

* 名前空間 [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* 組み立て [Aspose.Page](../../)


