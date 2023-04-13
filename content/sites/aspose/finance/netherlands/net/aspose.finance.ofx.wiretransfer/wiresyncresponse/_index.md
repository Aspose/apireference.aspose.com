---
title: Class WireSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.WireTransfer.WireSyncResponse klas. Synchronisatie antwoordklasse draadtransactie.
type: docs
weight: 6440
url: /nl/net/aspose.finance.ofx.wiretransfer/wiresyncresponse/
---
## WireSyncResponse class

Synchronisatie antwoordklasse draadtransactie.

```csharp
public class WireSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [WireSyncResponse](wiresyncresponse/)() | Initialiseert een nieuw exemplaar van`WireSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [BankAccountFrom](../../aspose.finance.ofx.wiretransfer/wiresyncresponse/bankaccountfrom/) { get; set; } | Haalt of stelt de from van in[`BankAccount`](../../aspose.finance.ofx/bankaccount/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [OfxExtension](../../aspose.finance.ofx.wiretransfer/wiresyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |
| [WireTransactionResponses](../../aspose.finance.ofx.wiretransfer/wiresyncresponse/wiretransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`WireTransactionResponse`](../wiretransactionresponse/) . |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.WireTransfer](../../aspose.finance.ofx.wiretransfer/)
* montage [Aspose.Finance](../../)


