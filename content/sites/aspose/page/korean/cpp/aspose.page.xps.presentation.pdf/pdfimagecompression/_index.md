---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression 열거형"
linktitle: "PdfImageCompression"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression 열거형. C++에서 PDF 파일의 이미지에 적용되는 압축 유형을 지정합니다."
type: docs
weight: 700
url: /ko/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


PDF 파일의 이미지에 적용되는 압축 유형을 지정합니다.

```cpp
enum class PdfImageCompression
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| 자동 | 0 | 각 이미지에 가장 적합한 압축을 자동으로 선택합니다. |
| None | 1 | 원시 이미지 바이트를 저장하여 PDF 파일 크기가 커집니다. |
| Rle | 2 | Run Length 압축. |
| Flate | 3 | Flate 압축. |
| LzwBaselinePredictor | 4 | 예측기 선택이 PNG Paeth 예측기로 제한되어 프로세스가 빨라집니다. 실제로 놀라울 정도로 좋은 성능을 보이며, [LzwOptimizedPredictor](./)보다 우수합니다. |
| LzwOptimizedPredictor | 5 | 예측기 선택은 더 복잡하며 이미지 크기를 더 작게 만들지만 시간이 더 많이 걸립니다. |
| Jpeg | 6 | JPEG 압축. 투명을 지원하지 않습니다. |

## 또 보기

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
