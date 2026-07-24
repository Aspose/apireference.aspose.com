---
title: "Μέθοδος System::IO::DirectoryInfo::GetDirectories"
linktitle: "GetDirectories"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::IO::DirectoryInfo::GetDirectories. Επιστρέφει έναν πίνακα που περιέχει κοινές δείκτες σε αντικείμενα DirectoryInfo που αντιπροσωπεύουν όλους τους καταλόγους που βρίσκονται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο σε C++."
type: docs
weight: 1200
url: /el/cpp/system.io/directoryinfo/getdirectories/
---
## DirectoryInfo::GetDirectories() method


Επιστρέφει έναν πίνακα που περιέχει κοινές δείκτες σε αντικείμενα [DirectoryInfo](../) που αντιπροσωπεύουν όλους τους καταλόγους που βρίσκονται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories()
```

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


Αναζητά τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| searchPattern | const String\& | Το μοτίβο ονόματος των καταλόγων προς αναζήτηση |

### ReturnValue

Ένας πίνακας κοινών δεικτών σε αντικείμενα [DirectoryInfo](../) που αντιπροσωπεύουν τους βρεθέντες καταλόγους των οποίων τα ονόματα ταιριάζουν με **searchPattern**

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


Αναζητά τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο είτε σε όλο το δέντρο καταλόγων που ρίζεται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| searchPattern | const String\& | Το μοτίβο ονόματος των καταλόγων προς αναζήτηση |
| searchOption | SearchOption | Καθορίζει αν η αναζήτηση πρέπει να εκτελεστεί μόνο στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο ή σε ολόκληρο το δέντρο καταλόγων που ρίζεται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο |

### ReturnValue

Ένας πίνακας κοινών δεικτών σε αντικείμενα [DirectoryInfo](../) που αντιπροσωπεύουν τους βρεθέντες καταλόγους των οποίων τα ονόματα ταιριάζουν με **searchPattern**

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
