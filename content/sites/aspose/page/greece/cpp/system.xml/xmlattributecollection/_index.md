---
title: "System::Xml::XmlAttributeCollection class"
linktitle: "XmlAttributeCollection"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlAttributeCollection class. Αντιπροσωπεύει μια συλλογή χαρακτηριστικών που μπορούν να προσπελαστούν κατά όνομα ή δείκτη σε C++."
type: docs
weight: 700
url: /el/cpp/system.xml/xmlattributecollection/
---
## XmlAttributeCollection class


Αναπαριστά μια συλλογή χαρακτηριστικών που μπορούν να προσπελαστούν με όνομα ή δείκτη.

```cpp
class XmlAttributeCollection : public System::Xml::XmlNamedNodeMap
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Append](./append/)(const SharedPtr\<XmlAttribute\>\&) | Εισάγει το καθορισμένο χαρακτηριστικό ως τον τελευταίο κόμβο στη συλλογή. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&, int32_t) | Αντιγράφει όλα τα αντικείμενα [XmlAttribute](../xmlattribute/) από αυτή τη συλλογή στον δεδομένο πίνακα. |
| [idx_get](./idx_get/)(int32_t) | Επιστρέφει το χαρακτηριστικό με το καθορισμένο δείκτη. |
| [idx_get](./idx_get/)(const String\&) | Επιστρέφει το χαρακτηριστικό με το καθορισμένο όνομα. |
| [idx_get](./idx_get/)(const String\&, const String\&) | Επιστρέφει το χαρακτηριστικό με το καθορισμένο τοπικό όνομα και το Uniform Resource Identifier (URI) του χώρου ονομάτων. |
| [InsertAfter](./insertafter/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Εισάγει το καθορισμένο χαρακτηριστικό αμέσως μετά το καθορισμένο χαρακτηριστικό αναφοράς. |
| [InsertBefore](./insertbefore/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Εισάγει το καθορισμένο χαρακτηριστικό αμέσως πριν το καθορισμένο χαρακτηριστικό αναφοράς. |
| [Prepend](./prepend/)(const SharedPtr\<XmlAttribute\>\&) | Εισάγει το καθορισμένο χαρακτηριστικό ως τον πρώτο κόμβο στη συλλογή. |
| [Remove](./remove/)(const SharedPtr\<XmlAttribute\>\&) | Αφαιρεί το καθορισμένο χαρακτηριστικό από τη συλλογή. |
| [RemoveAll](./removeall/)() | Αφαιρεί όλα τα χαρακτηριστικά από τη συλλογή. |
| [RemoveAt](./removeat/)(int32_t) | Αφαιρεί το χαρακτηριστικό που αντιστοιχεί στον καθορισμένο δείκτη από τη συλλογή. |
| [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) override | Προσθέτει ένα [XmlNode](../xmlnode/) χρησιμοποιώντας το αποτέλεσμα του [XmlNode::get_Name](../xmlnode/get_name/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlNamedNodeMap](../xmlnamednodemap/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
