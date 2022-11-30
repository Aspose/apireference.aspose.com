---
title: StopCheckSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 500
url: /python-net/aspose.finance.ofx.bank/stopchecksyncresponse/
is_root: false
---

## StopCheckSyncResponse class

Stop Check synchronization response class.



**Inheritance:** [StopCheckSyncResponse](/finance/python-net/aspose.finance.ofx.bank/stopchecksyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The StopCheckSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [StopCheckSyncResponse()](/finance/python-net/aspose.finance.ofx.bank/stopchecksyncresponse/__init__/#) | Initializes a new instance of [StopCheckSyncResponse](/finance/python-net/aspose.finance.ofx.bank/stopchecksyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.bank/stopchecksyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.bank/stopchecksyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [bank_account_from](/finance/python-net/aspose.finance.ofx.bank/stopchecksyncresponse/bank_account_from) | Gets or sets the from of [BankAccount](/finance/python-net/aspose.finance.ofx/bankaccount). |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.bank/stopchecksyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [stop_check_transaction_responses](/finance/python-net/aspose.finance.ofx.bank/stopchecksyncresponse/stop_check_transaction_responses) | Gets or sets the collection of [StopCheckTransactionResponse](/finance/python-net/aspose.finance.ofx.bank/stopchecktransactionresponse). |


### See Also

* module [aspose.finance.ofx.bank](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.bank/abstractsyncresponse)
