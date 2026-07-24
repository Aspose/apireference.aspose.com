---
title: "System::IO::DirectoryInfo::EnumerateFileSystemInfos μέθοδος"
linktitle: "EnumerateFileSystemInfos"
second_title: "Aspose.Page για C++"
description: "System::IO::DirectoryInfo::EnumerateFileSystemInfos μέθοδος. Επιστρέφει μια επαναληπτική συλλογή που περιέχει όλα τα αρχεία και τους καταλόγους που βρίσκονται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο σε C++."
type: docs
weight: 700
url: /el/cpp/system.io/directoryinfo/enumeratefilesysteminfos/
---
## DirectoryInfo::EnumerateFileSystemInfos() method


Επιστρέφει συλλογή επαναλήψιμη που περιέχει όλα τα αρχεία και τους καταλόγους που βρίσκονται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos()
```

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&) method


Αναζητά τα αρχεία και τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| searchPattern | const String\& | Το πρότυπο ονόματος των αρχείων και καταλόγων προς αναζήτηση |

### ReturnValue

Η επαναληπτική συλλογή των κοινόχρηστων δεικτών προς αντικείμενα [FileSystemInfo](../../filesysteminfo/) που αντιπροσωπεύουν τα ευρεθέντα αρχεία και καταλόγους των οποίων τα ονόματα ταιριάζουν με **searchPattern**

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&, SearchOption) method


Αναζητά τα αρχεία και τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο είτε σε ολόκληρο το δέντρο καταλόγων που ριζώνεται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| searchPattern | const String\& | Το πρότυπο ονόματος των αρχείων και καταλόγων προς αναζήτηση |
| searchOption | SearchOption | Καθορίζει αν η αναζήτηση πρέπει να εκτελεστεί μόνο στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο ή σε ολόκληρο το δέντρο καταλόγων που ρίζεται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο |

### ReturnValue

Η επαναληπτική συλλογή των κοινόχρηστων δεικτών προς αντικείμενα [FileSystemInfo](../../filesysteminfo/) που αντιπροσωπεύουν τα ευρεθέντα αρχεία και καταλόγους των οποίων τα ονόματα ταιριάζουν με **searchPattern**

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
