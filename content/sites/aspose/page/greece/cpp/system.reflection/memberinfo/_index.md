---
title: "System::Reflection::MemberInfo κλάση"
linktitle: "MemberInfo"
second_title: "Aspose.Page για C++"
description: "System::Reflection::MemberInfo κλάση. Παρέχει πληροφορίες αντανάκλασης για τα μέλη. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 700
url: /el/cpp/system.reflection/memberinfo/
---
## MemberInfo class


Παρέχει πληροφορίες αντανάκλασης για τα μέλη. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class MemberInfo : public System::Object
```

## Nested classes

* Class [TypeInternal](./typeinternal/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Προσθέτει χαρακτηριστικό στη συλλογή. |
| [get_DeclaringType](./get_declaringtype/)() const | Λαμβάνει τον τύπο που δηλώνει. |
| [get_FullName](./get_fullname/)() const | Λαμβάνει το πλήρες όνομα του μέλους. Μπορεί να διαφέρει σε χειροκίνητα υλοποιημένα τμήματα. |
| virtual [get_MemberType](./get_membertype/)() const | Λαμβάνει μια τιμή [System::Reflection::MemberTypes](../membertypes/) που υποδεικνύει τον τύπο του μέλους - μέθοδο, κατασκευαστή, γεγονός κ.λπ. |
| [get_Name](./get_name/)() const | Λαμβάνει το όνομα του μέλους. |
| [get_ReflectedType](./get_reflectedtype/)() const | Λαμβάνει τον τύπο του αντικατοπτρισμένου τύπου. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Επιστρέφει έναν πίνακα που περιέχει αντικείμενα που αντιπροσωπεύουν όλα τα προσαρμοσμένα χαρακτηριστικά που εφαρμόζονται στον τύπο που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [GetCustomAttributes](./getcustomattributes/)(bool) const | Επιστρέφει έναν πίνακα που περιέχει αντικείμενα που αντιπροσωπεύουν όλα τα προσαρμοσμένα χαρακτηριστικά που εφαρμόζονται στον τύπο που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [ObjectPtr](./objectptr/) | Ψευδώνυμο για έναν κοινόχρηστο δείκτη προς [Object](../../system/object/). |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
