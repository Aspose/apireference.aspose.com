---
title: "System::Xml::XmlTextWriter κλάση"
linktitle: "XmlTextWriter"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlTextWriter κλάση. Αντιπροσωπεύει έναν συγγραφέα που παρέχει έναν γρήγορο, μη προσωρινό, μόνο προς τα εμπρός τρόπο δημιουργίας ροών ή αρχείων που περιέχουν δεδομένα XML που συμμορφώνονται με το W3C Extensible Markup Language (XML) 1.0 και τις προτάσεις Namespaces in XML σε C++."
type: docs
weight: 4000
url: /el/cpp/system.xml/xmltextwriter/
---
## XmlTextWriter class


Αντιπροσωπεύει έναν συγγραφέα που παρέχει έναν γρήγορο, μη προσωρινό, τρόπο μόνο προς τα εμπρός για τη δημιουργία ροών ή αρχείων που περιέχουν δεδομένα XML και συμμορφώνονται με το W3C Extensible Markup Language (XML) 1.0 και τις προτάσεις για ονοματοχώρους στο XML.

```cpp
class XmlTextWriter : public System::Xml::XmlWriter
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Close](./close/)() override | Κλείνει αυτή τη ροή και την υποκείμενη ροή. |
| [Flush](./flush/)() override | Αδειάζει ό,τι υπάρχει στην ενδιάμεση μνήμη προς τις υποκείμενες ροές και επίσης αδειάζει την υποκείμενη ροή. |
| [get_BaseStream](./get_basestream/)() | Επιστρέφει το αντικείμενο της υποκείμενης ροής. |
| [get_Formatting](./get_formatting/)() | Δείχνει πώς μορφοποιείται η έξοδος. |
| [get_Indentation](./get_indentation/)() | Επιστρέφει πόσους χαρακτήρες εσοχής (IndentChars) να γράψει για κάθε επίπεδο στην ιεραρχία όταν το [XmlTextWriter::set_Formatting](./set_formatting/) είναι ορισμένο σε [Formatting::Indented](../formatting/). |
| [get_IndentChar](./get_indentchar/)() | Επιστρέφει ποιον χαρακτήρα να χρησιμοποιήσει για την εσοχή όταν το [XmlTextWriter::set_Formatting](./set_formatting/) είναι ορισμένο σε [Formatting::Indented](../formatting/). |
| [get_Namespaces](./get_namespaces/)() | Επιστρέφει μια τιμή που υποδεικνύει αν θα γίνει υποστήριξη χώρου ονομάτων. |
| [get_QuoteChar](./get_quotechar/)() | Επιστρέφει ποιον χαρακτήρα να χρησιμοποιήσει για την παράθεση τιμών χαρακτηριστικών. |
| [get_WriteState](./get_writestate/)() override | Επιστρέφει την κατάσταση του συγγραφέα. |
| [get_XmlLang](./get_xmllang/)() override | Επιστρέφει το τρέχον πεδίο **xml:lang**. |
| [get_XmlSpace](./get_xmlspace/)() override | Επιστρέφει ένα [XmlSpace](../xmlspace/) που αντιπροσωπεύει το τρέχον πεδίο **xml:space**. |
| [LookupPrefix](./lookupprefix/)(String) override | Επιστρέφει το πλησιέστερο πρόθεμα που ορίζεται στο τρέχον πεδίο ονομάτων χώρου για το URI του χώρου ονομάτων. |
| [set_Formatting](./set_formatting/)(System::Xml::Formatting) | Δείχνει πώς μορφοποιείται η έξοδος. |
| [set_Indentation](./set_indentation/)(int32_t) | Ορίζει πόσους χαρακτήρες εσοχής (IndentChars) να γράφει για κάθε επίπεδο στην ιεραρχία όταν το [XmlTextWriter::set_Formatting](./set_formatting/) είναι ορισμένο σε [Formatting::Indented](../formatting/). |
| [set_IndentChar](./set_indentchar/)(char16_t) | Ορίζει ποιον χαρακτήρα να χρησιμοποιήσει για την εσοχή όταν το [XmlTextWriter::set_Formatting](./set_formatting/) είναι ορισμένο σε [Formatting::Indented](../formatting/). |
| [set_Namespaces](./set_namespaces/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν θα γίνει υποστήριξη χώρου ονομάτων. |
| [set_QuoteChar](./set_quotechar/)(char16_t) | Ορίζει ποιο χαρακτήρα θα χρησιμοποιηθεί για την παράθεση τιμών ιδιότητας. |
| [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Κωδικοποιεί τα καθορισμένα δυαδικά byte ως base64 και γράφει το προκύπτον κείμενο. |
| [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Κωδικοποιεί τα καθορισμένα δυαδικά byte ως binhex και γράφει το προκύπτον κείμενο. |
| [WriteCData](./writecdata/)(String) override | Γράφει ένα μπλοκ **...** που περιέχει το καθορισμένο κείμενο. |
| [WriteCharEntity](./writecharentity/)(char16_t) override | Επιβάλλει τη δημιουργία μιας οντότητας χαρακτήρα για την καθορισμένη τιμή χαρακτήρα Unicode. |
| [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Γράφει κείμενο ένα buffer τη φορά. |
| [WriteComment](./writecomment/)(String) override | Γράφει ένα σχόλιο **** που περιέχει το καθορισμένο κείμενο. |
| [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) override | Γράφει τη δήλωση DOCTYPE με το καθορισμένο όνομα και προαιρετικές ιδιότητες. |
| [WriteEndAttribute](./writeendattribute/)() override | Κλείνει την προηγούμενη κλήση [XmlTextWriter::WriteStartAttribute](./writestartattribute/). |
| [WriteEndDocument](./writeenddocument/)() override | Κλείνει τυχόν ανοιχτά στοιχεία ή ιδιότητες και επαναφέρει τον συγγραφέα στην κατάσταση Start. |
| [WriteEndElement](./writeendelement/)() override | Κλείνει ένα στοιχείο και αφαιρεί το αντίστοιχο πεδίο ονομάτων (namespace). |
| [WriteEntityRef](./writeentityref/)(const String\&) override | Γράφει μια αναφορά οντότητας ως **&name**;. |
| [WriteFullEndElement](./writefullendelement/)() override | Κλείνει ένα στοιχείο και αφαιρεί το αντίστοιχο πεδίο ονομάτων (namespace). |
| [WriteName](./writename/)(const String\&) override | Γράφει το καθορισμένο όνομα, διασφαλίζοντας ότι είναι έγκυρο όνομα σύμφωνα με την [σύσταση W3C XML 1.0](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name). |
| [WriteNmToken](./writenmtoken/)(const String\&) override | Γράφει το καθορισμένο όνομα, διασφαλίζοντας ότι είναι έγκυρο **NmToken** σύμφωνα με την [σύσταση W3C XML 1.0](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name). |
| [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) override | Γράφει μια οδηγία επεξεργασίας με κενό μεταξύ του ονόματος και του κειμένου ως εξής: **<?name text?>**. |
| [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) override | Γράφει το namespace-qualified name. Αυτή η μέθοδος αναζητά το πρόθεμα που είναι εντός πεδίου για το δεδομένο namespace. |
| [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Γράφει ακατέργαστο markup χειροκίνητα από ένα buffer χαρακτήρων. |
| [WriteRaw](./writeraw/)(const String\&) override | Γράφει ακατέργαστο markup χειροκίνητα από μια συμβολοσειρά. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) override | Γράφει την αρχή μιας ιδιότητας. |
| [WriteStartDocument](./writestartdocument/)() override | Γράφει τη δήλωση XML με την έκδοση "1.0". |
| [WriteStartDocument](./writestartdocument/)(bool) override | Γράφει τη δήλωση XML με την έκδοση "1.0" και την ιδιότητα standalone. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) override | Γράφει την καθορισμένη ετικέτα έναρξης και τη συσχετίζει με το δοσμένο namespace και πρόθεμα. |
| [WriteString](./writestring/)(const String\&) override | Γράφει το δοσμένο περιεχόμενο κειμένου. |
| [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) override | Δημιουργεί και γράφει την οντότητα χαρακτήρα υποκατάστασης για το ζεύγος χαρακτήρων υποκατάστασης. |
| [WriteWhitespace](./writewhitespace/)(String) override | Γράφει το δοσμένο λευκό διάστημα. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | Δημιουργεί ένα στιγμιότυπο της κλάσης [XmlTextWriter](./) χρησιμοποιώντας τη συγκεκριμένη ροή και κωδικοποίηση. |
| [XmlTextWriter](./xmltextwriter/)(const String\&, const SharedPtr\<Text::Encoding\>\&) | Δημιουργεί ένα στιγμιότυπο της κλάσης [XmlTextWriter](./) χρησιμοποιώντας το συγκεκριμένο αρχείο. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::TextWriter\>\&) | Δημιουργεί ένα στιγμιότυπο της κλάσης [XmlTextWriter](./) χρησιμοποιώντας τον συγκεκριμένο TextWriter. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Συνιστάται η χρήση της κλάσης [XmlWriter](../xmlwriter/) αντ' αυτού.

Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlWriter](../xmlwriter/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
