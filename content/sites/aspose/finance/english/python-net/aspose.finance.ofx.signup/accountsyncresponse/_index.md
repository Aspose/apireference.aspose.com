---
title: AccountSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.finance.ofx.signup/accountsyncresponse/
is_root: false
---

## AccountSyncResponse class

Service activation synchronization response class.



**Inheritance:** [AccountSyncResponse](/finance/python-net/aspose.finance.ofx.signup/accountsyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The AccountSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [AccountSyncResponse()](/finance/python-net/aspose.finance.ofx.signup/accountsyncresponse/__init__/#) | Initializes a new instance of [AccountSyncResponse](/finance/python-net/aspose.finance.ofx.signup/accountsyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.signup/accountsyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.signup/accountsyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.signup/accountsyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [account_transaction_responses](/finance/python-net/aspose.finance.ofx.signup/accountsyncresponse/account_transaction_responses) | Gets or sets the collection of [AccountTransactionResponse](/finance/python-net/aspose.finance.ofx.signup/accounttransactionresponse). |


### See Also

* module [aspose.finance.ofx.signup](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.signup/abstractsyncresponse)
