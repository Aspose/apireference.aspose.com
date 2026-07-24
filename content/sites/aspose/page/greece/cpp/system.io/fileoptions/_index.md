---
title: "System::IO::FileOptions enum"
linktitle: "FileOptions"
second_title: "Aspose.Page για C++"
description: "System::IO::FileOptions enum. Αντιπροσωπεύει προχωρημένες επιλογές για τη δημιουργία αντικειμένου FileStream στη C++."
type: docs
weight: 3200
url: /el/cpp/system.io/fileoptions/
---
## FileOptions enum


Αντιπροσωπεύει προχωρημένες επιλογές για τη δημιουργία του αντικειμένου [FileStream](../filestream/).

```cpp
enum class FileOptions
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| None | 0 | Δεν υπάρχουν πρόσθετες επιλογές. |
| Encrypted | 16384 | Το αρχείο είναι κρυπτογραφημένο. ΔΕΝ ΥΛΟΠΟΙΕΙΤΑΙ. |
| DeleteOnClose | 67108864 | Το αρχείο θα πρέπει να διαγράφεται αυτόματα όταν δεν χρησιμοποιείται πλέον. |
| SequentialScan | 134217728 | Το αρχείο πρέπει να προσπελαύνεται διαδοχικά. |
| RandomAccess | 268435456 | Το αρχείο προσπελάζεται τυχαία. |
| Asynchronous | 1073741824 | Το αρχείο μπορεί να χρησιμοποιηθεί για ασύγχρονες λειτουργίες I/O. |
| WriteThrough | n/a | Όλες οι εγγραφές πρέπει να πηγαίνουν απευθείας στο δίσκο παρακάμπτοντας οποιαδήποτε ενδιάμεση κρυφή μνήμη. |

## Δείτε επίσης

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
