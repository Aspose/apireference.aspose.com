---
title: "System::Security::Cryptography::Oid κλάση"
linktitle: "Oid"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::Oid κλάση. Αναγνωριστικό κρυπτογραφικού αντικειμένου. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2500
url: /el/cpp/system.security.cryptography/oid/
---
## Oid class


Αναγνωριστικό κρυπτογραφικού αντικειμένου. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class Oid : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | Δημιουργήστε αντικείμενο OID από το καθορισμένο φιλικό όνομα OID. |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | Δημιουργήστε αντικείμενο OID από την καθορισμένη τιμή OID. |
| [get_FriendlyName](./get_friendlyname/)() const | Λαμβάνει το φιλικό προς το χρήστη όνομα του αντικειμένου. |
| [get_Value](./get_value/)() const | Λαμβάνει τη συμβολοσειρά αναγνωριστικού του αντικειμένου. |
| [Oid](./oid/)() | Πληροφορίες RTTI. |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | Κατασκευαστής αντιγραφής. |
| [Oid](./oid/)(const String\&) | Κατασκευαστής. |
| [Oid](./oid/)(const String\&, const String\&) | Κατασκευαστής. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Ορίζει το φιλικό προς το χρήστη όνομα του αντικειμένου. |
| [set_Value](./set_value/)(const String\&) | Ορίζει τη συμβολοσειρά αναγνωριστικού του αντικειμένου. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
