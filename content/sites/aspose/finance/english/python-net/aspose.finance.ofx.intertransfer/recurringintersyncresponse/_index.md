---
title: RecurringInterSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 220
url: /python-net/aspose.finance.ofx.intertransfer/recurringintersyncresponse/
is_root: false
---

## RecurringInterSyncResponse class

Recurring interbank transaction synchronization response class.



**Inheritance:** [RecurringInterSyncResponse](/finance/python-net/aspose.finance.ofx.intertransfer/recurringintersyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The RecurringInterSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [RecurringInterSyncResponse()](/finance/python-net/aspose.finance.ofx.intertransfer/recurringintersyncresponse/__init__/#) | Initializes a new instance of [RecurringInterSyncResponse](/finance/python-net/aspose.finance.ofx.intertransfer/recurringintersyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.intertransfer/recurringintersyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.intertransfer/recurringintersyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [account_from](/finance/python-net/aspose.finance.ofx.intertransfer/recurringintersyncresponse/account_from) | Gets or sets the from of [BankAccount](/finance/python-net/aspose.finance.ofx/bankaccount) or [CreditCardAccount](/finance/python-net/aspose.finance.ofx/creditcardaccount) or [LoanAccount](/finance/python-net/aspose.finance.ofx/loanaccount). |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.intertransfer/recurringintersyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [recurring_inter_transaction_responses](/finance/python-net/aspose.finance.ofx.intertransfer/recurringintersyncresponse/recurring_inter_transaction_responses) | Gets or sets the collection of [RecurringInterTransactionResponse](/finance/python-net/aspose.finance.ofx.intertransfer/recurringintertransactionresponse). |


### See Also

* module [aspose.finance.ofx.intertransfer](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.intertransfer/abstractsyncresponse)
