---
title: "System::Xml::XmlDocumentFragment κλάση"
linktitle: "XmlDocumentFragment"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlDocumentFragment κλάση. Αντιπροσωπεύει ένα ελαφρύ αντικείμενο που είναι χρήσιμο για λειτουργίες εισαγωγής δέντρου σε C++."
type: docs
weight: 1500
url: /el/cpp/system.xml/xmldocumentfragment/
---
## XmlDocumentFragment class


Αναπαριστά ένα ελαφρύ αντικείμενο που είναι χρήσιμο για λειτουργίες εισαγωγής δέντρου.

```cpp
class XmlDocumentFragment : public System::Xml::XmlNode
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Δημιουργεί ένα αντίγραφο αυτού του κόμβου. |
| [get_InnerXml](./get_innerxml/)() override | Επιστρέφει την σήμανση που αντιπροσωπεύει τα παιδιά αυτού του κόμβου. |
| [get_LocalName](./get_localname/)() override | Επιστρέφει το τοπικό όνομα του κόμβου. |
| [get_Name](./get_name/)() override | Επιστρέφει το πλήρες όνομα του κόμβου. |
| [get_NodeType](./get_nodetype/)() override | Επιστρέφει τον τύπο του τρέχοντος κόμβου. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Επιστρέφει το [XmlDocument](../xmldocument/) στο οποίο ανήκει αυτός ο κόμβος. |
| [set_InnerXml](./set_innerxml/)(String) override | Ορίζει τη σύνταξη που αντιπροσωπεύει τα παιδιά αυτού του κόμβου. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει όλα τα παιδιά του κόμβου στον καθορισμένο [XmlWriter](../xmlwriter/). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει τον κόμβο στον καθορισμένο [XmlWriter](../xmlwriter/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
