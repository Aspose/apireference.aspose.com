---
title: "Κλάση System::Xml::XmlValidatingReader"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Xml::XmlValidatingReader. Αντιπροσωπεύει έναν αναγνώστη που παρέχει επικύρωση ορισμού τύπου εγγράφου (DTD), σχήματος XML-Data Reduced (XDR) και γλώσσας ορισμού σχήματος XML (XSD) σε C++."
type: docs
weight: 4200
url: /el/cpp/system.xml/xmlvalidatingreader/
---
## XmlValidatingReader class


Αντιπροσωπεύει έναν αναγνώστη που παρέχει επικύρωση ορισμού τύπου εγγράφου (DTD), σχήματος XML-Data Reduced (XDR) και γλώσσας ορισμού σχήματος XML [Schema](../../system.xml.schema/) (XSD).

```cpp
class XmlValidatingReader : public System::Xml::XmlReader,
                            public System::Xml::IXmlLineInfo,
                            public System::Xml::IXmlNamespaceResolver
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Close](./close/)() override | Αλλάζει το [XmlReader::get_ReadState](../xmlreader/get_readstate/) σε Closed. |
| [get_AttributeCount](./get_attributecount/)() override | Επιστρέφει τον αριθμό των χαρακτηριστικών στον τρέχοντα κόμβο. |
| [get_BaseURI](./get_baseuri/)() override | Επιστρέφει το βασικό URI του τρέχοντος κόμβου. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν το [XmlValidatingReader](./) υλοποιεί τις μεθόδους ανάγνωσης δυαδικού περιεχομένου. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν αυτός ο αναγνώστης μπορεί να αναλύσει και να επιλύσει οντότητες. |
| [get_Depth](./get_depth/)() override | Επιστρέφει το βάθος του τρέχοντος κόμβου στο έγγραφο XML. |
| [get_Encoding](./get_encoding/)() | Επιστρέφει το χαρακτηριστικό κωδικοποίησης για το έγγραφο. |
| [get_EntityHandling](./get_entityhandling/)() | Επιστρέφει μια τιμή που καθορίζει πώς ο αναγνώστης διαχειρίζεται τις οντότητες. |
| [get_EOF](./get_eof/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο αναγνώστης βρίσκεται στο τέλος της ροής. |
| [get_HasValue](./get_hasvalue/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος μπορεί να έχει ένα [XmlValidatingReader::get_Value](./get_value/) διαφορετικό από το [String::Empty](../../system/string/empty/). |
| [get_IsDefault](./get_isdefault/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος είναι ένα χαρακτηριστικό που δημιουργήθηκε από την προεπιλεγμένη τιμή που ορίζεται στον ορισμό τύπου εγγράφου (DTD) ή στο σχήμα. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος είναι ένα κενό στοιχείο (για παράδειγμα, **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Επιστρέφει τον τρέχοντα αριθμό γραμμής. |
| [get_LinePosition](./get_lineposition/)() override | Επιστρέφει τη τρέχουσα θέση γραμμής. |
| [get_LocalName](./get_localname/)() override | Επιστρέφει το τοπικό όνομα του τρέχοντος κόμβου. |
| [get_Name](./get_name/)() override | Επιστρέφει το πλήρες όνομα του τρέχοντος κόμβου. |
| [get_Namespaces](./get_namespaces/)() | Επιστρέφει μια τιμή που υποδεικνύει αν θα γίνει υποστήριξη χώρου ονομάτων. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Επιστρέφει το Uniform Resource Identifier (URI) του χώρου ονομάτων (όπως ορίζεται στην προδιαγραφή του World Wide [Web](../../system.web/) Consortium (W3C) Namespace) του κόμβου στον οποίο βρίσκεται ο αναγνώστης. |
| [get_NameTable](./get_nametable/)() override | Επιστρέφει το [XmlNameTable](../xmlnametable/) που σχετίζεται με αυτήν την υλοποίηση. |
| [get_NodeType](./get_nodetype/)() override | Επιστρέφει τον τύπο του τρέχοντος κόμβου. |
| [get_Prefix](./get_prefix/)() override | Επιστρέφει το πρόθεμα ονοματοχώρου που σχετίζεται με τον τρέχοντα κόμβο. |
| [get_QuoteChar](./get_quotechar/)() override | Επιστρέφει το χαρακτήρα του εισαγωγικού που χρησιμοποιείται για την περιτύλιξη της τιμής ενός κόμβου χαρακτηριστικού. |
| [get_Reader](./get_reader/)() | Επιστρέφει το [XmlReader](../xmlreader/) που χρησιμοποιείται για τη δημιουργία αυτού του [XmlValidatingReader](./). |
| [get_ReadState](./get_readstate/)() override | Επιστρέφει την κατάσταση του αναγνώστη. |
| [get_Schemas](./get_schemas/)() | Επιστρέφει ένα XmlSchemaCollection για χρήση στην επικύρωση. |
| [get_SchemaType](./get_schematype/)() | Επιστρέφει ένα αντικείμενο τύπου σχήματος. |
| [get_ValidationType](./get_validationtype/)() | Επιστρέφει μια τιμή που υποδεικνύει τον τύπο της επικύρωσης που θα εκτελεστεί. |
| [get_Value](./get_value/)() override | Επιστρέφει την τιμή κειμένου του τρέχοντος κόμβου. |
| [get_XmlLang](./get_xmllang/)() override | Επιστρέφει το τρέχον πεδίο **xml:lang**. |
| [get_XmlSpace](./get_xmlspace/)() override | Επιστρέφει το τρέχον πεδίο **xml:space**. |
| [GetAttribute](./getattribute/)(String) override | Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο όνομα. |
| [GetAttribute](./getattribute/)(String, String) override | Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο τοπικό όνομα και το Uniform Resource Identifier (URI) του χώρου ονομάτων. |
| [GetAttribute](./getattribute/)(int32_t) override | Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο δείκτη. |
| [HasLineInfo](./haslineinfo/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν η κλάση μπορεί να επιστρέψει πληροφορίες γραμμής. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Επιλύει ένα πρόθεμα ονοματοχώρου στο πεδίο του τρέχοντος στοιχείου. |
| [MoveToAttribute](./movetoattribute/)(String) override | Μετακινείται στο χαρακτηριστικό με το καθορισμένο όνομα. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Μετακινείται στο χαρακτηριστικό με το καθορισμένο τοπικό όνομα και το Uniform Resource Identifier (URI) του χώρου ονομάτων. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Μετακινείται στο χαρακτηριστικό με το καθορισμένο δείκτη. |
| [MoveToElement](./movetoelement/)() override | Μετακινείται στο στοιχείο που περιέχει τον τρέχοντα κόμβο χαρακτηριστικού. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | Μετακινείται στο πρώτο χαρακτηριστικό. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Μετακινείται στο επόμενο χαρακτηριστικό. |
| [Read](./read/)() override | Διαβάζει τον επόμενο κόμβο από τη ροή. |
| [ReadAttributeValue](./readattributevalue/)() override | Αναλύει την τιμή του χαρακτηριστικού σε ένα ή περισσότερα **[Text](../../system.text/)**, **EntityReference**, ή **EndEntity** κόμβους. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Διαβάζει το περιεχόμενο και επιστρέφει τα δυαδικά bytes που αποκωδικοποιήθηκαν σε Base64. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Διαβάζει το περιεχόμενο και επιστρέφει τα δυαδικά bytes που αποκωδικοποιήθηκαν σε BinHex. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Διαβάζει το στοιχείο και αποκωδικοποιεί το περιεχόμενο σε Base64. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Διαβάζει το στοιχείο και αποκωδικοποιεί το περιεχόμενο σε BinHex. |
| [ReadString](./readstring/)() override | Διαβάζει τα περιεχόμενα ενός στοιχείου ή κόμβου κειμένου ως συμβολοσειρά. |
| [ReadTypedValue](./readtypedvalue/)() | Επιστρέφει τον τύπο runt-ime για τη συγκεκριμένη γλώσσα ορισμού XML [Schema](../../system.xml.schema/) (XSD). |
| [ResolveEntity](./resolveentity/)() override | Επιλύει την αναφορά οντότητας για κόμβους **EntityReference**. |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Ορίζει μια τιμή που καθορίζει πώς ο αναγνώστης διαχειρίζεται τις οντότητες. |
| [set_Namespaces](./set_namespaces/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν θα γίνει υποστήριξη χώρου ονομάτων. |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | Ορίζει μια τιμή που υποδεικνύει τον τύπο επικύρωσης που θα εκτελεστεί. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Ορίζει το [XmlResolver](../xmlresolver/) που χρησιμοποιείται για την επίλυση εξωτερικών αναφορών ορισμού τύπου εγγράφου (DTD) και θέσης σχήματος. Το [XmlResolver](../xmlresolver/) χρησιμοποιείται επίσης για τη διαχείριση τυχόν στοιχείων import ή include που βρίσκονται σε σχήματα XML [Schema](../../system.xml.schema/) γλώσσας ορισμού (XSD). |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Προσθέτει έναν διαχειριστή συμβάντος για τη λήψη πληροφοριών σχετικά με σφάλματα επικύρωσης ορισμού τύπου εγγράφου (DTD), σχήματος XML-Data Reduced (XDR) και σχήματος XML [Schema](../../system.xml.schema/) γλώσσας ορισμού (XSD). |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Αφαιρεί έναν διαχειριστή συμβάντος για τη λήψη πληροφοριών σχετικά με σφάλματα επικύρωσης ορισμού τύπου εγγράφου (DTD), σχήματος XML-Data Reduced (XDR) και σχήματος XML [Schema](../../system.xml.schema/) γλώσσας ορισμού (XSD). |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<XmlReader\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlValidatingReader](./) που επικυρώνει το περιεχόμενο που επιστρέφεται από το δεδομένο [XmlReader](../xmlreader/). |
| [XmlValidatingReader](./xmlvalidatingreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlValidatingReader](./) με τις καθορισμένες τιμές. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlValidatingReader](./) με τις καθορισμένες τιμές. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις


## Deprecated
Αυτή η κλάση είναι παρωχημένη. Συνιστάται η χρήση της κλάσης XmlReaderSettings και της μεθόδου XmlReader::Create για τη δημιουργία ενός επικυρωμένου αναγνώστη XML.

Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
