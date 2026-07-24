---
title: "Μέθοδος System::IO::DirectoryInfo::GetFiles"
linktitle: "GetFiles"
second_title: "Aspose.Page για C++"
description: "System::IO::DirectoryInfo::GetFiles μέθοδος. Επιστρέφει έναν πίνακα που περιέχει κοινές δείκτες σε αντικείμενα FileInfo που αντιπροσωπεύουν όλους τους καταλόγους που βρίσκονται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο σε C++."
type: docs
weight: 1300
url: /el/cpp/system.io/directoryinfo/getfiles/
---
## DirectoryInfo::GetFiles() method


Επιστρέφει έναν πίνακα που περιέχει κοινές δείκτες σε αντικείμενα [FileInfo](../../fileinfo/) που αντιπροσωπεύουν όλους τους καταλόγους που βρίσκονται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles()
```

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFiles(const String\&) method


Αναζητά τα αρχεία που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| searchPattern | const String\& | Το μοτίβο ονόματος των αρχείων προς αναζήτηση |

### ReturnValue

Ένας πίνακας κοινών δεικτών σε αντικείμενα [FileInfo](../../fileinfo/) που αντιπροσωπεύουν τα ευρεθέντα αρχεία των οποίων τα ονόματα ταιριάζουν με **searchPattern**

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFiles(const String\&, SearchOption) method


Αναζητά τα αρχεία που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο είτε σε ολόκληρο το δέντρο καταλόγων που ριζώνεται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| searchPattern | const String\& | Το μοτίβο ονόματος των αρχείων προς αναζήτηση |
| searchOption | SearchOption | Καθορίζει αν η αναζήτηση πρέπει να εκτελεστεί μόνο στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο ή σε ολόκληρο το δέντρο καταλόγων που ρίζεται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο |

### ReturnValue

Ένας πίνακας κοινών δεικτών σε αντικείμενα [FileInfo](../../fileinfo/) που αντιπροσωπεύουν τα ευρεθέντα αρχεία των οποίων τα ονόματα ταιριάζουν με **searchPattern**

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
