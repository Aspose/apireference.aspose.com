---
title: InterSyncResponse
second_title: Référence de l'API Aspose.Finance pour .NET
description: Classe de réponse de synchronisation des transactions interbancaires.
type: docs
weight: 2460
url: /fr/net/aspose.finance.ofx.intertransfer/intersyncresponse/
---
## InterSyncResponse class

Classe de réponse de synchronisation des transactions interbancaires.

```csharp
public class InterSyncResponse : AbstractSyncResponse
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [InterSyncResponse](intersyncresponse)() | Initialise une nouvelle instance de[`InterSyncResponse`](../intersyncresponse) classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.intertransfer/intersyncresponse/accountfrom) { get; set; } | Obtient ou définit le de[`BankAccount`](../../aspose.finance.ofx/bankaccount) ou[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount) ou[`LoanAccount`](../../aspose.finance.ofx/loanaccount) . |
| [InterTransactionResponses](../../aspose.finance.ofx.intertransfer/intersyncresponse/intertransactionresponses) { get; set; } | Obtient ou définit la collection de[`InterTransactionResponse`](../intertransactionresponse) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | Oui si le jeton de la demande de synchronisation est plus ancien que la première entrée de la table d'historique du serveur. Dans ce cas, certaines réponses ont été perdues. Non si le jeton de la demande de synchronisation est plus récent que ou correspond à un jeton de la table d'historique du serveur. table d'historique. |
| [OfxExtension](../../aspose.finance.ofx.intertransfer/intersyncresponse/ofxextension) { get; set; } | Obtient ou définit le[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | Obtient ou définit le nouveau jeton de synchronisation. |

### Voir également

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse)
* espace de noms [Aspose.Finance.Ofx.InterTransfer](../../aspose.finance.ofx.intertransfer)
* Assemblée [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
