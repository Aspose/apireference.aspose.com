---
title: "System::Security::SecurityElement κλάση"
linktitle: "SecurityElement"
second_title: "Aspose.Page για C++"
description: "System::Security::SecurityElement κλάση. Μοντέλο αντικειμένου XML για κωδικοποίηση αντικειμένου ασφαλείας. Δεν είναι υλοποιημένο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 300
url: /el/cpp/system.security/securityelement/
---
## SecurityElement class


Μοντέλο αντικειμένου XML για κωδικοποίηση αντικειμένου ασφαλείας. Δεν είναι υλοποιημένο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class SecurityElement : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddAttribute](./addattribute/)(const String\&, const String\&) | Προσθέτει χαρακτηριστικό στην ετικέτα. |
| [AddChild](./addchild/)(SecurityElement) | Προσθέτει υποετικέτα. |
| [Attribute](./attribute/)(const String\&) | Λαμβάνει την τιμή του χαρακτηριστικού. |
| [Copy](./copy/)() | Κλωνοποιεί την ετικέτα. |
| [Equal](./equal/)(SecurityElement) | Ελέγχει την ισότητα των παραμέτρων. |
| static [Escape](./escape/)(const String\&) | Κάνει escape χαρακτήρων σε συμβολοσειρά XML. |
| static [FromString](./fromstring/)(const String\&) | Δημιουργεί στοιχείο από κώδικα XML. |
| [get_Attributes](./get_attributes/)() | Λαμβάνει τα χαρακτηριστικά της ετικέτας. |
| [get_Children](./get_children/)() | Λαμβάνει τα υπο-αντικείμενα της ετικέτας. |
| [get_Tag](./get_tag/)() | Λαμβάνει το όνομα της ετικέτας. |
| [get_Text](./get_text/)() | Λαμβάνει το εσωτερικό κείμενο της ετικέτας. |
| static [IsValidAttributeName](./isvalidattributename/)(const String\&) | Ελέγχει εάν το όνομα του χαρακτηριστικού είναι έγκυρο. |
| static [IsValidAttributeValue](./isvalidattributevalue/)(const String\&) | Ελέγχει εάν η τιμή του χαρακτηριστικού είναι έγκυρη. |
| static [IsValidTag](./isvalidtag/)(const String\&) | Ελέγχει εάν η ετικέτα είναι έγκυρη. |
| static [IsValidText](./isvalidtext/)(const String\&) | Ελέγχει αν το κείμενο είναι έγκυρο. |
| [SearchForChildByTag](./searchforchildbytag/)(const String\&) | Λαμβάνει την ετικέτα-παιδί με το όνομα. |
| [SearchForTextOfTag](./searchfortextoftag/)(const String\&) | Λαμβάνει το εσωτερικό κείμενο της ετικέτας-παιδιού με βάση το όνομα της ετικέτας. |
| [SecurityElement](./securityelement/)(const String\&) | Κατασκευαστής. |
| [SecurityElement](./securityelement/)(const String\&, const String\&) | Κατασκευαστής. |
| [set_Attributes](./set_attributes/)(System::Collections::Generic::Dictionary\<String, String\>) | Ορίζει τα χαρακτηριστικά της ετικέτας. |
| [set_Children](./set_children/)(System::Collections::Generic::List\<SecurityElement\>) | Ορίζει τα αντικείμενα-παιδιά της ετικέτας. |
| [set_Tag](./set_tag/)(const String\&) | Ορίζει το όνομα της ετικέτας. |
| [set_Text](./set_text/)(const String\&) | Ορίζει το εσωτερικό κείμενο της ετικέτας. |
| [ToString](./tostring/)() const override | Μετατρέπει την ετικέτα σε συμβολοσειρά. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
