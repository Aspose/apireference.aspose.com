---
title: Class MailSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.Email.MailSyncResponse klas. Antwoordklasse emailsynchronisatie.
type: docs
weight: 2190
url: /nl/net/aspose.finance.ofx.email/mailsyncresponse/
---
## MailSyncResponse class

Antwoordklasse e-mailsynchronisatie.

```csharp
public class MailSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [MailSyncResponse](mailsyncresponse/)() | Initialiseert een nieuw exemplaar van`MailSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [MailTransactionResponses](../../aspose.finance.ofx.email/mailsyncresponse/mailtransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`MailTransactionResponse`](../mailtransactionresponse/) . |
| [OfxExtension](../../aspose.finance.ofx.email/mailsyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.Email](../../aspose.finance.ofx.email/)
* montage [Aspose.Finance](../../)


