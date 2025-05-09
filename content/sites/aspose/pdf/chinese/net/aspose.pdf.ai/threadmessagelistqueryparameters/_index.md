---
title: Class ThreadMessageListQueryParameters
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.AI.ThreadMessageListQueryParameters class. 查询线程消息的参数对象
type: docs
weight: 1130
url: /zh/net/aspose.pdf.ai/threadmessagelistqueryparameters/
---
## ThreadMessageListQueryParameters class

查询线程消息的参数对象。

```csharp
public class ThreadMessageListQueryParameters : BaseListQueryParameters, IQueryParameters
```

## Constructors

| Name | Description |
| --- | --- |
| [ThreadMessageListQueryParameters](threadmessagelistqueryparameters/)() | 默认构造函数。 |

## Properties

| Name | Description |
| --- | --- |
| [After](../../aspose.pdf.ai/baselistqueryparameters/after/) { get; set; } | 获取或设置用于分页的游标。 after 是一个对象 ID，定义您在列表中的位置。例如，如果您发出列表请求并接收到 100 个对象，以 obj_foo 结尾，则您的后续调用可以包含 after=obj_foo 以获取列表的下一页。 |
| [Before](../../aspose.pdf.ai/baselistqueryparameters/before/) { get; set; } | 获取或设置用于分页的游标。 before 是一个对象 ID，定义您在列表中的位置。例如，如果您发出列表请求并接收到 100 个对象，以 obj_foo 结尾，则您的后续调用可以包含 before=obj_foo 以获取列表的上一页。 |
| [Limit](../../aspose.pdf.ai/baselistqueryparameters/limit/) { get; set; } | 获取或设置要返回的对象数量限制。 Limit 可以在 1 到 100 之间，默认值为 20。 |
| [Order](../../aspose.pdf.ai/baselistqueryparameters/order/) { get; set; } | 获取或设置按对象的 created_at 时间戳排序的顺序。 asc 表示升序，desc 表示降序。 |
| [RunId](../../aspose.pdf.ai/threadmessagelistqueryparameters/runid/) { get; set; } | 按生成消息的运行 ID 过滤消息。 |

## Methods

| Name | Description |
| --- | --- |
| [GetQueryParameters](../../aspose.pdf.ai/threadmessagelistqueryparameters/getqueryparameters/)() | 获取用于列出线程消息的查询参数。 |

### See Also

* class [BaseListQueryParameters](../baselistqueryparameters/)
* interface [IQueryParameters](../iqueryparameters/)
* namespace [Aspose.Pdf.AI](../../aspose.pdf.ai/)
* assembly [Aspose.PDF](../../)