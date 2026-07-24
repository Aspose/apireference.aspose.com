---
title: "System::Net::Http::HttpContent class"
linktitle: "HttpContent"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::HttpContent class. Αντιπροσωπεύει το περιεχόμενο μιας οντότητας HTTP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 400
url: /el/cpp/system.net.http/httpcontent/
---
## HttpContent class


Αντιπροσωπεύει το περιεχόμενο μιας οντότητας HTTP. Το [Object](../../system/object/) αυτής της κλάσης πρέπει να δημιουργείται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class HttpContent : public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Dispose](./dispose/)() override | Αποδεσμεύει το τρέχον στιγμιότυπο. Αυτή η μέθοδος αποδεσμεύει επίσης τη ροή που επιστρέφεται από το 'ReadAsStream' και το buffer μνήμης εάν έχει δημιουργηθεί. |
| [get_Headers](./get_headers/)() | Επιστρέφει τις κεφαλίδες περιεχομένου HTTP. |
| [LoadIntoBuffer](./loadintobuffer/)() | Σειριοποιεί το περιεχόμενο σε buffer μνήμης. |
| [LoadIntoBuffer](./loadintobuffer/)(int64_t) | Σειριοποιεί το περιεχόμενο σε buffer μνήμης. |
| [ReadAsByteArray](./readasbytearray/)() | Σειριοποιεί το περιεχόμενο και επιστρέφει έναν πίνακα byte. |
| [ReadAsStream](./readasstream/)() | Σειριοποιεί το περιεχόμενο και επιστρέφει μια ροή. |
| [ReadAsString](./readasstring/)() | Σειριοποιεί το περιεχόμενο και επιστρέφει μια συμβολοσειρά. |
| virtual [TryComputeLength](./trycomputelength/)(int64_t\&) | Προσπαθεί να υπολογίσει το μέγεθος του περιεχομένου. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [DefaultStringEncoding](./defaultstringencoding/) | Η προεπιλεγμένη κωδικοποίηση. |
| static [MaxBufferSize](./maxbuffersize/) | Ο μέγιστος αριθμός byte. |
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
