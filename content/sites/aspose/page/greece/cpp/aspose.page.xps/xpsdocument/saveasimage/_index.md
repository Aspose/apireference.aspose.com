---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImage μέθοδος"
linktitle: "SaveAsImage"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImage μέθοδος. Αποθηκεύει το έγγραφο σε αρχείο εικόνας. Ο φάκελος εξόδου και το όνομα αρχείου θα είναι τα ίδια με αυτά του εισαγόμενου αρχείου XPS. Η επέκταση αρχείου θα αντιστοιχεί στη μορφή εικόνας στην παράμετρο \"options\". Εάν το έγγραφο αρχικοποιήθηκε με ροή που δεν είναι FileStream, το αρχείο εικόνας θα αποθηκευτεί στον τρέχοντα φάκελο με προεπιλεγμένο πρότυπο ονόματος αρχείου σε C++."
type: docs
weight: 5500
url: /el/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


Αποθηκεύει το έγγραφο σε αρχείο εικόνας. Ο φάκελος εξόδου και το όνομα αρχείου θα είναι τα ίδια με το αρχείο εισόδου [XPS](../../) file. Η επέκταση αρχείου θα αντιστοιχεί στη μορφή εικόνας στην παράμετρο "options". Εάν το έγγραφο αρχικοποιήθηκε με ροή που δεν είναι FileStream, το αρχείο εικόνας θα αποθηκευτεί στον τρέχοντα φάκελο με το προεπιλεγμένο πρότυπο ονόματος αρχείου.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| επιλογές | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Επιλογές για αποθήκευση του εγγράφου σε μορφή bitmap εικόνας. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


Αποθηκεύει το έγγραφο σε αρχείο εικόνας στον καθορισμένο φάκελο με το καθορισμένο όνομα αρχείου. Η επέκταση αρχείου θα αντιστοιχεί στη μορφή εικόνας στην παράμετρο \"options\".

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| επιλογές | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Επιλογές για αποθήκευση του εγγράφου σε μορφή bitmap εικόνας. |
| outDir | System::String | Ο φάκελος εξόδου όπου θα αποθηκευτεί το αρχείο εικόνας. |
| fileNameTemplate | System::String | Το πρότυπο ονόματος αρχείου για την εικόνα (χωρίς επέκταση). Εάν το αρχείο εισόδου [XPS](../../) είναι μονοσέλιδο, θα είναι ακριβώς το όνομα αρχείου, αλλιώς "_[n]", όπου "n" - ένας αριθμός σελίδας που ξεκινά από 0, θα προσαρτηθεί αυτό το επίθημα. Η επέκταση αρχείου θα αντιστοιχεί στη μορφή εικόνας στην παράμετρο "option". |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
