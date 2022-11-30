---
title: MailSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.finance.ofx.email/mailsyncresponse/
is_root: false
---

## MailSyncResponse class

Email synchronization response class.



**Inheritance:** [MailSyncResponse](/finance/python-net/aspose.finance.ofx.email/mailsyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The MailSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [MailSyncResponse()](/finance/python-net/aspose.finance.ofx.email/mailsyncresponse/__init__/#) | Initializes a new instance of [MailSyncResponse](/finance/python-net/aspose.finance.ofx.email/mailsyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.email/mailsyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.email/mailsyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.email/mailsyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [mail_transaction_responses](/finance/python-net/aspose.finance.ofx.email/mailsyncresponse/mail_transaction_responses) | Gets or sets the collection of [MailTransactionResponse](/finance/python-net/aspose.finance.ofx.email/mailtransactionresponse). |


### See Also

* module [aspose.finance.ofx.email](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.email/abstractsyncresponse)
