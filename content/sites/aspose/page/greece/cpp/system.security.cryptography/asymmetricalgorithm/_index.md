---
title: "System::Security::Cryptography::AsymmetricAlgorithm κλάση"
linktitle: "AsymmetricAlgorithm"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::AsymmetricAlgorithm κλάση. Αφηρημένη βασική κλάση για αλγόριθμους ασύμμετρης κρυπτογράφησης. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 200
url: /el/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


Αφηρημένη βασική κλάση για αλγόριθμους ασύμμετρης κρυπτογράφησης. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clear](./clear/)() | Απελευθερώνει όλους τους πόρους. |
| static [Create](./create/)() | Δημιουργεί έναν προεπιλεγμένο αλγόριθμο. Δεν έχει υλοποιηθεί. |
| static [Create](./create/)(const String\&) | Δημιουργεί αλγόριθμο με βάση το όνομα. Δεν έχει υλοποιηθεί. |
| [Dispose](./dispose/)() override | Απελευθερώνει τους πόρους που ανήκουν στο τρέχον αντικείμενο. |
| virtual [FromXmlString](./fromxmlstring/)(String) | Διαβάζει τις παραμέτρους του αλγορίθμου από τη συμβολοσειρά XML. |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | Λαμβάνει τον αλγόριθμο ανταλλαγής κλειδιών που θα χρησιμοποιηθεί. |
| virtual [get_KeySize](./get_keysize/)() | Πληροφορίες RTTI. |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | Λαμβάνει τον πίνακα των επιτρεπόμενων μεγεθών κλειδιών. |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | Λαμβάνει τον αλγόριθμο υπογραφής που θα χρησιμοποιηθεί. |
| virtual [set_KeySize](./set_keysize/)(int32_t) | Ορίζει το μέγεθος κλειδιού. |
| virtual [ToXmlString](./toxmlstring/)(bool) | Γράφει τις παραμέτρους του αλγορίθμου στη συμβολοσειρά XML. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
