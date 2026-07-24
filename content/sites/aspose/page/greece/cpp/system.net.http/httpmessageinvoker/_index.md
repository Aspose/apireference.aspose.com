---
title: "System::Net::Http::HttpMessageInvoker κλάση"
linktitle: "HttpMessageInvoker"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::HttpMessageInvoker κλάση. Επιτρέπει στις εφαρμογές να καλούν τη μέθοδο Send σε μια αλυσίδα χειριστών HTTP. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 600
url: /el/cpp/system.net.http/httpmessageinvoker/
---
## HttpMessageInvoker class


Επιτρέπει στις εφαρμογές να καλούν τη μέθοδο Send σε μια αλυσίδα χειριστών HTTP. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class HttpMessageInvoker : public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Dispose](./dispose/)() override | Αποδεσμεύει την τρέχουσα παρουσία. Αυτή η μέθοδος αποδεσμεύει επίσης τον χειριστή εάν απαιτείται. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>) | Πληροφορίες RTTI. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Δημιουργεί μια νέα παρουσία. |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | Αποστέλλει το καθορισμένο αίτημα. |
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
