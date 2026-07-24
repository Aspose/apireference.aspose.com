---
title: "System::IO::Directory::EnumerateFileSystemEntries μέθοδος"
linktitle: "EnumerateFileSystemEntries"
second_title: "Aspose.Page για C++"
description: "System::IO::Directory::EnumerateFileSystemEntries μέθοδος. Αναζητά τα αρχεία και τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον καθορισμένο κατάλογο είτε σε όλο το δέντρο καταλόγων που έχει ρίζα στον καθορισμένο κατάλογο σε C++."
type: docs
weight: 500
url: /el/cpp/system.io/directory/enumeratefilesystementries/
---
## Directory::EnumerateFileSystemEntries method


Αναζητά τα αρχεία και τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον καθορισμένο κατάλογο είτε σε όλο το δέντρο καταλόγων που ρίζεται στον καθορισμένο κατάλογο.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Πλήρης ή σχετική διαδρομή προς τον κατάλογο όπου θα γίνει η αναζήτηση |
| searchPattern | const String\& | Το πρότυπο ονόματος των αρχείων και καταλόγων προς αναζήτηση |
| searchOption | SearchOption | Καθορίζει εάν η αναζήτηση πρέπει να εκτελεστεί μόνο στον καθορισμένο κατάλογο ή σε ολόκληρο το δέντρο καταλόγων που ρίζεται στον καθορισμένο κατάλογο |

### ReturnValue

Η επαναλήψιμη συλλογή των πλήρων διαδρομών των ευρεθέντων αρχείων και καταλόγων των οποίων τα ονόματα ταιριάζουν με **searchPattern**

## Δείτε επίσης

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
