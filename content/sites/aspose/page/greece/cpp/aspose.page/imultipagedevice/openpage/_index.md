---
title: "Aspose::Page::IMultiPageDevice::OpenPage μέθοδος"
linktitle: "OpenPage"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::IMultiPageDevice::OpenPage μέθοδος. Κάνει τις απαραίτητες προετοιμασίες της συσκευής πριν από την απόδοση κάθε σελίδας σε C++."
type: docs
weight: 400
url: /el/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


Κάνει την απαραίτητη προετοιμασία της συσκευής πριν από την απόδοση κάθε σελίδας.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| πλάτος | float | Ένα πλάτος της σελίδας. |
| ύψος | float | Ένα ύψος της σελίδας. |

### ReturnValue

Επιστρέφει true εάν η ανοιγμένη σελίδα έχει αριθμό που εμπίπτει σε ένα εύρος επιλεγμένων αριθμών σελίδων και false διαφορετικά.

## Δείτε επίσης

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


Κάνει την απαραίτητη προετοιμασία της συσκευής πριν από την απόδοση της σελίδας.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τίτλος | System::String | Ο τίτλος της σελίδας. |

### ReturnValue

True εάν η σελίδα ανήκει στο ζητούμενο εύρος, διαφορετικά false. Χρησιμοποιείται σε συσκευές που μπορούν να αποδώσουν συγκεκριμένο σύνολο αριθμών σελίδων.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
