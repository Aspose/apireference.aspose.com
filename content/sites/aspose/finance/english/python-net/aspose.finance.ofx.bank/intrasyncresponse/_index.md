---
title: IntraSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 250
url: /python-net/aspose.finance.ofx.bank/intrasyncresponse/
is_root: false
---

## IntraSyncResponse class

Intrabank transaction synchronization response class.



**Inheritance:** [IntraSyncResponse](/finance/python-net/aspose.finance.ofx.bank/intrasyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The IntraSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [IntraSyncResponse()](/finance/python-net/aspose.finance.ofx.bank/intrasyncresponse/__init__/#) | Initializes a new instance of [IntraSyncResponse](/finance/python-net/aspose.finance.ofx.bank/intrasyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.bank/intrasyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.bank/intrasyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [account_from](/finance/python-net/aspose.finance.ofx.bank/intrasyncresponse/account_from) | Gets or sets the from of [BankAccount](/finance/python-net/aspose.finance.ofx/bankaccount) or [CreditCardAccount](/finance/python-net/aspose.finance.ofx/creditcardaccount) or [LoanAccount](/finance/python-net/aspose.finance.ofx/loanaccount). |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.bank/intrasyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [intra_transaction_responses](/finance/python-net/aspose.finance.ofx.bank/intrasyncresponse/intra_transaction_responses) | Gets or sets the collection of [IntraTransactionResponse](/finance/python-net/aspose.finance.ofx.bank/intratransactionresponse). |


### See Also

* module [aspose.finance.ofx.bank](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.bank/abstractsyncresponse)
