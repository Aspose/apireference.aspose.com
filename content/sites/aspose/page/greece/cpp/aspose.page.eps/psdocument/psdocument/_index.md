---
title: "Aspose::Page::EPS::PsDocument::PsDocument κατασκευαστής"
linktitle: "PsDocument"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::EPS::PsDocument::PsDocument κατασκευαστής. Αρχικοποιεί ένα κενό PsDocument. Αυτός ο κατασκευαστής χρησιμοποιείται μόνο για πρόσθετες λειτουργίες που δεν σχετίζονται με αρχεία PostScript, για παράδειγμα, μετατροπή γραμματοσειρών σε C++."
type: docs
weight: 100
url: /el/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


Αρχικοποιεί ένα κενό [PsDocument](../). Αυτός ο κατασκευαστής χρησιμοποιείται μόνο για πρόσθετες λειτουργίες που δεν σχετίζονται με αρχεία PostScript, για παράδειγμα, μετατροπή γραμματοσειρών.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## Δείτε επίσης

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


Αρχικοποιεί το [PsDocument](../) με μια ροή αρχείου PS/EPS.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | Ροή εισόδου αρχείου PS/EPS. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Αρχικοποιεί ένα κενό [PsDocument](../) με αρχικοποιημένη σελίδα.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Ροή όπου αποθηκεύεται το αρχείο PS/EPS. |
| επιλογές | System::SharedPtr\<Device::PsSaveOptions\> | Ένα σύνολο παραμέτρων που ελέγχουν την αποθήκευση αρχείου PostScript. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Αρχικοποιεί κενό [PsDocument](../).

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Ροή όπου αποθηκεύεται το αρχείο PS/EPS. |
| επιλογές | System::SharedPtr\<Device::PsSaveOptions\> | Ένα σύνολο παραμέτρων που ελέγχουν την αποθήκευση αρχείου PostScript. |
| multipaged | bool | Εάν είναι false, η σελίδα δεν θα αρχικοποιηθεί. Σε αυτήν την περίπτωση η αρχικοποίηση της σελίδας πρέπει να γίνει μέσω της ρητής κλήσης "openPage(width, height)". |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Αρχικοποιεί κενό [PsDocument](../) όταν ο αριθμός των σελίδων του εγγράφου [Postscript](../../../aspose.page.eps.postscript/) είναι γνωστός εκ των προτέρων.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Ροή όπου αποθηκεύεται το αρχείο PS/EPS. |
| επιλογές | System::SharedPtr\<Device::PsSaveOptions\> | Ένα σύνολο παραμέτρων που ελέγχουν την αποθήκευση αρχείου PostScript. |
| numberOfPages | int32_t | Ο αριθμός των σελίδων στο έγγραφο PostScript. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Αρχικοποιεί ένα κενό [PsDocument](../) με αρχικοποιημένη σελίδα.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| outPsFilePath | System::String | Η διαδρομή εξόδου του αρχείου PS/EPS. |
| επιλογές | System::SharedPtr\<Device::PsSaveOptions\> | Ένα σύνολο παραμέτρων που ελέγχουν την αποθήκευση αρχείου PostScript. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Αρχικοποιεί κενό [PsDocument](../).

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| outPsFilePath | System::String | Η διαδρομή εξόδου του αρχείου PS/EPS. |
| επιλογές | System::SharedPtr\<Device::PsSaveOptions\> | Ένα σύνολο παραμέτρων που ελέγχουν την αποθήκευση αρχείου PostScript. |
| multipaged | bool | Εάν είναι false, η σελίδα δεν θα αρχικοποιηθεί. Σε αυτήν την περίπτωση η αρχικοποίηση της σελίδας πρέπει να γίνει μέσω της ρητής κλήσης "openPage(width, height)". |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Αρχικοποιεί κενό [PsDocument](../) όταν ο αριθμός των σελίδων του εγγράφου [Postscript](../../../aspose.page.eps.postscript/) είναι γνωστός εκ των προτέρων.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| outPsFilePath | System::String | Η διαδρομή εξόδου του αρχείου PS/EPS. |
| επιλογές | System::SharedPtr\<Device::PsSaveOptions\> | Ένα σύνολο παραμέτρων που ελέγχουν την αποθήκευση αρχείου PostScript. |
| numberOfPages | int32_t | Ο αριθμός των σελίδων στο έγγραφο PostScript. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


Αρχικοποιεί το [PsDocument](../) με ένα αρχείο εισόδου PS/EPS.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| psFilePath | System::String | Διαδρομή αρχείου PS/EPS. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
