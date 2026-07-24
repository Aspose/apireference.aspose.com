---
title: "Aspose::Page::EPS::PsDocument::FillAndStrokeText 方法"
linktitle: "FillAndStrokeText"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument::FillAndStrokeText 方法。通过填充字形内部并在 C++ 中绘制字形轮廓来添加文本字符串。"
type: docs
weight: 2500
url: /zh/cpp/aspose.page.eps/psdocument/fillandstroketext/
---
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


通过填充字形内部并绘制字形轮廓来添加文本字符串。

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| text | System::String | 要添加的文本。 |
| 前进 | System::ArrayPtr\<float\> | 字形宽度的数组。其长度必须与字符串中的字形数量相匹配。 |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) 将用于绘制文本。它可以与位于自定义文件夹中的自定义字体一起使用。 |
| x | 单精度浮点数 | 文本起点的 X 坐标。 |
| y | 单精度浮点数 | 文本起点的 Y 坐标。 |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | 用于绘制字形内部的填充。 |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | 用于绘制字形轮廓的描边。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


通过填充字形内部并绘制字形轮廓来添加文本字符串。

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| text | System::String | 要添加的文本。 |
| 前进 | System::ArrayPtr\<float\> | 字形宽度的数组。其长度必须与字符串中的字形数量相匹配。 |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) 将用于绘制文本的字体。 |
| x | 单精度浮点数 | 文本起点的 X 坐标。 |
| y | 单精度浮点数 | 文本起点的 Y 坐标。 |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | 用于绘制字形内部的填充。 |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | 用于绘制字形轮廓的描边。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


通过填充字形内部并绘制字形轮廓来添加文本字符串。

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| text | System::String | 要添加的文本。 |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) 将用于绘制文本。它可以与位于自定义文件夹中的自定义字体一起使用。 |
| x | 单精度浮点数 | 文本起点的 X 坐标。 |
| y | 单精度浮点数 | 文本起点的 Y 坐标。 |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | 用于绘制字形内部的填充。 |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | 用于绘制字形轮廓的描边。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


通过填充字形内部并绘制字形轮廓来添加文本字符串。

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| text | System::String | 要添加的文本。 |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) 将用于绘制文本的字体。 |
| x | 单精度浮点数 | 文本起点的 X 坐标。 |
| y | 单精度浮点数 | 文本起点的 Y 坐标。 |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | 用于绘制字形内部的填充。 |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | 用于绘制字形轮廓的描边。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
