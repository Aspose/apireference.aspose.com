---
title: "System::Net::Cookie class"
linktitle: "Cookie"
second_title: "Aspose.Page για C++"
description: "System::Net::Cookie class. Αντιπροσωπεύει ένα HTTP cookie. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.net/cookie/
---
## Cookie class


Αντιπροσωπεύει ένα HTTP cookie. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class Cookie : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() | Δημιουργεί ένα αντίγραφο της τρέχουσας παρουσίας. |
| [Cookie](./cookie/)() | Δημιουργεί μια νέα παρουσία. |
| [Cookie](./cookie/)(String, String) | Δημιουργεί μια νέα παρουσία. |
| [Cookie](./cookie/)(String, String, String) | Δημιουργεί μια νέα παρουσία. |
| [Cookie](./cookie/)(String, String, String, String) | Δημιουργεί μια νέα παρουσία. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία του C# [Object.Equals](../../system/object/equals/) semantics. |
| [get_Comment](./get_comment/)() const | Ανακτά την τιμή του χαρακτηριστικού 'Comment'. |
| [get_CommentUri](./get_commenturi/)() const | Ανακτά την τιμή του χαρακτηριστικού 'CommentURL'. |
| [get_Discard](./get_discard/)() const | Ανακτά την τιμή του χαρακτηριστικού 'Discard'. |
| [get_Domain](./get_domain/)() const | Ανακτά την τιμή του χαρακτηριστικού 'Domain'. |
| [get_DomainImplicit](./get_domainimplicit/)() | Ανακτά μια τιμή που υποδεικνύει εάν ο τομέας είναι έμμεσο. |
| [get_DomainKey](./get_domainkey/)() const | Επιστρέφει το κλειδί του τομέα. |
| [get_Expired](./get_expired/)() | Ανακτά μια τιμή που υποδεικνύει εάν το cookie έληξε. |
| [get_Expires](./get_expires/)() | Ανακτά την τιμή του χαρακτηριστικού 'Expires'. |
| [get_HttpOnly](./get_httponly/)() const | Ανακτά την τιμή του χαρακτηριστικού 'HttpOnly'. |
| [get_Name](./get_name/)() const | Ανακτά το όνομα του cookie. |
| [get_Path](./get_path/)() const | Ανακτά την τιμή του χαρακτηριστικού 'Path'. |
| [get_Plain](./get_plain/)() const | Επιστρέφει μια τιμή που υποδεικνύει εάν η προδιαγραφή του cookie είναι 'Plain'. |
| [get_Port](./get_port/)() const | Ανακτά την τιμή του χαρακτηριστικού 'Port'. |
| [get_PortList](./get_portlist/)() const | Επιστρέφει τη συλλογή των τιμών του χαρακτηριστικού 'Port'. |
| [get_Secure](./get_secure/)() const | Ανακτά την τιμή του χαρακτηριστικού 'Secure'. |
| [get_TimeStamp](./get_timestamp/)() const | Επιστρέφει την ώρα που δημιουργήθηκε το cookie. |
| [get_Value](./get_value/)() const | Λαμβάνει την τιμή του cookie. |
| [get_Variant](./get_variant/)() const | Λαμβάνει την προδιαγραφή του cookie. |
| [get_Version](./get_version/)() const | Λαμβάνει την τιμή του χαρακτηριστικού '[Version](../../system/version/)' |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| [InternalSetName](./internalsetname/)(String) | Αυτή η μέθοδος καλείται από άλλες μεθόδους για να ορίσει ένα όνομα μεθόδου. |
| [set_Comment](./set_comment/)(String) | Ορίζει την τιμή του χαρακτηριστικού 'Comment'. |
| [set_CommentUri](./set_commenturi/)(System::SharedPtr\<Uri\>) | Ορίζει την τιμή του χαρακτηριστικού 'CommentURL'. |
| [set_Discard](./set_discard/)(bool) | Ορίζει την τιμή του χαρακτηριστικού 'Discard'. |
| [set_Domain](./set_domain/)(String) | Ορίζει την τιμή του χαρακτηριστικού 'Domain'. |
| [set_DomainImplicit](./set_domainimplicit/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν ο τομέας είναι έμμεσο. |
| [set_Expired](./set_expired/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν το cookie έληξε. |
| [set_Expires](./set_expires/)(DateTime) | Ορίζει την τιμή του χαρακτηριστικού 'Expires'. |
| [set_HttpOnly](./set_httponly/)(bool) | Ορίζει την τιμή του χαρακτηριστικού 'HttpOnly'. |
| [set_Name](./set_name/)(String) | Ορίζει το όνομα του cookie. |
| [set_Path](./set_path/)(String) | Ορίζει την τιμή του χαρακτηριστικού 'Path'. |
| [set_Port](./set_port/)(String) | Ορίζει την τιμή του χαρακτηριστικού 'Port'. |
| [set_Secure](./set_secure/)(bool) | Ορίζει την τιμή του χαρακτηριστικού 'Secure'. |
| [set_Value](./set_value/)(String) | Ορίζει την τιμή του cookie. |
| [set_Variant](./set_variant/)(CookieVariant) | Ορίζει την προδιαγραφή του cookie. |
| [set_Version](./set_version/)(int32_t) | Ορίζει την τιμή του χαρακτηριστικού '[Version](../../system/version/)' |
| [ToServerString](./toserverstring/)() | Σειριοποιεί την τρέχουσα παρουσία σε αναπαράσταση συμβολοσειράς. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| [VerifySetDefaults](./verifysetdefaults/)(CookieVariant, System::SharedPtr\<Uri\>, bool, String, bool, bool) | Επαληθεύει και ορίζει τις προεπιλεγμένες τιμές του χαρακτηριστικού. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [CommentAttributeName](./commentattributename/) | Το όνομα του χαρακτηριστικού 'Comment'. |
| static [CommentUrlAttributeName](./commenturlattributename/) | Το όνομα του χαρακτηριστικού 'CommentURL'. |
| static [DiscardAttributeName](./discardattributename/) | Το όνομα του χαρακτηριστικού 'Discard'. |
| static [DomainAttributeName](./domainattributename/) | Το όνομα του χαρακτηριστικού 'Domain'. |
| static [EqualsLiteral](./equalsliteral/) | Ο διαχωριστής που χρησιμοποιείται για να διαχωρίζει το όνομα και την τιμή ενός χαρακτηριστικού. |
| static [ExpiresAttributeName](./expiresattributename/) | Το όνομα του χαρακτηριστικού 'Expires'. |
| static [HttpOnlyAttributeName](./httponlyattributename/) | Το όνομα του χαρακτηριστικού 'HttpOnly'. |
| static [MaxAgeAttributeName](./maxageattributename/) | Το όνομα του χαρακτηριστικού 'Max-Age'. |
| static [MaxSupportedVersion](./maxsupportedversion/) | Πληροφορίες RTTI. |
| static [MaxSupportedVersionString](./maxsupportedversionstring/) | Η συμβολοσειρά που αντιπροσωπεύει τη μέγιστη υποστηριζόμενη έκδοση. |
| static [PathAttributeName](./pathattributename/) | Το όνομα του χαρακτηριστικού 'Path'. |
| static [PortAttributeName](./portattributename/) | Το όνομα του χαρακτηριστικού 'Port'. |
| static [PortSplitDelimiters](./portsplitdelimiters/) | Ο πίνακας που περιέχει διαχωριστικά για τις τιμές του χαρακτηριστικού 'Port'. |
| static [QuotesLiteral](./quotesliteral/) | Το σύμβολο που χρησιμοποιείται για να περικλείει τα μέρη του χαρακτηριστικού. |
| static [ReservedToName](./reservedtoname/) | Μια τιμή που είναι δεσμευμένη για το όνομα του cookie. |
| static [ReservedToValue](./reservedtovalue/) | Μια τιμή που είναι δεσμευμένη για την τιμή του cookie. |
| static [SecureAttributeName](./secureattributename/) | Το όνομα του χαρακτηριστικού 'Secure'. |
| static [SeparatorLiteral](./separatorliteral/) | Ο διαχωριστής χαρακτηριστικών. |
| static [SpecialAttributeLiteral](./specialattributeliteral/) | Το πρόθεμα των ονομάτων των ειδικών χαρακτηριστικών. |
| static [VersionAttributeName](./versionattributename/) | Το όνομα του χαρακτηριστικού '[Έκδοση](../../system/version/)' . |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
