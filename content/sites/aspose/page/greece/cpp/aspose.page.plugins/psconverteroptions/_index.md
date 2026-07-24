---
title: "Aspose::Page::Plugins::PsConverterOptions κλάση"
linktitle: "PsConverterOptions"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::Plugins::PsConverterOptions κλάση. Αντιπροσωπεύει τις επιλογές για το πρόσθετο PsConverter σε C++."
type: docs
weight: 1200
url: /el/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


Αντιπροσωπεύει τις επιλογές για το πρόσθετο [PsConverter](../psconverter/).

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Προσθέτει νέα πηγή δεδομένων στη συλλογή δεδομένων του πρόσθετου [PsConverter](../psconverter/). |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Προσθέτει νέα πηγή δεδομένων στη συλλογή δεδομένων του πρόσθετου [PsConverterOptions](./). |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Καθορίζει πρόσθετους φακέλους όπου ο μετατροπέας πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. Ο προεπιλεγμένος φάκελος είναι ο τυπικός φάκελος γραμματοσειρών όπου το λειτουργικό σύστημα βρίσκει γραμματοσειρές για εσωτερικές ανάγκες. |
| [get_DataCollection](./get_datacollection/)() override | Επιστρέφει τη συλλογή δεδομένων του πρόσθετου [PsConverterOptions](./). |
| virtual [get_Debug](./get_debug/)() | Καθορίζει αν οι πληροφορίες εντοπισμού σφαλμάτων πρέπει να εκτυπωθούν στην τυπική ροή εξόδου ή όχι. |
| virtual [get_Exceptions](./get_exceptions/)() | Επιστρέφει μια λίστα των καταπιεσμένων σφαλμάτων μετατροπής εάν το [SuppressErrors](../) είναι αληθές. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Η κατηγορία Ποιότητα καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός που καθορίζεται, τόσο μεγαλύτερη είναι η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη. |
| virtual [get_OperationName](./get_operationname/)() | Επιστρέφει το όνομα της λειτουργίας. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Λαμβάνει τη συλλογή των προστιθέμενων στόχων για την αποθήκευση των αποτελεσμάτων της λειτουργίας. |
| [get_SupressErrors](./get_supresserrors/)() const | Καθορίζει αν τα σφάλματα πρέπει να καταπιεστούν ή όχι. Εάν είναι αληθές, τα καταπιεσμένα σφάλματα προστίθενται στη λίστα [Exceptions](../). Εάν είναι ψευδές, το πρώτο σφάλμα θα τερματίσει το πρόγραμμα. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Καθορίζει πρόσθετους φακέλους όπου ο μετατροπέας πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. Ο προεπιλεγμένος φάκελος είναι ο τυπικός φάκελος γραμματοσειρών όπου το λειτουργικό σύστημα βρίσκει γραμματοσειρές για εσωτερικές ανάγκες. |
| virtual [set_Debug](./set_debug/)(bool) | Καθορίζει αν οι πληροφορίες εντοπισμού σφαλμάτων πρέπει να εκτυπωθούν στην τυπική ροή εξόδου ή όχι. |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | Επιστρέφει μια λίστα των καταπιεσμένων σφαλμάτων μετατροπής εάν το [SuppressErrors](../) είναι αληθές. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Η κατηγορία Ποιότητα καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός που καθορίζεται, τόσο μεγαλύτερη είναι η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη. |
| [set_SupressErrors](./set_supresserrors/)(bool) | Καθορίζει αν τα σφάλματα πρέπει να καταπιεστούν ή όχι. Εάν είναι αληθές, τα καταπιεσμένα σφάλματα προστίθενται στη λίστα [Exceptions](../). Εάν είναι ψευδές, το πρώτο σφάλμα θα τερματίσει το πρόγραμμα. |
## Δείτε επίσης

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
