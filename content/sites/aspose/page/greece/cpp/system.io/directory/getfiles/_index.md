---
title: "System::IO::Directory::GetFiles μέθοδος"
linktitle: "GetFiles"
second_title: "Aspose.Page για C++"
description: "System::IO::Directory::GetFiles μέθοδος. Αναζητά τα αρχεία που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον καθορισμένο φάκελο είτε σε όλο το δέντρο φακέλων που έχει ρίζα στον καθορισμένο φάκελο σε C++."
type: docs
weight: 1200
url: /el/cpp/system.io/directory/getfiles/
---
## Directory::GetFiles method


Αναζητά τα αρχεία που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον καθορισμένο κατάλογο είτε σε όλο το δέντρο καταλόγων που ρίζεται στον καθορισμένο κατάλογο.

```cpp
static ArrayPtr<String> System::IO::Directory::GetFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Πλήρης ή σχετική διαδρομή προς τον κατάλογο όπου θα γίνει η αναζήτηση |
| searchPattern | const String\& | Το μοτίβο ονόματος των αρχείων προς αναζήτηση |
| searchOption | SearchOption | Καθορίζει εάν η αναζήτηση πρέπει να εκτελεστεί μόνο στον καθορισμένο κατάλογο ή σε ολόκληρο το δέντρο καταλόγων που ρίζεται στον καθορισμένο κατάλογο |

### ReturnValue

Ένας πίνακας πλήρων διαδρομών των ευρεθέντων αρχείων των οποίων τα ονόματα ταιριάζουν με **searchPattern**

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
