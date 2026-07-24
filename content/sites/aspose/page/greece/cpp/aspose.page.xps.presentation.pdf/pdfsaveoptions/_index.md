---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions κλάση"
linktitle: "PdfSaveOptions"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions κλάση. Κλάση για επιλογές αποθήκευσης XPS-σε-PDF στη C++."
type: docs
weight: 300
url: /el/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


Κλάση για επιλογές αποθήκευσης XPS-ως-PDF.

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Καθορίζει το μέγεθος ενός τμήματος σελίδων που θα περάσει από κόμβο σε κόμβο. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | Η συλλογή των χειριστών συμβάντων που εκτελεί τροποποιήσεις σε μια σελίδα [XPS](../../aspose.page.xps/) λίγο πριν αποθηκευτεί. |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | Λαμβάνει λεπτομέρειες κρυπτογράφησης. Εάν δεν οριστεί, τότε δεν θα εκτελεστεί κρυπτογράφηση. |
| [get_ImageCompression](./get_imagecompression/)() const | Καθορίζει τον τύπο συμπίεσης που θα χρησιμοποιηθεί για όλες τις εικόνες στο έγγραφο. Η προεπιλογή είναι [PdfImageCompression::Auto](../pdfimagecompression/). |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | Καθορίζει μέχρι ποιο επίπεδο πρέπει να επεκταθεί το περιεχόμενο του εγγράφου όταν το αρχείο PDF ανοίγει σε προβολέα. 1 - εμφανίζονται μόνο τα στοιχεία του πρώτου επιπέδου, 2 - εμφανίζονται τα στοιχεία του πρώτου και του δεύτερου επιπέδου, κ.λπ. Η προεπιλογή είναι 1. |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | Καθορίζει το ύψος του δένδρου περιεχομένου του εγγράφου που θα αποθηκευτεί. 0 - το δένδρο περιεχομένου δεν θα μετατραπεί, 1 - θα μετατραπούν μόνο τα στοιχεία του πρώτου επιπέδου, κ.λπ. Η προεπιλογή είναι 10. |
| [get_PageNumbers](./get_pagenumbers/)() override | Λαμβάνει/ορίζει τον πίνακα αριθμών σελίδων προς μετατροπή. |
| [get_PreserveText](./get_preservetext/)() override | Στο [XPS](../../aspose.page.xps/), ορισμένα στοιχεία κειμένου μπορεί να περιέχουν αναφορές σε εναλλακτικές μορφές γλύφων που δεν αντιστοιχούν σε κανέναν κωδικό χαρακτήρα στη γραμματοσειρά. Εάν αυτή η σημαία οριστεί σε true, το κείμενο από τέτοια στοιχεία [XPS](../../aspose.page.xps/) μετατρέπεται σε γραφικά σχήματα. Στη συνέχεια το κείμενο εμφανίζεται διαφανές από πάνω. Αυτό αφήνει το κείμενο των στοιχείων επιλέξιμο. Ωστόσο, το παρεπίκειο είναι ότι το αρχείο εξόδου μπορεί να είναι πολύ μεγαλύτερο από το αρχικό. Εάν η σημαία οριστεί σε false, οι χαρακτήρες που θα έπρεπε να εμφανιστούν ως εναλλακτικές μορφές αντικαθίστανται με άλλους χαρακτήρες που αντιστοιχούν στις εναλλακτικές μορφές γλύφων. Συνεπώς το κείμενο, αν και παραμένει επιλέξιμο, θα τροποποιηθεί και πιθανότατα θα γίνει αδιάβαστο. Η προεπιλογή είναι false. |
| [get_TextCompression](./get_textcompression/)() const | Καθορίζει σε ποιο επίπεδο του περιεχομένου του εγγράφου θα εμφανίζονται τα αντικείμενα [ApsBookmark](../). 0 - δεν εμφανίζεται. 1 στο πρώτο επίπεδο κ.λπ. Η προεπιλογή είναι 0. |
| [PdfSaveOptions](./pdfsaveoptions/)() | Δημιουργεί νέα παρουσία των επιλογών. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Καθορίζει το μέγεθος ενός τμήματος σελίδων που θα περάσει από κόμβο σε κόμβο. |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | Ορίζει λεπτομέρειες κρυπτογράφησης. Εάν δεν οριστεί, τότε δεν θα εκτελεστεί κρυπτογράφηση. |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | Καθορίζει τον τύπο συμπίεσης που θα χρησιμοποιηθεί για όλες τις εικόνες στο έγγραφο. Η προεπιλογή είναι [PdfImageCompression::Auto](../pdfimagecompression/). |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | Καθορίζει μέχρι ποιο επίπεδο πρέπει να επεκταθεί το περιεχόμενο του εγγράφου όταν το αρχείο PDF ανοίγει σε προβολέα. 1 - εμφανίζονται μόνο τα στοιχεία του πρώτου επιπέδου, 2 - εμφανίζονται τα στοιχεία του πρώτου και του δεύτερου επιπέδου, κ.λπ. Η προεπιλογή είναι 1. |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | Καθορίζει το ύψος του δένδρου περιεχομένου του εγγράφου που θα αποθηκευτεί. 0 - το δένδρο περιεχομένου δεν θα μετατραπεί, 1 - θα μετατραπούν μόνο τα στοιχεία του πρώτου επιπέδου, κ.λπ. Η προεπιλογή είναι 10. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Λαμβάνει/ορίζει τον πίνακα αριθμών σελίδων προς μετατροπή. |
| [set_PreserveText](./set_preservetext/)(bool) override | Στο [XPS](../../aspose.page.xps/), ορισμένα στοιχεία κειμένου μπορεί να περιέχουν αναφορές σε εναλλακτικές μορφές γλύφων που δεν αντιστοιχούν σε κανέναν κωδικό χαρακτήρα στη γραμματοσειρά. Εάν αυτή η σημαία οριστεί σε true, το κείμενο από τέτοια στοιχεία [XPS](../../aspose.page.xps/) μετατρέπεται σε γραφικά σχήματα. Στη συνέχεια το κείμενο εμφανίζεται διαφανές από πάνω. Αυτό αφήνει το κείμενο των στοιχείων επιλέξιμο. Ωστόσο, το παρεπίκειο είναι ότι το αρχείο εξόδου μπορεί να είναι πολύ μεγαλύτερο από το αρχικό. Εάν η σημαία οριστεί σε false, οι χαρακτήρες που θα έπρεπε να εμφανιστούν ως εναλλακτικές μορφές αντικαθίστανται με άλλους χαρακτήρες που αντιστοιχούν στις εναλλακτικές μορφές γλύφων. Συνεπώς το κείμενο, αν και παραμένει επιλέξιμο, θα τροποποιηθεί και πιθανότατα θα γίνει αδιάβαστο. Η προεπιλογή είναι false. |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | Καθορίζει σε ποιο επίπεδο του περιεχομένου του εγγράφου θα εμφανίζονται τα αντικείμενα [ApsBookmark](../). 0 - δεν εμφανίζεται. 1 στο πρώτο επίπεδο κ.λπ. Η προεπιλογή είναι 0. |
## Δείτε επίσης

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
