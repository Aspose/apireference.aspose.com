---
title: LoanMailSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 130
url: /python-net/aspose.finance.ofx.loan/loanmailsyncresponse/
is_root: false
---

## LoanMailSyncResponse class

Loan mail synchronization response class.



**Inheritance:** [LoanMailSyncResponse](/finance/python-net/aspose.finance.ofx.loan/loanmailsyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The LoanMailSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [LoanMailSyncResponse()](/finance/python-net/aspose.finance.ofx.loan/loanmailsyncresponse/__init__/#) | Initializes a new instance of [LoanMailSyncResponse](/finance/python-net/aspose.finance.ofx.loan/loanmailsyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.loan/loanmailsyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.loan/loanmailsyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [loan_account_from](/finance/python-net/aspose.finance.ofx.loan/loanmailsyncresponse/loan_account_from) | Gets or sets the from of [LoanAccount](/finance/python-net/aspose.finance.ofx/loanaccount). |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.loan/loanmailsyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [loan_mail_transaction_responses](/finance/python-net/aspose.finance.ofx.loan/loanmailsyncresponse/loan_mail_transaction_responses) | Gets or sets the collection of [LoanMailTransactionResponse](/finance/python-net/aspose.finance.ofx.loan/loanmailtransactionresponse). |


### See Also

* module [aspose.finance.ofx.loan](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.loan/abstractsyncresponse)
