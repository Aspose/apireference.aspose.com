---
title: "类 ByteContentStreamSource"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Sources.ByteContentStreamSource 类。表示基于内容流的流源"
type: docs
weight: 710
url: /zh/net/aspose.font.sources/bytecontentstreamsource/
---
## ByteContentStreamSource class

表示基于内容流的流源。

```csharp
public class ByteContentStreamSource : StreamSource
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [ByteContentStreamSource](bytecontentstreamsource/)(byte[]) | 初始化新的 `ByteContentStreamSource` 对象。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [Offset](../../aspose.font.sources/streamsource/offset/) { get; set; } | 获取或设置源内部的偏移量。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| override [Clone](../../aspose.font.sources/bytecontentstreamsource/clone/)() | 克隆 ByteContentStreamSource 对象。 |
| override [GetFontStream](../../aspose.font.sources/bytecontentstreamsource/getfontstream/)() | 返回字体文件流。使用后请记得关闭流。 |
| virtual [MustCloseAfterUse](../../aspose.font.sources/streamsource/mustcloseafteruse/)() | 子类可能会阻止流关闭。如果流源希望在使用后关闭流，则返回 true；否则返回 false。 |

### 另见

* class [StreamSource](../streamsource/)
* namespace [Aspose.Font.Sources](../../aspose.font.sources/)
* assembly [Aspose.Font](../../)


