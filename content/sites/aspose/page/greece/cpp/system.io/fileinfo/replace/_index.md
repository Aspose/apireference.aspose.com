---
title: "System::IO::FileInfo::Replace μέθοδος"
linktitle: "Αντικατάσταση"
second_title: "Aspose.Page για C++"
description: "System::IO::FileInfo::Replace μέθοδος. Αντικαθιστά το περιεχόμενο ενός καθορισμένου αρχείου προορισμού με το αρχείο που αντιπροσωπεύεται από το τρέχον αντικείμενο FileInfo και δημιουργεί αντίγραφο ασφαλείας του αντικατεστημένου αρχείου σε C++."
type: docs
weight: 2000
url: /el/cpp/system.io/fileinfo/replace/
---
## FileInfo::Replace(const String\&, const String\&) method


Αντικαθιστά το περιεχόμενο ενός καθορισμένου αρχείου προορισμού με το αρχείο που αντιπροσωπεύεται από το τρέχον αντικείμενο [FileInfo](../) και δημιουργεί αντίγραφο ασφαλείας του αντικατεστημένου αρχείου.

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| destinationFileName | const String\& | Ένα όνομα του αρχείου προς αντικατάσταση |
| destinationBackupFileName | const String\& | Ένα όνομα του αρχείου αντιγράφου ασφαλείας |

### ReturnValue

Ένα αντικείμενο FileInfor που αντιπροσωπεύει το αρχείο στο οποίο δείχνει το **destinationFileName**

## Δείτε επίσης

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::Replace(const String\&, const String\&, bool) method


Αντικαθιστά το περιεχόμενο ενός καθορισμένου αρχείου προορισμού με το αρχείο που αντιπροσωπεύεται από το τρέχον αντικείμενο [FileInfo](../) και δημιουργεί αντίγραφο ασφαλείας του αντικατεστημένου αρχείου.

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName, bool ignoreMetadataErrors)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| destinationFileName | const String\& | Ένα όνομα του αρχείου προς αντικατάσταση |
| destinationBackupFileName | const String\& | Ένα όνομα του αρχείου αντιγράφου ασφαλείας |
| ignoreMetadataErrors | bool | Καθορίζει εάν τα σφάλματα συγχώνευσης από το αντικατεστημένο αρχείο στο αρχείο αντικατάστασης πρέπει να αγνοηθούν (true) ή όχι (false) |

### ReturnValue

Ένα αντικείμενο FileInfor που αντιπροσωπεύει το αρχείο στο οποίο δείχνει το **destinationFileName**

## Δείτε επίσης

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
