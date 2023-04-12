---
title: Class RecurringInterSyncResponse
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Ofx.InterTransfer.RecurringInterSyncResponse τάξη. Κλάση απόκρισης συγχρονισμού επαναλαμβανόμενων διατραπεζικών συναλλαγών.
type: docs
weight: 2570
url: /el/net/aspose.finance.ofx.intertransfer/recurringintersyncresponse/
---
## RecurringInterSyncResponse class

Κλάση απόκρισης συγχρονισμού επαναλαμβανόμενων διατραπεζικών συναλλαγών.

```csharp
public class RecurringInterSyncResponse : AbstractSyncResponse
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [RecurringInterSyncResponse](recurringintersyncresponse/)() | Αρχικοποιεί μια νέα παρουσία του`RecurringInterSyncResponse` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/accountfrom/) { get; set; } | Λαμβάνει ή ορίζει το από του[`BankAccount`](../../aspose.finance.ofx/bankaccount/) ή[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/) ή[`LoanAccount`](../../aspose.finance.ofx/loanaccount/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ναι, εάν το διακριτικό στο αίτημα συγχρονισμού είναι παλαιότερο από την παλαιότερη καταχώριση στον πίνακα ιστορικού του διακομιστή. Σε αυτήν την περίπτωση, ορισμένες απαντήσεις έχουν χαθεί. Όχι εάν το διακριτικό στο αίτημα συγχρονισμού είναι νεότερο ή ταιριάζει με ένα διακριτικό στον διακομιστή πίνακας ιστορικού. |
| [OfxExtension](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/ofxextension/) { get; set; } | Λαμβάνει ή ορίζει το[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [RecurringInterTransactionResponses](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/recurringintertransactionresponses/) { get; set; } | Λαμβάνει ή ορίζει τη συλλογή του[`RecurringInterTransactionResponse`](../recurringintertransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Λαμβάνει ή ορίζει το νέο διακριτικό συγχρονισμού. |

### Δείτε επίσης

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* χώρος ονομάτων [Aspose.Finance.Ofx.InterTransfer](../../aspose.finance.ofx.intertransfer/)
* συνέλευση [Aspose.Finance](../../)


