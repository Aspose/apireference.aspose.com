---
title: Class PaymentSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.BillPay.PaymentSyncResponse klas. Antwoordklasse betalingssynchronisatie.
type: docs
weight: 1250
url: /nl/net/aspose.finance.ofx.billpay/paymentsyncresponse/
---
## PaymentSyncResponse class

Antwoordklasse betalingssynchronisatie.

```csharp
public class PaymentSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [PaymentSyncResponse](paymentsyncresponse/)() | Initialiseert een nieuw exemplaar van`PaymentSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [BankAccountFrom](../../aspose.finance.ofx.billpay/paymentsyncresponse/bankaccountfrom/) { get; set; } | Haalt of stelt de from van in[`BankAccount`](../../aspose.finance.ofx/bankaccount/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [OfxExtension](../../aspose.finance.ofx.billpay/paymentsyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [PaymentTransactionResponses](../../aspose.finance.ofx.billpay/paymentsyncresponse/paymenttransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`PaymentTransactionResponse`](../paymenttransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay/)
* montage [Aspose.Finance](../../)


