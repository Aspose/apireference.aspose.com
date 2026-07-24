---
title: "System::IO::Directory::GetFileSystemEntries μέθοδος"
linktitle: "GetFileSystemEntries"
second_title: "Aspose.Page για C++"
description: "System::IO::Directory::GetFileSystemEntries μέθοδος. Αναζητά τα αρχεία και τους φακέλους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον καθορισμένο φάκελο είτε σε όλο το δέντρο φακέλων που έχει ρίζα στον καθορισμένο φάκελο σε C++."
type: docs
weight: 1300
url: /el/cpp/system.io/directory/getfilesystementries/
---
## Directory::GetFileSystemEntries method


Αναζητά τα αρχεία και τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον καθορισμένο κατάλογο είτε σε όλο το δέντρο καταλόγων που ρίζεται στον καθορισμένο κατάλογο.

```cpp
static ArrayPtr<String> System::IO::Directory::GetFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Πλήρης ή σχετική διαδρομή προς τον κατάλογο όπου θα γίνει η αναζήτηση |
| searchPattern | const String\& | Το πρότυπο ονόματος των αρχείων και καταλόγων προς αναζήτηση |
| searchOption | SearchOption | Καθορίζει εάν η αναζήτηση πρέπει να εκτελεστεί μόνο στον καθορισμένο κατάλογο ή σε ολόκληρο το δέντρο καταλόγων που ρίζεται στον καθορισμένο κατάλογο |

### ReturnValue

Ένας πίνακας πλήρων διαδρομών των ευρεθέντων αρχείων και φακέλων των οποίων τα ονόματα ταιριάζουν με **searchPattern**

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
