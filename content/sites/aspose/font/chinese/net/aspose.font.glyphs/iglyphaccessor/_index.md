---
title: "接口 IGlyphAccessor"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Glyphs.IGlyphAccessor 接口。定义检索指定字形标识符和字形的功能"
type: docs
weight: 460
url: /zh/net/aspose.font.glyphs/iglyphaccessor/
---
## IGlyphAccessor interface

定义检索指定字形标识符和字形的功能。

```csharp
public interface IGlyphAccessor
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [GlyphIdType](../../aspose.font.glyphs/iglyphaccessor/glyphidtype/) { get; } | 字形 ID 类型规范。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [GetAllGlyphIds](../../aspose.font.glyphs/iglyphaccessor/getallglyphids/)() | 返回字体中可用的所有字形 ID。字形 ID 是字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，是 ([`GlyphStringId`](../glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，是 ([`GlyphUInt32Id`](../glyphuint32id/)) 类的实例。 |
| [GetGlyphById](../../aspose.font.glyphs/iglyphaccessor/getglyphbyid/)(GlyphId) | 根据字形 ID 返回字形。字形 ID 是字形的唯一编号，取决于字体类型。GlyphId - 派生对象。例如：Type1 的 ID 是字形名称，是 ([`GlyphStringId`](../glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，是 ([`GlyphUInt32Id`](../glyphuint32id/)) 类的实例。 |
| [GetGlyphsForText](../../aspose.font.glyphs/iglyphaccessor/getglyphsfortext/)(string) | 获取文本的字形表示。 |

### 另见

* namespace [Aspose.Font.Glyphs](../../aspose.font.glyphs/)
* assembly [Aspose.Font](../../)


