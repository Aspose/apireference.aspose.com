---
title: "类 GlyphId"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Glyphs.GlyphId 类。表示字体中可用的字形 ID。字形 ID 是针对字形的唯一编号，取决于字体类型。例如，Type1 的 ID 是 GlyphStringId 类的字形名称实例。TTF 的 ID 是 GlyphUInt32Id 类的整数索引实例。"
type: docs
weight: 400
url: /zh/net/aspose.font.glyphs/glyphid/
---
## GlyphId class

表示字体中可用的字形 ID。字形 ID 是针对字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，([`GlyphStringId`](../glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，([`GlyphUInt32Id`](../glyphuint32id/)) 类的实例。

```csharp
public abstract class GlyphId
```

## 方法

| 名称 | 描述 |
| --- | --- |
| override [Equals](../../aspose.font.glyphs/glyphid/equals/)(object) | 如果两个字形 ID 不相等则返回 true。 |
| abstract [GetHashCode](../../aspose.font.glyphs/glyphid/gethashcode/)() | 返回对象的哈希码。 |
| virtual [ToGlyphStringId](../../aspose.font.glyphs/glyphid/toglyphstringid/)() | 虚拟强制转换为 GlyphUInt32Id。GlyphUInt32Id 重写以返回实例。 |
| virtual [ToGlyphUInt32Id](../../aspose.font.glyphs/glyphid/toglyphuint32id/)() | 虚拟强制转换为 GlyphUInt32Id。GlyphUInt32Id 重写以返回实例。 |
| abstract [ToString](../../aspose.font.glyphs/glyphid/tostring/)() | 返回字形 ID 的字符串表示。 |
| [operator ==](../../aspose.font.glyphs/glyphid/op_equality/) | 如果两个字形 ID 相等则返回 true。 |
| [operator !=](../../aspose.font.glyphs/glyphid/op_inequality/) | 如果两个字形 ID 不相等则返回 true。 |

### 另见

* namespace [Aspose.Font.Glyphs](../../aspose.font.glyphs/)
* assembly [Aspose.Font](../../)


