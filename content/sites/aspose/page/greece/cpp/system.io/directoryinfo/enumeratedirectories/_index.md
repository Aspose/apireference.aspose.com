---
title: "System::IO::DirectoryInfo::EnumerateDirectories μέθοδος"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Page για C++"
description: "System::IO::DirectoryInfo::EnumerateDirectories μέθοδος. Επιστρέφει μια επαναληπτική συλλογή που περιέχει όλους τους καταλόγους που βρίσκονται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο σε C++."
type: docs
weight: 500
url: /el/cpp/system.io/directoryinfo/enumeratedirectories/
---
## DirectoryInfo::EnumerateDirectories() method


Επιστρέφει μια συλλογή με δυνατότητα επανάληψης που περιέχει όλους τους καταλόγους που βρίσκονται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories()
```

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&) method


Αναζητά τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| searchPattern | const String\& | Το μοτίβο ονόματος των καταλόγων προς αναζήτηση |

### ReturnValue

Η επαναληπτική συλλογή κοινών δεικτών σε αντικείμενα [DirectoryInfo](../) που αντιπροσωπεύουν τους ευρεθέντες καταλόγους των οποίων τα ονόματα ταιριάζουν με **searchPattern**

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&, SearchOption) method


Αναζητά τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο είτε σε όλο το δέντρο καταλόγων που ρίζεται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| searchPattern | const String\& | Το μοτίβο ονόματος των καταλόγων προς αναζήτηση |
| searchOption | SearchOption | Καθορίζει αν η αναζήτηση πρέπει να εκτελεστεί μόνο στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο ή σε ολόκληρο το δέντρο καταλόγων που ρίζεται στον κατάλογο που αντιπροσωπεύεται από το τρέχον αντικείμενο |

### ReturnValue

Η επαναληπτική συλλογή κοινών δεικτών σε αντικείμενα [DirectoryInfo](../) που αντιπροσωπεύουν τους ευρεθέντες καταλόγους των οποίων τα ονόματα ταιριάζουν με **searchPattern**

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
