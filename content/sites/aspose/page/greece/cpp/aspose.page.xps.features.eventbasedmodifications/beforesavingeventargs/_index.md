---
title: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class"
linktitle: "BeforeSavingEventArgs"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class. Ορίζει τη βασική κλάση για τα επιχειρήματα διαφόρων συμβάντων πριν την αποθήκευση σε C++."
type: docs
weight: 200
url: /el/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


Ορίζει τη βασική κλάση για τα επιχειρήματα διαφόρων συμβάντων πριν από την αποθήκευση.

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος του API τροποποίησης. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | Ο τρέχων απόλυτος αριθμός σελίδας σε όλα τα έγγραφα μέσα στο πακέτο [XPS](../../aspose.page.xps/). |
| [get_DocumentNumber](./get_documentnumber/)() const | Ο τρέχων αριθμός εγγράφου μέσα στο πακέτο [XPS](../../aspose.page.xps/). |
| [get_ElementAPI](./get_elementapi/)() const | Αποκτά το API τροποποίησης του στοιχείου που πρόκειται να αποθηκευτεί. |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | Ο τρέχων αριθμός εξόδου. Διαφέρει από **AbsolutePageNumber** εάν έχει οριστεί η επιλογή αποθήκευσης **PageNumbers**. |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | Ο τρέχων αριθμός σελίδας σε σχέση με το τρέχον έγγραφο μέσα στο πακέτο [XPS](../../aspose.page.xps/). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ορίστε το n'th όρισμα προτύπου ως αδύναμο δείκτη (αντί για κοινόχρηστο). Επιτρέπει την εναλλαγή δεικτών σε containers σε αδύναμη λειτουργία. |

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
