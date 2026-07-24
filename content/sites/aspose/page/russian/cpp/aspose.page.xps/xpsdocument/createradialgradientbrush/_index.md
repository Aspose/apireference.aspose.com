---
title: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush метод"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush метод. Создаёт новую радиальную градиентную кисть в C++."
type: docs
weight: 2700
url: /ru/cpp/aspose.page.xps/xpsdocument/createradialgradientbrush/
---
## XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


Создает новую радиальную градиентную кисть.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| центр | System::Drawing::PointF | Точка центра радиального градиента (то есть центр эллипса). |
| gradientOrigin | System::Drawing::PointF | Точка начала радиального градиента. |
| radiusX | float | Радиус по оси X эллипса, определяющего радиальный градиент. |
| radiusY | float | Радиус в y‑измерении эллипса, определяющего радиальный градиент. |

### ReturnValue

Новая кисть радиального градиента.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


Создает новую радиальную градиентную кисть.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | Список градиентных остановок. |
| центр | System::Drawing::PointF | Точка центра радиального градиента (то есть центр эллипса). |
| gradientOrigin | System::Drawing::PointF | Точка начала радиального градиента. |
| radiusX | float | Радиус по оси X эллипса, определяющего радиальный градиент. |
| radiusY | float | Радиус в y‑измерении эллипса, определяющего радиальный градиент. |

### ReturnValue

Новая кисть радиального градиента.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
