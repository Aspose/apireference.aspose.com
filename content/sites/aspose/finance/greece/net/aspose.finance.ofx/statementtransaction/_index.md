---
title: Class StatementTransaction
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Ofx.StatementTransaction τάξη. Αυτή η κλάση περιγράφει μια μεμονωμένη συναλλαγή. Προσδιορίζει τον τύπο της συναλλαγής και την ημερομηνία ανάρτησής της. Η τάξη μπορεί επίσης να παρέχει πρόσθετες πληροφορίες για να βοηθήσει τον πελάτη να αναγνωρίσει τη συναλλαγή αριθμός επιταγής όνομα δικαιούχου πληρωμής και σημείωμα. Η συναλλαγή μπορεί να έχει έναν Τυπικό Βιομηχανικό Κώδικα που μπορεί να χρησιμοποιήσει ένας πελάτης για να κατηγοριοποιήσει τη συναλλαγή.
type: docs
weight: 5730
url: /el/net/aspose.finance.ofx/statementtransaction/
---
## StatementTransaction class

Αυτή η κλάση περιγράφει μια μεμονωμένη συναλλαγή. Προσδιορίζει τον τύπο της συναλλαγής και την ημερομηνία ανάρτησής της. Η τάξη μπορεί επίσης να παρέχει πρόσθετες πληροφορίες για να βοηθήσει τον πελάτη να αναγνωρίσει τη συναλλαγή: αριθμός επιταγής, όνομα δικαιούχου πληρωμής και σημείωμα. Η συναλλαγή μπορεί να έχει έναν Τυπικό Βιομηχανικό Κώδικα που μπορεί να χρησιμοποιήσει ένας πελάτης για να κατηγοριοποιήσει τη συναλλαγή.

```csharp
public class StatementTransaction
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [StatementTransaction](statementtransaction/)() | Αρχικοποιεί μια νέα παρουσία του`StatementTransaction` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [AccountTo](../../aspose.finance.ofx/statementtransaction/accountto/) { get; set; } | Λαμβάνει ή ορίζει το λογαριασμό,[`BankAccount`](../bankaccount/) ή[`CreditCardAccount`](../creditcardaccount/) . |
| [AvailableDate](../../aspose.finance.ofx/statementtransaction/availabledate/) { get; set; } | Λαμβάνει ή ορίζει την ημερομηνία που τα χρήματα είναι διαθέσιμα (ημερομηνία αξίας). |
| [CheckNumber](../../aspose.finance.ofx/statementtransaction/checknumber/) { get; set; } | Λαμβάνει ή ορίζει τον αριθμό επιταγής. |
| [CorrectFinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/correctfinancialinstitutiontransactionid/) { get; set; } | Λαμβάνει ή ορίζει το διορθωμένο αναγνωριστικό συναλλαγής. Εάν υπάρχει, το FinancialInstitutionTransactionId μιας συναλλαγής που είχε σταλεί προηγουμένως που έχει διορθωθεί από αυτήν την εγγραφή. |
| [CorrectiveAction](../../aspose.finance.ofx/statementtransaction/correctiveaction/) { get; set; } | Λαμβάνει ή ορίζει τη διορθωτική ενέργεια. |
| [Currency](../../aspose.finance.ofx/statementtransaction/currency/) { get; set; } | Λαμβάνει ή ορίζει το[`Currency`](./currency/) . |
| [ExtendedName](../../aspose.finance.ofx/statementtransaction/extendedname/) { get; set; } | Λαμβάνει ή ορίζει το διευρυμένο όνομα του δικαιούχου πληρωμής ή την περιγραφή της συναλλαγής. |
| [FinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/financialinstitutiontransactionid/) { get; set; } | Λαμβάνει ή ορίζει το αναγνωριστικό συναλλαγής που εκδίδεται από το χρηματοπιστωτικό ίδρυμα. |
| [ImageDatas](../../aspose.finance.ofx/statementtransaction/imagedatas/) { get; set; } | Λαμβάνει ή ορίζει τη συλλογή του[`ImageData`](../imagedata/) . |
| [Investment401kSource](../../aspose.finance.ofx/statementtransaction/investment401ksource/) { get; set; } | Λαμβάνει ή ορίζει την πηγή μετρητών για αυτήν τη συναλλαγή. |
| [Memo](../../aspose.finance.ofx/statementtransaction/memo/) { get; set; } | Λαμβάνει ή ορίζει τις επιπλέον πληροφορίες. |
| [Name](../../aspose.finance.ofx/statementtransaction/name/) { get; set; } | Λαμβάνει ή ορίζει το όνομα του δικαιούχου πληρωμής ή την περιγραφή της συναλλαγής. |
| [OriginCurrency](../../aspose.finance.ofx/statementtransaction/origincurrency/) { get; set; } | Λαμβάνει ή ορίζει το Origin[`Currency`](./currency/) . |
| [Payee](../../aspose.finance.ofx/statementtransaction/payee/) { get; set; } | Λαμβάνει ή ορίζει το[`Payee`](./payee/) . |
| [PayeeId](../../aspose.finance.ofx/statementtransaction/payeeid/) { get; set; } | Λαμβάνει ή ορίζει το αναγνωριστικό δικαιούχου πληρωμής εάν είναι διαθέσιμο. |
| [PostedDate](../../aspose.finance.ofx/statementtransaction/posteddate/) { get; set; } | Λαμβάνει ή ορίζει την ημερομηνία δημοσίευσης της συναλλαγής στον λογαριασμό. |
| [ReferenceNumber](../../aspose.finance.ofx/statementtransaction/referencenumber/) { get; set; } | Λαμβάνει ή ορίζει τον αριθμό αναφοράς που προσδιορίζει μοναδικά τη συναλλαγή. |
| [ServerTransactionId](../../aspose.finance.ofx/statementtransaction/servertransactionid/) { get; set; } | Λαμβάνει ή ορίζει το αναγνωριστικό συναλλαγής που έχει εκχωρηθεί στον διακομιστή. |
| [StandardIndustrialCode](../../aspose.finance.ofx/statementtransaction/standardindustrialcode/) { get; set; } | Λαμβάνει ή ορίζει τον Τυπικό Βιομηχανικό Κώδικα. |
| [TransactionAmount](../../aspose.finance.ofx/statementtransaction/transactionamount/) { get; set; } | Λαμβάνει ή ορίζει το ποσό της συναλλαγής. |
| [TransactionType](../../aspose.finance.ofx/statementtransaction/transactiontype/) { get; set; } | Λαμβάνει ή ορίζει τον τύπο συναλλαγής. |
| [UserDate](../../aspose.finance.ofx/statementtransaction/userdate/) { get; set; } | Λαμβάνει ή ορίζει την ημερομηνία έναρξης της συναλλαγής από τον χρήστη, εάν είναι γνωστή. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Finance.Ofx](../../aspose.finance.ofx/)
* συνέλευση [Aspose.Finance](../../)


