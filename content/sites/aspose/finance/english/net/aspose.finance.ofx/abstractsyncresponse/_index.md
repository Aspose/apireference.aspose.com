---
title: AbstractSyncResponse
second_title: Aspose.Finance for .NET API Reference
description: Abstract base class of synchronization response related classes
type: docs
weight: 110
url: /net/aspose.finance.ofx/abstractsyncresponse/
---
## AbstractSyncResponse class

Abstract base class of synchronization response related classes

```csharp
public class AbstractSyncResponse : AbstractResponse
```

## Properties

| Name | Description |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost. No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | Gets or sets the new synchronization token. |

### See Also

* class [AbstractResponse](../abstractresponse)
* namespace [Aspose.Finance.Ofx](../../aspose.finance.ofx)
* assembly [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
