---
title: "Aspose::Font::IFontSubset 类"
linktitle: "IFontSubset"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::IFontSubset 类。表示 C++ 中的字体子集接口。"
type: docs
weight: 2000
url: /zh/cpp/aspose.font/ifontsubset/
---
## IFontSubset class


表示字体子集接口。

```cpp
class IFontSubset : public virtual Aspose::Font::IFont
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_OriginalFont](./get_originalfont/)() | 获取 [Font](../font/) 子集的原始字体。 |
| virtual [get_SubsetName](./get_subsetname/)() | 子集的名称。如果设置，则替代原始字体的名称；否则，将使用原始字体的名称作为子集名称。 |
| virtual [get_UsedGlyphs](./get_usedglyphs/)() | 获取使用的字形 ID 列表。 |
| virtual [set_SubsetName](./set_subsetname/)(System::String) | 子集的名称。如果设置，则替代原始字体的名称；否则，将使用原始字体的名称作为子集名称。 |
## 另见

* Class [IFont](../ifont/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
