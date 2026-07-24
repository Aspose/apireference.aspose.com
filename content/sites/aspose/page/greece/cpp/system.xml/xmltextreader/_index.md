---
title: "System::Xml::XmlTextReader κλάση"
linktitle: "XmlTextReader"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlTextReader κλάση. Αντιπροσωπεύει έναν αναγνώστη που παρέχει γρήγορη, μη προσωρινή, πρόσβαση μόνο προς τα εμπρός σε δεδομένα XML σε C++."
type: docs
weight: 3900
url: /el/cpp/system.xml/xmltextreader/
---
## XmlTextReader class


Αντιπροσωπεύει έναν αναγνώστη που παρέχει γρήγορη, μη προσωρινή, πρόσβαση μόνο προς τα εμπρός στα δεδομένα XML.

```cpp
class XmlTextReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlLineInfo,
                      public System::Xml::IXmlNamespaceResolver
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Close](./close/)() override | Αλλάζει το [XmlReader::get_ReadState](../xmlreader/get_readstate/) σε **Closed**. |
| [get_AttributeCount](./get_attributecount/)() override | Επιστρέφει τον αριθμό των χαρακτηριστικών στον τρέχοντα κόμβο. |
| [get_BaseURI](./get_baseuri/)() override | Επιστρέφει το βασικό URI του τρέχοντος κόμβου. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν το [XmlTextReader](./) υλοποιεί τις μεθόδους ανάγνωσης δυαδικού περιεχομένου. |
| [get_CanReadValueChunk](./get_canreadvaluechunk/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν το [XmlTextReader](./) υλοποιεί τη μέθοδο [XmlReader::ReadValueChunk](../xmlreader/readvaluechunk/). |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν αυτός ο αναγνώστης μπορεί να αναλύσει και να επιλύσει οντότητες. |
| [get_Depth](./get_depth/)() override | Επιστρέφει το βάθος του τρέχοντος κόμβου στο έγγραφο XML. |
| [get_DtdProcessing](./get_dtdprocessing/)() | Επιστρέφει την απαρίθμηση [DtdProcessing](../dtdprocessing/). |
| [get_Encoding](./get_encoding/)() | Επιστρέφει την κωδικοποίηση του εγγράφου. |
| [get_EntityHandling](./get_entityhandling/)() | Επιστρέφει μια τιμή που καθορίζει πώς ο αναγνώστης διαχειρίζεται τις οντότητες. |
| [get_EOF](./get_eof/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο αναγνώστης βρίσκεται στο τέλος της ροής. |
| [get_HasValue](./get_hasvalue/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος μπορεί να έχει ένα [XmlTextReader::get_Value](./get_value/) διαφορετικό από το [String::Empty](../../system/string/empty/). |
| [get_IsDefault](./get_isdefault/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος είναι ένα χαρακτηριστικό που δημιουργήθηκε από την προεπιλεγμένη τιμή που ορίζεται στο DTD ή στο σχήμα. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος είναι ένα κενό στοιχείο (για παράδειγμα, **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Επιστρέφει τον τρέχοντα αριθμό γραμμής. |
| [get_LinePosition](./get_lineposition/)() override | Επιστρέφει τη τρέχουσα θέση γραμμής. |
| [get_LocalName](./get_localname/)() override | Επιστρέφει το τοπικό όνομα του τρέχοντος κόμβου. |
| [get_Name](./get_name/)() override | Επιστρέφει το πλήρες όνομα του τρέχοντος κόμβου. |
| [get_Namespaces](./get_namespaces/)() | Επιστρέφει μια τιμή που υποδεικνύει αν θα γίνει υποστήριξη χώρου ονομάτων. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Επιστρέφει το URI του ονοματοχώρου (όπως ορίζεται στην προδιαγραφή ονοματοχώρου του W3C) του κόμβου στον οποίο βρίσκεται ο αναγνώστης. |
| [get_NameTable](./get_nametable/)() override | Επιστρέφει το [XmlNameTable](../xmlnametable/) που σχετίζεται με αυτήν την υλοποίηση. |
| [get_NodeType](./get_nodetype/)() override | Επιστρέφει τον τύπο του τρέχοντος κόμβου. |
| [get_Normalization](./get_normalization/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν θα γίνει κανονικοποίηση των κενών διαστημάτων και των τιμών χαρακτηριστικών. |
| [get_Prefix](./get_prefix/)() override | Επιστρέφει το πρόθεμα ονοματοχώρου που σχετίζεται με τον τρέχοντα κόμβο. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν θα επιτραπεί η επεξεργασία DTD. |
| [get_QuoteChar](./get_quotechar/)() override | Επιστρέφει το χαρακτήρα του εισαγωγικού που χρησιμοποιείται για την περιτύλιξη της τιμής ενός κόμβου χαρακτηριστικού. |
| [get_ReadState](./get_readstate/)() override | Επιστρέφει την κατάσταση του αναγνώστη. |
| [get_Value](./get_value/)() override | Επιστρέφει την τιμή κειμένου του τρέχοντος κόμβου. |
| [get_WhitespaceHandling](./get_whitespacehandling/)() | Επιστρέφει μια τιμή που καθορίζει πώς διαχειρίζονται τα κενά διαστήματα. |
| [get_XmlLang](./get_xmllang/)() override | Επιστρέφει το τρέχον πεδίο **xml:lang**. |
| [get_XmlSpace](./get_xmlspace/)() override | Επιστρέφει το τρέχον πεδίο **xml:space**. |
| [GetAttribute](./getattribute/)(String) override | Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο όνομα. |
| [GetAttribute](./getattribute/)(String, String) override | Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου. |
| [GetAttribute](./getattribute/)(int32_t) override | Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο δείκτη. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Επιστρέφει μια συλλογή που περιέχει όλους τους χώρους ονομάτων που είναι αυτή τη στιγμή εντός εμβέλειας. |
| [GetRemainder](./getremainder/)() | Επιστρέφει το υπόλοιπο του ενδιάμεσου XML. |
| [HasLineInfo](./haslineinfo/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν η κλάση μπορεί να επιστρέψει πληροφορίες γραμμής. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Επιλύει ένα πρόθεμα ονοματοχώρου στο πεδίο του τρέχοντος στοιχείου. |
| [MoveToAttribute](./movetoattribute/)(String) override | Μετακινείται στο χαρακτηριστικό με το καθορισμένο όνομα. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Μετακινείται στο χαρακτηριστικό με το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Μετακινείται στο χαρακτηριστικό με το καθορισμένο δείκτη. |
| [MoveToElement](./movetoelement/)() override | Μετακινείται στο στοιχείο που περιέχει τον τρέχοντα κόμβο χαρακτηριστικού. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | Μετακινείται στο πρώτο χαρακτηριστικό. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Μετακινείται στο επόμενο χαρακτηριστικό. |
| [Read](./read/)() override | Διαβάζει τον επόμενο κόμβο από τη ροή. |
| [ReadAttributeValue](./readattributevalue/)() override | Αναλύει την τιμή του χαρακτηριστικού σε ένα ή περισσότερα **[Text](../../system.text/)**, **EntityReference**, ή **EndEntity** κόμβους. |
| [ReadBase64](./readbase64/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Αποκωδικοποιεί Base64 και επιστρέφει τα αποκωδικοποιημένα δυαδικά bytes. |
| [ReadBinHex](./readbinhex/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Αποκωδικοποιεί **BinHex** και επιστρέφει τα αποκωδικοποιημένα δυαδικά bytes. |
| [ReadChars](./readchars/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) | Διαβάζει το κείμενο ενός στοιχείου σε έναν buffer χαρακτήρων. Αυτή η μέθοδος σχεδιάστηκε για την ανάγνωση μεγάλων ροών ενσωματωμένου κειμένου καλώντας την διαδοχικά. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Διαβάζει το περιεχόμενο και επιστρέφει τα **Base64** αποκωδικοποιημένα δυαδικά bytes. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Διαβάζει το περιεχόμενο και επιστρέφει τα **BinHex** αποκωδικοποιημένα δυαδικά bytes. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Διαβάζει το στοιχείο και αποκωδικοποιεί το περιεχόμενο σε Base64. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Διαβάζει το στοιχείο και αποκωδικοποιεί το περιεχόμενο **BinHex**. |
| [ReadString](./readstring/)() override | Διαβάζει τα περιεχόμενα ενός στοιχείου ή ενός κόμβου κειμένου ως συμβολοσειρά. |
| [ResetState](./resetstate/)() | Επαναφέρει την κατάσταση του αναγνώστη στο [ReadState::Initial](../readstate/). |
| [ResolveEntity](./resolveentity/)() override | Επιλύει την αναφορά οντότητας για κόμβους **EntityReference**. |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | Ορίζει την απαρίθμηση [DtdProcessing](../dtdprocessing/). |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Ορίζει μια τιμή που καθορίζει πώς ο αναγνώστης διαχειρίζεται τις οντότητες. |
| [set_Namespaces](./set_namespaces/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν θα γίνει υποστήριξη χώρου ονομάτων. |
| [set_Normalization](./set_normalization/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν θα κανονικοποιηθεί το κενό διάστημα και οι τιμές των χαρακτηριστικών. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν θα επιτραπεί η επεξεργασία DTD. |
| [set_WhitespaceHandling](./set_whitespacehandling/)(System::Xml::WhitespaceHandling) | Ορίζει μια τιμή που καθορίζει πώς διαχειρίζεται το κενό διάστημα. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Ορίζει το [XmlResolver](../xmlresolver/) που χρησιμοποιείται για την επίλυση αναφορών DTD. |
| [Skip](./skip/)() override | Παραλείπει τα παιδιά του τρέχοντος κόμβου. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlTextReader](./) με τη συγκεκριμένη ροή. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlTextReader](./) με το καθορισμένο URL και τη ροή. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlTextReader](./) με τη συγκεκριμένη ροή και το [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlTextReader](./) με το καθορισμένο URL, τη ροή και το [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlTextReader](./) με το καθορισμένο TextReader. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlTextReader](./) με το καθορισμένο URL και το TextReader. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlTextReader](./) με το καθορισμένο TextReader και το [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlTextReader](./) με το καθορισμένο URL, το TextReader και το [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlTextReader](./) με τη συγκεκριμένη ροή, το [XmlNodeType](../xmlnodetype/), και το [XmlParserContext](../xmlparsercontext/). |
| [XmlTextReader](./xmltextreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlTextReader](./) με τη συγκεκριμένη συμβολοσειρά, το [XmlNodeType](../xmlnodetype/), και το [XmlParserContext](../xmlparsercontext/). |
| [XmlTextReader](./xmltextreader/)(const String\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlTextReader](./) με το καθορισμένο αρχείο. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<XmlNameTable\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlTextReader](./) με το καθορισμένο αρχείο και το [XmlNameTable](../xmlnametable/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Συνιστάται η χρήση της κλάσης [XmlReader](../xmlreader/) αντ' αυτού.

Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
