---
title: Class InterSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.InterTransfer.InterSyncResponse klas. Reactieklasse interbancaire transactiesynchronisatie.
type: docs
weight: 2470
url: /nl/net/aspose.finance.ofx.intertransfer/intersyncresponse/
---
## InterSyncResponse class

Reactieklasse interbancaire transactiesynchronisatie.

```csharp
public class InterSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [InterSyncResponse](intersyncresponse/)() | Initialiseert een nieuw exemplaar van`InterSyncResponse` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.intertransfer/intersyncresponse/accountfrom/) { get; set; } | Haalt of stelt de from van in[`BankAccount`](../../aspose.finance.ofx/bankaccount/) of[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/) of[`LoanAccount`](../../aspose.finance.ofx/loanaccount/) . |
| [InterTransactionResponses](../../aspose.finance.ofx.intertransfer/intersyncresponse/intertransactionresponses/) { get; set; } | Haalt of stelt de collectie van[`InterTransactionResponse`](../intertransactionresponse/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [OfxExtension](../../aspose.finance.ofx.intertransfer/intersyncresponse/ofxextension/) { get; set; } | Haalt of stelt de[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* naamruimte [Aspose.Finance.Ofx.InterTransfer](../../aspose.finance.ofx.intertransfer/)
* montage [Aspose.Finance](../../)


