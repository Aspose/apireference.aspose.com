---
title: "System::IO::File::Open μέθοδος"
linktitle: "Open"
second_title: "Aspose.Page για C++"
description: "System::IO::File::Open μέθοδος. Ανοίγει το καθορισμένο αρχείο στην καθορισμένη λειτουργία για ανάγνωση και εγγραφή και χωρίς κοινή χρήση στο C++."
type: docs
weight: 1900
url: /el/cpp/system.io/file/open/
---
## File::Open(const String\&, FileMode) method


Ανοίγει το καθορισμένο αρχείο στην καθορισμένη λειτουργία για ανάγνωση και εγγραφή χωρίς κοινή χρήση.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Η διαδρομή του αρχείου που θα ανοιχθεί |
| mode | FileMode | Καθορίζει τη λειτουργία με την οποία θα ανοίξει το αρχείο |

### ReturnValue

Ένα αντικείμενο [FileStream](../../filestream/) που σχετίζεται με το ανοιγμένο αρχείο

## Δείτε επίσης

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::Open(const String\&, FileMode, FileAccess, FileShare) method


Ανοίγει το καθορισμένο αρχείο στην καθορισμένη λειτουργία, με τον καθορισμένο τύπο πρόσβασης και την επιλογή κοινής χρήσης.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::None)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Η διαδρομή του αρχείου που θα ανοιχθεί |
| mode | FileMode | Καθορίζει τη λειτουργία με την οποία θα ανοίξει το αρχείο |
| access | FileAccess | Ο ζητούμενος τύπος πρόσβασης |
| share | FileShare | Ο τύπος πρόσβασης που έχουν άλλα αντικείμενα [FileStream](../../filestream/) στο ανοιγμένο αρχείο |

### ReturnValue

Ένα αντικείμενο [FileStream](../../filestream/) που σχετίζεται με το ανοιγμένο αρχείο

## Δείτε επίσης

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
