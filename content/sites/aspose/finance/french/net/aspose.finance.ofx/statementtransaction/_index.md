---
title: StatementTransaction
second_title: Référence de l'API Aspose.Finance pour .NET
description: Cette classe décrit une seule transaction. Il identifie le type de transaction et la date à laquelle elle a été enregistrée. La classe peut également fournir des informations supplémentaires pour aider le client à reconnaître la transaction  numéro de chèque nom du bénéficiaire et mémo. La transaction peut avoir un code industriel standard quun client peut utiliser pour catégoriser la transaction.
type: docs
weight: 5700
url: /fr/net/aspose.finance.ofx/statementtransaction/
---
## StatementTransaction class

Cette classe décrit une seule transaction. Il identifie le type de transaction et la date à laquelle elle a été enregistrée. La classe peut également fournir des informations supplémentaires pour aider le client à reconnaître la transaction : numéro de chèque, nom du bénéficiaire et mémo. La transaction peut avoir un code industriel standard qu'un client peut utiliser pour catégoriser la transaction.

```csharp
public class StatementTransaction
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [StatementTransaction](statementtransaction)() | Initialise une nouvelle instance de[`StatementTransaction`](../statementtransaction) classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [AccountTo](../../aspose.finance.ofx/statementtransaction/accountto) { get; set; } | Obtient ou définit le compte,[`BankAccount`](../bankaccount) ou[`CreditCardAccount`](../creditcardaccount) . |
| [AvailableDate](../../aspose.finance.ofx/statementtransaction/availabledate) { get; set; } | Obtient ou définit la date à laquelle les fonds sont disponibles (date de valeur). |
| [CheckNumber](../../aspose.finance.ofx/statementtransaction/checknumber) { get; set; } | Obtient ou définit le numéro de chèque. |
| [CorrectFinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/correctfinancialinstitutiontransactionid) { get; set; } | Obtient ou définit l'ID de transaction corrigé. S'il est présent, le FinancialInstitutionTransactionId d'une transaction envoyée précédemment qui est corrigée par cet enregistrement. |
| [CorrectiveAction](../../aspose.finance.ofx/statementtransaction/correctiveaction) { get; set; } | Obtient ou définit l'action corrective. |
| [Currency](../../aspose.finance.ofx/statementtransaction/currency) { get; set; } | Obtient ou définit le[`Currency`](./currency) . |
| [ExtendedName](../../aspose.finance.ofx/statementtransaction/extendedname) { get; set; } | Obtient ou définit le nom étendu du bénéficiaire ou la description de la transaction. |
| [FinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/financialinstitutiontransactionid) { get; set; } | Obtient ou définit l'ID de transaction émis par l'institution financière. |
| [ImageDatas](../../aspose.finance.ofx/statementtransaction/imagedatas) { get; set; } | Obtient ou définit la collection de[`ImageData`](../imagedata) . |
| [Investment401kSource](../../aspose.finance.ofx/statementtransaction/investment401ksource) { get; set; } | Obtient ou définit la source de trésorerie pour cette transaction. |
| [Memo](../../aspose.finance.ofx/statementtransaction/memo) { get; set; } | Obtient ou définit les informations supplémentaires. |
| [Name](../../aspose.finance.ofx/statementtransaction/name) { get; set; } | Obtient ou définit le nom du bénéficiaire ou la description de la transaction. |
| [OriginCurrency](../../aspose.finance.ofx/statementtransaction/origincurrency) { get; set; } | Obtient ou définit l'origine[`Currency`](./currency) . |
| [Payee](../../aspose.finance.ofx/statementtransaction/payee) { get; set; } | Obtient ou définit le[`Payee`](./payee) . |
| [PayeeId](../../aspose.finance.ofx/statementtransaction/payeeid) { get; set; } | Obtient ou définit l'identifiant du bénéficiaire si disponible. |
| [PostedDate](../../aspose.finance.ofx/statementtransaction/posteddate) { get; set; } | Obtient ou définit la date à laquelle la transaction a été enregistrée sur le compte. |
| [ReferenceNumber](../../aspose.finance.ofx/statementtransaction/referencenumber) { get; set; } | Obtient ou définit le numéro de référence qui identifie de manière unique la transaction. |
| [ServerTransactionId](../../aspose.finance.ofx/statementtransaction/servertransactionid) { get; set; } | Obtient ou définit l'ID de transaction attribué au serveur. |
| [StandardIndustrialCode](../../aspose.finance.ofx/statementtransaction/standardindustrialcode) { get; set; } | Obtient ou définit le code industriel standard. |
| [TransactionAmount](../../aspose.finance.ofx/statementtransaction/transactionamount) { get; set; } | Obtient ou définit le montant de la transaction. |
| [TransactionType](../../aspose.finance.ofx/statementtransaction/transactiontype) { get; set; } | Obtient ou définit le type de transaction. |
| [UserDate](../../aspose.finance.ofx/statementtransaction/userdate) { get; set; } | Obtient ou définit la date à laquelle l'utilisateur a lancé la transaction, si elle est connue. |

### Voir également

* espace de noms [Aspose.Finance.Ofx](../../aspose.finance.ofx)
* Assemblée [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
