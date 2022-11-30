---
title: InterSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 120
url: /python-net/aspose.finance.ofx.intertransfer/intersyncresponse/
is_root: false
---

## InterSyncResponse class

Interbank transaction synchronization response class.



**Inheritance:** [InterSyncResponse](/finance/python-net/aspose.finance.ofx.intertransfer/intersyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The InterSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [InterSyncResponse()](/finance/python-net/aspose.finance.ofx.intertransfer/intersyncresponse/__init__/#) | Initializes a new instance of [InterSyncResponse](/finance/python-net/aspose.finance.ofx.intertransfer/intersyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.intertransfer/intersyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.intertransfer/intersyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [account_from](/finance/python-net/aspose.finance.ofx.intertransfer/intersyncresponse/account_from) | Gets or sets the from of [BankAccount](/finance/python-net/aspose.finance.ofx/bankaccount) or [CreditCardAccount](/finance/python-net/aspose.finance.ofx/creditcardaccount) or [LoanAccount](/finance/python-net/aspose.finance.ofx/loanaccount). |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.intertransfer/intersyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [inter_transaction_responses](/finance/python-net/aspose.finance.ofx.intertransfer/intersyncresponse/inter_transaction_responses) | Gets or sets the collection of [InterTransactionResponse](/finance/python-net/aspose.finance.ofx.intertransfer/intertransactionresponse). |


### See Also

* module [aspose.finance.ofx.intertransfer](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.intertransfer/abstractsyncresponse)
