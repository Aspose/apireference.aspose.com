---
title: "System::ComponentModel::BackgroundWorker κλάση"
linktitle: "BackgroundWorker"
second_title: "Aspose.Page για C++"
description: "System::ComponentModel::BackgroundWorker κλάση. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 200
url: /el/cpp/system.componentmodel/backgroundworker/
---
## BackgroundWorker class


Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class BackgroundWorker : public System::ComponentModel::Component
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [BackgroundWorker](./backgroundworker/)() | Πληροφορίες RTTI. |
| [get_WorkerReportsProgress](./get_workerreportsprogress/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν το [System::ComponentModel::BackgroundWorker](./) μπορεί να αναφέρει ενημερώσεις προόδου. |
| [ReportProgress](./reportprogress/)(int) | Ενεργοποιεί το συμβάν **System::ComponentModel::BackgroundWorker::ProgressChanged**. |
| [ReportProgress](./reportprogress/)(int, const System::SharedPtr\<System::Object\>\&) | Ενεργοποιεί το συμβάν **System::ComponentModel::BackgroundWorker::ProgressChanged** με αντικείμενο userState. |
| [RunWorkerAsync](./runworkerasync/)() | Ξεκινά την εκτέλεση μιας λειτουργίας στο παρασκήνιο. |
| [RunWorkerAsync](./runworkerasync/)(const System::SharedPtr\<System::Object\>\&) | Ξεκινά την εκτέλεση μιας λειτουργίας στο παρασκήνιο. |
| [set_WorkerReportsProgress](./set_workerreportsprogress/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν το [System::ComponentModel::BackgroundWorker](./) μπορεί να αναφέρει ενημερώσεις προόδου. |
| [~BackgroundWorker](./~backgroundworker/)() | Καταστροφέας. |
## Δείτε επίσης

* Class [Component](../component/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
