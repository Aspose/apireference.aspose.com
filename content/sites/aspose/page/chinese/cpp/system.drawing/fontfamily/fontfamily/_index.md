---
title: "System::Drawing::FontFamily::FontFamily 构造函数"
linktitle: "FontFamily"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::FontFamily::FontFamily 构造函数。构造一个新的 FontFamily 类实例，该实例表示具有指定名称的字体系列（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.drawing/fontfamily/fontfamily/
---
## FontFamily::FontFamily(const String\&) constructor


构造一个新的 [FontFamily](../) 类实例，该实例表示具有指定名称的字体系列。

```cpp
System::Drawing::FontFamily::FontFamily(const String &name)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | const String\& | 字体系列名称 |

## 另见

* Class [String](../../../system/string/)
* Class [FontFamily](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## FontFamily::FontFamily(const String\&, const SharedPtr\<Text::FontCollection\>\&) constructor


在指定的 FontCollection 中构造一个新的 [FontFamily](../) 实例，使用指定的名称。

```cpp
System::Drawing::FontFamily::FontFamily(const String &name, const SharedPtr<Text::FontCollection> &font_collection)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | const String\& | 字体系列名称 |
| font_collection | const SharedPtr\<Text::FontCollection\>\& | 包含此实例的 FontCollection。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontCollection](../../../system.drawing.text/fontcollection/)
* Class [FontFamily](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## FontFamily::FontFamily(Text::GenericFontFamilies) constructor


从指定的通用字体系列构造一个新的 [FontFamily](../) 实例。

```cpp
System::Drawing::FontFamily::FontFamily(Text::GenericFontFamilies generic_family)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| generic_family | Text::GenericFontFamilies | 用于构造 [FontFamily](../) 的 GenericFontFamilies 值。 |

## 另见

* Enum [GenericFontFamilies](../../../system.drawing.text/genericfontfamilies/)
* Class [FontFamily](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
