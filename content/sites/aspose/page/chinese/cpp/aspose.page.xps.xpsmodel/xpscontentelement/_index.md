---
title: "Aspose::Page::XPS::XpsModel::XpsContentElement 类"
linktitle: "XpsContentElement"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsModel::XpsContentElement 类。封装 XPS 内容元素（Canvas、Path 和 Glyphs）的特性，适用于 C++。"
type: docs
weight: 700
url: /zh/cpp/aspose.page.xps.xpsmodel/xpscontentelement/
---
## XpsContentElement class


封装 [XPS](../../aspose.page.xps/) 内容元素的特性：Canvas、Path 和 Glyphs。

```cpp
class XpsContentElement : public Aspose::Page::XPS::XpsModel::XpsHyperlinkElement
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Clip](./get_clip/)() | 返回/设置限制元素渲染区域的路径几何实例。 |
| [get_Opacity](./get_opacity/)() const | 返回/设置定义元素统一透明度的值。 |
| [get_OpacityMask](./get_opacitymask/)() | 返回/设置画刷，该画刷指定一个 alpha 值掩码，以与 Opacity 属性相同的方式应用于元素，但允许元素不同区域使用不同的 alpha 值。 |
| [get_RenderTransform](./get_rendertransform/)() | 返回/设置仿射变换矩阵，为元素的所有属性以及所有子元素（如果有）建立新的坐标系。 |
| [set_Clip](./set_clip/)(System::SharedPtr\<XpsPathGeometry\>) | 返回/设置限制元素渲染区域的路径几何实例。 |
| [set_Opacity](./set_opacity/)(float) | 返回/设置定义元素统一透明度的值。 |
| [set_OpacityMask](./set_opacitymask/)(System::SharedPtr\<XpsBrush\>) | 返回/设置画刷，该画刷指定一个 alpha 值掩码，以与 Opacity 属性相同的方式应用于元素，但允许元素不同区域使用不同的 alpha 值。 |
| [set_RenderTransform](./set_rendertransform/)(System::SharedPtr\<XpsMatrix\>) | 返回/设置仿射变换矩阵，为元素的所有属性以及所有子元素（如果有）建立新的坐标系。 |
## 另见

* Class [XpsHyperlinkElement](../xpshyperlinkelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
