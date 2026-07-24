---
title: "System::Xml::XmlReaderSettings κλάση"
linktitle: "XmlReaderSettings"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReaderSettings κλάση. Καθορίζει ένα σύνολο χαρακτηριστικών για υποστήριξη στο αντικείμενο XmlReader που δημιουργείται από τη μέθοδο XmlReader::Create σε C++."
type: docs
weight: 3400
url: /el/cpp/system.xml/xmlreadersettings/
---
## XmlReaderSettings class


Καθορίζει ένα σύνολο χαρακτηριστικών για υποστήριξη στο αντικείμενο [XmlReader](../xmlreader/) που δημιουργείται από τη μέθοδο [XmlReader::Create](../xmlreader/create/).

```cpp
class XmlReaderSettings : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CheckReadOnly](./checkreadonly/)(const String\&) |  |
| [Clone](./clone/)() | Δημιουργεί ένα αντίγραφο της παρουσίας [XmlReaderSettings](./). |
| [get_CheckCharacters](./get_checkcharacters/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν θα γίνει έλεγχος χαρακτήρων. |
| [get_CloseInput](./get_closeinput/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η υποκείμενη ροή ή το TextReader πρέπει να κλείσει όταν κλείνει ο αναγνώστης. |
| [get_ConformanceLevel](./get_conformancelevel/)() | Επιστρέφει το επίπεδο συμμόρφωσης στο οποίο θα τηρείται ο [XmlReader](../xmlreader/). |
| [get_DtdProcessing](./get_dtdprocessing/)() | Επιστρέφει μια τιμή που καθορίζει την επεξεργασία των DTD. |
| [get_IgnoreComments](./get_ignorecomments/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν θα αγνοηθούν τα σχόλια. |
| [get_IgnoreProcessingInstructions](./get_ignoreprocessinginstructions/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν θα αγνοηθούν οι οδηγίες επεξεργασίας. |
| [get_IgnoreWhitespace](./get_ignorewhitespace/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν θα αγνοηθούν τα ασήμαντα κενά. |
| [get_LineNumberOffset](./get_linenumberoffset/)() | Επιστρέφει τη μετατόπιση του αριθμού γραμμής του αντικειμένου [XmlReader](../xmlreader/). |
| [get_LinePositionOffset](./get_linepositionoffset/)() | Επιστρέφει τη μετατόπιση της θέσης γραμμής του αντικειμένου [XmlReader](../xmlreader/). |
| [get_MaxCharactersFromEntities](./get_maxcharactersfromentities/)() | Επιστρέφει μια τιμή που υποδεικνύει τον μέγιστο επιτρεπτό αριθμό χαρακτήρων σε ένα έγγραφο που προκύπτει από την επέκταση οντοτήτων. |
| [get_MaxCharactersInDocument](./get_maxcharactersindocument/)() | Επιστρέφει μια τιμή που υποδεικνύει τον μέγιστο επιτρεπτό αριθμό χαρακτήρων σε ένα έγγραφο XML. Μια τιμή μηδέν (0) σημαίνει ότι δεν υπάρχουν περιορισμοί στο μέγεθος του εγγράφου XML. Μια μη μηδενική τιμή καθορίζει το μέγιστο μέγεθος, σε χαρακτήρες. |
| [get_NameTable](./get_nametable/)() | Επιστρέφει το [XmlNameTable](../xmlnametable/) που χρησιμοποιείται για ατομικές συγκρίσεις συμβολοσειρών. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | Επιστρέφει μια τιμή που υποδεικνύει αν πρέπει να απαγορευτεί η επεξεργασία ορισμού τύπου εγγράφου (DTD). |
| [get_Schemas](./get_schemas/)() | Επιστρέφει το XmlSchemaSet που θα χρησιμοποιηθεί κατά την εκτέλεση επικύρωσης σχήματος. |
| [get_ValidationFlags](./get_validationflags/)() | Επιστρέφει μια τιμή που υποδεικνύει τις ρυθμίσεις επικύρωσης σχήματος. Αυτή η ρύθμιση εφαρμόζεται σε αντικείμενα [XmlReader](../xmlreader/) που επικυρώνουν σχήματα (η τιμή του [XmlReaderSettings::get_ValidationType](./get_validationtype/) είναι [ValidationType::Schema](../validationtype/)). |
| [get_ValidationType](./get_validationtype/)() | Επιστρέφει μια τιμή που υποδεικνύει αν το [XmlReader](../xmlreader/) θα εκτελεί επικύρωση ή ανάθεση τύπου κατά την ανάγνωση. |
| [Reset](./reset/)() | Επαναφέρει τα μέλη της κλάσης ρυθμίσεων στις προεπιλεγμένες τιμές τους. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν θα γίνει έλεγχος χαρακτήρων. |
| [set_CloseInput](./set_closeinput/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν η υποκείμενη ροή ή το TextReader πρέπει να κλείσουν όταν κλείσει ο αναγνώστης. |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | Ορίζει το επίπεδο συμμόρφωσης στο οποίο θα τηρεί το [XmlReader](../xmlreader/). |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | Ορίζει μια τιμή που καθορίζει την επεξεργασία των DTD. |
| [set_IgnoreComments](./set_ignorecomments/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν θα αγνοηθούν τα σχόλια. |
| [set_IgnoreProcessingInstructions](./set_ignoreprocessinginstructions/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν θα αγνοηθούν οι οδηγίες επεξεργασίας. |
| [set_IgnoreWhitespace](./set_ignorewhitespace/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν θα αγνοηθεί το ασήμαντο λευκό διάστημα. |
| [set_LineNumberOffset](./set_linenumberoffset/)(int32_t) | Ορίζει την απόκλιση αριθμού γραμμής του αντικειμένου [XmlReader](../xmlreader/). |
| [set_LinePositionOffset](./set_linepositionoffset/)(int32_t) | Ορίζει την απόκλιση θέσης γραμμής του αντικειμένου [XmlReader](../xmlreader/). |
| [set_MaxCharactersFromEntities](./set_maxcharactersfromentities/)(int64_t) | Ορίζει μια τιμή που υποδεικνύει τον μέγιστο επιτρεπτό αριθμό χαρακτήρων σε ένα έγγραφο που προκύπτει από την επέκταση οντοτήτων. |
| [set_MaxCharactersInDocument](./set_maxcharactersindocument/)(int64_t) | Ορίζει μια τιμή που υποδεικνύει τον μέγιστο επιτρεπτό αριθμό χαρακτήρων σε ένα έγγραφο XML. Μια τιμή μηδέν (0) σημαίνει ότι δεν υπάρχουν περιορισμοί στο μέγεθος του εγγράφου XML. Μια μη μηδενική τιμή καθορίζει το μέγιστο μέγεθος, σε χαρακτήρες. |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | Ορίζει το [XmlNameTable](../xmlnametable/) που χρησιμοποιείται για ατομικές συγκρίσεις συμβολοσειρών. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν πρέπει να απαγορευτεί η επεξεργασία ορισμού τύπου εγγράφου (DTD). |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | Ορίζει το XmlSchemaSet που θα χρησιμοποιηθεί κατά την εκτέλεση επικύρωσης σχήματος. |
| [set_ValidationFlags](./set_validationflags/)(Schema::XmlSchemaValidationFlags) | Ορίζει μια τιμή που υποδεικνύει τις ρυθμίσεις επικύρωσης σχήματος. Αυτή η ρύθμιση εφαρμόζεται σε αντικείμενα [XmlReader](../xmlreader/) που επικυρώνουν σχήματα (η τιμή του [XmlReaderSettings::get_ValidationType](./get_validationtype/) είναι [ValidationType::Schema](../validationtype/)). |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | Ορίζει μια τιμή που υποδεικνύει αν το [XmlReader](../xmlreader/) θα εκτελεί επικύρωση ή ανάθεση τύπου κατά την ανάγνωση. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Ορίζει το [XmlResolver](../xmlresolver/) που χρησιμοποιείται για πρόσβαση σε εξωτερικά έγγραφα. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Προσθέτει έναν διαχειριστή συμβάντων που ενεργοποιείται όταν ο αναγνώστης αντιμετωπίζει σφάλματα επικύρωσης. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Αφαιρεί έναν διαχειριστή συμβάντων που ενεργοποιείται όταν ο αναγνώστης αντιμετωπίζει σφάλματα επικύρωσης. |
| [XmlReaderSettings](./xmlreadersettings/)() | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlReaderSettings](./). |
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
