---
title: Class RecurringInterSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.InterTransfer.RecurringInterSyncResponse klas. Terugkerende interbancaire transactiesynchronisatie responsklasse.
type: docs
weight: 2570
url: /nl/net/aspose.finance.ofx.intertransfer/recurringintersyncresponse/
---
## RecurringInterSyncResponse class

Terugkerende interbancaire transactiesynchronisatie responsklasse.

```csharp
public class RecurringInterSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [RecurringInterSyncResponse](recurringintersyncresponse/)() | Initialiseert een nieuw exemplaar van`RecurringInterSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/accountfrom/) { get; set; } | Haalt of stelt de from van in[`BankAccount`](../../aspose.finance.ofx/bankaccount/) of[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/) of[`LoanAccount`](../../aspose.finance.ofx/loanaccount/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [OfxExtension](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [RecurringInterTransactionResponses](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/recurringintertransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`RecurringInterTransactionResponse`](../recurringintertransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.InterTransfer](../../aspose.finance.ofx.intertransfer/)
* montage [Aspose.Finance](../../)


