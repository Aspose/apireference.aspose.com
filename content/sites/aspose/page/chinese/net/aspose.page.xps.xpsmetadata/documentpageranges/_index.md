---
title: Class DocumentPageRanges
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.DocumentPageRanges 班级. 以页为单位描述文档的输出范围参数值必须符合以下结构  PageRangeTextPageRange或PageRangePageRange  PageRangePageNumber或PageNumberPageNumber  PageNumber1 到 N其中 N 是页数文档中的页数如果 PageNumber  N则 PageNumber  N. 应忽略字符串中的空格 https//docs.microsoft.com/enus/windows/win32/printdocs/documentpageranges
type: docs
weight: 770
url: /zh/net/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class

以页为单位描述文档的输出范围。参数值必须符合以下结构： - PageRangeText：“PageRange”或“PageRange,PageRange” - PageRange：“PageNumber”或“PageNumber-PageNumber” - PageNumber：1 到 N，其中 N 是页数文档中的页数。如果 PageNumber &gt; N，则 PageNumber = N. 应忽略字符串中的空格。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges

```csharp
public sealed class DocumentPageRanges : StringParameterInit, IDocumentPrintTicketItem, 
    IJobPrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [DocumentPageRanges](documentpageranges/)(string) | 创建一个新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| virtual [MaxLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/maxlength/) { get; } | 对于字符串值，定义允许的最长字符串。 |
| virtual [MinLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/minlength/) { get; } | 对于字符串值，定义允许的最短字符串。 |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 获取元素名称。 |

### 也可以看看

* class [StringParameterInit](../stringparameterinit/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


