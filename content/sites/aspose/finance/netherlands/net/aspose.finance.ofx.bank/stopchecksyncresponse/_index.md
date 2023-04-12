---
title: Class StopCheckSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.Bank.StopCheckSyncResponse klas. Stop Check synchronisatie antwoordklasse.
type: docs
weight: 750
url: /nl/net/aspose.finance.ofx.bank/stopchecksyncresponse/
---
## StopCheckSyncResponse class

Stop Check synchronisatie antwoordklasse.

```csharp
public class StopCheckSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [StopCheckSyncResponse](stopchecksyncresponse/)() | Initialiseert een nieuw exemplaar van`StopCheckSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [BankAccountFrom](../../aspose.finance.ofx.bank/stopchecksyncresponse/bankaccountfrom/) { get; set; } | Haalt of stelt de from van in[`BankAccount`](../../aspose.finance.ofx/bankaccount/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [OfxExtension](../../aspose.finance.ofx.bank/stopchecksyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [StopCheckTransactionResponses](../../aspose.finance.ofx.bank/stopchecksyncresponse/stopchecktransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`StopCheckTransactionResponse`](../stopchecktransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank/)
* montage [Aspose.Finance](../../)


