---
title: "System::Xml::XmlReader class"
linktitle: "XmlReader"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader class. Αντιπροσωπεύει έναν αναγνώστη που παρέχει γρήγορη, μη προσωρινή, μόνο-προώθηση πρόσβαση σε δεδομένα XML σε C++."
type: docs
weight: 3300
url: /el/cpp/system.xml/xmlreader/
---
## XmlReader class


Αντιπροσωπεύει έναν αναγνώστη που παρέχει γρήγορη, μη προσωρινή, πρόσβαση μόνο προς τα εμπρός στα δεδομένα XML.

```cpp
class XmlReader : public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Close](./close/)() | Όταν παρακάμπτεται σε μια κληρονομημένη κλάση, αλλάζει το [XmlReader::get_ReadState](./get_readstate/) σε [ReadState::Closed](../readstate/). |
| static [Create](./create/)(const String\&) | Δημιουργεί ένα νέο [XmlReader](./) αντίγραφο με καθορισμένο URI. |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | Δημιουργεί ένα νέο [XmlReader](./) αντίγραφο χρησιμοποιώντας το καθορισμένο URI και τις ρυθμίσεις. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Δημιουργεί ένα νέο [XmlReader](./) αντίγραφο χρησιμοποιώντας το καθορισμένο URI, τις ρυθμίσεις και τις πληροφορίες περιβάλλοντος για την ανάλυση. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Δημιουργεί ένα νέο [XmlReader](./) αντίγραφο χρησιμοποιώντας το καθορισμένο ρεύμα με προεπιλεγμένες ρυθμίσεις. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Δημιουργεί ένα νέο [XmlReader](./) αντίγραφο με το καθορισμένο ρεύμα και τις ρυθμίσεις. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Δημιουργεί ένα νέο [XmlReader](./) αντίγραφο χρησιμοποιώντας το καθορισμένο ρεύμα, το βασικό URI και τις ρυθμίσεις. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Δημιουργεί ένα νέο [XmlReader](./) αντίγραφο χρησιμοποιώντας το καθορισμένο ρεύμα, τις ρυθμίσεις και τις πληροφορίες περιβάλλοντος για την ανάλυση. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | Δημιουργεί ένα νέο [XmlReader](./) αντίγραφο χρησιμοποιώντας τον καθορισμένο αναγνώστη κειμένου. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Δημιουργεί ένα νέο [XmlReader](./) αντίγραφο χρησιμοποιώντας τον καθορισμένο αναγνώστη κειμένου και τις ρυθμίσεις. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Δημιουργεί ένα νέο [XmlReader](./) αντίγραφο χρησιμοποιώντας τον καθορισμένο αναγνώστη κειμένου, τις ρυθμίσεις και το βασικό URI. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Δημιουργεί ένα νέο [XmlReader](./) αντίγραφο χρησιμοποιώντας τον καθορισμένο αναγνώστη κειμένου, τις ρυθμίσεις και τις πληροφορίες περιβάλλοντος για την ανάλυση. |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | Δημιουργεί ένα νέο [XmlReader](./) αντίγραφο χρησιμοποιώντας τον καθορισμένο αναγνώστη XML και τις ρυθμίσεις. |
| [Dispose](./dispose/)() override | Απελευθερώνει όλους τους πόρους που χρησιμοποιούνται από το τρέχον αντίγραφο της κλάσης [XmlReader](./). |
| virtual [get_AttributeCount](./get_attributecount/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιστρέφει τον αριθμό των χαρακτηριστικών στον τρέχον κόμβο. |
| virtual [get_BaseURI](./get_baseuri/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιστρέφει το βασικό URI του τρέχοντος κόμβου. |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν το [XmlReader](./) υλοποιεί τις μεθόδους ανάγνωσης δυαδικού περιεχομένου. |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν το [XmlReader](./) υλοποιεί τη μέθοδο [XmlReader::ReadValueChunk](./readvaluechunk/). |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν αυτός ο αναγνώστης μπορεί να αναλύσει και να επιλύσει οντότητες. |
| virtual [get_Depth](./get_depth/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιστρέφει το βάθος του τρέχοντος κόμβου στο έγγραφο XML. |
| virtual [get_EOF](./get_eof/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιστρέφει μια τιμή που υποδεικνύει εάν ο αναγνώστης βρίσκεται στο τέλος της ροής. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος έχει οποιαδήποτε χαρακτηριστικά. |
| virtual [get_HasValue](./get_hasvalue/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος μπορεί να έχει τιμή [XmlReader::get_Value](./get_value/). |
| virtual [get_IsDefault](./get_isdefault/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος είναι ένα χαρακτηριστικό που δημιουργήθηκε από την προεπιλεγμένη τιμή που ορίζεται στο DTD ή στο σχήμα. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος είναι ένα κενό στοιχείο (για παράδειγμα, **<MyElement/>**). |
| virtual [get_LocalName](./get_localname/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιστρέφει το τοπικό όνομα του τρέχοντος κόμβου. |
| virtual [get_Name](./get_name/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιστρέφει το πλήρες όνομα του τρέχοντος κόμβου. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιστρέφει το URI του ονόματος χώρου (όπως ορίζεται στην προδιαγραφή ονομάτων χώρου W3C) του κόμβου στον οποίο βρίσκεται ο αναγνώστης. |
| virtual [get_NameTable](./get_nametable/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει το [XmlNameTable](../xmlnametable/) που σχετίζεται με αυτήν την υλοποίηση. |
| virtual [get_NodeType](./get_nodetype/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει τον τύπο του τρέχοντος κόμβου. |
| virtual [get_Prefix](./get_prefix/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει το πρόθεμα του χώρου ονομάτων που σχετίζεται με τον τρέχοντα κόμβο. |
| virtual [get_QuoteChar](./get_quotechar/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει το χαρακτήρα εισαγωγικών που χρησιμοποιείται για την περιτύλιξη της τιμής ενός κόμβου χαρακτηριστικού. |
| virtual [get_ReadState](./get_readstate/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει την κατάσταση του αναγνώστη. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Επιστρέφει τις πληροφορίες σχήματος που έχουν εκχωρηθεί στον τρέχοντα κόμβο ως αποτέλεσμα της επικύρωσης σχήματος. |
| virtual [get_Settings](./get_settings/)() | Επιστρέφει το αντικείμενο [XmlReaderSettings](../xmlreadersettings/) που χρησιμοποιείται για τη δημιουργία αυτής της παρουσίας του [XmlReader](./). |
| virtual [get_Value](./get_value/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει την τιμή κειμένου του τρέχοντος κόμβου. |
| virtual [get_ValueType](./get_valuetype/)() | Επιστρέφει τον τύπο για τον τρέχοντα κόμβο. |
| virtual [get_XmlLang](./get_xmllang/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει το τρέχον πεδίο **xml:lang**. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει το τρέχον πεδίο **xml:space**. |
| virtual [GetAttribute](./getattribute/)(String) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει την τιμή του χαρακτηριστικού με την καθορισμένη τιμή του [XmlReader::get_Name](./get_name/). |
| virtual [GetAttribute](./getattribute/)(String, String) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει την τιμή του χαρακτηριστικού με τις καθορισμένες τιμές του [XmlReader::get_LocalName](./get_localname/) και του [XmlReader::get_NamespaceURI](./get_namespaceuri/). |
| virtual [GetAttribute](./getattribute/)(int32_t) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο ευρετήριο. |
| virtual [idx_get](./idx_get/)(int32_t) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο ευρετήριο. |
| virtual [idx_get](./idx_get/)(String) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει την τιμή του χαρακτηριστικού με την καθορισμένη τιμή του [XmlReader::get_Name](./get_name/). |
| virtual [idx_get](./idx_get/)(String, String) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει την τιμή του χαρακτηριστικού με τις καθορισμένες τιμές του [XmlReader::get_LocalName](./get_localname/) και του [XmlReader::get_NamespaceURI](./get_namespaceuri/). |
| static [IsName](./isname/)(const String\&) | Επιστρέφει μια τιμή που υποδεικνύει εάν το όρισμα συμβολοσειράς είναι έγκυρο όνομα XML. |
| static [IsNameToken](./isnametoken/)(const String\&) | Επιστρέφει μια τιμή που υποδεικνύει εάν ή όχι το όρισμα συμβολοσειράς είναι έγκυρο διακριτικό ονόματος XML. |
| virtual [IsStartElement](./isstartelement/)() | Καλεί το [XmlReader::MoveToContent](./movetocontent/) και ελέγχει εάν ο τρέχων κόμβος περιεχομένου είναι ετικέτα έναρξης ή ετικέτα κενού στοιχείου. |
| virtual [IsStartElement](./isstartelement/)(String) | Καλεί το [XmlReader::MoveToContent](./movetocontent/) και ελέγχει εάν ο τρέχων κόμβος περιεχομένου είναι ετικέτα έναρξης ή ετικέτα κενού στοιχείου και εάν η τιμή του [XmlReader::get_Name](./get_name/) του ευρεθέντος στοιχείου ταιριάζει με το δοσμένο όρισμα. |
| virtual [IsStartElement](./isstartelement/)(String, String) | Καλεί το [XmlReader::MoveToContent](./movetocontent/) και ελέγχει εάν ο τρέχων κόμβος περιεχομένου είναι ετικέτα έναρξης ή ετικέτα κενού στοιχείου και εάν οι τιμές του [XmlReader::get_LocalName](./get_localname/) και του [XmlReader::get_NamespaceURI](./get_namespaceuri/) του ευρεθέντος στοιχείου ταιριάζουν με τις δοσμένες συμβολοσειρές. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιλύει ένα πρόθεμα χώρου ονομάτων στην εμβέλεια του τρέχοντος στοιχείου. |
| virtual [MoveToAttribute](./movetoattribute/)(String) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, μετακινείται στο χαρακτηριστικό με την καθορισμένη τιμή του [XmlReader::get_Name](./get_name/). |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, μετακινείται στο χαρακτηριστικό με τις καθορισμένες τιμές του [XmlReader::get_LocalName](./get_localname/) και του [XmlReader::get_NamespaceURI](./get_namespaceuri/). |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, μετακινείται στο χαρακτηριστικό με το καθορισμένο ευρετήριο. |
| virtual [MoveToContent](./movetocontent/)() | Ελέγχει εάν ο τρέχων κόμβος είναι κόμβος περιεχομένου (μη κενό κείμενο, **CDATA**, **Element**, **EndElement**, **EntityReference**, ή **EndEntity**). Εάν ο κόμβος δεν είναι κόμβος περιεχομένου, ο αναγνώστης παραλείπει προς τον επόμενο κόμβο περιεχομένου ή το τέλος του αρχείου. Παραλείπει κόμβους των ακόλουθων τύπων: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace**, ή **SignificantWhitespace**. |
| virtual [MoveToElement](./movetoelement/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, μετακινείται στο στοιχείο που περιέχει τον τρέχοντα κόμβο χαρακτηριστικού. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Όταν παρακαμφθεί σε μια παράγωγη κλάση, μετακινείται στο πρώτο χαρακτηριστικό. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Όταν παρακαμφθεί σε μια παράγωγη κλάση, μετακινείται στο επόμενο χαρακτηριστικό. |
| virtual [Read](./read/)() | Όταν παρακαμφθεί σε μια παράγωγη κλάση, διαβάζει τον επόμενο κόμβο από τη ροή. |
| virtual [ReadAttributeValue](./readattributevalue/)() | Όταν παρακαμφθεί σε μια παράγωγη κλάση, αναλύει την τιμή του χαρακτηριστικού σε ένα ή περισσότερα **[Text](../../system.text/)**, **EntityReference**, ή **EndEntity** κόμβους. |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Διαβάζει το περιεχόμενο ως ένα αντικείμενο του καθορισμένου τύπου. |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Διαβάζει το περιεχόμενο και επιστρέφει τα δυαδικά bytes που αποκωδικοποιήθηκαν σε Base64. |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Διαβάζει το περιεχόμενο και επιστρέφει τα **BinHex** αποκωδικοποιημένα δυαδικά bytes. |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | Διαβάζει το κείμενο στην τρέχουσα θέση ως ένα αντικείμενο [Boolean](../../system/boolean/). |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | Διαβάζει το κείμενο στην τρέχουσα θέση ως ένα αντικείμενο [DateTime](../../system/datetime/). |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | Διαβάζει το κείμενο στην τρέχουσα θέση ως ένα αντικείμενο [DateTimeOffset](../../system/datetimeoffset/). |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | Διαβάζει το κείμενο στην τρέχουσα θέση ως ένα αντικείμενο [Decimal](../../system/decimal/). |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | Διαβάζει το κείμενο στην τρέχουσα θέση ως αριθμό κινητής υποδιαστολής διπλής ακρίβειας. |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | Διαβάζει το κείμενο στην τρέχουσα θέση ως αριθμό κινητής υποδιαστολής μονής ακρίβειας. |
| virtual [ReadContentAsInt](./readcontentasint/)() | Διαβάζει το κείμενο στην τρέχουσα θέση ως 32-bit υπογεγραμμένο ακέραιο. |
| virtual [ReadContentAsLong](./readcontentaslong/)() | Διαβάζει το κείμενο στην τρέχουσα θέση ως 64-bit υπογεγραμμένο ακέραιο. |
| virtual [ReadContentAsObject](./readcontentasobject/)() | Διαβάζει το κείμενο στην τρέχουσα θέση ως ένα [Object](../../system/object/). |
| virtual [ReadContentAsString](./readcontentasstring/)() | Διαβάζει το κείμενο στην τρέχουσα θέση ως ένα αντικείμενο [String](../../system/string/). |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Διαβάζει το περιεχόμενο του στοιχείου ως τον ζητούμενο τύπο. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | Ελέγχει ότι το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου ταιριάζουν με αυτά του τρέχοντος στοιχείου, στη συνέχεια διαβάζει το περιεχόμενο του στοιχείου ως τον ζητούμενο τύπο. |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Διαβάζει το στοιχείο και αποκωδικοποιεί το περιεχόμενο **Base64**. |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Διαβάζει το στοιχείο και αποκωδικοποιεί το περιεχόμενο **BinHex**. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | Διαβάζει το τρέχον στοιχείο και επιστρέφει τα περιεχόμενα ως ένα αντικείμενο [Boolean](../../system/boolean/). |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | Ελέγχει ότι το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου ταιριάζουν με αυτά του τρέχοντος στοιχείου, στη συνέχεια διαβάζει το τρέχον στοιχείο και επιστρέφει τα περιεχόμενα ως ένα αντικείμενο [Boolean](../../system/boolean/). |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | Διαβάζει το τρέχον στοιχείο και επιστρέφει τα περιεχόμενα ως ένα αντικείμενο [DateTime](../../system/datetime/). |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | Ελέγχει ότι το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου ταιριάζουν με αυτά του τρέχοντος στοιχείου, στη συνέχεια διαβάζει το τρέχον στοιχείο και επιστρέφει τα περιεχόμενα ως ένα αντικείμενο [DateTime](../../system/datetime/). |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | Διαβάζει το τρέχον στοιχείο και επιστρέφει τα περιεχόμενα ως ένα αντικείμενο [Decimal](../../system/decimal/). |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | Ελέγχει ότι το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου ταιριάζουν με αυτά του τρέχοντος στοιχείου, στη συνέχεια διαβάζει το τρέχον στοιχείο και επιστρέφει τα περιεχόμενα ως ένα αντικείμενο [Decimal](../../system/decimal/). |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | Διαβάζει το τρέχον στοιχείο και επιστρέφει τα περιεχόμενα ως αριθμό κινητής υποδιαστολής διπλής ακρίβειας. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | Ελέγχει ότι το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου ταιριάζουν με αυτά του τρέχοντος στοιχείου, στη συνέχεια διαβάζει το τρέχον στοιχείο και επιστρέφει το περιεχόμενο ως αριθμό κινητής υποδιαστολής διπλής ακρίβειας. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | Διαβάζει το τρέχον στοιχείο και επιστρέφει το περιεχόμενο ως αριθμό κινητής υποδιαστολής μονής ακρίβειας. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | Ελέγχει ότι το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου ταιριάζουν με αυτά του τρέχοντος στοιχείου, στη συνέχεια διαβάζει το τρέχον στοιχείο και επιστρέφει το περιεχόμενο ως αριθμό κινητής υποδιαστολής μονής ακρίβειας. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | Διαβάζει το τρέχον στοιχείο και επιστρέφει το περιεχόμενο ως 32‑bit ακέραιο με πρόσημο. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | Ελέγχει ότι το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου ταιριάζουν με αυτά του τρέχοντος στοιχείου, στη συνέχεια διαβάζει το τρέχον στοιχείο και επιστρέφει το περιεχόμενο ως 32‑bit ακέραιο με πρόσημο. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | Διαβάζει το τρέχον στοιχείο και επιστρέφει το περιεχόμενο ως 64‑bit ακέραιο με πρόσημο. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | Ελέγχει ότι το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου ταιριάζουν με αυτά του τρέχοντος στοιχείου, στη συνέχεια διαβάζει το τρέχον στοιχείο και επιστρέφει το περιεχόμενο ως 64‑bit ακέραιο με πρόσημο. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | Διαβάζει το τρέχον στοιχείο και επιστρέφει το περιεχόμενο ως ένα [Object](../../system/object/). |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | Ελέγχει ότι το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου ταιριάζουν με αυτά του τρέχοντος στοιχείου, στη συνέχεια διαβάζει το τρέχον στοιχείο και επιστρέφει το περιεχόμενο ως ένα [Object](../../system/object/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | Διαβάζει το τρέχον στοιχείο και επιστρέφει το περιεχόμενο ως ένα αντικείμενο [String](../../system/string/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | Ελέγχει ότι το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου ταιριάζουν με αυτά του τρέχοντος στοιχείου, στη συνέχεια διαβάζει το τρέχον στοιχείο και επιστρέφει το περιεχόμενο ως ένα αντικείμενο [String](../../system/string/). |
| virtual [ReadElementString](./readelementstring/)() | Διαβάζει ένα στοιχείο μόνο κειμένου. Ωστόσο, συνιστάται η χρήση της μεθόδου [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) αντ' αυτού, επειδή παρέχει έναν πιο απλό τρόπο διαχείρισης αυτής της λειτουργίας. |
| virtual [ReadElementString](./readelementstring/)(String) | Ελέγχει ότι η τιμή [XmlReader::get_Name](./get_name/) του εντοπισμένου στοιχείου ταιριάζει με το δοσμένο κείμενο πριν διαβάσει ένα στοιχείο μόνο κειμένου. Ωστόσο, συνιστάται η χρήση της μεθόδου [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) αντ' αυτού, επειδή παρέχει έναν πιο απλό τρόπο διαχείρισης αυτής της λειτουργίας. |
| virtual [ReadElementString](./readelementstring/)(String, String) | Ελέγχει ότι οι τιμές [XmlReader::get_LocalName](./get_localname/) και [XmlReader::get_NamespaceURI](./get_namespaceuri/) του εντοπισμένου στοιχείου ταιριάζουν με τα δοσμένα κείμενα πριν διαβάσει ένα στοιχείο μόνο κειμένου. Ωστόσο, συνιστάται η χρήση της μεθόδου [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) αντ' αυτού, επειδή παρέχει έναν πιο απλό τρόπο διαχείρισης αυτής της λειτουργίας. |
| virtual [ReadEndElement](./readendelement/)() | Ελέγχει ότι ο τρέχων κόμβος περιεχομένου είναι ετικέτα λήξης και προχωρά τον αναγνώστη στον επόμενο κόμβο. |
| virtual [ReadInnerXml](./readinnerxml/)() | Όταν υπερκαλύπτεται σε μια παράγωγη κλάση, διαβάζει όλο το περιεχόμενο, συμπεριλαμβανομένου του σήματος, ως συμβολοσειρά. |
| virtual [ReadOuterXml](./readouterxml/)() | Όταν υπερκαλύπτεται σε μια παράγωγη κλάση, διαβάζει το περιεχόμενο, συμπεριλαμβανομένου του σήματος, που αντιπροσωπεύει αυτόν τον κόμβο και όλα τα παιδιά του. |
| virtual [ReadStartElement](./readstartelement/)() | Ελέγχει ότι ο τρέχων κόμβος είναι στοιχείο και προχωρά τον αναγνώστη στον επόμενο κόμβο. |
| virtual [ReadStartElement](./readstartelement/)(String) | Ελέγχει ότι ο τρέχων κόμβος περιεχομένου είναι στοιχείο με τη δεδομένη τιμή [XmlReader::get_Name](./get_name/) και προχωρά τον αναγνώστη στον επόμενο κόμβο. |
| virtual [ReadStartElement](./readstartelement/)(String, String) | Ελέγχει ότι ο τρέχων κόμβος περιεχομένου είναι στοιχείο με τις δεδομένες τιμές [XmlReader::get_LocalName](./get_localname/) και [XmlReader::get_NamespaceURI](./get_namespaceuri/) και προχωρά τον αναγνώστη στον επόμενο κόμβο. |
| virtual [ReadString](./readstring/)() | Όταν υπερκαλύπτεται σε μια παράγωγη κλάση, διαβάζει το περιεχόμενο ενός στοιχείου ή κόμβου κειμένου ως συμβολοσειρά. Ωστόσο, συνιστάται η χρήση της μεθόδου [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) αντ' αυτού, επειδή παρέχει έναν πιο απλό τρόπο διαχείρισης αυτής της λειτουργίας. |
| virtual [ReadSubtree](./readsubtree/)() | Επιστρέφει ένα νέο αντικείμενο [XmlReader](./) που μπορεί να χρησιμοποιηθεί για την ανάγνωση του τρέχοντος κόμβου και όλων των απογόνων του. |
| virtual [ReadToDescendant](./readtodescendant/)(String) | Προχωρά το [XmlReader](./) στο επόμενο απογόμενο στοιχείο με το καθορισμένο πλήρες όνομα. |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | Προχωρά το [XmlReader](./) στο επόμενο απογόμενο στοιχείο με το καθορισμένο τοπικό όνομα και URI ονοματοχώρου. |
| virtual [ReadToFollowing](./readtofollowing/)(String) | Διαβάζει μέχρι να βρεθεί ένα στοιχείο με το καθορισμένο πλήρες όνομα. |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | Διαβάζει μέχρι να βρεθεί ένα στοιχείο με το καθορισμένο τοπικό όνομα και URI ονοματοχώρου. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | Προχωρά το [XmlReader](./) στο επόμενο αδερφικό στοιχείο με το καθορισμένο πλήρες όνομα. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | Προχωρά το [XmlReader](./) στο επόμενο αδερφικό στοιχείο με το καθορισμένο τοπικό όνομα και URI ονοματοχώρου. |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Διαβάζει μεγάλα ρεύματα κειμένου ενσωματωμένα σε ένα έγγραφο XML. |
| virtual [ResolveEntity](./resolveentity/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιλύει την αναφορά οντότητας για κόμβους **EntityReference**. |
| virtual [Skip](./skip/)() | Παραλείπει τα παιδιά του τρέχοντος κόμβου. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
