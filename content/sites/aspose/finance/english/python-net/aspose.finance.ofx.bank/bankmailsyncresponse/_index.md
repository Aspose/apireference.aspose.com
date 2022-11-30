---
title: BankMailSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 100
url: /python-net/aspose.finance.ofx.bank/bankmailsyncresponse/
is_root: false
---

## BankMailSyncResponse class

Bank mail synchronization response class.



**Inheritance:** [BankMailSyncResponse](/finance/python-net/aspose.finance.ofx.bank/bankmailsyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The BankMailSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [BankMailSyncResponse()](/finance/python-net/aspose.finance.ofx.bank/bankmailsyncresponse/__init__/#) | Initializes a new instance of [BankMailSyncResponse](/finance/python-net/aspose.finance.ofx.bank/bankmailsyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.bank/bankmailsyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.bank/bankmailsyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [account_from](/finance/python-net/aspose.finance.ofx.bank/bankmailsyncresponse/account_from) | Gets or sets the from of [BankAccount](/finance/python-net/aspose.finance.ofx/bankaccount) or [CreditCardAccount](/finance/python-net/aspose.finance.ofx/creditcardaccount). |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.bank/bankmailsyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [bank_mail_transaction_responses](/finance/python-net/aspose.finance.ofx.bank/bankmailsyncresponse/bank_mail_transaction_responses) | Gets or sets the collection of [BankMailTransactionResponse](/finance/python-net/aspose.finance.ofx.bank/bankmailtransactionresponse). |


### See Also

* module [aspose.finance.ofx.bank](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.bank/abstractsyncresponse)
