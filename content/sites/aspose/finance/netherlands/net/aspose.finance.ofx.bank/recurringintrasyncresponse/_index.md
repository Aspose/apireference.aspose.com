---
title: Class RecurringIntraSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.Bank.RecurringIntraSyncResponse klas. Terugkerende synchronisatieresponsklasse voor intrabanktransacties.
type: docs
weight: 600
url: /nl/net/aspose.finance.ofx.bank/recurringintrasyncresponse/
---
## RecurringIntraSyncResponse class

Terugkerende synchronisatieresponsklasse voor intrabanktransacties.

```csharp
public class RecurringIntraSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [RecurringIntraSyncResponse](recurringintrasyncresponse/)() | Initialiseert een nieuw exemplaar van`RecurringIntraSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/recurringintrasyncresponse/accountfrom/) { get; set; } | Haalt of stelt de from van in[`BankAccount`](../../aspose.finance.ofx/bankaccount/) of[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/) of[`LoanAccount`](../../aspose.finance.ofx/loanaccount/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [OfxExtension](../../aspose.finance.ofx.bank/recurringintrasyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [RecurringIntraTransactionResponses](../../aspose.finance.ofx.bank/recurringintrasyncresponse/recurringintratransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`RecurringIntraTransactionResponse`](../recurringintratransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank/)
* montage [Aspose.Finance](../../)


