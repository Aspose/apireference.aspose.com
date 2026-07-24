---
title: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush 메서드"
linktitle: "CreateRadialGradientBrush"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush 메서드. C++에서 새로운 방사형 그라디언트 브러시를 생성합니다."
type: docs
weight: 2700
url: /ko/cpp/aspose.page.xps/xpsdocument/createradialgradientbrush/
---
## XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


새로운 방사형 그라디언트 브러시를 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| center | System::Drawing::PointF | 방사형 그라디언트의 중심점(즉, 타원의 중심). |
| gradientOrigin | System::Drawing::PointF | 방사형 그라디언트의 원점. |
| radiusX | float | 방사형 그라디언트를 정의하는 타원의 x 차원 반지름. |
| radiusY | float | 방사형 그라디언트를 정의하는 타원의 y 차원 반경. |

### ReturnValue

새 방사형 그라디언트 브러시.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


새로운 방사형 그라디언트 브러시를 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | 그라디언트 스톱 목록. |
| center | System::Drawing::PointF | 방사형 그라디언트의 중심점(즉, 타원의 중심). |
| gradientOrigin | System::Drawing::PointF | 방사형 그라디언트의 원점. |
| radiusX | float | 방사형 그라디언트를 정의하는 타원의 x 차원 반지름. |
| radiusY | float | 방사형 그라디언트를 정의하는 타원의 y 차원 반경. |

### ReturnValue

새 방사형 그라디언트 브러시.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
