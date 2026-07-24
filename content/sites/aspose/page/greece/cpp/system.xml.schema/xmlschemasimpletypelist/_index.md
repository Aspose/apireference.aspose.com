---
title: "System::Xml::Schema::XmlSchemaSimpleTypeList κλάση"
linktitle: "XmlSchemaSimpleTypeList"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeList κλάση. Αντιπροσωπεύει το στοιχείο λίστας από το XML Schema όπως ορίζεται από το World Wide Web Consortium (W3C). Αυτή η κλάση μπορεί να χρησιμοποιηθεί για τον ορισμό ενός στοιχείου simpleType ως λίστα τιμών ενός καθορισμένου τύπου δεδομένων σε C++."
type: docs
weight: 6400
url: /el/cpp/system.xml.schema/xmlschemasimpletypelist/
---
## XmlSchemaSimpleTypeList class


Αντιπροσωπεύει το στοιχείο **list** από το XML [Schema](../) όπως ορίζεται από το World Wide [Web](../../system.web/) Consortium (W3C). Αυτή η κλάση μπορεί να χρησιμοποιηθεί για τον ορισμό ενός στοιχείου **simpleType** ως λίστα τιμών ενός καθορισμένου τύπου δεδομένων.

```cpp
class XmlSchemaSimpleTypeList : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_BaseItemType](./get_baseitemtype/)() | Επιστρέφει το [XmlSchemaSimpleType](../xmlschemasimpletype/) που αντιπροσωπεύει τον τύπο του στοιχείου **simpleType** βάσει των τιμών [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) και [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) του απλού τύπου. |
| [get_ItemType](./get_itemtype/)() | Επιστρέφει το στοιχείο **simpleType** που προέρχεται από τον τύπο που καθορίζεται από τη βασική τιμή. |
| [get_ItemTypeName](./get_itemtypename/)() | Επιστρέφει το όνομα ενός ενσωματωμένου τύπου δεδομένων ή του στοιχείου **simpleType** που ορίζεται σε αυτό το σχήμα (ή σε άλλο σχήμα που υποδεικνύεται από τον καθορισμένο χώρο ονομάτων). |
| [set_BaseItemType](./set_baseitemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Ορίζει το [XmlSchemaSimpleType](../xmlschemasimpletype/) που αντιπροσωπεύει τον τύπο του στοιχείου **simpleType** βάσει των τιμών [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) και [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) του απλού τύπου. |
| [set_ItemType](./set_itemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Ορίζει το στοιχείο **simpleType** που προέρχεται από τον τύπο που καθορίζεται από τη βασική τιμή. |
| [set_ItemTypeName](./set_itemtypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Ορίζει το όνομα ενός ενσωματωμένου τύπου δεδομένων ή του στοιχείου **simpleType** που ορίζεται σε αυτό το σχήμα (ή σε άλλο σχήμα που υποδεικνύεται από τον καθορισμένο χώρο ονομάτων). |
| [XmlSchemaSimpleTypeList](./xmlschemasimpletypelist/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaSimpleTypeList](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
