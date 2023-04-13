---
title: Class RecurringIntraSyncResponse
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Ofx.Bank.RecurringIntraSyncResponse τάξη. Κλάση απόκρισης συγχρονισμού επαναλαμβανόμενων ενδοτραπεζικών συναλλαγών.
type: docs
weight: 600
url: /el/net/aspose.finance.ofx.bank/recurringintrasyncresponse/
---
## RecurringIntraSyncResponse class

Κλάση απόκρισης συγχρονισμού επαναλαμβανόμενων ενδοτραπεζικών συναλλαγών.

```csharp
public class RecurringIntraSyncResponse : AbstractSyncResponse
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [RecurringIntraSyncResponse](recurringintrasyncresponse/)() | Αρχικοποιεί μια νέα παρουσία του`RecurringIntraSyncResponse` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/recurringintrasyncresponse/accountfrom/) { get; set; } | Λαμβάνει ή ορίζει το από του[`BankAccount`](../../aspose.finance.ofx/bankaccount/) ή[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/) ή[`LoanAccount`](../../aspose.finance.ofx/loanaccount/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ναι, εάν το διακριτικό στο αίτημα συγχρονισμού είναι παλαιότερο από την παλαιότερη καταχώριση στον πίνακα ιστορικού του διακομιστή. Σε αυτήν την περίπτωση, ορισμένες απαντήσεις έχουν χαθεί. Όχι εάν το διακριτικό στο αίτημα συγχρονισμού είναι νεότερο ή ταιριάζει με ένα διακριτικό στον διακομιστή πίνακας ιστορικού. |
| [OfxExtension](../../aspose.finance.ofx.bank/recurringintrasyncresponse/ofxextension/) { get; set; } | Λαμβάνει ή ορίζει το[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [RecurringIntraTransactionResponses](../../aspose.finance.ofx.bank/recurringintrasyncresponse/recurringintratransactionresponses/) { get; set; } | Λαμβάνει ή ορίζει τη συλλογή του[`RecurringIntraTransactionResponse`](../recurringintratransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Λαμβάνει ή ορίζει το νέο διακριτικό συγχρονισμού. |

### Δείτε επίσης

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* χώρος ονομάτων [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank/)
* συνέλευση [Aspose.Finance](../../)


