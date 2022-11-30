---
title: BillStatusCodeEnum enumeration
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 420
url: /python-net/aspose.finance.ofx.billerdelivery/billstatuscodeenum/
is_root: false
---

## BillStatusCodeEnum enumeration

Bill status code enum.



The BillStatusCodeEnum type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| WITHDRAWN | The biller or publisher no longer wishes this bill to be displayed. |
| UNDELIVERABLE | Attempts to deliver this bill to the consumer in a timely fashion have failed. This status is not generally used when presenting<br/>a bill to a consumer. However, notifications using this status cover many useful cases. |
| NEW | The server has not sent the bill to either the client or client proxy. This is the initial status code of a bill. |
| DELIVERED | The server has sent the bill to either a client or client proxy. |
| VIEWED | The customer has seen the bill. Implies previous status of DELIVERED. |
| RETIRED | The customer no longer wishes to see this bill. Implies previous status of DELIVERED. |


### See Also

* module [aspose.finance.ofx.billerdelivery](../)
