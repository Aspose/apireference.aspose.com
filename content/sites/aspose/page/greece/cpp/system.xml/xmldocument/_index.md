---
title: "System::Xml::XmlDocument κλάση"
linktitle: "XmlDocument"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlDocument κλάση. Αντιπροσωπεύει ένα έγγραφο XML. Μπορείτε να χρησιμοποιήσετε αυτήν την κλάση για να φορτώσετε, να επικυρώσετε, να επεξεργαστείτε, να προσθέσετε και να τοποθετήσετε XML σε ένα έγγραφο σε C++."
type: docs
weight: 1400
url: /el/cpp/system.xml/xmldocument/
---
## XmlDocument class


Αναπαριστά ένα έγγραφο XML. Μπορείτε να χρησιμοποιήσετε αυτήν την κλάση για να φορτώσετε, επικυρώσετε, επεξεργαστείτε, προσθέσετε και τοποθετήσετε XML σε ένα έγγραφο.

```cpp
class XmlDocument : public System::Xml::XmlNode
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Δημιουργεί ένα αντίγραφο αυτού του κόμβου. |
| [CreateAttribute](./createattribute/)(const String\&) | Δημιουργεί ένα [XmlAttribute](../xmlattribute/) με το καθορισμένο όνομα. |
| [CreateAttribute](./createattribute/)(const String\&, const String\&) | Δημιουργεί ένα [XmlAttribute](../xmlattribute/) με το καθορισμένο πλήρες όνομα και [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateAttribute](./createattribute/)(const String\&, const String\&, const String\&) | Δημιουργεί ένα [XmlAttribute](../xmlattribute/) με το καθορισμένο [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/) και [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateCDataSection](./createcdatasection/)(const String\&) | Δημιουργεί ένα [XmlCDataSection](../xmlcdatasection/) που περιέχει τα καθορισμένα δεδομένα. |
| virtual [CreateComment](./createcomment/)(const String\&) | Δημιουργεί ένα [XmlComment](../xmlcomment/) που περιέχει τα καθορισμένα δεδομένα. |
| virtual [CreateDocumentFragment](./createdocumentfragment/)() | Δημιουργεί ένα [XmlDocumentFragment](../xmldocumentfragment/). |
| virtual [CreateDocumentType](./createdocumenttype/)(const String\&, const String\&, const String\&, const String\&) | Επιστρέφει ένα νέο αντικείμενο [XmlDocumentType](../xmldocumenttype/). |
| [CreateElement](./createelement/)(const String\&) | Δημιουργεί ένα στοιχείο με το καθορισμένο όνομα. |
| [CreateElement](./createelement/)(const String\&, const String\&) | Δημιουργεί ένα [XmlElement](../xmlelement/) με το πλήρες όνομα και [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateElement](./createelement/)(const String\&, const String\&, const String\&) | Δημιουργεί ένα στοιχείο με το καθορισμένο [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/) και [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateEntityReference](./createentityreference/)(const String\&) | Δημιουργεί ένα [XmlEntityReference](../xmlentityreference/) με το καθορισμένο όνομα. |
| [CreateNavigator](./createnavigator/)() override | Δημιουργεί ένα νέο αντικείμενο XPathNavigator για την περιήγηση σε αυτό το έγγραφο. |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&, const String\&) | Δημιουργεί ένα [XmlNode](../xmlnode/) με το καθορισμένο [XmlNodeType](../xmlnodetype/), [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_Name](./get_name/) και [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateNode](./createnode/)(const String\&, const String\&, const String\&) | Δημιουργεί ένα [XmlNode](../xmlnode/) με τον καθορισμένο τύπο κόμβου, [XmlDocument::get_Name](./get_name/) και [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&) | Δημιουργεί ένα [XmlNode](../xmlnode/) με το καθορισμένο [XmlNodeType](../xmlnodetype/), [XmlDocument::get_Name](./get_name/) και [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateProcessingInstruction](./createprocessinginstruction/)(const String\&, const String\&) | Δημιουργεί ένα [XmlProcessingInstruction](../xmlprocessinginstruction/) με το καθορισμένο όνομα και δεδομένα. |
| virtual [CreateSignificantWhitespace](./createsignificantwhitespace/)(const String\&) | Δημιουργεί έναν κόμβο [XmlSignificantWhitespace](../xmlsignificantwhitespace/). |
| virtual [CreateTextNode](./createtextnode/)(const String\&) | Δημιουργεί ένα [XmlText](../xmltext/) με το καθορισμένο κείμενο. |
| virtual [CreateWhitespace](./createwhitespace/)(const String\&) | Δημιουργεί έναν [XmlWhitespace](../xmlwhitespace/) κόμβο. |
| virtual [CreateXmlDeclaration](./createxmldeclaration/)(const String\&, const String\&, const String\&) | Δημιουργεί έναν [XmlDeclaration](../xmldeclaration/) κόμβο με τις καθορισμένες τιμές. |
| [get_BaseURI](./get_baseuri/)() override | Επιστρέφει το βασικό URI του τρέχοντος κόμβου. |
| [get_DocumentElement](./get_documentelement/)() | Επιστρέφει το ριζικό [XmlElement](../xmlelement/) για το έγγραφο. |
| virtual [get_DocumentType](./get_documenttype/)() | Επιστρέφει τον κόμβο που περιέχει τη δήλωση DOCTYPE. |
| [get_Implementation](./get_implementation/)() | Επιστρέφει το αντικείμενο [XmlImplementation](../xmlimplementation/) για το τρέχον έγγραφο. |
| [get_InnerXml](./get_innerxml/)() override | Επιστρέφει τη σήμανση που αντιπροσωπεύει τα παιδιά του τρέχοντος κόμβου. |
| [get_IsReadOnly](./get_isreadonly/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος είναι μόνο για ανάγνωση. |
| [get_LocalName](./get_localname/)() override | Επιστρέφει το τοπικό όνομα του κόμβου. |
| [get_Name](./get_name/)() override | Επιστρέφει το πλήρες όνομα του κόμβου. |
| [get_NameTable](./get_nametable/)() | Επιστρέφει το [XmlNameTable](../xmlnametable/) που σχετίζεται με αυτήν την υλοποίηση. |
| [get_NodeType](./get_nodetype/)() override | Επιστρέφει τον τύπο του τρέχοντος κόμβου. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Επιστρέφει το [XmlDocument](./) στο οποίο ανήκει ο τρέχων κόμβος. |
| [get_PreserveWhitespace](./get_preservewhitespace/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν πρέπει να διατηρηθεί το κενό διάστημα στο περιεχόμενο του στοιχείου. |
| [get_SchemaInfo](./get_schemainfo/)() override | Επιστρέφει το Post-Schema-Validation-Infoset (PSVI) του κόμβου. |
| [get_Schemas](./get_schemas/)() | Επιστρέφει το αντικείμενο XmlSchemaSet που σχετίζεται με αυτό το [XmlDocument](./). |
| virtual [GetElementById](./getelementbyid/)(String) | Επιστρέφει το [XmlElement](../xmlelement/) με το καθορισμένο ID. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | Επιστρέφει μια [XmlNodeList](../xmlnodelist/) που περιέχει μια λίστα όλων των απογόνων στοιχείων που ταιριάζουν με το καθορισμένο όνομα. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | Επιστρέφει μια [XmlNodeList](../xmlnodelist/) που περιέχει μια λίστα όλων των απογόνων στοιχείων που ταιριάζουν με το καθορισμένο [XmlDocument::get_LocalName](./get_localname/) και [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [ImportNode](./importnode/)(SharedPtr\<XmlNode\>, bool) | Εισάγει έναν κόμβο από άλλο έγγραφο στο τρέχον έγγραφο. |
| virtual [Load](./load/)(String) | Φορτώνει το έγγραφο XML από το καθορισμένο URL. |
| virtual [Load](./load/)(SharedPtr\<IO::Stream\>) | Φορτώνει το έγγραφο XML από τη καθορισμένη ροή. |
| virtual [Load](./load/)(SharedPtr\<IO::TextReader\>) | Φορτώνει το έγγραφο XML από το καθορισμένο TextReader. |
| virtual [Load](./load/)(SharedPtr\<XmlReader\>) | Φορτώνει το έγγραφο XML από το καθορισμένο [XmlReader](../xmlreader/). |
| virtual [LoadXml](./loadxml/)(String) | Φορτώνει το έγγραφο XML από τη καθορισμένη συμβολοσειρά. |
| virtual [ReadNode](./readnode/)(SharedPtr\<XmlReader\>) | Δημιουργεί ένα αντικείμενο [XmlNode](../xmlnode/) βάσει των πληροφοριών στο [XmlReader](../xmlreader/). Ο αναγνώστης πρέπει να είναι τοποθετημένος σε έναν κόμβο ή χαρακτηριστικό. |
| virtual [Save](./save/)(String) | Αποθηκεύει το έγγραφο XML στο καθορισμένο αρχείο. Εάν το καθορισμένο αρχείο υπάρχει, αυτή η μέθοδος το αντικαθιστά. |
| virtual [Save](./save/)(SharedPtr\<IO::Stream\>) | Αποθηκεύει το έγγραφο XML στη καθορισμένη ροή. |
| virtual [Save](./save/)(SharedPtr\<IO::TextWriter\>) | Αποθηκεύει το έγγραφο XML στον καθορισμένο TextWriter. |
| virtual [Save](./save/)(SharedPtr\<XmlWriter\>) | Αποθηκεύει το έγγραφο XML στον καθορισμένο [XmlWriter](../xmlwriter/). |
| [set_InnerText](./set_innertext/)(String) override | Εκτοπίζει μια InvalidOperationException σε όλες τις περιπτώσεις. |
| [set_InnerXml](./set_innerxml/)(String) override | Ορίζει τη σήμανση που αντιπροσωπεύει τα παιδιά του τρέχοντος κόμβου. |
| [set_PreserveWhitespace](./set_preservewhitespace/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν θα διατηρηθεί το κενό διάστημα στο περιεχόμενο του στοιχείου. |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | Ορίζει το αντικείμενο XmlSchemaSet που σχετίζεται με αυτό το [XmlDocument](./). |
| virtual [set_XmlResolver](./set_xmlresolver/)(SharedPtr\<System::Xml::XmlResolver\>) | Ορίζει το [XmlResolver](../xmlresolver/) που θα χρησιμοποιηθεί για την επίλυση εξωτερικών πόρων. |
| [Validate](./validate/)(Schema::ValidationEventHandler) | Επικυρώνει το [XmlDocument](./) έναντι των σχημάτων XML [Schema](../../system.xml.schema/) Definition Language (XSD) που περιέχονται στη λίστα [XmlDocument::get_Schemas](./get_schemas/). |
| [Validate](./validate/)(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) | Επικυρώνει το αντικείμενο [XmlNode](../xmlnode/) που καθορίζεται έναντι των σχημάτων XML [Schema](../../system.xml.schema/) Definition Language (XSD) στη λίστα [XmlDocument::get_Schemas](./get_schemas/). |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει όλα τα παιδιά του κόμβου [XmlDocument](./) στον καθορισμένο [XmlWriter](../xmlwriter/). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει τον κόμβο [XmlDocument](./) στον καθορισμένο [XmlWriter](../xmlwriter/). |
| [XmlDocument](./xmldocument/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlDocument](./). |
| [XmlDocument](./xmldocument/)(const SharedPtr\<XmlNameTable\>\&) | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlDocument](./) με το καθορισμένο [XmlNameTable](../xmlnametable/). |
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
