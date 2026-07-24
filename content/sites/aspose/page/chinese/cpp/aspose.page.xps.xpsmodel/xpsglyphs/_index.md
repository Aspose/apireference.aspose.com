---
title: "Aspose::Page::XPS::XpsModel::XpsGlyphs 类"
linktitle: "XpsGlyphs"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsModel::XpsGlyphs 类。类封装了 Glyphs 元素的特性。该元素表示来自单一字体的统一格式文本序列。它提供了精确渲染所需的信息，并在 C++ 中支持查看器的搜索和选择功能。"
type: docs
weight: 1500
url: /zh/cpp/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class


封装 Glyphs 元素特性的类。此元素表示来自单一字体的统一格式文本序列。它提供准确渲染所需的信息，并支持查看器中的搜索和选择功能。

```cpp
class XpsGlyphs : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() | 克隆这些字形。 |
| [get_BidiLevel](./get_bidilevel/)() const | 返回/设置 指定 Unicode 算法双向嵌套级别的值。偶数值表示从左到右布局，奇数值表示从右到左布局。右到左布局将运行起点放在第一个字形的右侧，正的前进宽度（表示向左的前进）会将后续字形放置在前一个字形的左侧。 |
| [get_Fill](./get_fill/)() | 返回/设置 用于填充已渲染字形形状的画刷。 |
| [get_Font](./get_font/)() | 返回用于排版元素文本的 **TrueType** 字体资源。 |
| [get_FontRenderingEmSize](./get_fontrenderingemsize/)() const | 返回/设置 绘图表面单位中的字体大小，以有效坐标空间单位的浮点数表示。 |
| [get_Indices](./get_indices/)() |  |
| [get_IsSideways](./get_issideways/)() const | 返回/设置指示字形已侧转的值，原点定义为未侧转字形的顶部中心。 |
| [get_OriginX](./get_originx/)() const | 返回/设置运行中第一个字形的 X 坐标，单位为有效坐标空间。 |
| [get_OriginY](./get_originy/)() const | 返回/设置运行中第一个字形的 Y 坐标，单位为有效坐标空间。 |
| [get_StyleSimulations](./get_stylesimulations/)() const | 返回/设置指定样式仿真的值。 |
| [get_UnicodeString](./get_unicodestring/)() const | 返回/设置 Glyphs 元素渲染的文本字符串。该文本以 Unicode 代码点的形式指定。 |
| [set_BidiLevel](./set_bidilevel/)(int32_t) | 返回/设置 指定 Unicode 算法双向嵌套级别的值。偶数值表示从左到右布局，奇数值表示从右到左布局。右到左布局将运行起点放在第一个字形的右侧，正的前进宽度（表示向左的前进）会将后续字形放置在前一个字形的左侧。 |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | 返回/设置 用于填充已渲染字形形状的画刷。 |
| [set_FontRenderingEmSize](./set_fontrenderingemsize/)(float) | 返回/设置 绘图表面单位中的字体大小，以有效坐标空间单位的浮点数表示。 |
| [set_Indices](./set_indices/)(System::SharedPtr\<System::Collections::Generic::SortedList\<int32_t, System::SharedPtr\<XpsGlyphMapping\>\>\>) |  |
| [set_IsSideways](./set_issideways/)(bool) | 返回/设置指示字形已侧转的值，原点定义为未侧转字形的顶部中心。 |
| [set_OriginX](./set_originx/)(float) | 返回/设置运行中第一个字形的 X 坐标，单位为有效坐标空间。 |
| [set_OriginY](./set_originy/)(float) | 返回/设置运行中第一个字形的 Y 坐标，单位为有效坐标空间。 |
| [set_StyleSimulations](./set_stylesimulations/)(XpsStyleSimulations) | 返回/设置指定样式仿真的值。 |
| [set_UnicodeString](./set_unicodestring/)(System::String) | 返回/设置 Glyphs 元素渲染的文本字符串。该文本以 Unicode 代码点的形式指定。 |
## 另见

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
