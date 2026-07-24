---
title: "Aspose::Page::Font::DrFont 类"
linktitle: "DrFont"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::Font::DrFont 类。请在 C++ 中使用此类来代替 GDI+ Font。"
type: docs
weight: 100
url: /zh/cpp/aspose.page.font/drfont/
---
## DrFont class


请使用此类来代替 GDI+ [Font](../)。

```cpp
class DrFont : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 确定指定的 [System::Object](../../system/object/) 是否等于此实例。 |
| [get_AscentLis](./get_ascentlis/)() | 此字体的单元上升度（lis）。这是从单元顶部到单元基线的垂直距离。 |
| [get_AscentPoints](./get_ascentpoints/)() | 返回单元格上升值（以点为单位）。 |
| [get_CellHeightLis](./get_cellheightlis/)() | 返回此字体的单元格高度（lis）。这是 [AscentLis](../) + [DescentLis](../) 的快捷方式。 |
| [get_CellHeightPoints](./get_cellheightpoints/)() | [AscentPoints](../) + [DescentPoints](../) 的快捷方式。 |
| [get_DescentLis](./get_descentlis/)() | 此字体的单元格下降（lis）。这是从单元格底部到基线的垂直距离。 |
| [get_DescentPoints](./get_descentpoints/)() | 返回单元格下降值（以点为单位）。 |
| [get_FamilyName](./get_familyname/)() | 获取此字体的名称。 |
| [get_IsBold](./get_isbold/)() | 获取指示此实例是否为粗体的值。 |
| [get_IsItalic](./get_isitalic/)() | 获取指示此实例是否为斜体的值。 |
| [get_LeadingLis](./get_leadinglis/)() | 返回此字体的行距（lis）。这是 [LineSpacingLis](../) - [CellHeightLis](../) 的快捷方式。 |
| [get_LeadingPoints](./get_leadingpoints/)() | 返回此字体的行距（lis）。这是 [LineSpacingLis](../) - [CellHeightLis](../) 的快捷方式。 |
| [get_LineSpacingLis](./get_linespacinglis/)() | 返回此字体的单元格间距（lis）。这是两个字形基线之间的垂直距离。 |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | 返回此字体的单元格间距（点）。这是两个字形基线之间的垂直距离。 |
| [get_SizePoints](./get_sizepoints/)() | 获取此字体的大小（点）。 |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | 获取字体的大写字母。 |
| [get_Style](./get_style/)() | 获取 TrueType 字体。 |
| [get_StyleEx](./get_styleex/)() | 此属性包含有关字体样式的附加信息。 |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | 获取字符宽度 lis。 |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | 返回字符的宽度（点）。 |
| [GetHashCode](./gethashcode/)() const override | 返回此实例的哈希码。 |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | 返回文本的测量文本框（点）。 |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | 获取文本宽度 lis。 |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | 获取文本宽度（点）。 |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | 获取文本宽度（点）。 |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | 对 "Microsoft Sans Serif" 字体返回 True。此字体在 GDI+ 中渲染效果较差。参见 Test286 和 Gemini-6959。 |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | 替换字体内容。 |
| [set_SizePoints](./set_sizepoints/)(float) | 获取此字体的大小（点）。 |
| [set_StyleEx](./set_styleex/)(int16_t) | 此属性包含有关字体样式的附加信息。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
