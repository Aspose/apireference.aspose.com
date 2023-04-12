---
title: Class AccountSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.Signup.AccountSyncResponse klas. Synchronisatieantwoordklasse serviceactivering.
type: docs
weight: 5540
url: /nl/net/aspose.finance.ofx.signup/accountsyncresponse/
---
## AccountSyncResponse class

Synchronisatie-antwoordklasse serviceactivering.

```csharp
public class AccountSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [AccountSyncResponse](accountsyncresponse/)() | Initialiseert een nieuw exemplaar van`AccountSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AccountTransactionResponses](../../aspose.finance.ofx.signup/accountsyncresponse/accounttransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`AccountTransactionResponse`](../accounttransactionresponse/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [OfxExtension](../../aspose.finance.ofx.signup/accountsyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.Signup](../../aspose.finance.ofx.signup/)
* montage [Aspose.Finance](../../)


