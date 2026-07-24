---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform метод"
linktitle: "SetTransform"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform метод. Задает текущую трансформацию. Поскольку большинство форматов вывода не реализуют эту функциональность, вычисляется обратная трансформация currentTransform и умножается на трансформацию, которую необходимо установить. Затем результат передаётся вызовом writeTransform(Transform) в C++."
type: docs
weight: 5800
url: /ru/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


Указывает текущую трансформацию. Поскольку большинство форматов вывода не реализуют эту функциональность, вычисляется обратная трансформация currentTransform и умножается на задаваемую трансформацию. Затем результат передаётся вызовом writeTransform(Transform).

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| трансформация | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Трансформация, которую следует применить. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
