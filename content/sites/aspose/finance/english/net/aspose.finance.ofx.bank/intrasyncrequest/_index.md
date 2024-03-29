---
title: IntraSyncRequest
second_title: Aspose.Finance for .NET API Reference
description: Intrabank transaction synchronization request class.
type: docs
weight: 490
url: /net/aspose.finance.ofx.bank/intrasyncrequest/
---
## IntraSyncRequest class

Intrabank transaction synchronization request class.

```csharp
public class IntraSyncRequest : AbstractSyncRequest
```

## Constructors

| Name | Description |
| --- | --- |
| [IntraSyncRequest](intrasyncrequest)() | Initializes a new instance of [`IntraSyncRequest`](../intrasyncrequest) class. |

## Properties

| Name | Description |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/intrasyncrequest/accountfrom) { get; set; } | Gets or sets the from of [`BankAccount`](../../aspose.finance.ofx/bankaccount) or [`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount) or [`LoanAccount`](../../aspose.finance.ofx/loanaccount). |
| [IntraTransactionRequests](../../aspose.finance.ofx.bank/intrasyncrequest/intratransactionrequests) { get; set; } | Gets or sets the collection of [`IntraTransactionRequest`](../intratransactionrequest). |
| [OfxExtension](../../aspose.finance.ofx.bank/intrasyncrequest/ofxextension) { get; set; } | Gets or sets the [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype). |
| [Refresh](../../aspose.finance.ofx/abstractsyncrequest/refresh) { get; set; } | Gets or sets whether request for refresh of current state. |
| [RejectIfMisssing](../../aspose.finance.ofx/abstractsyncrequest/rejectifmisssing) { get; set; } | If yes, do not process requests if client token is out of date. |
| [Token](../../aspose.finance.ofx/abstractsyncrequest/token) { get; set; } | Gets or sets the token. |
| [TokenOnly](../../aspose.finance.ofx/abstractsyncrequest/tokenonly) { get; set; } | Gets or sets whether request for just the current token without the history. |

### See Also

* class [AbstractSyncRequest](../../aspose.finance.ofx/abstractsyncrequest)
* namespace [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank)
* assembly [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
