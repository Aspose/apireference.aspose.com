---
title: "System::Drawing::Graphics::DrawString 方法"
linktitle: "DrawString"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::Graphics::DrawString 方法。 在 C++ 中使用指定的字体和画刷，在指定的位置绘制指定的字符串。"
type: docs
weight: 2800
url: /zh/cpp/system.drawing/graphics/drawstring/
---
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


在指定位置使用指定的字体和画刷绘制指定的字符串。

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, float x, float y, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| str | const String\& | 要绘制的字符串 |
| 字体 | const SharedPtr\<Font\>\& | 要使用的字体 |
| brush | const SharedPtr\<Brush\>\& | 用于绘图的 [Brush](../../brush/) 对象 |
| x | 单精度浮点数 | 已绘制字符串左上角位置的 X 坐标 |
| y | 单精度浮点数 | 已绘制字符串左上角位置的 Y 坐标 |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | 指定字符串的格式 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


在指定位置使用指定的字体和画刷绘制指定的字符串。

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, PointF topLeft, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| str | const String\& | 要绘制的字符串 |
| 字体 | const SharedPtr\<Font\>\& | 要使用的字体 |
| brush | const SharedPtr\<Brush\>\& | 用于绘图的 [Brush](../../brush/) 对象 |
| topLeft | PointF | 指定已绘制字符串左上角的位置 |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | 指定字符串的格式 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


使用指定的字体和画笔在指定的矩形中绘制指定的字符串。

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, RectangleF layoutRectangle, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| str | const String\& | 要绘制的字符串 |
| 字体 | const SharedPtr\<Font\>\& | 要使用的字体 |
| brush | const SharedPtr\<Brush\>\& | 用于绘图的 [Brush](../../brush/) 对象 |
| layoutRectangle | RectangleF | 指定用于绘制字符串的矩形 |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | 指定字符串的格式 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
