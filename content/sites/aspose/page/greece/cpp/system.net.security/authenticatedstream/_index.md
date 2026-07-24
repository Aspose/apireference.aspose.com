---
title: "System::Net::Security::AuthenticatedStream class"
linktitle: "AuthenticatedStream"
second_title: "Aspose.Page για C++"
description: "System::Net::Security::AuthenticatedStream class. Περιέχει τις μεθόδους για τη μεταφορά διαπιστευτηρίων μέσω μιας ροής. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.net.security/authenticatedstream/
---
## AuthenticatedStream class


Περιέχει τις μεθόδους για τη μεταφορά διαπιστευτηρίων μέσω μιας ροής. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class AuthenticatedStream : public System::IO::Stream
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [get_IsAuthenticated](./get_isauthenticated/)() const | Επιστρέφει μια τιμή που υποδεικνύει εάν η πιστοποίηση πέρασε επιτυχώς. |
| virtual [get_IsEncrypted](./get_isencrypted/)() const | Επιστρέφει μια τιμή που υποδεικνύει εάν τα δεδομένα που αποστέλλονται μέσω αυτής της ροής είναι κρυπτογραφημένα. |
| virtual [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const | Επιστρέφει μια τιμή που υποδεικνύει εάν ένας διακομιστής και ένας πελάτης έχουν πιστοποιηθεί. |
| virtual [get_IsServer](./get_isserver/)() const | Επιστρέφει μια τιμή που υποδεικνύει εάν η τοπική πλευρά της σύνδεσης είναι ο διακομιστής. |
| virtual [get_IsSigned](./get_issigned/)() const | Επιστρέφει μια τιμή που υποδεικνύει εάν τα δεδομένα που αποστέλλονται μέσω αυτής της ροής είναι υπογεγραμμένα. |
| [get_LeaveInnerStreamOpen](./get_leaveinnerstreamopen/)() const | Πληροφορίες RTTI. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Μια ροή χωρίς υποκείμενη αποθήκευση. |
## Δείτε επίσης

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
