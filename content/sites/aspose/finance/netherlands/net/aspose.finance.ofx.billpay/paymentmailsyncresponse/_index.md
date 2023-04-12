---
title: Class PaymentMailSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.BillPay.PaymentMailSyncResponse klas. Antwoordklasse betalingsmailsynchronisatie.
type: docs
weight: 1150
url: /nl/net/aspose.finance.ofx.billpay/paymentmailsyncresponse/
---
## PaymentMailSyncResponse class

Antwoordklasse betalingsmailsynchronisatie.

```csharp
public class PaymentMailSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [PaymentMailSyncResponse](paymentmailsyncresponse/)() | Initialiseert een nieuw exemplaar van`PaymentMailSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [OfxExtension](../../aspose.finance.ofx.billpay/paymentmailsyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [PaymentMailTransactionResponses](../../aspose.finance.ofx.billpay/paymentmailsyncresponse/paymentmailtransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`PaymentMailTransactionResponse`](../paymentmailtransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay/)
* montage [Aspose.Finance](../../)


