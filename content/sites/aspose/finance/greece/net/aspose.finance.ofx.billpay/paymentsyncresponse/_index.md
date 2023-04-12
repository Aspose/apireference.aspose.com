---
title: Class PaymentSyncResponse
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Ofx.BillPay.PaymentSyncResponse τάξη. Κλάση απόκρισης συγχρονισμού πληρωμών.
type: docs
weight: 1250
url: /el/net/aspose.finance.ofx.billpay/paymentsyncresponse/
---
## PaymentSyncResponse class

Κλάση απόκρισης συγχρονισμού πληρωμών.

```csharp
public class PaymentSyncResponse : AbstractSyncResponse
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [PaymentSyncResponse](paymentsyncresponse/)() | Αρχικοποιεί μια νέα παρουσία του`PaymentSyncResponse` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [BankAccountFrom](../../aspose.finance.ofx.billpay/paymentsyncresponse/bankaccountfrom/) { get; set; } | Λαμβάνει ή ορίζει το από του[`BankAccount`](../../aspose.finance.ofx/bankaccount/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ναι, εάν το διακριτικό στο αίτημα συγχρονισμού είναι παλαιότερο από την παλαιότερη καταχώριση στον πίνακα ιστορικού του διακομιστή. Σε αυτήν την περίπτωση, ορισμένες απαντήσεις έχουν χαθεί. Όχι εάν το διακριτικό στο αίτημα συγχρονισμού είναι νεότερο ή ταιριάζει με ένα διακριτικό στον διακομιστή πίνακας ιστορικού. |
| [OfxExtension](../../aspose.finance.ofx.billpay/paymentsyncresponse/ofxextension/) { get; set; } | Λαμβάνει ή ορίζει το[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [PaymentTransactionResponses](../../aspose.finance.ofx.billpay/paymentsyncresponse/paymenttransactionresponses/) { get; set; } | Λαμβάνει ή ορίζει τη συλλογή του[`PaymentTransactionResponse`](../paymenttransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Λαμβάνει ή ορίζει το νέο διακριτικό συγχρονισμού. |

### Δείτε επίσης

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* χώρος ονομάτων [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay/)
* συνέλευση [Aspose.Finance](../../)


