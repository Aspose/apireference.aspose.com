---
title: "Aspose::Page::License::SetLicense μέθοδος"
linktitle: "SetLicense"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::License::SetLicense μέθοδος. Παρέχει άδεια στο στοιχείο σε C++."
type: docs
weight: 400
url: /el/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Αδειοδοτεί το στοιχείο.

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | System::SharedPtr\<System::IO::Stream\> | Μία ροή που περιέχει την άδεια. |
## Παρατηρήσεις



Χρησιμοποιήστε αυτή τη μέθοδο για να φορτώσετε μια άδεια από μια ροή.

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


Αδειοδοτεί το στοιχείο.

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## Παρατηρήσεις


Προσπαθεί να βρει την άδεια στις ακόλουθες τοποθεσίες:

1. Ρητή διαδρομή.

<ms>

2. Ο φάκελος της συναρμολόγησης του στοιχείου.

3. Ο φάκελος της συναρμολόγησης κλήσης του πελάτη.

4. Ο φάκελος της κύριας συναρμολόγησης.

5. Ένας ενσωματωμένος πόρος στη συναρμολόγηση κλήσης του πελάτη.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Ρητή διαδρομή.

2. Ένας ενσωματωμένος πόρος στη συναρμολόγηση κλήσης του πελάτη.

</ms>

<java>

2. Ο φάκελος του αρχείου jar του στοιχείου.

</java>
## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
