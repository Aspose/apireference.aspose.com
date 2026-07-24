---
title: "Aspose::Page::XPS::XpsMetadata::Option κλάση"
linktitle: "Option"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsMetadata::Option κλάση. Η κλάση που υλοποιεί μια κοινή PrintTicketOption. Η βασική κλάση για όλες τις επιλογές που ορίζονται από το σχήμα. Ένα στοιχείο Option περιέχει όλα τα στοιχεία Property και ScoredProperty που σχετίζονται με αυτήν την επιλογή.  σε C++."
type: docs
weight: 7600
url: /el/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


Η κλάση που υλοποιεί μια κοινή [PrintTicket](../printticket/)**[Option](./)**. Η βασική κλάση για όλες τις επιλογές που ορίζονται από το σχήμα. Ένα στοιχείο [Option](./) περιέχει όλα τα στοιχεία [Property](../property/) και [ScoredProperty](../scoredproperty/) που σχετίζονται με αυτήν την επιλογή. [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option).

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας στοιχείων αυτής της επιλογής. Κάθε ένα πρέπει να είναι ένα αντικείμενο [ScoredProperty](../scoredproperty/) ή [Property](../property/). |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Δημιουργεί μια νέα παρουσία επιλογής [PrintTicket](../printticket/). |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Δημιουργεί μια νέα παρουσία επιλογής [PrintTicket](../printticket/). |
| [Option](./option/)(System::SharedPtr\<Option\>) | Δημιουργεί μια κλώνο επιλογής. |
## Δείτε επίσης

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
