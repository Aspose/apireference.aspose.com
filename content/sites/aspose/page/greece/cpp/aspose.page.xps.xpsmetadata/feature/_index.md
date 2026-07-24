---
title: "Aspose::Page::XPS::XpsMetadata::Feature κλάση"
linktitle: "Χαρακτηριστικό"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsMetadata::Feature κλάση. Η κλάση που περιλαμβάνει μια κοινή λειτουργία του Print Schema. Η βασική κλάση για όλες τις λειτουργίες που ορίζονται στο σχήμα. Ένα στοιχείο Feature περιέχει μια πλήρη λίστα των στοιχείων Option και Property που περιγράφουν πλήρως ένα χαρακτηριστικό συσκευής, ρύθμιση μορφοποίησης εργασίας ή άλλο σχετικό χαρακτηριστικό.  σε C++."
type: docs
weight: 2900
url: /el/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


Η κλάση που περιλαμβάνει μια κοινή δυνατότητα του Print Schema. Η βασική κλάση για όλες τις δυνατότητες που ορίζονται από το σχήμα. Ένα στοιχείο **[Feature](./)** περιέχει μια πλήρη λίστα των στοιχείων [Option](../option/) και [Property](../property/) που περιγράφουν πλήρως ένα χαρακτηριστικό συσκευής, ρύθμιση μορφοποίησης εργασίας ή άλλο σχετικό χαρακτηριστικό. [https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature).

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της δυνατότητας. Κάθε ένα πρέπει να είναι μια παρουσία του [Feature](./), ενός [Option](../option/) ή ενός [Property](../property/). |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Δημιουργεί μια νέα παρουσία δυνατότητας [PrintTicket](../printticket/). |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Δημιουργεί μια νέα παρουσία δυνατότητας [PrintTicket](../printticket/). |
## Δείτε επίσης

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
