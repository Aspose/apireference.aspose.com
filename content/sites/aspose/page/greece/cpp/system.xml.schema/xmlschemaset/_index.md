---
title: "System::Xml::Schema::XmlSchemaSet κλάση"
linktitle: "XmlSchemaSet"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaSet κλάση. Περιέχει μια κρυφή μνήμη (cache) των XML Schema definition language (XSD) σχημάτων σε C++."
type: docs
weight: 5800
url: /el/cpp/system.xml.schema/xmlschemaset/
---
## XmlSchemaSet class


Περιέχει μια κρυφή μνήμη των XML [Schema](../) definition language (XSD) σχημάτων.

```cpp
class XmlSchemaSet : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(String, const String\&) | Προσθέτει το XML [Schema](../) definition language (XSD) σχήμα στη διεύθυνση URL που καθορίζεται στο [XmlSchemaSet](./). |
| [Add](./add/)(String, const SharedPtr\<XmlReader\>\&) | Προσθέτει το XML [Schema](../) definition language (XSD) σχήμα που περιέχεται στο [XmlReader](../../system.xml/xmlreader/) στο [XmlSchemaSet](./). |
| [Add](./add/)(const SharedPtr\<XmlSchemaSet\>\&) | Προσθέτει όλα τα XML [Schema](../) definition language (XSD) σχήματα στο δεδομένο [XmlSchemaSet](./) στο [XmlSchemaSet](./). |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | Προσθέτει το δεδομένο [XmlSchema](../xmlschema/) στο [XmlSchemaSet](./). |
| [Compile](./compile/)() | Συγκεντρώνει (μεταγλωττίζει) τα XML [Schema](../) definition language (XSD) σχήματα που προστέθηκαν στο [XmlSchemaSet](./) σε ένα λογικό σχήμα. |
| [Contains](./contains/)(String) | Δείχνει εάν ένα XML [Schema](../) definition language (XSD) σχήμα με το καθορισμένο URI του χώρου στόχου υπάρχει στο [XmlSchemaSet](./). |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Δείχνει εάν το καθορισμένο XML [Schema](../) definition language (XSD) αντικείμενο [XmlSchema](../xmlschema/) υπάρχει στο [XmlSchemaSet](./). |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Αντιγράφει όλα τα αντικείμενα [XmlSchema](../xmlschema/) από το [XmlSchemaSet](./) στον δοσμένο πίνακα, ξεκινώντας από το δοσμένο δείκτη. |
| [get_CompilationSettings](./get_compilationsettings/)() | Επιστρέφει το [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) για το [XmlSchemaSet](./). |
| [get_Count](./get_count/)() | Επιστρέφει τον αριθμό των λογικών σχημάτων XML [Schema](../) definition language (XSD) στο [XmlSchemaSet](./). |
| [get_GlobalAttributes](./get_globalattributes/)() | Επιστρέφει όλα τα παγκόσμια χαρακτηριστικά σε όλα τα XML [Schema](../) definition language (XSD) σχήματα στο [XmlSchemaSet](./). |
| [get_GlobalElements](./get_globalelements/)() | Επιστρέφει όλα τα παγκόσμια στοιχεία σε όλα τα XML [Schema](../) definition language (XSD) σχήματα στο [XmlSchemaSet](./). |
| [get_GlobalTypes](./get_globaltypes/)() | Επιστρέφει όλους τους παγκόσμιους απλούς και σύνθετους τύπους σε όλα τα XML [Schema](../) definition language (XSD) σχήματα στο [XmlSchemaSet](./). |
| [get_IsCompiled](./get_iscompiled/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν τα XML [Schema](../) definition language (XSD) σχήματα στο [XmlSchemaSet](./) έχουν μεταγλωττιστεί. |
| [get_NameTable](./get_nametable/)() | Επιστρέφει τον προεπιλεγμένο [XmlNameTable](../../system.xml/xmlnametable/) που χρησιμοποιείται από το [XmlSchemaSet](./) κατά τη φόρτωση νέων XML [Schema](../) definition language (XSD) σχημάτων. |
| [Remove](./remove/)(const SharedPtr\<XmlSchema\>\&) | Αφαιρεί το καθορισμένο XML [Schema](../) definition language (XSD) σχήμα από το [XmlSchemaSet](./). |
| [RemoveRecursive](./removerecursive/)(const SharedPtr\<XmlSchema\>\&) | Αφαιρεί το καθορισμένο XML [Schema](../) definition language (XSD) σχήμα και όλα τα σχήματα που εισάγει από το [XmlSchemaSet](./). |
| [Reprocess](./reprocess/)(SharedPtr\<XmlSchema\>) | Επεξεργάζεται εκ νέου ένα XML [Schema](../) definition language (XSD) σχήμα που υπάρχει ήδη στο [XmlSchemaSet](./). |
| [Schemas](./schemas/)() | Επιστρέφει μια συλλογή όλων των XML [Schema](../) definition language (XSD) σχημάτων στο [XmlSchemaSet](./). |
| [Schemas](./schemas/)(String) | Επιστρέφει μια συλλογή όλων των XML [Schema](../) definition language (XSD) σχημάτων στο [XmlSchemaSet](./) που ανήκουν στο δεδομένο χώρο ονομάτων. |
| [set_CompilationSettings](./set_compilationsettings/)(const SharedPtr\<XmlSchemaCompilationSettings\>\&) | Ορίζει το [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) για το [XmlSchemaSet](./). |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Ορίζει το [XmlResolver](../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση χώρων ονομάτων ή τοποθεσιών που αναφέρονται σε στοιχεία include και import ενός σχήματος. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Προσθέτει έναν χειριστή συμβάντος για τη λήψη πληροφοριών σχετικά με σφάλματα επικύρωσης XML [Schema](../) definition language (XSD) σχήματος. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Αφαιρεί έναν χειριστή συμβάντος για τη λήψη πληροφοριών σχετικά με σφάλματα επικύρωσης XML [Schema](../) definition language (XSD) σχήματος. |
| [XmlSchemaSet](./xmlschemaset/)() | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlSchemaSet](./). |
| [XmlSchemaSet](./xmlschemaset/)(const SharedPtr\<XmlNameTable\>\&) | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlSchemaSet](./) με τον καθορισμένο [XmlNameTable](../../system.xml/xmlnametable/). |
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
