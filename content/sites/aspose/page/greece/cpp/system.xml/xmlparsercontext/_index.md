---
title: "System::Xml::XmlParserContext κλάση"
linktitle: "XmlParserContext"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlParserContext κλάση. Παρέχει όλες τις πληροφορίες περιβάλλοντος που απαιτούνται από το XmlReader για την ανάλυση ενός τμήματος XML σε C++."
type: docs
weight: 3000
url: /el/cpp/system.xml/xmlparsercontext/
---
## XmlParserContext class


Παρέχει όλες τις πληροφορίες περιβάλλοντος που απαιτούνται από το [XmlReader](../xmlreader/) για την ανάλυση ενός τμήματος XML.

```cpp
class XmlParserContext : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_BaseURI](./get_baseuri/)() | Επιστρέφει το βασικό URI. |
| [get_DocTypeName](./get_doctypename/)() | Επιστρέφει το όνομα της δήλωσης τύπου εγγράφου. |
| [get_Encoding](./get_encoding/)() | Επιστρέφει τον τύπο κωδικοποίησης. |
| [get_InternalSubset](./get_internalsubset/)() | Επιστρέφει το εσωτερικό υποσύνολο DTD. |
| [get_NamespaceManager](./get_namespacemanager/)() | Επιστρέφει το [XmlNamespaceManager](../xmlnamespacemanager/). |
| [get_NameTable](./get_nametable/)() | Επιστρέφει το [XmlNameTable](../xmlnametable/) που χρησιμοποιείται για την ατομικοποίηση των συμβολοσειρών. Για περισσότερες πληροφορίες σχετικά με τις ατομικοποιημένες συμβολοσειρές, δείτε το [XmlNameTable](../xmlnametable/). |
| [get_PublicId](./get_publicid/)() | Επιστρέφει το δημόσιο αναγνωριστικό. |
| [get_SystemId](./get_systemid/)() | Επιστρέφει το αναγνωριστικό συστήματος. |
| [get_XmlLang](./get_xmllang/)() | Επιστρέφει το τρέχον πεδίο **xml:lang**. |
| [get_XmlSpace](./get_xmlspace/)() | Επιστρέφει το τρέχον πεδίο **xml:space**. |
| [set_BaseURI](./set_baseuri/)(const String\&) | Ορίζει το βασικό URI. |
| [set_DocTypeName](./set_doctypename/)(const String\&) | Ορίζει το όνομα της δήλωσης τύπου εγγράφου. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | Ορίζει τον τύπο κωδικοποίησης. |
| [set_InternalSubset](./set_internalsubset/)(const String\&) | Ορίζει το εσωτερικό υποσύνολο DTD. |
| [set_NamespaceManager](./set_namespacemanager/)(const SharedPtr\<XmlNamespaceManager\>\&) | Ορίζει το [XmlNamespaceManager](../xmlnamespacemanager/). |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | Ορίζει το [XmlNameTable](../xmlnametable/) που χρησιμοποιείται για την ατομικοποίηση των συμβολοσειρών. Για περισσότερες πληροφορίες σχετικά με τις ατομικοποιημένες συμβολοσειρές, δείτε το [XmlNameTable](../xmlnametable/). |
| [set_PublicId](./set_publicid/)(const String\&) | Ορίζει το δημόσιο αναγνωριστικό. |
| [set_SystemId](./set_systemid/)(const String\&) | Ορίζει το αναγνωριστικό συστήματος. |
| [set_XmlLang](./set_xmllang/)(const String\&) | Ορίζει το τρέχον πεδίο **xml:lang**. |
| [set_XmlSpace](./set_xmlspace/)(System::Xml::XmlSpace) | Ορίζει το τρέχον πεδίο **xml:space**. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlParserContext](./) με τα καθορισμένα [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), τιμές **xml:lang** και **xml:space**. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlParserContext](./) με τα καθορισμένα [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), **xml:lang**, **xml:space**, και κωδικοποίηση. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlParserContext](./) με τα καθορισμένα [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), βασικό URI, **xml:lang**, **xml:space**, και τιμές τύπου εγγράφου. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | Αρχικοποιεί ένα νέο αντίγραφο της κλάσης [XmlParserContext](./) με το καθορισμένο [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), βασική URI, **xml:lang**, **xml:space**, κωδικοποίηση και τιμές τύπου εγγράφου. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
