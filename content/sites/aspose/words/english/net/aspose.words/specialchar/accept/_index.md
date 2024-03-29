---
title: SpecialChar.Accept
linktitle: Accept
articleTitle: Accept
second_title: Aspose.Words for .NET
description: SpecialChar Accept method. Accepts a visitor in C#.
type: docs
weight: 20
url: /net/aspose.words/specialchar/accept/
---
## SpecialChar.Accept method

Accepts a visitor.

```csharp
public override bool Accept(DocumentVisitor visitor)
```

| Parameter | Type | Description |
| --- | --- | --- |
| visitor | DocumentVisitor | The visitor that will visit the node. |

### Return Value

`false` if the visitor requested the enumeration to stop.

## Remarks

Calls [`VisitSpecialChar`](../../documentvisitor/visitspecialchar/).

For more info see the Visitor design pattern.

### See Also

* class [DocumentVisitor](../../documentvisitor/)
* class [SpecialChar](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
