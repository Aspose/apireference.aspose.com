---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas class"
linktitle: "XpsCanvas"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas class. 类封装了 Canvas 元素特性。此元素将元素组合在一起。例如，Glyphs 和 Path 元素可以在 canvas 中分组，以便被识别为一个单元（作为超链接目标），或对每个子元素和祖先元素应用组合属性值，使用 C++。"
type: docs
weight: 500
url: /zh/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


封装 Canvas 元素特性的类。此元素将元素组合在一起。例如，Glyphs 和 Path 元素可以在画布中分组，以便被识别为一个单元（作为超链接目标），或对每个子元素和祖先元素应用组合属性值。

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(T) | 向此 canvas 的子列表添加一个元素。 |
| [AddCanvas](./addcanvas/)() | 向此 canvas 的子列表添加一个新 canvas。 |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | 向此 canvas 的子列表添加新的 glyphs。 |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | 向此 canvas 的子列表添加一个新 path。 |
| [Clone](./clone/)() | 克隆此 canvas。 |
| [get_EdgeMode](./get_edgemode/)() const | 返回/设置控制 canvas 中路径边缘渲染方式的值。 |
| [Insert](./insert/)(int32_t, T) | 在 *index*  position 向此 canvas 的子列表插入一个元素。 |
| [InsertCanvas](./insertcanvas/)(int32_t) | 在 *index*  position 向此 canvas 的子列表插入一个新 canvas。 |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | 在 *index*  position 向此 canvas 的子列表插入新的 glyphs。 |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | 在 *index*  position 向此 canvas 的子列表插入一个新 path。 |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | 返回/设置控制 canvas 中路径边缘渲染方式的值。 |
## 另见

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
