---
title: Class PresentmentMailSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.BillerDelivery.PresentmentMailSyncResponse klas. Bill presentment mail synchronisatie antwoordklasse.
type: docs
weight: 1760
url: /nl/net/aspose.finance.ofx.billerdelivery/presentmentmailsyncresponse/
---
## PresentmentMailSyncResponse class

Bill presentment mail synchronisatie antwoordklasse.

```csharp
public class PresentmentMailSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [PresentmentMailSyncResponse](presentmentmailsyncresponse/)() | Initialiseert een nieuw exemplaar van`PresentmentMailSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [OfxExtension](../../aspose.finance.ofx.billerdelivery/presentmentmailsyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [PresentmentAccountFrom](../../aspose.finance.ofx.billerdelivery/presentmentmailsyncresponse/presentmentaccountfrom/) { get; set; } | Haalt of stelt de from van in[`PresentmentAccount`](../../aspose.finance.ofx/presentmentaccount/) . |
| [PresentmentMailTransactionResponses](../../aspose.finance.ofx.billerdelivery/presentmentmailsyncresponse/presentmentmailtransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`PresentmentMailTransactionResponse`](../presentmentmailtransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.BillerDelivery](../../aspose.finance.ofx.billerdelivery/)
* montage [Aspose.Finance](../../)


