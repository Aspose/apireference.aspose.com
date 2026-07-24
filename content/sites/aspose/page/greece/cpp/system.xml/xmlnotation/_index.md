---
title: "System::Xml::XmlNotation κλάση"
linktitle: "XmlNotation"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNotation κλάση. Αντιπροσωπεύει μια δήλωση σημειογραφίας, όπως <!NOTATION... > σε C++."
type: docs
weight: 2900
url: /el/cpp/system.xml/xmlnotation/
---
## XmlNotation class


Αντιπροσωπεύει μια δήλωση σημειογραφίας, όπως **<!NOTATION... >**.

```cpp
class XmlNotation : public System::Xml::XmlNode
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Δημιουργεί ένα αντίγραφο αυτού του κόμβου. Οι κόμβοι σημειογραφίας δεν μπορούν να κλωνοποιηθούν. Η κλήση αυτής της μεθόδου σε ένα αντικείμενο [XmlNotation](./) προκαλεί εξαίρεση. |
| [get_InnerXml](./get_innerxml/)() override | Επιστρέφει την σήμανση που αντιπροσωπεύει τα παιδιά αυτού του κόμβου. |
| [get_IsReadOnly](./get_isreadonly/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο κόμβος είναι μόνο για ανάγνωση. |
| [get_LocalName](./get_localname/)() override | Επιστρέφει το όνομα του τρέχοντος κόμβου χωρίς το πρόθεμα του χώρου ονομάτων. |
| [get_Name](./get_name/)() override | Επιστρέφει το όνομα του τρέχοντος κόμβου. |
| [get_NodeType](./get_nodetype/)() override | Επιστρέφει τον τύπο του τρέχοντος κόμβου. |
| [get_OuterXml](./get_outerxml/)() override | Επιστρέφει τη σύνταξη που αντιπροσωπεύει αυτόν τον κόμβο και όλα τα παιδιά του. |
| [get_PublicId](./get_publicid/)() | Επιστρέφει την τιμή του δημόσιου αναγνωριστικού στη δήλωση σημειογραφίας. |
| [get_SystemId](./get_systemid/)() | Επιστρέφει την τιμή του αναγνωριστικού συστήματος στη δήλωση σημειογραφίας. |
| [set_InnerXml](./set_innerxml/)(String) override | Ορίζει τη σύνταξη που αντιπροσωπεύει τα παιδιά αυτού του κόμβου. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει τα παιδιά του κόμβου στον καθορισμένο [XmlWriter](../xmlwriter/). Αυτή η μέθοδος δεν έχει καμία επίδραση στους κόμβους [XmlNotation](./). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει τον κόμβο στον καθορισμένο [XmlWriter](../xmlwriter/). Αυτή η μέθοδος δεν έχει καμία επίδραση στους κόμβους [XmlNotation](./). |
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
