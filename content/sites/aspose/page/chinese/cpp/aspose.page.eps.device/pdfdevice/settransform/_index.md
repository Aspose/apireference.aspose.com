---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform 方法"
linktitle: "SetTransform"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform 方法。指定当前的变换。由于大多数输出格式不实现此功能，计算 currentTransform 的逆变换并与要设置的变换相乘。然后通过在 C++ 中调用 writeTransform(Transform) 将结果转发。"
type: docs
weight: 5800
url: /zh/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


指定当前变换。由于大多数输出格式不实现此功能，会计算 currentTransform 的逆变换并与要设置的变换相乘。然后通过调用 writeTransform(Transform) 将结果转发。

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 变换 | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | 要应用的变换。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
