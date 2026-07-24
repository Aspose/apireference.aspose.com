---
title: "Aspose::Page::XPS::XpsMetadata::DocumentNUp κλάση"
linktitle: "DocumentNUp"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentNUp κλάση. Περιγράφει την έξοδο και τη μορφή πολλαπλών λογικών σελίδων σε ένα ενιαίο φυσικό φύλλο. Κάθε έγγραφο συντάσσεται ξεχωριστά. Τα DocumentNUp και JobNUpAllDocumentsContiguously είναι αμοιβαία αποκλειστικά. Η ευθύνη του οδηγού είναι να καθορίσει τη διαχείριση περιορισμών μεταξύ αυτών των λέξεων-κλειδιά.  σε C++."
type: docs
weight: 2000
url: /el/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


Περιγράφει την έξοδο και τη μορφή πολλαπλών λογικών σελίδων σε ένα ενιαίο φυσικό φύλλο. Κάθε έγγραφο συντάσσεται ξεχωριστά. **[DocumentNUp](./)** και [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) είναι αμοιβαία αποκλειστικά. Η ευθύνη του οδηγού είναι να καθορίσει τη διαχείριση περιορισμών μεταξύ αυτών των λέξεων-κλειδιά. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup).

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Προσθέτει μια επιλογή με τιμή ιδιότητας **PagesPerSheet**. Καθορίζει τον αριθμό λογικών σελίδων ανά φυσικό φύλλο. |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
