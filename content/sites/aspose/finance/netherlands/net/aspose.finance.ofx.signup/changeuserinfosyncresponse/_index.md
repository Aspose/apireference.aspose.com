---
title: Class ChangeUserInfoSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.Signup.ChangeUserInfoSyncResponse klas. Antwoordklasse voor synchronisatie van gebruikersgegevens wijzigen.
type: docs
weight: 5600
url: /nl/net/aspose.finance.ofx.signup/changeuserinfosyncresponse/
---
## ChangeUserInfoSyncResponse class

Antwoordklasse voor synchronisatie van gebruikersgegevens wijzigen.

```csharp
public class ChangeUserInfoSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [ChangeUserInfoSyncResponse](changeuserinfosyncresponse/)() | Initialiseert een nieuw exemplaar van`ChangeUserInfoSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [ChangeUserInfoTransactionResponses](../../aspose.finance.ofx.signup/changeuserinfosyncresponse/changeuserinfotransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`ChangeUserInfoTransactionResponse`](../changeuserinfotransactionresponse/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [OfxExtension](../../aspose.finance.ofx.signup/changeuserinfosyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.Signup](../../aspose.finance.ofx.signup/)
* montage [Aspose.Finance](../../)


