---
title: "System::Net::CookieCollection κλάση"
linktitle: "CookieCollection"
second_title: "Aspose.Page για C++"
description: "System::Net::CookieCollection κλάση. Αντιπροσωπεύει μια λίστα ταξινομημένων cookie. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 200
url: /el/cpp/system.net/cookiecollection/
---
## CookieCollection class


Αντιπροσωπεύει μια λίστα ταξινομημένων cookie. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class CookieCollection : public System::Collections::Generic::ICollection<System::SharedPtr<System::Net::Cookie>>
```

## Enums

| Απαρίθμηση | Περιγραφή |
| --- | --- |
| [Stamp](./stamp/) | Πληροφορίες RTTI. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Cookie\>\&) override | Προσθέτει ένα cookie στη συλλογή. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | Προσθέτει cookie από τη καθορισμένη συλλογή στην τρέχουσα. |
| [Clear](./clear/)() override | Αφαιρεί όλα τα cookie από τη συλλογή. |
| [Contains](./contains/)(const System::SharedPtr\<Cookie\>\&) const override | Ελέγχει εάν η συλλογή περιέχει το καθορισμένο cookie. |
| [CookieCollection](./cookiecollection/)() | Δημιουργεί μια νέα παρουσία. |
| [get_Count](./get_count/)() const override | Λαμβάνει τον αριθμό των στοιχείων στη συλλογή. |
| [get_IsOtherVersionSeen](./get_isotherversionseen/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η συλλογή περιέχει ένα cookie με έκδοση που δεν είναι ίση με [Cookie::MaxSupportedVersion](../cookie/maxsupportedversion/). |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει τον ενομετρητή. |
| [idx_get](./idx_get/)(int32_t) | Επιστρέφει ένα cookie από τη συλλογή cookie στον καθορισμένο δείκτη. |
| [idx_get](./idx_get/)(String) | Επιστρέφει ένα cookie από τη συλλογή cookie με το καθορισμένο όνομα. |
| [IndexOf](./indexof/)(System::SharedPtr\<Cookie\>) | Επιστρέφει έναν δείκτη του καθορισμένου cookie. |
| [InternalAdd](./internaladd/)(System::SharedPtr\<Cookie\>, bool) | Προσθέτει το καθορισμένο cookie στη συλλογή. |
| [Remove](./remove/)(const System::SharedPtr\<Cookie\>\&) override | Αφαιρεί το καθορισμένο cookie από τη συλλογή. |
| [RemoveAt](./removeat/)(int32_t) | Αφαιρεί ένα cookie στον καθορισμένο δείκτη. |
| [TimeStamp](./timestamp/)(CookieCollection::Stamp) | Ενημερώνει τη χρονική σήμανση βάσει του καθορισμένου σεναρίου και επιστρέφει μια νέα τιμή. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Λαμβάνει την υλοποίηση του begin const iterator για το τρέχον κοντέινερ. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Λαμβάνει την υλοποίηση του begin iterator για το τρέχον κοντέινερ. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Λαμβάνει την υλοποίηση του end const iterator για το τρέχον κοντέινερ. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Λαμβάνει την υλοποίηση του end iterator για το τρέχον κοντέινερ. |
## Δείτε επίσης

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
