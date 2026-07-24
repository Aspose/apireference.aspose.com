---
title: "System::Xml::Serialization::XmlSerializerNamespaces κλάση"
linktitle: "XmlSerializerNamespaces"
second_title: "Aspose.Page για C++"
description: "System::Xml::Serialization::XmlSerializerNamespaces κλάση. Περιέχει τους χώρους ονομάτων XML και τα προθέματα που το Serialization::XmlSerializer χρησιμοποιεί για τη δημιουργία πλήρων ονομάτων σε ένα παράδειγμα XML-εγγράφου σε C++."
type: docs
weight: 800
url: /el/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


Περιέχει τους χώρους ονομάτων XML και τα προθέματα που το [Serialization::XmlSerializer](../xmlserializer/) χρησιμοποιεί για τη δημιουργία πλήρων ονομάτων σε ένα παράδειγμα XML-εγγράφου.

```cpp
class XmlSerializerNamespaces : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Προσθέτει ένα πρόθεμα και ένα ζεύγος χώρου ονομάτων σε ένα αντικείμενο [Serialization::XmlSerializerNamespaces](./). |
| [get_Count](./get_count/)() | Επιστρέφει τον αριθμό των προθεμάτων και ζευγών χώρων ονομάτων στη συλλογή. |
| [get_NamespaceList](./get_namespacelist/)() |  |
| [get_Namespaces](./get_namespaces/)() |  |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<Collections::Generic::Dictionary\<String, String\>\>\&) |  |
| [ToArray](./toarray/)() | Επιστρέφει τον πίνακα των προθεμάτων και ζευγών χώρων ονομάτων σε ένα αντικείμενο [Serialization::XmlSerializerNamespaces](./). |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | Δημιουργεί μια νέα παρουσία της κλάσης [Serialization::XmlSerializerNamespaces](./). |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | Δημιουργεί μια νέα παρουσία της κλάσης [Serialization::XmlSerializerNamespaces](./), χρησιμοποιώντας την καθορισμένη παρουσία του **[XmlSerializerNamespaces](./)** που περιέχει τη συλλογή των προθεμάτων και ζευγών χώρων ονομάτων. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Δημιουργεί μια νέα παρουσία της κλάσης [Serialization::XmlSerializerNamespaces](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
