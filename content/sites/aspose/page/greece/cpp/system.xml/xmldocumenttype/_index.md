---
title: "System::Xml::XmlDocumentType κλάση"
linktitle: "XmlDocumentType"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlDocumentType κλάση. Αντιπροσωπεύει τη δήλωση τύπου εγγράφου σε C++."
type: docs
weight: 1600
url: /el/cpp/system.xml/xmldocumenttype/
---
## XmlDocumentType class


Αναπαριστά τη δήλωση τύπου εγγράφου.

```cpp
class XmlDocumentType : public System::Xml::XmlLinkedNode
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Δημιουργεί ένα αντίγραφο αυτού του κόμβου. |
| [get_Entities](./get_entities/)() | Επιστρέφει τη συλλογή των κόμβων [XmlEntity](../xmlentity/) που δηλώνονται στη δήλωση τύπου εγγράφου. |
| [get_InternalSubset](./get_internalsubset/)() | Επιστρέφει την τιμή του εσωτερικού υποσυνόλου του ορισμού τύπου εγγράφου (DTD) στη δήλωση DOCTYPE. |
| [get_IsReadOnly](./get_isreadonly/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο κόμβος είναι μόνο για ανάγνωση. |
| [get_LocalName](./get_localname/)() override | Επιστρέφει το τοπικό όνομα του κόμβου. |
| [get_Name](./get_name/)() override | Επιστρέφει το πλήρες όνομα του κόμβου. |
| [get_NodeType](./get_nodetype/)() override | Επιστρέφει τον τύπο του τρέχοντος κόμβου. |
| [get_Notations](./get_notations/)() | Επιστρέφει τη συλλογή των κόμβων [XmlNotation](../xmlnotation/) που υπάρχουν στη δήλωση τύπου εγγράφου. |
| [get_PublicId](./get_publicid/)() | Επιστρέφει την τιμή του δημόσιου αναγνωριστικού στη δήλωση DOCTYPE. |
| [get_SystemId](./get_systemid/)() | Επιστρέφει την τιμή του αναγνωριστικού συστήματος στη δήλωση DOCTYPE. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει όλα τα παιδιά του κόμβου στον καθορισμένο [XmlWriter](../xmlwriter/). Για κόμβους [XmlDocumentType](./), αυτή η μέθοδος δεν έχει καμία επίδραση. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει τον κόμβο στον καθορισμένο [XmlWriter](../xmlwriter/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
