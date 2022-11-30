---
title: RecurringIntraSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 350
url: /python-net/aspose.finance.ofx.bank/recurringintrasyncresponse/
is_root: false
---

## RecurringIntraSyncResponse class

Recurring intrabank transaction synchronization response class.



**Inheritance:** [RecurringIntraSyncResponse](/finance/python-net/aspose.finance.ofx.bank/recurringintrasyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The RecurringIntraSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [RecurringIntraSyncResponse()](/finance/python-net/aspose.finance.ofx.bank/recurringintrasyncresponse/__init__/#) | Initializes a new instance of [RecurringIntraSyncResponse](/finance/python-net/aspose.finance.ofx.bank/recurringintrasyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.bank/recurringintrasyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.bank/recurringintrasyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [account_from](/finance/python-net/aspose.finance.ofx.bank/recurringintrasyncresponse/account_from) | Gets or sets the from of [BankAccount](/finance/python-net/aspose.finance.ofx/bankaccount) or [CreditCardAccount](/finance/python-net/aspose.finance.ofx/creditcardaccount) or [LoanAccount](/finance/python-net/aspose.finance.ofx/loanaccount). |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.bank/recurringintrasyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [recurring_intra_transaction_responses](/finance/python-net/aspose.finance.ofx.bank/recurringintrasyncresponse/recurring_intra_transaction_responses) | Gets or sets the collection of [RecurringIntraTransactionResponse](/finance/python-net/aspose.finance.ofx.bank/recurringintratransactionresponse). |


### See Also

* module [aspose.finance.ofx.bank](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.bank/abstractsyncresponse)
