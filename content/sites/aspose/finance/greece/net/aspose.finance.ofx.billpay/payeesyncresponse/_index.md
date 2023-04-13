---
title: Class PayeeSyncResponse
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Ofx.BillPay.PayeeSyncResponse τάξη. Κατηγορία απόκρισης συγχρονισμού λίστας δικαιούχων.
type: docs
weight: 1020
url: /el/net/aspose.finance.ofx.billpay/payeesyncresponse/
---
## PayeeSyncResponse class

Κατηγορία απόκρισης συγχρονισμού λίστας δικαιούχων.

```csharp
public class PayeeSyncResponse : AbstractSyncResponse
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [PayeeSyncResponse](payeesyncresponse/)() | Αρχικοποιεί μια νέα παρουσία του`PayeeSyncResponse` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ναι, εάν το διακριτικό στο αίτημα συγχρονισμού είναι παλαιότερο από την παλαιότερη καταχώριση στον πίνακα ιστορικού του διακομιστή. Σε αυτήν την περίπτωση, ορισμένες απαντήσεις έχουν χαθεί. Όχι εάν το διακριτικό στο αίτημα συγχρονισμού είναι νεότερο ή ταιριάζει με ένα διακριτικό στον διακομιστή πίνακας ιστορικού. |
| [OfxExtension](../../aspose.finance.ofx.billpay/payeesyncresponse/ofxextension/) { get; set; } | Λαμβάνει ή ορίζει το[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [PayeeTransactionResponses](../../aspose.finance.ofx.billpay/payeesyncresponse/payeetransactionresponses/) { get; set; } | Λαμβάνει ή ορίζει τη συλλογή του[`PayeeTransactionResponse`](../payeetransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Λαμβάνει ή ορίζει το νέο διακριτικό συγχρονισμού. |

### Δείτε επίσης

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* χώρος ονομάτων [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay/)
* συνέλευση [Aspose.Finance](../../)


