---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform メソッド"
linktitle: "SetTransform"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform メソッド。現在の変換を指定します。ほとんどの出力フォーマットはこの機能を実装していないため、currentTransform の逆変換が計算され、設定する変換と掛け合わされます。その結果は C++ の writeTransform(Transform) 呼び出しに転送されます。"
type: docs
weight: 5800
url: /ja/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


現在の変換を指定します。ほとんどの出力フォーマットがこの機能を実装していないため、currentTransform の逆変換を計算し、設定する変換と掛け合わせます。その結果は writeTransform(Transform) の呼び出しで転送されます。

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| transform | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | 適用する変換。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
