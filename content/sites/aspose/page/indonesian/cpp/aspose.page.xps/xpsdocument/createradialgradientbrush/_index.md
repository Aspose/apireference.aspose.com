---
title: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush metode"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush metode. Membuat kuas gradien radial baru dalam C++."
type: docs
weight: 2700
url: /id/cpp/aspose.page.xps/xpsdocument/createradialgradientbrush/
---
## XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


Membuat radial gradient brush baru.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| center | System::Drawing::PointF | Titik pusat gradien radial (yaitu, pusat elips). |
| gradientOrigin | System::Drawing::PointF | Titik asal gradien radial. |
| radiusX | float | Radius pada dimensi x elips yang menentukan gradien radial. |
| radiusY | float | Jari-jari pada dimensi y dari elips yang mendefinisikan gradien radial. |

### ReturnValue

Kuas gradien radial baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


Membuat radial gradient brush baru.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | Daftar titik henti gradien. |
| center | System::Drawing::PointF | Titik pusat gradien radial (yaitu, pusat elips). |
| gradientOrigin | System::Drawing::PointF | Titik asal gradien radial. |
| radiusX | float | Radius pada dimensi x elips yang menentukan gradien radial. |
| radiusY | float | Jari-jari pada dimensi y dari elips yang mendefinisikan gradien radial. |

### ReturnValue

Kuas gradien radial baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
