---
title: "System::IO::DirectoryInfo::GetFileSystemInfos μέθοδος"
linktitle: "GetFileSystemInfos"
second_title: "Aspose.Page για C++"
description: "System::IO::DirectoryInfo::GetFileSystemInfos μέθοδος. Επιστρέφει έναν πίνακα που περιέχει κοινές δείκτες σε αντικείμενα FileSystemInfo που αντιπροσωπεύουν όλα τα αρχεία και καταλόγους που βρίσκονται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο σε C++."
type: docs
weight: 1400
url: /el/cpp/system.io/directoryinfo/getfilesysteminfos/
---
## DirectoryInfo::GetFileSystemInfos() method


Επιστρέφει έναν πίνακα που περιέχει κοινές δείκτες σε αντικείμενα [FileSystemInfo](../../filesysteminfo/) που αντιπροσωπεύουν όλα τα αρχεία και καταλόγους που βρίσκονται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos()
```

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&) method


Αναζητά τα αρχεία και τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| searchPattern | const String\& | Το πρότυπο ονόματος των αρχείων και καταλόγων προς αναζήτηση |

### ReturnValue

Ένας πίνακας κοινών δεικτών σε αντικείμενα [FileSystemInfo](../../filesysteminfo/) που αντιπροσωπεύουν τα ευρεθέντα αρχεία και καταλόγους των οποίων τα ονόματα ταιριάζουν με **searchPattern**

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&, SearchOption) method


Αναζητά τα αρχεία και τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο είτε σε ολόκληρο το δέντρο καταλόγων που ριζώνεται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| searchPattern | const String\& | Το πρότυπο ονόματος των αρχείων και καταλόγων προς αναζήτηση |
| searchOption | SearchOption | Καθορίζει αν η αναζήτηση πρέπει να εκτελεστεί μόνο στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο ή σε ολόκληρο το δέντρο καταλόγων που ρίζεται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο |

### ReturnValue

Ένας πίνακας κοινών δεικτών σε αντικείμενα [FileSystemInfo](../../filesysteminfo/) που αντιπροσωπεύουν τα ευρεθέντα αρχεία και καταλόγους των οποίων τα ονόματα ταιριάζουν με **searchPattern**

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
