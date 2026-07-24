---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enum"
linktitle: "PdfImageCompression"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enum. C++'ta PDF dosyasındaki görüntülere uygulanan sıkıştırma türünü belirtir."
type: docs
weight: 700
url: /tr/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


PDF dosyasındaki görüntülere uygulanan sıkıştırma türünü belirtir.

```cpp
enum class PdfImageCompression
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Otomatik | 0 | Her görüntü için en uygun sıkıştırmayı otomatik olarak seçer. |
| None | 1 | Ham görüntü baytlarını kaydeder, bu da daha büyük PDF dosya boyutlarına yol açar. |
| Rle | 2 | Run Length sıkıştırması. |
| Flate | 3 | Flate sıkıştırması. |
| LzwBaselinePredictor | 4 | Tahminci seçimi, işlemi hızlandırmak için PNG Paeth tahmincisine sınırlıdır. Pratikte şaşırtıcı derecede iyi performans gösterir. [LzwOptimizedPredictor](./) öğesinden daha iyidir. |
| LzwOptimizedPredictor | 5 | Tahminci seçimi daha karmaşıktır ve daha küçük görüntü boyutlarıyla sonuçlanmalı, ancak daha fazla zaman alır. |
| Jpeg | 6 | JPEG sıkıştırması. Şeffaflığı desteklemez. |

## Ayrıca Bakınız

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
