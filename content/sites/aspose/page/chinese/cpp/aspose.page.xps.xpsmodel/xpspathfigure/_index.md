---
title: "Aspose::Page::XPS::XpsModel::XpsPathFigure 类"
linktitle: "XpsPathFigure"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathFigure 类. 封装 PathFigure 元素特性的类。此元素由一个或多个直线或曲线段组成（C++）。"
type: docs
weight: 3100
url: /zh/cpp/aspose.page.xps.xpsmodel/xpspathfigure/
---
## XpsPathFigure class


封装 PathFigure 元素特性的类。此元素由一个或多个线段或曲线段组成。

```cpp
class XpsPathFigure : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathSegment>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() | 克隆此路径图形。 |
| [get_IsClosed](./get_isclosed/)() const | 返回/设置指示路径图形是否闭合的值。 |
| [get_IsFilled](./get_isfilled/)() const | 返回/设置指示路径图形是否用于计算所包含路径几何体面积的值。 |
| [get_Segments](./get_segments/)() | 返回子路径段的列表。 |
| [get_StartPoint](./get_startpoint/)() const | 返回/设置路径图形的第一个段的起始点。 |
| [set_IsClosed](./set_isclosed/)(bool) | 返回/设置指示路径图形是否闭合的值。 |
| [set_IsFilled](./set_isfilled/)(bool) | 返回/设置指示路径图形是否用于计算所包含路径几何体面积的值。 |
| [set_StartPoint](./set_startpoint/)(System::Drawing::PointF) | 返回/设置路径图形的第一个段的起始点。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 将第 n 个模板参数设置为弱指针（而非共享指针）。允许在容器中将指针切换为弱模式。 |
## 另见

* Class [XpsArray](../xpsarray/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
