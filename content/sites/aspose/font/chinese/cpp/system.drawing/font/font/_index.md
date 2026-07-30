---
title: "System::Drawing::Font::Font 构造函数"
linktitle: "Font"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Font::Font 构造函数。构造一个新的 Font 类实例，该实例表示具有指定字体样式的指定现有字体（在 C++ 中）。"
type: docs
weight: 100
url: /zh/cpp/system.drawing/font/font/
---
## Font::Font(const SharedPtr\<Font\>\&, FontStyle) constructor


构造一个新的 [Font](../) 类实例，该实例表示具有指定字体样式的指定现有字体。

```cpp
System::Drawing::Font::Font(const SharedPtr<Font> &prototype, FontStyle new_style)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 原型 | const SharedPtr\<Font\>\& | 用于创建新字体的现有字体 |
| new_style | FontStyle | 要应用于新字体的字体样式 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontStyle](../../fontstyle/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


构造一个新的 [Font](../) 类实例。

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| family | const SharedPtr\<FontFamily\>\& | 新字体的字体系列 |
| em_size | float | 新字体的 em 大小，单位由 **unit** 参数指定 |
| 样式 | FontStyle | 新字体的样式 |
| 单位 | GraphicsUnit | 新字体的测量单位 |
| gdi_charset | uint8_t | 用于新字体的 GDI 字符集 |
| gdi_vertical_font | bool | 如果新字体来源于 GDI 垂直字体，则为 True |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) constructor


构造一个新的 [Font](../) 类实例。

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| family | const SharedPtr\<FontFamily\>\& | 新字体的字体系列 |
| em_size | float | 新字体的 em 大小，单位由 **unit** 参数指定 |
| 单位 | GraphicsUnit | 新字体的测量单位 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Font(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


构造一个新的 [Font](../) 类实例。

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| family_name | const String\& | 新字体的字体族名称 |
| em_size | float | 新字体的 em 大小，单位由 **unit** 参数指定 |
| 样式 | FontStyle | 新字体的样式 |
| 单位 | GraphicsUnit | 新字体的测量单位 |
| gdi_charset | uint8_t | 用于新字体的 GDI 字符集 |
| gdi_vertical_font | bool | 如果新字体来源于 GDI 垂直字体，则为 True |

## 另见

* Class [String](../../../system/string/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Font(const String\&, float, GraphicsUnit) constructor


构造一个新的 [Font](../) 类实例。

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| family_name | const String\& | 新字体的字体族名称 |
| em_size | float | 新字体的 em 大小，单位由 **unit** 参数指定 |
| 单位 | GraphicsUnit | 新字体的测量单位 |

## 另见

* Class [String](../../../system/string/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
