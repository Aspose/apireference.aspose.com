---
title: "System::IO::File::Create μέθοδος"
linktitle: "Δημιουργία"
second_title: "Aspose.Page για C++"
description: "System::IO::File::Create μέθοδος. Δημιουργεί ένα νέο αρχείο (ή αντικαθιστά το υπάρχον) και το ανοίγει για πρόσβαση ανάγνωσης και εγγραφής χρησιμοποιώντας το καθορισμένο μέγεθος buffer και τις επιλογές σε C++."
type: docs
weight: 500
url: /el/cpp/system.io/file/create/
---
## File::Create method


Δημιουργεί ένα νέο αρχείο (ή αντικαθιστά το υπάρχον) και το ανοίγει για πρόσβαση ανάγνωσης και εγγραφής χρησιμοποιώντας το καθορισμένο μέγεθος buffer και τις επιλογές.

```cpp
static FileStreamPtr System::IO::File::Create(const String &path, int32_t bufferSize=DefaultBufferSize, FileOptions options=FileOptions::None)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Η διαδρομή του αρχείου που θα δημιουργηθεί ή θα αντικατασταθεί |
| bufferSize | int32_t | Ο αριθμός των byte που αποθηκεύονται προσωρινά κατά την ανάγνωση και εγγραφή στο αρχείο |
| επιλογές | FileOptions | Καθορίζει πώς να δημιουργηθεί ή να αντικατασταθεί το αρχείο |

### ReturnValue

Ένας κοινός δείκτης προς το αντικείμενο [FileStream](../../filestream/) που σχετίζεται με το καθορισμένο αρχείο

## Δείτε επίσης

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileOptions](../../fileoptions/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
