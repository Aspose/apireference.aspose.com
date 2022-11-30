---
title: InvestmentMailSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 330
url: /python-net/aspose.finance.ofx.investment/investmentmailsyncresponse/
is_root: false
---

## InvestmentMailSyncResponse class

Investment email Synchronization response class.



**Inheritance:** [InvestmentMailSyncResponse](/finance/python-net/aspose.finance.ofx.investment/investmentmailsyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The InvestmentMailSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [InvestmentMailSyncResponse()](/finance/python-net/aspose.finance.ofx.investment/investmentmailsyncresponse/__init__/#) | Initializes a new instance of [InvestmentMailSyncResponse](/finance/python-net/aspose.finance.ofx.investment/investmentmailsyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.investment/investmentmailsyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.investment/investmentmailsyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [investment_account_from](/finance/python-net/aspose.finance.ofx.investment/investmentmailsyncresponse/investment_account_from) | Gets or sets the from of [InvestmentAccount](/finance/python-net/aspose.finance.ofx/investmentaccount). |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.investment/investmentmailsyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [investment_mail_transaction_responses](/finance/python-net/aspose.finance.ofx.investment/investmentmailsyncresponse/investment_mail_transaction_responses) | Gets or sets the collection of [InvestmentMailTransactionResponse](/finance/python-net/aspose.finance.ofx.investment/investmentmailtransactionresponse). |


### See Also

* module [aspose.finance.ofx.investment](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.investment/abstractsyncresponse)
