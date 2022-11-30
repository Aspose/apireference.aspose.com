---
title: PresentmentMailSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 330
url: /python-net/aspose.finance.ofx.billerdelivery/presentmentmailsyncresponse/
is_root: false
---

## PresentmentMailSyncResponse class

Bill presentment mail synchronization response class.



**Inheritance:** [PresentmentMailSyncResponse](/finance/python-net/aspose.finance.ofx.billerdelivery/presentmentmailsyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The PresentmentMailSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [PresentmentMailSyncResponse()](/finance/python-net/aspose.finance.ofx.billerdelivery/presentmentmailsyncresponse/__init__/#) | Initializes a new instance of [PresentmentMailSyncResponse](/finance/python-net/aspose.finance.ofx.billerdelivery/presentmentmailsyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.billerdelivery/presentmentmailsyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.billerdelivery/presentmentmailsyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [presentment_account_from](/finance/python-net/aspose.finance.ofx.billerdelivery/presentmentmailsyncresponse/presentment_account_from) | Gets or sets the from of [PresentmentAccount](/finance/python-net/aspose.finance.ofx/presentmentaccount). |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.billerdelivery/presentmentmailsyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [presentment_mail_transaction_responses](/finance/python-net/aspose.finance.ofx.billerdelivery/presentmentmailsyncresponse/presentment_mail_transaction_responses) | Gets or sets the collection of [PresentmentMailTransactionResponse](/finance/python-net/aspose.finance.ofx.billerdelivery/presentmentmailtransactionresponse). |


### See Also

* module [aspose.finance.ofx.billerdelivery](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.billerdelivery/abstractsyncresponse)
