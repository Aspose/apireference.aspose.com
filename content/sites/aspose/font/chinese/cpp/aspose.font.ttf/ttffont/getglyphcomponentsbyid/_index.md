---
title: "Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById 方法"
linktitle: "GetGlyphComponentsById"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById 方法。获取通过传入的字形标识符的字形，并用该字形的组件填充传入的字形标识符列表。字形 id 是字形的唯一编号，取决于字体类型。TTF Font 字形 id 可以是 (GlyphStringId) 类或 (GlyphUInt32Id) 类的实例。支持通过名称 (string) 对字形进行寻址，适用于通过 Post 表映射的 TTF 字体。若为 CFF Font，则使用 CFF 结构通过名称寻址字形，适用于 C++。"
type: docs
weight: 1900
url: /zh/cpp/aspose.font.ttf/ttffont/getglyphcomponentsbyid/
---
## TtfFont::GetGlyphComponentsById(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) method


获取通过传入的字形标识符的字形，并用该字形的组件填充传入的字形标识符列表。字形 id 是字形的唯一编号，取决于字体类型。TTF [Font](../../../aspose.font/font/) 字形 id 可以是 ([GlyphStringId](../)) 类或 ([GlyphUInt32Id](../)) 类的实例。支持通过名称 (string) 对字形进行寻址，适用于通过 Post 表映射的 TTF 字体。若为 CFF [Font](../../../aspose.font/font/)，则使用 CFF 结构通过名称寻址字形。

```cpp
virtual void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::SharedPtr<Glyphs::GlyphId> id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 标识符 | System::SharedPtr\<Glyphs::GlyphId\> | 字形 id。 |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | 要填充的字形标识符列表。 |
## 备注


应传入空的集合 componentsToPopulate，用于包含字形组件 id 列表。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) method


通过传入的字形名称获取字形，并将该字形的组成部分填充到传入的字形标识列表中。

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::String glyphName, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphName | System::String | 字形名称。 |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | 要填充的字形标识符列表。 |
## 备注


应传入空的集合 componentsToPopulate，用于包含字形组件 id 列表。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) method


通过传入的字形索引获取字形，并将该字形的组成部分填充到传入的字形标识列表中。

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(uint32_t id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 标识符 | uint32_t | 字形索引。 |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | 要填充的字形标识符列表。 |
## 备注


应传入空的集合 componentsToPopulate，用于包含字形组件 id 列表。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
