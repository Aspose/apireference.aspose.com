---
title: Class BillPayMessageSetV1
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Ofx.Profile.BillPayMessageSetV1 τάξη. Έκδοση 1 του σετ μηνυμάτων πληρωμής λογαριασμού.
type: docs
weight: 4420
url: /el/net/aspose.finance.ofx.profile/billpaymessagesetv1/
---
## BillPayMessageSetV1 class

Έκδοση 1 του σετ μηνυμάτων πληρωμής λογαριασμού.

```csharp
public class BillPayMessageSetV1 : AbstractMessageSetVersion
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [BillPayMessageSetV1](billpaymessagesetv1/)() | Αρχικοποιεί μια νέα παρουσία του`BillPayMessageSetV1` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [BillPresentmentContext](../../aspose.finance.ofx.profile/billpaymessagesetv1/billpresentmentcontext/) { get; set; } | Λαμβάνει ή ορίζει εάν ο πάροχος πληρωμών υποστηρίζει πληροφορίες περιβάλλοντος παρουσίασης λογαριασμών στις πράξεις πληρωμής. |
| [CanAddPayee](../../aspose.finance.ofx.profile/billpaymessagesetv1/canaddpayee/) { get; set; } | Λαμβάνει ή ορίζει εάν ο χρήστης μπορεί να προσθέσει payees.if false, ο χρήστης περιορίζεται στους δικαιούχους πληρωμής που προστίθενται στη λίστα δικαιούχων του χρήστη από το σύστημα πληρωμών. |
| [CanModificationModels](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationmodels/) { get; set; } | Λαμβάνει ή ορίζει εάν επιτρέπει τροποποιήσεις σε μοντέλα. |
| [CanModificationPayments](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationpayments/) { get; set; } | Λαμβάνει ή ορίζει εάν επιτρέπει τροποποιήσεις σε πληρωμές. |
| [DaysWithdrawal](../../aspose.finance.ofx.profile/billpaymessagesetv1/dayswithdrawal/) { get; set; } | Λαμβάνει ή ορίζει τη μετατόπιση στην ημερομηνία ανάληψης. |
| [DefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/defaultdaystopay/) { get; set; } | Λαμβάνει ή ορίζει τον προεπιλεγμένο αριθμό ημερών για πληρωμή με επιταγή (εκτός από μεταφορά). |
| [DifferentFirstPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentfirstpayment/) { get; set; } | Λαμβάνει ή ορίζει εάν υποστήριξη για τον καθορισμό διαφορετικού ποσού για την πρώτη πληρωμή που δημιουργείται από ένα model |
| [DifferentLastPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentlastpayment/) { get; set; } | Λαμβάνει ή ορίζει εάν υποστήριξη για τον καθορισμό διαφορετικού ποσού για την τελευταία πληρωμή που δημιουργήθηκε από ένα model |
| [HasExtendedPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/hasextendedpayment/) { get; set; } | Λαμβάνει ή ορίζει εάν υποστηρίζει την επιχειρηματική πληρωμή ExtendedPayment. |
| [MessageSetCore](../../aspose.finance.ofx.profile/abstractmessagesetversion/messagesetcore/) { get; set; } | Λαμβάνει ή ορίζει το[`MessageSetCore`](../abstractmessagesetversion/messagesetcore/) . |
| [ModelWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/modelwindow/) { get; set; } | Λαμβάνει ή ορίζει το παράθυρο μοντέλου. ο αριθμός των ημερών πριν από την προγραμματισμένη επεξεργασία μιας επαναλαμβανόμενης συναλλαγής που έχει δημιουργηθεί στο σύστημα. |
| [PaymentByAddress](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbyaddress/) { get; set; } | Λαμβάνει ή ορίζει εάν υποστηρίζει πληρωμές σε δικαιούχους πληρωμής που προσδιορίζονται από τη διεύθυνση χρέωσης, δηλαδή την[`Payee`](../../aspose.finance.ofx/payee/) . |
| [PaymentByPayeeId](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbypayeeid/) { get; set; } | Λαμβάνει ή ορίζει εάν υποστηρίζει πληρωμές σε δικαιούχους πληρωμής που προσδιορίζονται από ένα αναγνωριστικό δικαιούχου πληρωμής που παρέχεται από διακομιστή. |
| [PaymentByTransfer](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbytransfer/) { get; set; } | Λαμβάνει ή ορίζει εάν οι πληρωμές σε δικαιούχους πληρωμής προσδιορίζονται από λογαριασμό προορισμού |
| [PostProcessWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/postprocesswindow/) { get; set; } | Λαμβάνει ή ορίζει τον αριθμό των ημερών μετά την επεξεργασία μιας συναλλαγής που είναι προσβάσιμη για ερωτήματα κατάστασης. |
| [ProcessingDaysOffs](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingdaysoffs/) { get; set; } | Λαμβάνει ή ορίζει τις ημέρες της εβδομάδας που δεν πραγματοποιείται καμία επεξεργασία. |
| [ProcessingEndTime](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingendtime/) { get; set; } | Λαμβάνει ή ορίζει την ώρα της ημέρας που τελειώνει η επεξεργασία εκείνης της ημέρας. |
| [StatusViaMods](../../aspose.finance.ofx.profile/billpaymessagesetv1/statusviamods/) { get; set; } | Εάν αληθεύει, ο διακομιστής υποστηρίζει την επικοινωνία των αλλαγών κατάστασης πληρωμής που εκκινούνται από διακομιστή μέσω του μηνύματος PaymentModResponse. |
| [TransferDaysWithdraw](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdayswithdraw/) { get; set; } | Λαμβάνει ή ορίζει τον αριθμό των ημερών πριν από την ημερομηνία επεξεργασίας κατά τις οποίες τα χρήματα αποσύρονται για πληρωμή μέσω μεταφοράς. |
| [TransferDefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdefaultdaystopay/) { get; set; } | Λαμβάνει ή ορίζει τον προεπιλεγμένο αριθμό ημερών για πληρωμή με έμβασμα. |

### Δείτε επίσης

* class [AbstractMessageSetVersion](../abstractmessagesetversion/)
* χώρος ονομάτων [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile/)
* συνέλευση [Aspose.Finance](../../)


