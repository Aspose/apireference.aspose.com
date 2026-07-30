---
title: "IFontEncoding.DecodeToGidParameterized"
second_title: "Aspose.Font for .NET API 参考"
description: "IFontEncoding 方法。参数化解码方法。某些字体类型可能拥有多种编码算法/映射。因此使用 IEncodingParameters 接口来创建具体的字体编码参数"
type: docs
weight: 20
url: /zh/net/aspose.font/ifontencoding/decodetogidparameterized/
---
## IFontEncoding.DecodeToGidParameterized method

参数化解码方法。某些字体类型可能拥有多种编码算法/映射。因此，[`IEncodingParameters`](../../iencodingparameters/) 接口用于创建具体的字体编码参数。

```csharp
public GlyphId DecodeToGidParameterized(IEncodingParameters parameters, uint charCode)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| parameters | IEncodingParameters | [`IEncodingParameters`](../../iencodingparameters/) 接口的实现。 |
| charCode | UInt32 | 用于获取 glyph 标识符的字符代码。 |

### 返回值

与传入字符码相关的字形标识符。

### 另见

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IEncodingParameters](../../iencodingparameters/)
* interface [IFontEncoding](../)
* namespace [Aspose.Font](../../../aspose.font/)
* assembly [Aspose.Font](../../../)


