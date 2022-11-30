---
title: PaymentSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 400
url: /python-net/aspose.finance.ofx.billpay/paymentsyncresponse/
is_root: false
---

## PaymentSyncResponse class

Payment synchronization response class.



**Inheritance:** [PaymentSyncResponse](/finance/python-net/aspose.finance.ofx.billpay/paymentsyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The PaymentSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [PaymentSyncResponse()](/finance/python-net/aspose.finance.ofx.billpay/paymentsyncresponse/__init__/#) | Initializes a new instance of [PaymentSyncResponse](/finance/python-net/aspose.finance.ofx.billpay/paymentsyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.billpay/paymentsyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.billpay/paymentsyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [bank_account_from](/finance/python-net/aspose.finance.ofx.billpay/paymentsyncresponse/bank_account_from) | Gets or sets the from of [BankAccount](/finance/python-net/aspose.finance.ofx/bankaccount). |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.billpay/paymentsyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [payment_transaction_responses](/finance/python-net/aspose.finance.ofx.billpay/paymentsyncresponse/payment_transaction_responses) | Gets or sets the collection of [PaymentTransactionResponse](/finance/python-net/aspose.finance.ofx.billpay/paymenttransactionresponse). |


### See Also

* module [aspose.finance.ofx.billpay](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.billpay/abstractsyncresponse)
