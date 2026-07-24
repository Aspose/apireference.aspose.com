---
title: "System::Xml::XmlElement κλάση"
linktitle: "XmlElement"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlElement κλάση. Αντιπροσωπεύει ένα στοιχείο σε C++."
type: docs
weight: 1700
url: /el/cpp/system.xml/xmlelement/
---
## XmlElement class


Αναπαριστά ένα στοιχείο.

```cpp
class XmlElement : public System::Xml::XmlLinkedNode
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Δημιουργεί ένα αντίγραφο αυτού του κόμβου. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Επιστρέφει μια **bool** τιμή που υποδεικνύει εάν ο τρέχων κόμβος έχει οποιεσδήποτε ιδιότητες. |
| [get_InnerText](./get_innertext/)() override | Επιστρέφει τις συνενωμένες τιμές του κόμβου και όλων των παιδιών του. |
| [get_InnerXml](./get_innerxml/)() override | Επιστρέφει τη σήμανση που αντιπροσωπεύει μόνο τα παιδιά αυτού του κόμβου. |
| [get_IsEmpty](./get_isempty/)() | Επιστρέφει τη μορφή ετικέτας του στοιχείου. |
| [get_LocalName](./get_localname/)() override | Επιστρέφει το τοπικό όνομα του τρέχοντος κόμβου. |
| [get_Name](./get_name/)() override | Επιστρέφει το πλήρες όνομα του κόμβου. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Επιστρέφει το URI του ονοματοχώρου αυτού του κόμβου. |
| [get_NodeType](./get_nodetype/)() override | Επιστρέφει τον τύπο του τρέχοντος κόμβου. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Επιστρέφει το [XmlDocument](../xmldocument/) στο οποίο ανήκει αυτός ο κόμβος. |
| [get_Prefix](./get_prefix/)() override | Επιστρέφει το πρόθεμα ονοματοχώρου αυτού του κόμβου. |
| [get_SchemaInfo](./get_schemainfo/)() override | Επιστρέφει το σύνολο πληροφοριών μετά την επικύρωση σχήματος που έχει ανατεθεί σε αυτόν τον κόμβο ως αποτέλεσμα της επικύρωσης σχήματος. |
| virtual [GetAttribute](./getattribute/)(String) | Επιστρέφει την τιμή για το χαρακτηριστικό με το καθορισμένο όνομα. |
| virtual [GetAttribute](./getattribute/)(String, String) | Επιστρέφει την τιμή για το χαρακτηριστικό με το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου. |
| virtual [GetAttributeNode](./getattributenode/)(String) | Επιστρέφει το [XmlAttribute](../xmlattribute/) με το καθορισμένο όνομα. |
| virtual [GetAttributeNode](./getattributenode/)(String, String) | Επιστρέφει το [XmlAttribute](../xmlattribute/) με το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | Επιστρέφει μια [XmlNodeList](../xmlnodelist/) που περιέχει μια λίστα όλων των απογόνων στοιχείων που ταιριάζουν με το καθορισμένο [XmlElement::get_Name](./get_name/). |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | Επιστρέφει μια [XmlNodeList](../xmlnodelist/) που περιέχει μια λίστα όλων των απογόνων στοιχείων που ταιριάζουν με τις καθορισμένες τιμές [XmlElement::get_LocalName](./get_localname/) και [XmlElement::get_NamespaceURI](./get_namespaceuri/). |
| virtual [HasAttribute](./hasattribute/)(String) | Καθορίζει εάν ο τρέχων κόμβος έχει ένα χαρακτηριστικό με το καθορισμένο όνομα. |
| virtual [HasAttribute](./hasattribute/)(String, String) | Καθορίζει εάν ο τρέχων κόμβος έχει ένα χαρακτηριστικό με το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου. |
| [RemoveAll](./removeall/)() override | Αφαιρεί όλα τα καθορισμένα χαρακτηριστικά και παιδιά του τρέχοντος κόμβου. Τα προεπιλεγμένα χαρακτηριστικά δεν αφαιρούνται. |
| virtual [RemoveAllAttributes](./removeallattributes/)() | Αφαιρεί όλα τα καθορισμένα χαρακτηριστικά από το στοιχείο. Τα προεπιλεγμένα χαρακτηριστικά δεν αφαιρούνται. |
| virtual [RemoveAttribute](./removeattribute/)(String) | Αφαιρεί ένα χαρακτηριστικό με βάση το όνομα. |
| virtual [RemoveAttribute](./removeattribute/)(String, String) | Αφαιρεί ένα χαρακτηριστικό με το καθορισμένο τοπικό όνομα και το URI του χώρου ονομάτων. (Εάν το αφαιρεθέν χαρακτηριστικό έχει προεπιλεγμένη τιμή, αντικαθίσταται αμέσως). |
| virtual [RemoveAttributeAt](./removeattributeat/)(int32_t) | Αφαιρεί τον κόμβο χαρακτηριστικού με τον καθορισμένο δείκτη από το στοιχείο. (Εάν το αφαιρεθέν χαρακτηριστικό έχει προεπιλεγμένη τιμή, αντικαθίσταται αμέσως). |
| virtual [RemoveAttributeNode](./removeattributenode/)(SharedPtr\<XmlAttribute\>) | Αφαιρεί το καθορισμένο [XmlAttribute](../xmlattribute/). |
| virtual [RemoveAttributeNode](./removeattributenode/)(String, String) | Αφαιρεί το [XmlAttribute](../xmlattribute/) που καθορίζεται από το τοπικό όνομα και το URI του χώρου ονομάτων. (Εάν το αφαιρεθέν χαρακτηριστικό έχει προεπιλεγμένη τιμή, αντικαθίσταται αμέσως). |
| [set_InnerText](./set_innertext/)(String) override | Ορίζει τις συνενωμένες τιμές του κόμβου και όλων των παιδιών του. |
| [set_InnerXml](./set_innerxml/)(String) override | Ορίζει τη σήμανση που αντιπροσωπεύει μόνο τα παιδιά αυτού του κόμβου. |
| [set_IsEmpty](./set_isempty/)(bool) | Ορίζει τη μορφή ετικέτας του στοιχείου. |
| [set_Prefix](./set_prefix/)(String) override | Ορίζει το πρόθεμα του χώρου ονομάτων αυτού του κόμβου. |
| virtual [SetAttribute](./setattribute/)(String, String) | Ορίζει την τιμή του χαρακτηριστικού με το καθορισμένο όνομα. |
| virtual [SetAttribute](./setattribute/)(String, String, String) | Ορίζει την τιμή του χαρακτηριστικού με το καθορισμένο τοπικό όνομα και το URI του χώρου ονομάτων. |
| virtual [SetAttributeNode](./setattributenode/)(SharedPtr\<XmlAttribute\>) | Προσθέτει το καθορισμένο [XmlAttribute](../xmlattribute/). |
| virtual [SetAttributeNode](./setattributenode/)(String, String) | Προσθέτει το καθορισμένο [XmlAttribute](../xmlattribute/). |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει όλα τα παιδιά του κόμβου στον καθορισμένο [XmlWriter](../xmlwriter/). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει τον τρέχοντα κόμβο στο καθορισμένο [XmlWriter](../xmlwriter/). |
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
