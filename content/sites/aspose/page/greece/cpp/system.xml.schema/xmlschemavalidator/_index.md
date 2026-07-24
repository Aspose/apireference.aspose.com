---
title: "System::Xml::Schema::XmlSchemaValidator κλάση"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaValidator κλάση. Αντιπροσωπεύει μια μηχανή επικύρωσης XML Schema Definition Language (XSD) Schema. Η κλάση XmlSchemaValidator δεν μπορεί να κληρονομηθεί σε C++."
type: docs
weight: 7000
url: /el/cpp/system.xml.schema/xmlschemavalidator/
---
## XmlSchemaValidator class


Αντιπροσωπεύει μια μηχανή επικύρωσης XML [Schema](../) Definition Language (XSD) [Schema](../). Η κλάση [XmlSchemaValidator](./) δεν μπορεί να κληρονομηθεί.

```cpp
class XmlSchemaValidator : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddSchema](./addschema/)(const SharedPtr\<XmlSchema\>\&) | Προσθέτει ένα XML [Schema](../) Definition Language (XSD) σχήμα στο σύνολο των σχημάτων που χρησιμοποιούνται για την επικύρωση. |
| [EndValidation](./endvalidation/)() | Τελειώνει την επικύρωση και ελέγχει τους περιορισμούς ταυτότητας για ολόκληρο το έγγραφο XML. |
| [get_LineInfoProvider](./get_lineinfoprovider/)() | Επιστρέφει τις πληροφορίες αριθμού γραμμής για τον κόμβο XML που επικυρώνεται. |
| [get_SourceUri](./get_sourceuri/)() | Επιστρέφει το URI προέλευσης για τον κόμβο XML που επικυρώνεται. |
| [get_ValidationEventSender](./get_validationeventsender/)() | Επιστρέφει το αντικείμενο που αποστέλλεται ως αντικείμενο αποστολέα ενός γεγονότος επικύρωσης. |
| [GetExpectedAttributes](./getexpectedattributes/)() | Επιστρέφει τα αναμενόμενα χαρακτηριστικά για το τρέχον πλαίσιο στοιχείου. |
| [GetExpectedParticles](./getexpectedparticles/)() | Επιστρέφει τα αναμενόμενα σωματίδια στο τρέχον πλαίσιο στοιχείου. |
| [GetUnspecifiedDefaultAttributes](./getunspecifieddefaultattributes/)(const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\&) | Επικυρώνει τους περιορισμούς ταυτότητας στα προεπιλεγμένα χαρακτηριστικά και γεμίζει τη Λίστα που έχει οριστεί με αντικείμενα [XmlSchemaAttribute](../xmlschemaattribute/) για τυχόν χαρακτηριστικά με προεπιλεγμένες τιμές που δεν έχουν επικυρωθεί προηγουμένως χρησιμοποιώντας τη μέθοδο [XmlSchemaValidator::ValidateAttribute](./validateattribute/) στο πλαίσιο του στοιχείου. |
| [Initialize](./initialize/)() | Αρχικοποιεί την κατάσταση του αντικειμένου [XmlSchemaValidator](./). |
| [Initialize](./initialize/)(const SharedPtr\<XmlSchemaObject\>\&) | Αρχικοποιεί την κατάσταση του αντικειμένου [XmlSchemaValidator](./) χρησιμοποιώντας το [XmlSchemaObject](../xmlschemaobject/) που έχει οριστεί για μερική επικύρωση. |
| [set_LineInfoProvider](./set_lineinfoprovider/)(const SharedPtr\<IXmlLineInfo\>\&) | Ορίζει τις πληροφορίες αριθμού γραμμής για τον κόμβο XML που επικυρώνεται. |
| [set_SourceUri](./set_sourceuri/)(const SharedPtr\<Uri\>\&) | Ορίζει το URI προέλευσης για τον κόμβο XML που επικυρώνεται. |
| [set_ValidationEventSender](./set_validationeventsender/)(const SharedPtr\<Object\>\&) | Ορίζει το αντικείμενο που αποστέλλεται ως αντικείμενο αποστολέα ενός γεγονότος επικύρωσης. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Ορίζει το αντικείμενο [XmlResolver](../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση των στοιχείων **xs:import** και **xs:include**, καθώς και των χαρακτηριστικών **xsi:schemaLocation** και **xsi:noNamespaceSchemaLocation**. |
| [SkipToEndElement](./skiptoendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Παραλείπει την επικύρωση του τρέχοντος περιεχομένου του στοιχείου και προετοιμάζει το αντικείμενο [XmlSchemaValidator](./) για την επικύρωση του περιεχομένου στο πλαίσιο του γονικού στοιχείου. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Επικυρώνει το όνομα του χαρακτηριστικού, το URI του ονοματοχώρου και την τιμή στο τρέχον πλαίσιο στοιχείου. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) | Επικυρώνει το όνομα του χαρακτηριστικού, το URI του ονοματοχώρου και την τιμή στο τρέχον πλαίσιο στοιχείου. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Επικυρώνει το στοιχείο στο τρέχον πλαίσιο. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) | Επικυρώνει το στοιχείο στο τρέχον πλαίσιο με τις καθορισμένες τιμές χαρακτηριστικών **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation** και **xsi:NoNamespaceSchemaLocation**. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Επαληθεύει εάν το κειμενικό περιεχόμενο του στοιχείου είναι έγκυρο σύμφωνα με τον τύπο δεδομένων του για στοιχεία με απλό περιεχόμενο, και επαληθεύει εάν το περιεχόμενο του τρέχοντος στοιχείου είναι πλήρες για στοιχεία με σύνθετο περιεχόμενο. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) | Επαληθεύει εάν το κειμενικό περιεχόμενο του καθορισμένου στοιχείου είναι έγκυρο σύμφωνα με τον τύπο δεδομένων του. |
| [ValidateEndOfAttributes](./validateendofattributes/)(const SharedPtr\<XmlSchemaInfo\>\&) | Επαληθεύει εάν όλα τα απαιτούμενα χαρακτηριστικά στο πλαίσιο του στοιχείου είναι παρόντα και προετοιμάζει το αντικείμενο [XmlSchemaValidator](./) για την επικύρωση του περιεχομένου των θυγατρικών στοιχείων. |
| [ValidateText](./validatetext/)(const String\&) | Επικυρώνει εάν η καθορισμένη **string** κειμένου επιτρέπεται στο τρέχον πλαίσιο στοιχείου και συγκεντρώνει το κείμενο για επικύρωση εάν το τρέχον στοιχείο έχει απλό περιεχόμενο. |
| [ValidateText](./validatetext/)(XmlValueGetter) | Επικυρώνει εάν το κείμενο που επιστρέφεται από το αντικείμενο [XmlValueGetter](../xmlvaluegetter/) που έχει καθοριστεί επιτρέπεται στο τρέχον πλαίσιο στοιχείου και συγκεντρώνει το κείμενο για επικύρωση εάν το τρέχον στοιχείο έχει απλό περιεχόμενο. |
| [ValidateWhitespace](./validatewhitespace/)(const String\&) | Επικυρώνει εάν το κενό διάστημα στην καθορισμένη **string** επιτρέπεται στο τρέχον πλαίσιο στοιχείου και συγκεντρώνει το κενό διάστημα για επικύρωση εάν το τρέχον στοιχείο έχει απλό περιεχόμενο. |
| [ValidateWhitespace](./validatewhitespace/)(XmlValueGetter) | Επικυρώνει εάν το κενό διάστημα που επιστρέφεται από το αντικείμενο [XmlValueGetter](../xmlvaluegetter/) που έχει καθοριστεί επιτρέπεται στο τρέχον πλαίσιο στοιχείου και συγκεντρώνει το κενό διάστημα για επικύρωση εάν το τρέχον στοιχείο έχει απλό περιεχόμενο. |
| [XmlSchemaValidator](./xmlschemavalidator/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlSchemaSet\>\&, const SharedPtr\<IXmlNamespaceResolver\>\&, XmlSchemaValidationFlags) | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaValidator](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
