---
title: "System::Xml::XmlWriter κλάση"
linktitle: "XmlWriter"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlWriter κλάση. Αντιπροσωπεύει έναν συγγραφέα που παρέχει έναν γρήγορο, μη προσωρινό, μόνο προς τα εμπρός τρόπο δημιουργίας ροών ή αρχείων που περιέχουν δεδομένα XML σε C++."
type: docs
weight: 4400
url: /el/cpp/system.xml/xmlwriter/
---
## XmlWriter class


Αντιπροσωπεύει έναν συγγραφέα που παρέχει έναν γρήγορο, μη προσωρινό, τρόπο μόνο προς τα εμπρός για τη δημιουργία ροών ή αρχείων που περιέχουν δεδομένα XML.

```cpp
class XmlWriter : public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Close](./close/)() | Όταν παρακαμφθεί σε μια παράγωγη κλάση, κλείνει αυτή τη ροή και την υποκείμενη ροή. |
| static [Create](./create/)(const String\&) | Δημιουργεί ένα νέο αντικείμενο [XmlWriter](./) χρησιμοποιώντας το καθορισμένο όνομα αρχείου. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlWriterSettings\>) | Δημιουργεί ένα νέο αντικείμενο [XmlWriter](./) χρησιμοποιώντας το όνομα αρχείου και το αντικείμενο [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Δημιουργεί ένα νέο αντικείμενο [XmlWriter](./) χρησιμοποιώντας τη συγκεκριμένη ροή. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) | Δημιουργεί ένα νέο αντικείμενο [XmlWriter](./) χρησιμοποιώντας τη ροή και το αντικείμενο [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&) | Δημιουργεί ένα νέο αντικείμενο [XmlWriter](./) χρησιμοποιώντας το καθορισμένο TextWriter. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Δημιουργεί ένα νέο αντικείμενο [XmlWriter](./) χρησιμοποιώντας το TextWriter και τα αντικείμενα [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&) | Δημιουργεί ένα νέο αντικείμενο [XmlWriter](./) χρησιμοποιώντας το καθορισμένο [Text::StringBuilder](../../system.text/stringbuilder/). |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) | Δημιουργεί ένα νέο αντικείμενο [XmlWriter](./) χρησιμοποιώντας το [Text::StringBuilder](../../system.text/stringbuilder/) και τα αντικείμενα [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&) | Δημιουργεί ένα νέο αντικείμενο [XmlWriter](./) χρησιμοποιώντας το καθορισμένο αντικείμενο [XmlWriter](./). |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Δημιουργεί ένα νέο αντικείμενο [XmlWriter](./) χρησιμοποιώντας το καθορισμένο αντικείμενο [XmlWriter](./) και τα αντικείμενα [XmlWriterSettings](../xmlwritersettings/). |
| [Dispose](./dispose/)() override | Απελευθερώνει όλους τους πόρους που χρησιμοποιούνται από το τρέχον αντικείμενο της κλάσης [XmlWriter](./). |
| virtual [Flush](./flush/)() | Όταν παρακαμφθεί σε μια παράγωγη κλάση, εκκενώνει ό,τι υπάρχει στη μνήμη buffer προς τις υποκείμενες ροές και επίσης εκκενώνει την υποκείμενη ροή. |
| virtual [get_Settings](./get_settings/)() | Επιστρέφει το αντικείμενο [XmlWriterSettings](../xmlwritersettings/) που χρησιμοποιήθηκε για τη δημιουργία αυτού του αντικειμένου [XmlWriter](./). |
| virtual [get_WriteState](./get_writestate/)() | Όταν παρακαμφθεί σε μια παράγωγη κλάση, λαμβάνει την κατάσταση του writer. |
| virtual [get_XmlLang](./get_xmllang/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει το τρέχον πεδίο **xml:lang**. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Όταν παρακαμφθεί σε μια παράγωγη κλάση, λαμβάνει ένα [XmlSpace](../xmlspace/) που αντιπροσωπεύει το τρέχον πεδίο **xml:space**. |
| virtual [LookupPrefix](./lookupprefix/)(String) | Όταν παρακαμφθεί σε μια παράγωγη κλάση, επιστρέφει το πλησιέστερο πρόθεμα που ορίζεται στο τρέχον πεδίο ονοματοχώρου για το URI του ονοματοχώρου. |
| virtual [WriteAttributes](./writeattributes/)(SharedPtr\<XmlReader\>, bool) | Όταν παρακαμφθεί σε μια παράγωγη κλάση, γράφει όλα τα χαρακτηριστικά που βρέθηκαν στην τρέχουσα θέση στο [XmlReader](../xmlreader/). |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&) | Όταν παρακαμφθεί σε μια παράγωγη κλάση, γράφει ένα χαρακτηριστικό με το καθορισμένο τοπικό όνομα, το URI του ονοματοχώρου και την τιμή. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&) | Όταν παρακαμφθεί σε μια παράγωγη κλάση, γράφει το χαρακτηριστικό με το καθορισμένο τοπικό όνομα και την τιμή. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&, const String\&) | Όταν παρακαμφθεί σε μια παράγωγη κλάση, γράφει το χαρακτηριστικό με το καθορισμένο πρόθεμα, τοπικό όνομα, URI ονοματοχώρου και τιμή. |
| virtual [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Όταν παρακαμφθεί σε μια παράγωγη κλάση, κωδικοποιεί τα καθορισμένα δυαδικά byte ως Base64 και γράφει το προκύπτον κείμενο. |
| virtual [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Όταν παρακαμφθεί σε μια παράγωγη κλάση, κωδικοποιεί τα καθορισμένα δυαδικά byte ως **BinHex** και γράφει το προκύπτον κείμενο. |
| virtual [WriteCData](./writecdata/)(String) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει ένα **...** μπλοκ που περιέχει το καθορισμένο κείμενο. |
| virtual [WriteCharEntity](./writecharentity/)(char16_t) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιβάλλει τη δημιουργία μιας οντότητας χαρακτήρα για την καθορισμένη τιμή Unicode. |
| virtual [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει κείμενο ένα buffer τη φορά. |
| virtual [WriteComment](./writecomment/)(String) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει ένα σχόλιο **** που περιέχει το καθορισμένο κείμενο. |
| virtual [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει τη δήλωση DOCTYPE με το καθορισμένο όνομα και προαιρετικά χαρακτηριστικά. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&) | Γράφει ένα στοιχείο με το καθορισμένο τοπικό όνομα και τιμή. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&) | Γράφει ένα στοιχείο με το καθορισμένο τοπικό όνομα, URI ονοματοχώρου και τιμή. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&, const String\&) | Γράφει ένα στοιχείο με το καθορισμένο πρόθεμα, τοπικό όνομα, URI ονοματοχώρου και τιμή. |
| virtual [WriteEndAttribute](./writeendattribute/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, κλείνει την προηγούμενη κλήση XmlWriter::WriteStartAttribute(String,String). |
| virtual [WriteEndDocument](./writeenddocument/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, κλείνει τυχόν ανοιχτά στοιχεία ή χαρακτηριστικά και επαναφέρει τον συγγραφέα στην κατάσταση Start. |
| virtual [WriteEndElement](./writeendelement/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, κλείνει ένα στοιχείο και αφαιρεί το αντίστοιχο πεδίο ονοματοχώρου. |
| virtual [WriteEntityRef](./writeentityref/)(const String\&) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει μια αναφορά οντότητας ως **&name**;. |
| virtual [WriteFullEndElement](./writefullendelement/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, κλείνει ένα στοιχείο και αφαιρεί το αντίστοιχο πεδίο ονοματοχώρου. |
| virtual [WriteName](./writename/)(const String\&) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει το καθορισμένο όνομα, διασφαλίζοντας ότι είναι έγκυρο όνομα σύμφωνα με τη σύσταση W3C XML 1.0 ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNmToken](./writenmtoken/)(const String\&) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει το καθορισμένο όνομα, διασφαλίζοντας ότι είναι έγκυρο NmToken σύμφωνα με τη σύσταση W3C XML 1.0 ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNode](./writenode/)(SharedPtr\<XmlReader\>, bool) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, αντιγράφει όλα από τον αναγνώστη στον συγγραφέα και μετακινεί τον αναγνώστη στην αρχή του επόμενου αδερφού. |
| virtual [WriteNode](./writenode/)(SharedPtr\<XPath::XPathNavigator\>, bool) | Αντιγράφει όλα από το αντικείμενο XPathNavigator στον συγγραφέα. Η θέση του XPathNavigator παραμένει αμετάβλητη. |
| virtual [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει μια οδηγία επεξεργασίας με κενό μεταξύ του ονόματος και του κειμένου ως εξής: **<?name text?>**. |
| virtual [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει το όνομα με προθεματισμό ονοματοχώρου. Αυτή η μέθοδος αναζητά το πρόθεμα που είναι εντός εμβέλειας για το δεδομένο ονοματοχώρο. |
| virtual [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει ακατέργαστο markup χειροκίνητα από ένα buffer χαρακτήρων. |
| virtual [WriteRaw](./writeraw/)(const String\&) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει ακατέργαστο markup χειροκίνητα από μια συμβολοσειρά. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&) | Γράφει την αρχή ενός χαρακτηριστικού με το καθορισμένο τοπικό όνομα και URI ονοματοχώρου. |
| virtual [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει την αρχή ενός χαρακτηριστικού με το καθορισμένο πρόθεμα, τοπικό όνομα και URI ονοματοχώρου. |
| [WriteStartAttribute](./writestartattribute/)(const String\&) | Γράφει την αρχή ενός χαρακτηριστικού με το καθορισμένο τοπικό όνομα. |
| virtual [WriteStartDocument](./writestartdocument/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει τη δήλωση XML με την έκδοση \"1.0\". |
| virtual [WriteStartDocument](./writestartdocument/)(bool) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει τη δήλωση XML με την έκδοση \"1.0\" και το χαρακτηριστικό standalone. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&) | Όταν παρακαμφθεί σε μια παράγωγη κλάση, γράφει την καθορισμένη ετικέτα έναρξης και τη συσχετίζει με το δεδομένο χώρο ονομάτων. |
| virtual [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) | Όταν παρακαμφθεί σε μια παράγωγη κλάση, γράφει την καθορισμένη ετικέτα έναρξης και τη συσχετίζει με το δεδομένο χώρο ονομάτων και πρόθεμα. |
| [WriteStartElement](./writestartelement/)(const String\&) | Όταν παρακαμφθεί σε μια παράγωγη κλάση, γράφει μια ετικέτα έναρξης με το καθορισμένο τοπικό όνομα. |
| virtual [WriteString](./writestring/)(const String\&) | Όταν παρακαμφθεί σε μια παράγωγη κλάση, γράφει το δεδομένο κείμενο. |
| virtual [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) | Όταν παρακαμφθεί σε μια παράγωγη κλάση, δημιουργεί και γράφει την οντότητα χαρακτήρα υποκατάστασης για το ζεύγος χαρακτήρων υποκατάστασης. |
| virtual [WriteValue](./writevalue/)(SharedPtr\<Object\>) | Γράφει την τιμή του αντικειμένου. |
| virtual [WriteValue](./writevalue/)(const String\&) | Γράφει μια τιμή [String](../../system/string/). |
| virtual [WriteValue](./writevalue/)(bool) | Γράφει μια τιμή [Boolean](../../system/boolean/). |
| virtual [WriteValue](./writevalue/)(DateTime) | Γράφει μια τιμή [DateTime](../../system/datetime/). |
| virtual [WriteValue](./writevalue/)(DateTimeOffset) | Γράφει μια τιμή [DateTimeOffset](../../system/datetimeoffset/). |
| virtual [WriteValue](./writevalue/)(double) | Γράφει μια τιμή [Double](../../system/double/). |
| virtual [WriteValue](./writevalue/)(float) | Γράφει έναν αριθμό κινητής υποδιαστολής μονής ακρίβειας. |
| virtual [WriteValue](./writevalue/)(Decimal) | Γράφει μια τιμή [Decimal](../../system/decimal/). |
| virtual [WriteValue](./writevalue/)(int32_t) | Γράφει μια τιμή [Int32](../../system/int32/). |
| virtual [WriteValue](./writevalue/)(int64_t) | Γράφει μια τιμή [Int64](../../system/int64/). |
| virtual [WriteWhitespace](./writewhitespace/)(String) | Όταν παρακαμφθεί σε μια παράγωγη κλάση, γράφει το δεδομένο λευκό διάστημα. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
