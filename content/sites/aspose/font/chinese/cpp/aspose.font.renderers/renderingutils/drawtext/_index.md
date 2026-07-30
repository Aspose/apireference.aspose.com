---
title: "Aspose::Font::Renderers::RenderingUtils::DrawText 方法"
linktitle: "DrawText"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Renderers::RenderingUtils::DrawText 方法。在位图中渲染文本。返回以 PNG 格式的字节流结果，使用 C++。"
type: docs
weight: 100
url: /zh/cpp/aspose.font.renderers/renderingutils/drawtext/
---
## RenderingUtils::DrawText(System::SharedPtr\<Font\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, double) method


[Rendering](../../../aspose.font.rendering/) text in BitMap. Return result in PNG-format as stream of bytes.

```cpp
static System::SharedPtr<System::IO::Stream> Aspose::Font::Renderers::RenderingUtils::DrawText(System::SharedPtr<Font> font, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> glyphIds, double fontSize)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [字体](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | 文本表示为字形标识符数组 |
| fontSize | double | [字体](../../../aspose.font/font/) 大小 |

### ReturnValue

PNG 格式的图像，以字节流形式

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [RenderingUtils](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## RenderingUtils::DrawText(System::SharedPtr\<Font\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, double, RenderingUtils::LineSpacingType, int32_t, int32_t) method


[Rendering](../../../aspose.font.rendering/) text in BitMap. Return result in PNG-format as stream of bytes.

```cpp
static System::SharedPtr<System::IO::Stream> Aspose::Font::Renderers::RenderingUtils::DrawText(System::SharedPtr<Font> font, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> glyphIds, double fontSize, RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [字体](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | 文本表示为字形标识符数组 |
| fontSize | double | [字体](../../../aspose.font/font/) 大小 |
| lineSpacingType | RenderingUtils::LineSpacingType | 行间距的类型。像素数或字体高度的百分比 |
| lineSpacingValue | int32_t | 行间距的值 |
| maxWidth | int32_t | 图像的最大宽度（像素） |

### ReturnValue

PNG 格式的图像，以字节流形式

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Enum [LineSpacingType](../linespacingtype/)
* Class [RenderingUtils](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## RenderingUtils::DrawText(System::SharedPtr\<Font\>, System::String, double) method


[Rendering](../../../aspose.font.rendering/) text in BitMap. Return result in PNG-format as stream of bytes.

```cpp
static System::SharedPtr<System::IO::Stream> Aspose::Font::Renderers::RenderingUtils::DrawText(System::SharedPtr<Font> font, System::String text, double fontSize)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [字体](../../../aspose.font/font/) |
| 文本 | System::String | Text |
| fontSize | double | [字体](../../../aspose.font/font/) 大小 |

### ReturnValue

PNG 格式的图像，以字节流形式

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Font](../../../aspose.font/font/)
* Class [String](../../../system/string/)
* Class [RenderingUtils](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## RenderingUtils::DrawText(System::SharedPtr\<Font\>, System::String, double, RenderingUtils::LineSpacingType, int32_t, int32_t) method


[Rendering](../../../aspose.font.rendering/) text in BitMap. Return result in PNG-format as stream of bytes.

```cpp
static System::SharedPtr<System::IO::Stream> Aspose::Font::Renderers::RenderingUtils::DrawText(System::SharedPtr<Font> font, System::String text, double fontSize, RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [字体](../../../aspose.font/font/) |
| 文本 | System::String | Text |
| fontSize | double | [字体](../../../aspose.font/font/) 大小 |
| lineSpacingType | RenderingUtils::LineSpacingType | 行间距的类型。像素数或字体高度的百分比 |
| lineSpacingValue | int32_t | 行间距的值 |
| maxWidth | int32_t | 图像的最大宽度（像素） |

### ReturnValue

PNG 格式的图像，以字节流形式

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Font](../../../aspose.font/font/)
* Class [String](../../../system/string/)
* Enum [LineSpacingType](../linespacingtype/)
* Class [RenderingUtils](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
