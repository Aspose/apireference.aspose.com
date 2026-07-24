---
title: "Aspose::Page::XPS::XpsModel::XpsPathGeometry 类"
linktitle: "XpsPathGeometry"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathGeometry 类。封装 PathGeometry 属性元素特性的类。此元素在 C++ 中包含一组路径图形，可通过 Figures 属性或子 PathFigure 元素指定。"
type: docs
weight: 3200
url: /zh/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


封装 PathGeometry 属性元素特性的类。此元素包含一组路径图形，可通过 Figures 属性或子 PathFigure 元素指定。

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | 向最后一个路径图形的子段列表添加路径段。 |
| [Clone](./clone/)() | 克隆此路径几何体。 |
| [get_FillRule](./get_fillrule/)() const | 返回/设置指定几何形状相交区域如何组合形成区域的值。 |
| [get_PathFigures](./get_pathfigures/)() | 返回子路径图形的列表。 |
| [get_Transform](./get_transform/)() override | 返回/设置仿射变换矩阵，该矩阵建立对路径几何体的所有子元素和后代元素在用于填充、裁剪或描边之前的局部矩阵变换。 |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | 在 *index* 位置将路径段插入最后一个路径图形的子段列表中。 |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | 从最后一个路径图形的子段列表中移除路径段。 |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | 在 *index* 位置从最后一个路径图形的子段列表中移除路径段。 |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | 返回/设置指定几何形状相交区域如何组合形成区域的值。 |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | 返回/设置仿射变换矩阵，该矩阵建立对路径几何体的所有子元素和后代元素在用于填充、裁剪或描边之前的局部矩阵变换。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 将第 n 个模板参数设置为弱指针（而非共享指针）。允许在容器中将指针切换为弱模式。 |
## 另见

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
