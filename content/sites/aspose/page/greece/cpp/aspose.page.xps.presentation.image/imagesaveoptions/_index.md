---
title: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions κλάση"
linktitle: "ImageSaveOptions"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions κλάση. Βασική κλάση για επιλογές αποθήκευσης XPS-ως-εικόνα σε C++."
type: docs
weight: 200
url: /el/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


Βασική κλάση για επιλογές αποθήκευσης XPS-ως-εικόνα.

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Καθορίζει το μέγεθος ενός τμήματος σελίδων που θα περάσει από κόμβο σε κόμβο. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | Η συλλογή των χειριστών συμβάντων που εκτελεί τροποποιήσεις σε μια σελίδα [XPS](../../aspose.page.xps/) λίγο πριν αποθηκευτεί. |
| [get_ImageSize](./get_imagesize/)() const | Λαμβάνει/ορίζει το μέγεθος των εικόνων εξόδου σε εικονοστοιχεία. |
| [get_InterpolationMode](./get_interpolationmode/)() const | Λαμβάνει/ορίζει τη λειτουργία παρεμβολής. |
| [get_PageNumbers](./get_pagenumbers/)() override | Λαμβάνει/ορίζει τον πίνακα αριθμών σελίδων προς μετατροπή. |
| [get_Resolution](./get_resolution/)() const | Λαμβάνει/ορίζει την ανάλυση εικόνας. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Λαμβάνει/ορίζει τη λειτουργία εξομάλυνσης. |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | Λαμβάνει/ορίζει τη συμβουλή απόδοσης κειμένου. |
| [ImageSaveOptions](./imagesaveoptions/)() | Δημιουργεί νέα παρουσία των επιλογών. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Καθορίζει το μέγεθος ενός τμήματος σελίδων που θα περάσει από κόμβο σε κόμβο. |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | Λαμβάνει/ορίζει το μέγεθος των εικόνων εξόδου σε εικονοστοιχεία. |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | Λαμβάνει/ορίζει τη λειτουργία παρεμβολής. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Λαμβάνει/ορίζει τον πίνακα αριθμών σελίδων προς μετατροπή. |
| [set_Resolution](./set_resolution/)(float) | Λαμβάνει/ορίζει την ανάλυση εικόνας. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | Λαμβάνει/ορίζει τη λειτουργία εξομάλυνσης. |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | Λαμβάνει/ορίζει τη συμβουλή απόδοσης κειμένου. |
## Δείτε επίσης

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
