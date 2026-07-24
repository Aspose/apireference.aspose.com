---
title: "System::IO::Directory::EnumerateDirectories μέθοδος"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Page για C++"
description: "System::IO::Directory::EnumerateDirectories μέθοδος. Αναζητά τους φακέλους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον καθορισμένο φάκελο είτε σε όλο το δέντρο φακέλων που έχει ρίζα στον καθορισμένο φάκελο σε C++."
type: docs
weight: 300
url: /el/cpp/system.io/directory/enumeratedirectories/
---
## Directory::EnumerateDirectories method


Αναζητά τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον καθορισμένο κατάλογο είτε σε όλο το δέντρο καταλόγων που ρίζεται στον καθορισμένο κατάλογο.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Πλήρης ή σχετική διαδρομή προς τον κατάλογο όπου θα γίνει η αναζήτηση |
| searchPattern | const String\& | Το μοτίβο ονόματος των καταλόγων προς αναζήτηση |
| searchOption | SearchOption | Καθορίζει εάν η αναζήτηση πρέπει να εκτελεστεί μόνο στον καθορισμένο κατάλογο ή σε ολόκληρο το δέντρο καταλόγων που ρίζεται στον καθορισμένο κατάλογο |

### ReturnValue

Η συλλογή με δυνατότητα επανάληψης πλήρων διαδρομών των ευρεθέντων φακέλων των οποίων τα ονόματα ταιριάζουν με **searchPattern**

## Δείτε επίσης

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
