---
title: "System::Net::Http::ByteArrayContent class"
linktitle: "ByteArrayContent"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::ByteArrayContent class. Αντιπροσωπεύει το περιεχόμενο HTTP ως πίνακα byte. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.net.http/bytearraycontent/
---
## ByteArrayContent class


Αντιπροσωπεύει το περιεχόμενο HTTP ως πίνακα byte. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class ByteArrayContent : public System::Net::Http::HttpContent
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>) | Πληροφορίες RTTI. |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | Δημιουργεί μια νέα παρουσία. |
| [TryComputeLength](./trycomputelength/)(int64_t\&) override | Προσπαθεί να υπολογίσει το μήκος του πίνακα byte. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | Η προεπιλεγμένη κωδικοποίηση. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | Ο μέγιστος αριθμός byte. |
## Δείτε επίσης

* Class [HttpContent](../httpcontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
