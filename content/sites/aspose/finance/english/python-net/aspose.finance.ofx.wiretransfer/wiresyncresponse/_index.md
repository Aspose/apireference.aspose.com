---
title: WireSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 110
url: /python-net/aspose.finance.ofx.wiretransfer/wiresyncresponse/
is_root: false
---

## WireSyncResponse class

Wire transaction synchronization response class.



**Inheritance:** [WireSyncResponse](/finance/python-net/aspose.finance.ofx.wiretransfer/wiresyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The WireSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [WireSyncResponse()](/finance/python-net/aspose.finance.ofx.wiretransfer/wiresyncresponse/__init__/#) | Initializes a new instance of [WireSyncResponse](/finance/python-net/aspose.finance.ofx.wiretransfer/wiresyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.wiretransfer/wiresyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.wiretransfer/wiresyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [bank_account_from](/finance/python-net/aspose.finance.ofx.wiretransfer/wiresyncresponse/bank_account_from) | Gets or sets the from of [BankAccount](/finance/python-net/aspose.finance.ofx/bankaccount). |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.wiretransfer/wiresyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [wire_transaction_responses](/finance/python-net/aspose.finance.ofx.wiretransfer/wiresyncresponse/wire_transaction_responses) | Gets or sets the collection of [WireTransactionResponse](/finance/python-net/aspose.finance.ofx.wiretransfer/wiretransactionresponse). |


### See Also

* module [aspose.finance.ofx.wiretransfer](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.wiretransfer/abstractsyncresponse)
