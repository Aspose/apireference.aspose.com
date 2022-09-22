---
title: StatementTransaction
second_title: Aspose.Finance per .NET API Reference
description: Questa classe descrive una singola transazione. Identifica il tipo di transazione e la data in cui è stata registrata. La classe può anche fornire informazioni aggiuntive per aiutare il cliente a riconoscere la transazione numero dellassegno nome del beneficiario e memo. La transazione può avere un codice industriale standard che un cliente può utilizzare per classificare la transazione.
type: docs
weight: 5700
url: /it/net/aspose.finance.ofx/statementtransaction/
---
## StatementTransaction class

Questa classe descrive una singola transazione. Identifica il tipo di transazione e la data in cui è stata registrata. La classe può anche fornire informazioni aggiuntive per aiutare il cliente a riconoscere la transazione: numero dell'assegno, nome del beneficiario e memo. La transazione può avere un codice industriale standard che un cliente può utilizzare per classificare la transazione.

```csharp
public class StatementTransaction
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [StatementTransaction](statementtransaction)() | Inizializza una nuova istanza di[`StatementTransaction`](../statementtransaction) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AccountTo](../../aspose.finance.ofx/statementtransaction/accountto) { get; set; } | Ottiene o imposta l'account,[`BankAccount`](../bankaccount) o[`CreditCardAccount`](../creditcardaccount) . |
| [AvailableDate](../../aspose.finance.ofx/statementtransaction/availabledate) { get; set; } | Ottiene o imposta la data in cui i fondi sono disponibili (data valuta). |
| [CheckNumber](../../aspose.finance.ofx/statementtransaction/checknumber) { get; set; } | Ottiene o imposta il numero di controllo. |
| [CorrectFinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/correctfinancialinstitutiontransactionid) { get; set; } | Ottiene o imposta l'ID transazione corretto. Se presente, FinancialInstitutionTransactionId di una transazione inviata in precedenza che viene corretta da questo record. |
| [CorrectiveAction](../../aspose.finance.ofx/statementtransaction/correctiveaction) { get; set; } | Ottiene o imposta l'azione correttiva. |
| [Currency](../../aspose.finance.ofx/statementtransaction/currency) { get; set; } | Ottiene o imposta il[`Currency`](./currency) . |
| [ExtendedName](../../aspose.finance.ofx/statementtransaction/extendedname) { get; set; } | Ottiene o imposta il nome esteso del beneficiario o la descrizione della transazione. |
| [FinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/financialinstitutiontransactionid) { get; set; } | Ottiene o imposta l'ID transazione emesso dall'istituto finanziario. |
| [ImageDatas](../../aspose.finance.ofx/statementtransaction/imagedatas) { get; set; } | Ottiene o imposta la raccolta di[`ImageData`](../imagedata) . |
| [Investment401kSource](../../aspose.finance.ofx/statementtransaction/investment401ksource) { get; set; } | Ottiene o imposta la fonte di denaro per questa transazione. |
| [Memo](../../aspose.finance.ofx/statementtransaction/memo) { get; set; } | Ottiene o imposta le informazioni aggiuntive. |
| [Name](../../aspose.finance.ofx/statementtransaction/name) { get; set; } | Ottiene o imposta il nome del beneficiario o la descrizione della transazione. |
| [OriginCurrency](../../aspose.finance.ofx/statementtransaction/origincurrency) { get; set; } | Ottiene o imposta l'Origine[`Currency`](./currency) . |
| [Payee](../../aspose.finance.ofx/statementtransaction/payee) { get; set; } | Ottiene o imposta il[`Payee`](./payee) . |
| [PayeeId](../../aspose.finance.ofx/statementtransaction/payeeid) { get; set; } | Ottiene o imposta l'identificatore del beneficiario, se disponibile. |
| [PostedDate](../../aspose.finance.ofx/statementtransaction/posteddate) { get; set; } | Ottiene o imposta la data in cui la transazione è stata registrata nell'account. |
| [ReferenceNumber](../../aspose.finance.ofx/statementtransaction/referencenumber) { get; set; } | Ottiene o imposta il numero di riferimento che identifica in modo univoco la transazione. |
| [ServerTransactionId](../../aspose.finance.ofx/statementtransaction/servertransactionid) { get; set; } | Ottiene o imposta l'ID transazione assegnato dal server. |
| [StandardIndustrialCode](../../aspose.finance.ofx/statementtransaction/standardindustrialcode) { get; set; } | Ottiene o imposta il codice industriale standard. |
| [TransactionAmount](../../aspose.finance.ofx/statementtransaction/transactionamount) { get; set; } | Ottiene o imposta l'importo della transazione. |
| [TransactionType](../../aspose.finance.ofx/statementtransaction/transactiontype) { get; set; } | Ottiene o imposta il tipo di transazione. |
| [UserDate](../../aspose.finance.ofx/statementtransaction/userdate) { get; set; } | Ottiene o imposta la data in cui l'utente ha avviato la transazione, se nota. |

### Guarda anche

* spazio dei nomi [Aspose.Finance.Ofx](../../aspose.finance.ofx)
* assemblea [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
