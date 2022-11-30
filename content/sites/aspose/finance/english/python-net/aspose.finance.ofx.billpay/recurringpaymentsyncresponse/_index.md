---
title: RecurringPaymentSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 500
url: /python-net/aspose.finance.ofx.billpay/recurringpaymentsyncresponse/
is_root: false
---

## RecurringPaymentSyncResponse class

Recurring payment synchronization response class.



**Inheritance:** [RecurringPaymentSyncResponse](/finance/python-net/aspose.finance.ofx.billpay/recurringpaymentsyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The RecurringPaymentSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [RecurringPaymentSyncResponse()](/finance/python-net/aspose.finance.ofx.billpay/recurringpaymentsyncresponse/__init__/#) | Initializes a new instance of [RecurringPaymentSyncResponse](/finance/python-net/aspose.finance.ofx.billpay/recurringpaymentsyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.billpay/recurringpaymentsyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.billpay/recurringpaymentsyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [bank_account_from](/finance/python-net/aspose.finance.ofx.billpay/recurringpaymentsyncresponse/bank_account_from) | Gets or sets the from of [BankAccount](/finance/python-net/aspose.finance.ofx/bankaccount). |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.billpay/recurringpaymentsyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [recurring_payment_transaction_responses](/finance/python-net/aspose.finance.ofx.billpay/recurringpaymentsyncresponse/recurring_payment_transaction_responses) | Gets or sets the collection of [RecurringPaymentTransactionResponse](/finance/python-net/aspose.finance.ofx.billpay/recurringpaymenttransactionresponse). |


### See Also

* module [aspose.finance.ofx.billpay](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.billpay/abstractsyncresponse)
