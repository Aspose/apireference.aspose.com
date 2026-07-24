---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform method"
linktitle: "SetTransform"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform 메서드. 현재 변환을 지정합니다. 대부분의 출력 형식이 이 기능을 구현하지 않기 때문에, 현재 변환(currentTransform)의 역변환이 계산되고 설정하려는 변환과 곱해집니다. 결과는 C++에서 writeTransform(Transform) 호출을 통해 전달됩니다."
type: docs
weight: 5800
url: /ko/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


현재 변환을 지정합니다. 대부분의 출력 형식이 이 기능을 구현하지 않기 때문에, currentTransform의 역변환을 계산하고 설정될 변환과 곱합니다. 결과는 writeTransform(Transform) 호출을 통해 전달됩니다.

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| transform | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | 적용할 변환. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
