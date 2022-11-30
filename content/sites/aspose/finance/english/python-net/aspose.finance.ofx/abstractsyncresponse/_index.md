---
title: AbstractSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 90
url: /python-net/aspose.finance.ofx/abstractsyncresponse/
is_root: false
---

## AbstractSyncResponse class

Abstract base class of synchronization response related classes



**Inheritance:** [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The AbstractSyncResponse type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx/abstractsyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx/abstractsyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |


### See Also

* module [aspose.finance.ofx](../)
* class [AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)
