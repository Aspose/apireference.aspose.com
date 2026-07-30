---
title: "System::Drawing::Graphics::MeasureString 方法"
linktitle: "MeasureString"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Graphics::MeasureString 方法。返回在 C++ 中使用指定字体和指定格式绘制的指定字符串的尺寸。"
type: docs
weight: 6500
url: /zh/cpp/system.drawing/graphics/measurestring/
---
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const method


返回在指定字体和指定格式下绘制的指定字符串的大小。

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, int width, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | String const\& | 要计算其尺寸的字符串 |
| 字体 | System::SharedPtr\<Font\> const\& | 用于绘制字符串的字体 |
| width | int | 字符串的最大宽度 |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | 指定字符串格式 |

### ReturnValue

一个 [SizeF](../../sizef/) 对象，表示当前 Grapphics 对象的 PageUnit 属性指定的测量单位下字符串的尺寸。

## 另见

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const method


返回在指定字体和指定格式下绘制的指定字符串的大小。

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, PointF const &origin=PointF(0, 0), System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | String const\& | 要计算其尺寸的字符串 |
| 字体 | System::SharedPtr\<Font\> const\& | 用于绘制字符串的字体 |
| origin | PointF const\& | 指定字符串左上角的位置 |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | 指定字符串格式 |

### ReturnValue

一个 [SizeF](../../sizef/) 对象，表示当前 Grapphics 对象的 PageUnit 属性指定的测量单位下字符串的尺寸。

## 另见

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const method


未实现。

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat, int &charactersFitted, int &linesFilled) const
```


## 另见

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const method


返回在指定字体和指定格式下绘制的指定字符串的大小。

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | String const\& | 要计算其尺寸的字符串 |
| 字体 | System::SharedPtr\<Font\> const\& | 用于绘制字符串的字体 |
| layoutArea | SizeF const\& | 字符串的最大布局区域 |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | 指定字符串格式 |

### ReturnValue

一个 [SizeF](../../sizef/) 对象，表示当前 Grapphics 对象的 PageUnit 属性指定的测量单位下字符串的尺寸。

## 另见

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
