---
title: "System::Drawing::Font 类"
linktitle: "Font"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Font 类。表示文本的特定格式，包括字体、大小和样式。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 700
url: /zh/cpp/system.drawing/font/
---
## Font class


表示文本的特定格式，包括字体、大小和样式。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Font : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() | 返回当前字体的副本。 |
| [Dispose](./dispose/)() | 释放当前对象获取的所有操作系统资源。 |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 确定当前对象和指定对象是否相同。 |
| [Font](./font/)(const SharedPtr\<Font\>\&, FontStyle) | 构造一个新的 [Font](./) 类实例，该实例表示具有指定字体样式的指定现有字体。 |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | 构造一个新的 [Font](./) 类实例。 |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) | 构造一个新的 [Font](./) 类实例。 |
| [Font](./font/)(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | 构造一个新的 [Font](./) 类实例。 |
| [Font](./font/)(const String\&, float, GraphicsUnit) | 构造一个新的 [Font](./) 类实例。 |
| static [FromLogFont](./fromlogfont/)(const SharedPtr\<Object\>\&) | 未实现。 |
| [get_Bold](./get_bold/)() | 确定当前对象表示的字体是否已应用粗体样式。 |
| [get_FontFamily](./get_fontfamily/)() | 返回当前对象表示的字体的字体族。 |
| [get_FontStyle](./get_fontstyle/)() | 返回当前对象表示的字体的字体样式。 |
| [get_GdiCharSet](./get_gdicharset/)() | 返回一个值，指示当前对象表示的字体使用的 GDI 字符集。 |
| [get_Height](./get_height/)() | 返回当前对象表示的字体的行间距（像素）。 |
| [get_Italic](./get_italic/)() | 确定当前对象表示的字体是否已应用斜体样式。 |
| [get_Name](./get_name/)() | 返回当前对象表示的字体的字体名称。 |
| [get_OriginalFontName](./get_originalfontname/)() | 返回字体最初指定的名称。 |
| [get_Size](./get_size/)() | 返回当前对象表示的字体的 em 大小，单位为 Unit 属性指定的单位。 |
| [get_SizeInPoints](./get_sizeinpoints/)() | 返回当前对象表示的字体的 em 大小（以点为单位）。 |
| [get_Strikeout](./get_strikeout/)() | 确定当前对象表示的字体是否已应用删除线样式。 |
| [get_Style](./get_style/)() | 返回当前对象表示的字体的字体样式。 |
| [get_Underline](./get_underline/)() | 确定当前对象表示的字体是否已应用下划线样式。 |
| [get_Unit](./get_unit/)() | 返回当前对象表示的字体的测量单位。 |
| [GetHeight](./getheight/)(const SharedPtr\<Graphics\>\&) | 返回当前对象表示的字体的行间距，使用指定的 [Graphics](../graphics/) 对象的当前单位。 |
| [GetHeight](./getheight/)(float) | 返回在具有指定垂直分辨率的显示设备上绘制时，当前对象表示的字体的高度。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
