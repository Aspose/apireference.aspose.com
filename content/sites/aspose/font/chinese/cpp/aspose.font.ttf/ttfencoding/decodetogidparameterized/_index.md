---
title: "Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized 方法"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized 方法。参数化版本允许在 C++ 中使用特定的 CMap 表（非 Unicode）。"
type: docs
weight: 200
url: /zh/cpp/aspose.font.ttf/ttfencoding/decodetogidparameterized/
---
## TtfEncoding::DecodeToGidParameterized method


参数化版本允许使用特定的 CMap 表（而非 Unicode）。

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | [IEncodingParameters](../../../aspose.font/iencodingparameters/) 接口的实现。 |
| charCode | uint32_t | 用于获取字形标识符的字符代码。 |

### ReturnValue

与传入的字符代码相关的字形标识符。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
