---
title: "System::Drawing::Printing::PrintPageEventArgs κλάση"
linktitle: "PrintPageEventArgs"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Printing::PrintPageEventArgs κλάση. Παρέχει δεδομένα για το γεγονός PrintPage. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 900
url: /el/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


Παρέχει δεδομένα για το γεγονός PrintPage. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Graphics](./get_graphics/)() | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [get_HasMorePages](./get_hasmorepages/)() | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [get_PageSettings](./get_pagesettings/)() | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | Δημιουργεί ένα νέο στιγμιότυπο της κλάσης [PrintPageEventArgs](./). |
| [set_HasMorePages](./set_hasmorepages/)(bool) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ένα στατικό μέλος που αντιπροσωπεύει έναν "κενό" [EventArgs](../../system/eventargs/) δείκτη κοινόχρηστου (null-pointer). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [ptr](./ptr/) | Ένα ψευδώνυμο για έναν κοινό δείκτη προς ένα στιγμιότυπο αυτής της κλάσης. |
## Δείτε επίσης

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
