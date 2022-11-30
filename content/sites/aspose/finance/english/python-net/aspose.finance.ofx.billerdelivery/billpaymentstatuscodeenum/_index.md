---
title: BillPaymentStatusCodeEnum enumeration
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 410
url: /python-net/aspose.finance.ofx.billerdelivery/billpaymentstatuscodeenum/
is_root: false
---

## BillPaymentStatusCodeEnum enumeration

Bill payment status code enum.



The BillPaymentStatusCodeEnum type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| PAIDOUTOFBAND | A Payment has been initiated for this bill via a mechanism that does not report status via OFX. This status is intended to<br/>indicate the customer has paid the biller directly with cash or a check or has initiated an electronic payment through a mechanism that does not report payment status through OFX. |
| AUTOPAY | The Biller or Service Provider will initiate the payment based on a pre-authorization by the customer, typically a “good until cancelled”<br/>instruction with no defined end date. In the US this is often implemented using a recurring pre-authorized ACH debit, though some Billers offer preauthorized automatic payment through credit card.Examples include<br/>monthly deductions to cover a mortgage, regular payments from a checking account to a credit card, and the Automatic Payment Service (APS) offered<br/>by many utilities.Like NONE, this may be the initial payment status of the bill. |
| CANCELLED | The customer cancelled the payment that was previously scheduled. |
| UNPAYABLE | None of the Payment Instruments allowed for this bill are supported by the Payment Provider. This is intended to be used where the<br/>bill restricts payment to a subset of the Payment Instruments allowed in the Biller Directory entry. This could occur if the Payment Provider or the<br/>Biller changed their supported payment instrument types after enrollment and account activation. |
| NONE | There is neither a payment scheduled, nor has one been made against this bill. This may be the initial payment status of a bill. |
| SCHEDULED | A payment has been scheduled, but not yet processed against this bill. |
| PROCESSED | The payment has been processed against this bill, and can no longer be cancelled. |
| POSTED | The biller has posted the payment against this bill. |


### See Also

* module [aspose.finance.ofx.billerdelivery](../)
