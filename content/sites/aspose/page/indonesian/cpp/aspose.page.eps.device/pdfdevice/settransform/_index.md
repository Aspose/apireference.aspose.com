---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform method"
linktitle: "SetTransform"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform method. Menentukan transformasi saat ini. Karena sebagian besar format keluaran tidak mengimplementasikan fungsionalitas ini, transformasi invers dari currentTransform dihitung dan dikalikan dengan transformasi yang akan diatur. Hasilnya kemudian diteruskan dengan panggilan ke writeTransform(Transform) dalam C++."
type: docs
weight: 5800
url: /id/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


Menentukan transformasi saat ini. Karena sebagian besar format output tidak mengimplementasikan fungsi ini, transformasi invers dari currentTransform dihitung dan dikalikan dengan transformasi yang akan diatur. Hasilnya kemudian diteruskan melalui pemanggilan writeTransform(Transform).

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| transform | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Transform yang akan diterapkan. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
