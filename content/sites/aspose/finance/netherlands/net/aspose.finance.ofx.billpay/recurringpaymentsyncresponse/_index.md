---
title: Class RecurringPaymentSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.BillPay.RecurringPaymentSyncResponse klas. Reactieklasse terugkerende betalingssynchronisatie.
type: docs
weight: 1350
url: /nl/net/aspose.finance.ofx.billpay/recurringpaymentsyncresponse/
---
## RecurringPaymentSyncResponse class

Reactieklasse terugkerende betalingssynchronisatie.

```csharp
public class RecurringPaymentSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [RecurringPaymentSyncResponse](recurringpaymentsyncresponse/)() | Initialiseert een nieuw exemplaar van`RecurringPaymentSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [BankAccountFrom](../../aspose.finance.ofx.billpay/recurringpaymentsyncresponse/bankaccountfrom/) { get; set; } | Haalt of stelt de from van in[`BankAccount`](../../aspose.finance.ofx/bankaccount/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [OfxExtension](../../aspose.finance.ofx.billpay/recurringpaymentsyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [RecurringPaymentTransactionResponses](../../aspose.finance.ofx.billpay/recurringpaymentsyncresponse/recurringpaymenttransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`RecurringPaymentTransactionResponse`](../recurringpaymenttransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay/)
* montage [Aspose.Finance](../../)


