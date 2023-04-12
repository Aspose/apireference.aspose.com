---
title: Class BankMailSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.Bank.BankMailSyncResponse klas. Reactieklasse bankmailsynchronisatie.
type: docs
weight: 340
url: /nl/net/aspose.finance.ofx.bank/bankmailsyncresponse/
---
## BankMailSyncResponse class

Reactieklasse bankmailsynchronisatie.

```csharp
public class BankMailSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [BankMailSyncResponse](bankmailsyncresponse/)() | Initialiseert een nieuw exemplaar van`BankMailSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/bankmailsyncresponse/accountfrom/) { get; set; } | Haalt of stelt de from van in[`BankAccount`](../../aspose.finance.ofx/bankaccount/) of[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/) . |
| [BankMailTransactionResponses](../../aspose.finance.ofx.bank/bankmailsyncresponse/bankmailtransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`BankMailTransactionResponse`](../bankmailtransactionresponse/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [OfxExtension](../../aspose.finance.ofx.bank/bankmailsyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank/)
* montage [Aspose.Finance](../../)


