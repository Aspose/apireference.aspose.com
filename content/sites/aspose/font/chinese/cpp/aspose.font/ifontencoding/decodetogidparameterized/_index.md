---
title: "Aspose::Font::IFontEncoding::DecodeToGidParameterized 方法"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::IFontEncoding::DecodeToGidParameterized 方法。C++ 中的参数化解码方法。"
type: docs
weight: 200
url: /zh/cpp/aspose.font/ifontencoding/decodetogidparameterized/
---
## IFontEncoding::DecodeToGidParameterized method


参数化解码方法。

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | 实现 [IEncodingParameters](../../iencodingparameters/) 接口。 |
| charCode | uint32_t | 用于获取字形标识符的字符代码。 |

### ReturnValue

与传入字符码相关的字形标识符。
## 备注


某些字体类型可能拥有多种编码算法/映射。因此，使用 [IEncodingParameters](../../iencodingparameters/) 接口来创建具体的字体编码参数。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../iencodingparameters/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
