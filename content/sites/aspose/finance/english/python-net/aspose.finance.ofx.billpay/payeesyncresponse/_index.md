---
title: PayeeSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 180
url: /python-net/aspose.finance.ofx.billpay/payeesyncresponse/
is_root: false
---

## PayeeSyncResponse class

Payee list synchronization response class.



**Inheritance:** [PayeeSyncResponse](/finance/python-net/aspose.finance.ofx.billpay/payeesyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The PayeeSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [PayeeSyncResponse()](/finance/python-net/aspose.finance.ofx.billpay/payeesyncresponse/__init__/#) | Initializes a new instance of [PayeeSyncResponse](/finance/python-net/aspose.finance.ofx.billpay/payeesyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.billpay/payeesyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.billpay/payeesyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.billpay/payeesyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [payee_transaction_responses](/finance/python-net/aspose.finance.ofx.billpay/payeesyncresponse/payee_transaction_responses) | Gets or sets the collection of [PayeeTransactionResponse](/finance/python-net/aspose.finance.ofx.billpay/payeetransactionresponse). |


### See Also

* module [aspose.finance.ofx.billpay](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.billpay/abstractsyncresponse)
