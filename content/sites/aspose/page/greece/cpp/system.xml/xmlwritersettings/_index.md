---
title: "System::Xml::XmlWriterSettings class"
linktitle: "XmlWriterSettings"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Xml::XmlWriterSettings. Καθορίζει ένα σύνολο λειτουργιών που υποστηρίζονται στο αντικείμενο XmlWriter που δημιουργείται από τη μέθοδο XmlWriter::Create στη C++."
type: docs
weight: 4500
url: /el/cpp/system.xml/xmlwritersettings/
---
## XmlWriterSettings class


Καθορίζει ένα σύνολο λειτουργιών που υποστηρίζονται στο αντικείμενο [XmlWriter](../xmlwriter/) που δημιουργείται από τη μέθοδο [XmlWriter::Create](../xmlwriter/create/).

```cpp
class XmlWriterSettings : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() | Δημιουργεί ένα αντίγραφο του αντικειμένου [XmlWriterSettings](./). |
| [get_CheckCharacters](./get_checkcharacters/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν ο XML writer πρέπει να ελέγχει ώστε να διασφαλιστεί ότι όλοι οι χαρακτήρες στο έγγραφο συμμορφώνονται με την ενότητα \"2.2 Characters\" της σύστασης W3C [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets). |
| [get_CloseOutput](./get_closeoutput/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν το [XmlWriter](../xmlwriter/) πρέπει επίσης να κλείσει το υποκείμενο stream ή TextWriter όταν κληθεί η μέθοδος [XmlWriter::Close](../xmlwriter/close/). |
| [get_ConformanceLevel](./get_conformancelevel/)() | Επιστρέφει το επίπεδο συμμόρφωσης που ο XML writer ελέγχει στο XML output. |
| [get_DoNotEscapeUriAttributes](./get_donotescapeuriattributes/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν το [XmlWriter](../xmlwriter/) δεν διαφύγει τα χαρακτηριστικά URI. |
| [get_Encoding](./get_encoding/)() | Επιστρέφει τον τύπο κωδικοποίησης κειμένου που θα χρησιμοποιηθεί. |
| [get_Indent](./get_indent/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν θα γίνει εσοχή των στοιχείων. |
| [get_IndentChars](./get_indentchars/)() | Επιστρέφει τη συμβολοσειρά χαρακτήρων που θα χρησιμοποιηθεί κατά την εσοχή. Αυτή η ρύθμιση χρησιμοποιείται όταν η τιμή [XmlWriterSettings::set_Indent](./set_indent/) ορίζεται σε **true**. |
| [get_NamespaceHandling](./get_namespacehandling/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν το [XmlWriter](../xmlwriter/) πρέπει να αφαιρέσει τις διπλές δηλώσεις ονοματοχώρου κατά τη γραφή περιεχομένου XML. Η προεπιλεγμένη συμπεριφορά είναι ο writer να εκτυπώνει όλες τις δηλώσεις ονοματοχώρου που υπάρχουν στον resolver ονοματοχώρου του writer. |
| [get_NewLineChars](./get_newlinechars/)() | Επιστρέφει τη συμβολοσειρά χαρακτήρων που θα χρησιμοποιηθεί για αλλαγές γραμμής. |
| [get_NewLineHandling](./get_newlinehandling/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν θα γίνει κανονικοποίηση των αλλαγών γραμμής στην έξοδο. |
| [get_NewLineOnAttributes](./get_newlineonattributes/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν θα γραφτούν τα χαρακτηριστικά σε νέα γραμμή. |
| [get_OmitXmlDeclaration](./get_omitxmldeclaration/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν θα παραλειφθεί μια δήλωση XML. |
| [get_OutputMethod](./get_outputmethod/)() | Επιστρέφει τη μέθοδο που χρησιμοποιείται για τη σειριοποίηση της εξόδου του [XmlWriter](../xmlwriter/). |
| [get_WriteEndDocumentOnClose](./get_writeenddocumentonclose/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν το [XmlWriter](../xmlwriter/) θα προσθέσει ετικέτες κλεισίματος σε όλες τις ανοιχτές ετικέτες στοιχείων όταν κληθεί η μέθοδος [XmlWriter::Close](../xmlwriter/close/). |
| [Reset](./reset/)() | Επαναφέρει τα μέλη της κλάσης ρυθμίσεων στις προεπιλεγμένες τιμές τους. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν ο XML writer πρέπει να ελέγχει ώστε να διασφαλιστεί ότι όλοι οι χαρακτήρες στο έγγραφο συμμορφώνονται με την ενότητα \"2.2 Characters\" της σύστασης W3C [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets). |
| [set_CloseOutput](./set_closeoutput/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν το [XmlWriter](../xmlwriter/) πρέπει επίσης να κλείσει το υποκείμενο stream ή TextWriter όταν κληθεί η μέθοδος [XmlWriter::Close](../xmlwriter/close/). |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | Ορίζει το επίπεδο συμμόρφωσης που ο XML writer ελέγχει στο XML output. |
| [set_DoNotEscapeUriAttributes](./set_donotescapeuriattributes/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν το [XmlWriter](../xmlwriter/) δεν διαφύγει τα χαρακτηριστικά URI. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | Ορίζει τον τύπο κωδικοποίησης κειμένου που θα χρησιμοποιηθεί. |
| [set_Indent](./set_indent/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν θα γίνει εσοχή των στοιχείων. |
| [set_IndentChars](./set_indentchars/)(const String\&) | Ορίζει τη συμβολοσειρά χαρακτήρων που θα χρησιμοποιείται κατά την εσοχή. Αυτή η ρύθμιση χρησιμοποιείται όταν η τιμή του [XmlWriterSettings::set_Indent](./set_indent/) ορίζεται σε **true**. |
| [set_NamespaceHandling](./set_namespacehandling/)(System::Xml::NamespaceHandling) | Ορίζει μια τιμή που υποδεικνύει εάν ο [XmlWriter](../xmlwriter/) πρέπει να αφαιρέσει τις διπλές δηλώσεις χώρου ονομάτων κατά τη σύνταξη περιεχομένου XML. Η προεπιλεγμένη συμπεριφορά είναι ο συγγραφέας να εξάγει όλες τις δηλώσεις χώρου ονομάτων που υπάρχουν στον επιλυτή χώρου ονομάτων του συγγραφέα. |
| [set_NewLineChars](./set_newlinechars/)(const String\&) | Ορίζει τη συμβολοσειρά χαρακτήρων που θα χρησιμοποιείται για αλλαγές γραμμής. |
| [set_NewLineHandling](./set_newlinehandling/)(System::Xml::NewLineHandling) | Ορίζει μια τιμή που υποδεικνύει εάν θα γίνει ομαλοποίηση των αλλαγών γραμμής στην έξοδο. |
| [set_NewLineOnAttributes](./set_newlineonattributes/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν θα γράφονται τα χαρακτηριστικά σε νέα γραμμή. |
| [set_OmitXmlDeclaration](./set_omitxmldeclaration/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν θα παραλειφθεί μια δήλωση XML. |
| [set_WriteEndDocumentOnClose](./set_writeenddocumentonclose/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν ο [XmlWriter](../xmlwriter/) θα προσθέσει ετικέτες κλεισίματος σε όλες τις ανοιχτές ετικέτες στοιχείων όταν κληθεί η μέθοδος [XmlWriter::Close](../xmlwriter/close/). |
| [XmlWriterSettings](./xmlwritersettings/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlWriterSettings](./). |
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
