---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression 列挙体"
linktitle: "PdfImageCompression"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression 列挙体。C++ で PDF ファイル内の画像に適用される圧縮タイプを指定します。"
type: docs
weight: 700
url: /ja/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


PDF ファイル内の画像に適用される圧縮タイプを指定します。

```cpp
enum class PdfImageCompression
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| 自動 | 0 | 各画像に最適な圧縮を自動的に選択します。 |
| None | 1 | 生の画像バイトを保存するため、PDF ファイルサイズが大きくなります。 |
| Rle | 2 | ランレングス圧縮。 |
| Flate | 3 | Flate 圧縮。 |
| LzwBaselinePredictor | 4 | 予測子の選択は PNG の Paeth 予測子に限定され、処理を高速化します。実際のところ、驚くほど良好に動作し、[LzwOptimizedPredictor](./) よりも優れています。 |
| LzwOptimizedPredictor | 5 | 予測子の選択はより複雑で、画像サイズは小さくなるはずですが、時間がかかります。 |
| Jpeg | 6 | JPEG 圧縮です。透過はサポートされていません。 |

## 参照

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
