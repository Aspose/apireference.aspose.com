---
title: "System::Xml::XmlEntity class"
linktitle: "XmlEntity"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlEntity class. Αντιπροσωπεύει μια δήλωση οντότητας, όπως <!ENTITY... > σε C++."
type: docs
weight: 1800
url: /el/cpp/system.xml/xmlentity/
---
## XmlEntity class


Αναπαριστά μια δήλωση οντότητας, όπως **<!ENTITY... >**.

```cpp
class XmlEntity : public System::Xml::XmlNode
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Δημιουργεί ένα αντίγραφο αυτού του κόμβου. Οι κόμβοι οντότητας δεν μπορούν να κλωνοποιηθούν. Η κλήση αυτής της μεθόδου σε ένα αντικείμενο [XmlEntity](./) προκαλεί εξαίρεση. |
| [get_BaseURI](./get_baseuri/)() override | Επιστρέφει τη βασική Uniform Resource Identifier (URI) του τρέχοντος κόμβου. |
| [get_InnerText](./get_innertext/)() override | Επιστρέφει τις ενωμένες τιμές του κόμβου οντότητας και όλων των παιδιών του. |
| [get_InnerXml](./get_innerxml/)() override | Επιστρέφει την σήμανση που αντιπροσωπεύει τα παιδιά αυτού του κόμβου. |
| [get_IsReadOnly](./get_isreadonly/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο κόμβος είναι μόνο για ανάγνωση. |
| [get_LocalName](./get_localname/)() override | Επιστρέφει το όνομα του κόμβου χωρίς το πρόθεμα του χώρου ονομάτων. |
| [get_Name](./get_name/)() override | Επιστρέφει το όνομα του κόμβου. |
| [get_NodeType](./get_nodetype/)() override | Επιστρέφει τον τύπο του κόμβου. |
| [get_NotationName](./get_notationname/)() | Επιστρέφει το όνομα του προαιρετικού χαρακτηριστικού NDATA στη δήλωση οντότητας. |
| [get_OuterXml](./get_outerxml/)() override | Επιστρέφει τη σύνταξη που αντιπροσωπεύει αυτόν τον κόμβο και όλα τα παιδιά του. |
| [get_PublicId](./get_publicid/)() | Επιστρέφει την τιμή του δημόσιου αναγνωριστικού στη δήλωση οντότητας. |
| [get_SystemId](./get_systemid/)() | Επιστρέφει την τιμή του αναγνωριστικού συστήματος στη δήλωση οντότητας. |
| [set_InnerText](./set_innertext/)(String) override | Ορίζει τις συνενωμένες τιμές του κόμβου οντότητας και όλων των παιδιών του. |
| [set_InnerXml](./set_innerxml/)(String) override | Ορίζει τη σύνταξη που αντιπροσωπεύει τα παιδιά αυτού του κόμβου. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει όλα τα παιδιά του κόμβου στον καθορισμένο [XmlWriter](../xmlwriter/). Για κόμβους [XmlEntity](./), αυτή η μέθοδος δεν έχει καμία επίδραση. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει τον κόμβο στον καθορισμένο [XmlWriter](../xmlwriter/). Για κόμβους [XmlEntity](./), αυτή η μέθοδος δεν έχει καμία επίδραση. |
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
