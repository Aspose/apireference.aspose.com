---
title: "Κλάση System::Xml::Schema::XmlSchemaRedefine"
linktitle: "XmlSchemaRedefine"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Xml::Schema::XmlSchemaRedefine. Αντιπροσωπεύει το στοιχείο redefine από το XML Schema όπως ορίζεται από το World Wide Web Consortium (W3C). Αυτή η κλάση μπορεί να χρησιμοποιηθεί για να επιτρέψει απλούς και σύνθετους τύπους, ομάδες και ομάδες χαρακτηριστικών από εξωτερικά αρχεία σχήματος να επαναοριστούν στο τρέχον σχήμα. Αυτή η κλάση μπορεί επίσης να χρησιμοποιηθεί για την παροχή έκδοσης για τα στοιχεία του σχήματος σε C++."
type: docs
weight: 5600
url: /el/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


Αντιπροσωπεύει το στοιχείο **redefine** από το XML [Schema](../) όπως καθορίζεται από το Παγκόσμιου Ιστού Consortium (W3C). Αυτή η κλάση μπορεί να χρησιμοποιηθεί για να επιτρέψει απλούς και σύνθετους τύπους, ομάδες και ομάδες χαρακτηριστικών από εξωτερικά αρχεία σχήματος να επαναορίζονται στο τρέχον σχήμα. Αυτή η κλάση μπορεί επίσης να χρησιμοποιηθεί για την παροχή έκδοσης για τα στοιχεία του σχήματος.

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | Επιστρέφει τον [XmlSchemaObjectTable](../xmlschemaobjecttable/) , για όλα τα χαρακτηριστικά στο σχήμα, ο οποίος περιέχει την ερμηνεία μετά τη μεταγλώττιση της τιμής **AttributeGroups**. |
| [get_Groups](./get_groups/)() | Επιστρέφει τον [XmlSchemaObjectTable](../xmlschemaobjecttable/), για όλες τις ομάδες στο σχήμα, ο οποίος περιέχει την ερμηνεία μετά τη μεταγλώττιση της τιμής **Groups**. |
| [get_Items](./get_items/)() | Επιστρέφει τη συλλογή των παρακάτω κλάσεων: [XmlSchemaAnnotation](../xmlschemaannotation/), [XmlSchemaAttributeGroup](../xmlschemaattributegroup/), [XmlSchemaComplexType](../xmlschemacomplextype/), [XmlSchemaSimpleType](../xmlschemasimpletype/), και [XmlSchemaGroup](../xmlschemagroup/). |
| [get_SchemaTypes](./get_schematypes/)() | Επιστρέφει τον [XmlSchemaObjectTable](../xmlschemaobjecttable/), για όλους τους απλούς και σύνθετους τύπους στο σχήμα, ο οποίος περιέχει την ερμηνεία μετά τη μεταγλώττιση της τιμής **SchemaTypes**. |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlSchemaRedefine](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
