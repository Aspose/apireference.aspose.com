---
title: "Aspose::Page::EPS::PsDocument::DrawTransparentImage 메서드"
linktitle: "DrawTransparentImage"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::DrawTransparentImage 메서드. 변환된 투명 이미지를 그립니다. 이미지에 알파 채널이 없으면 C++에서 불투명 이미지로 그려집니다."
type: docs
weight: 2000
url: /ko/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


변환된 투명 이미지를 그립니다. 이미지에 알파 채널이 없으면 불투명 이미지로 그려집니다.

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 이미지 | System::SharedPtr\<System::Drawing::Bitmap\> | 그릴 이미지. |
| transform | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | 이미지를 변환할 행렬. |
| transparencyThreshold | int32_t | 투명도가 완전히 투명으로 해석되는 픽셀 값의 기준을 정의하는 임계값입니다. 이 임계값 이하의 모든 값은 완전히 불투명으로 해석됩니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
