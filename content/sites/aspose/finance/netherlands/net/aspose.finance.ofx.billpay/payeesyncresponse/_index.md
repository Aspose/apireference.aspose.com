---
title: Class PayeeSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.BillPay.PayeeSyncResponse klas. Synchronisatie antwoordklasse begunstigdenlijst.
type: docs
weight: 1020
url: /nl/net/aspose.finance.ofx.billpay/payeesyncresponse/
---
## PayeeSyncResponse class

Synchronisatie antwoordklasse begunstigdenlijst.

```csharp
public class PayeeSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [PayeeSyncResponse](payeesyncresponse/)() | Initialiseert een nieuw exemplaar van`PayeeSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [OfxExtension](../../aspose.finance.ofx.billpay/payeesyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [PayeeTransactionResponses](../../aspose.finance.ofx.billpay/payeesyncresponse/payeetransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`PayeeTransactionResponse`](../payeetransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay/)
* montage [Aspose.Finance](../../)


