---
title: LinkEmbedDecision
second_title: Aspose.Slides for .NET API 参考
description: 确定在保存期间如何处理对象
type: docs
weight: 3880
url: /zh/net/aspose.slides.export/linkembeddecision/
---
## LinkEmbedDecision enumeration

确定在保存期间如何处理对象。

```csharp
public enum LinkEmbedDecision
```

### 价值观

| 姓名 | 价值 | 描述 |
| --- | --- | --- |
| Link | `0` | 对象将存储在外部，由 URL |
| Embed | `1` | 对象应尽可能嵌入到生成的文件中。如果嵌入是不可能的，将调用 GetUrl，并且根据结果，对象将被 URL 引用或忽略。 |
| Ignore | `2` | 对象将被忽略。 |

### 也可以看看

* 命名空间 [Aspose.Slides.Export](../../aspose.slides.export)
* 部件 [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
