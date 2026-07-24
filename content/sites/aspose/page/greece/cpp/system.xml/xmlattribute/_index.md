---
title: "System::Xml::XmlAttribute κλάση"
linktitle: "XmlAttribute"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlAttribute κλάση. Αντιπροσωπεύει ένα χαρακτηριστικό. Οι έγκυρες και προεπιλεγμένες τιμές για το χαρακτηριστικό ορίζονται σε έναν ορισμό τύπου εγγράφου (DTD) ή σχήμα σε C++."
type: docs
weight: 600
url: /el/cpp/system.xml/xmlattribute/
---
## XmlAttribute class


Αναπαριστά ένα χαρακτηριστικό. Οι έγκυρες και προεπιλεγμένες τιμές για το χαρακτηριστικό ορίζονται σε έναν ορισμό τύπου εγγράφου (DTD) ή σχήμα.

```cpp
class XmlAttribute : public System::Xml::XmlNode
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) override | Προσθέτει τον καθορισμένο κόμβο στο τέλος της λίστας των παιδικών κόμβων αυτού του κόμβου. |
| [CloneNode](./clonenode/)(bool) override | Δημιουργεί ένα αντίγραφο αυτού του κόμβου. |
| [get_BaseURI](./get_baseuri/)() override | Επιστρέφει το βασικό Uniform Resource Identifier (URI) του κόμβου. |
| [get_LocalName](./get_localname/)() override | Επιστρέφει το τοπικό όνομα του κόμβου. |
| [get_Name](./get_name/)() override | Επιστρέφει το πλήρες όνομα του κόμβου. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Επιστρέφει το URI του ονοματοχώρου αυτού του κόμβου. |
| [get_NodeType](./get_nodetype/)() override | Επιστρέφει τον τύπο του τρέχοντος κόμβου. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Επιστρέφει το [XmlDocument](../xmldocument/) στο οποίο ανήκει αυτός ο κόμβος. |
| virtual [get_OwnerElement](./get_ownerelement/)() | Επιστρέφει το [XmlElement](../xmlelement/) στο οποίο ανήκει το χαρακτηριστικό. |
| [get_Prefix](./get_prefix/)() override | Επιστρέφει το πρόθεμα ονοματοχώρου αυτού του κόμβου. |
| [get_SchemaInfo](./get_schemainfo/)() override | Επιστρέφει το post-schema-validation-infoset που έχει εκχωρηθεί σε αυτόν τον κόμβο ως αποτέλεσμα της επικύρωσης σχήματος. |
| virtual [get_Specified](./get_specified/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η τιμή του χαρακτηριστικού ορίστηκε ρητά. |
| [get_Value](./get_value/)() override | Επιστρέφει την τιμή του κόμβου. |
| [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Εισάγει τον καθορισμένο κόμβο αμέσως μετά τον καθορισμένο κόμβο αναφοράς. |
| [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Εισάγει τον καθορισμένο κόμβο αμέσως πριν τον καθορισμένο κόμβο αναφοράς. |
| [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) override | Προσθέτει τον καθορισμένο κόμβο στην αρχή της λίστας των υποκόμβων για αυτόν τον κόμβο. |
| [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) override | Αφαιρεί τον καθορισμένο κόμβο-παιδί. |
| [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Αντικαθιστά τον καθορισμένο κόμβο-παιδί με τον νέο καθορισμένο κόμβο-παιδί. |
| [set_InnerText](./set_innertext/)(String) override | Ορίζει τις συνενωμένες τιμές του κόμβου και όλων των παιδιών του. |
| [set_InnerXml](./set_innerxml/)(String) override | Ορίζει την τιμή του χαρακτηριστικού. |
| [set_Prefix](./set_prefix/)(String) override | Ορίζει το πρόθεμα του χώρου ονομάτων αυτού του κόμβου. |
| [set_Value](./set_value/)(String) override | Ορίζει την τιμή του κόμβου. |
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
