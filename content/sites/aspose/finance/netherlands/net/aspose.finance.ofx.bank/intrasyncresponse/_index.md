---
title: Class IntraSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.Bank.IntraSyncResponse klas. Intrabancaire transactie synchronisatie antwoordklasse.
type: docs
weight: 500
url: /nl/net/aspose.finance.ofx.bank/intrasyncresponse/
---
## IntraSyncResponse class

Intrabancaire transactie synchronisatie antwoordklasse.

```csharp
public class IntraSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [IntraSyncResponse](intrasyncresponse/)() | Initialiseert een nieuw exemplaar van`IntraSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/intrasyncresponse/accountfrom/) { get; set; } | Haalt of stelt de from van in[`BankAccount`](../../aspose.finance.ofx/bankaccount/) of[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/) of[`LoanAccount`](../../aspose.finance.ofx/loanaccount/) . |
| [IntraTransactionResponses](../../aspose.finance.ofx.bank/intrasyncresponse/intratransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`IntraTransactionResponse`](../intratransactionresponse/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [OfxExtension](../../aspose.finance.ofx.bank/intrasyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank/)
* montage [Aspose.Finance](../../)


