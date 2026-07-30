---
title: "Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized 方法。"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized 方法。参数化解码方法。此方法在 C++ 中不支持 CFF Font 类型。"
type: docs
weight: 200
url: /zh/cpp/aspose.font.cff/cffencoding/decodetogidparameterized/
---
## CffEncoding::DecodeToGidParameterized method


参数化解码方法。此方法不支持 CFF [Font](../../../aspose.font/font/) 类型。

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | [IEncodingParameters](../../../aspose.font/iencodingparameters/) 接口的实现。 |
| charCode | uint32_t | 用于获取字形标识符的字符代码。 |

### ReturnValue

与传入的 charCode 相关的字形标识符。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
