---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class"
linktitle: "InputBinOption"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class. Περιγράφει τις επιλογές χαρακτηριστικών του JobInputBin, DocumentInputBin και PageInputBin σε C++."
type: docs
weight: 700
url: /el/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


Περιγράφει τις επιλογές χαρακτηριστικών του [JobInputBin](../../jobinputbin/), [DocumentInputBin](../../documentinputbin/) και [PageInputBin](../../pageinputbin/).

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Προσθέτει έναν πίνακα από στιγμιότυπα του [IInputBinOptionItem](../iinputbinoptionitem/) στην επιλογή. |
| [Clone](./clone/)() | Κλωνοποιεί αυτήν την παρουσία επιλογής. |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Δημιουργεί μια νέα παρουσία. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [AutoSelect](./autoselect/) | Η συσκευή θα επιλέξει αυτόματα την καλύτερη επιλογή βάσει της διαμόρφωσης. |
| static [AutoSheetFeeder](./autosheetfeeder/) | Δίσκος εισόδου της συσκευής για εκτυπωτές ψεκασμού μελάνης. |
| static [Cassette](./cassette/) | Καθορίζει ότι το δοχείο τροφοδοσίας είναι κασέτα. |
| static [Manual](./manual/) | Καθορίζει το προεπιλεγμένο χειροκίνητο δοχείο τροφοδοσίας. |
| static [Tractor](./tractor/) | Καθορίζει ότι το δοχείο τροφοδοσίας είναι τρακτέρ. |
## Δείτε επίσης

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
