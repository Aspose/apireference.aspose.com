---
title: "TtfEncoding.DecodeToGidParameterized"
second_title: "Aspose.Font for .NET API 参考"
description: "TtfEncoding 方法。参数化版本允许使用特定的 CMap 表而非 unicode。"
type: docs
weight: 20
url: /zh/net/aspose.font.ttf/ttfencoding/decodetogidparameterized/
---
## TtfEncoding.DecodeToGidParameterized method

参数化版本允许使用特定的 CMap 表（非 unicode）。

```csharp
public GlyphId DecodeToGidParameterized(IEncodingParameters parameters, uint charCode)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| parameters | IEncodingParameters | 实现了 [`IEncodingParameters`](../../../aspose.font/iencodingparameters/) 接口。 |
| charCode | UInt32 | 用于获取 glyph 标识符的字符代码。 |

### 返回值

传入的字符代码对应的 glyph 标识符。

### 另见

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* class [TtfEncoding](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)


