---
title: PaymentMailSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 310
url: /python-net/aspose.finance.ofx.billpay/paymentmailsyncresponse/
is_root: false
---

## PaymentMailSyncResponse class

Payment mail synchronization response class.



**Inheritance:** [PaymentMailSyncResponse](/finance/python-net/aspose.finance.ofx.billpay/paymentmailsyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The PaymentMailSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [PaymentMailSyncResponse()](/finance/python-net/aspose.finance.ofx.billpay/paymentmailsyncresponse/__init__/#) | Initializes a new instance of [PaymentMailSyncResponse](/finance/python-net/aspose.finance.ofx.billpay/paymentmailsyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.billpay/paymentmailsyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.billpay/paymentmailsyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.billpay/paymentmailsyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [payment_mail_transaction_responses](/finance/python-net/aspose.finance.ofx.billpay/paymentmailsyncresponse/payment_mail_transaction_responses) | Gets or sets the collection of [PaymentMailTransactionResponse](/finance/python-net/aspose.finance.ofx.billpay/paymentmailtransactionresponse). |


### See Also

* module [aspose.finance.ofx.billpay](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.billpay/abstractsyncresponse)
