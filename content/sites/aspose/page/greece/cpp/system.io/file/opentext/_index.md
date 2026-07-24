---
title: "System::IO::File::OpenText μέθοδος"
linktitle: "OpenText"
second_title: "Aspose.Page για C++"
description: "System::IO::File::OpenText μέθοδος. Ανοίγει το καθορισμένο υπάρχον αρχείο για ανάγνωση κειμένου χρησιμοποιώντας κωδικοποίηση UTF-8 χωρίς κοινή χρήση σε C++."
type: docs
weight: 2100
url: /el/cpp/system.io/file/opentext/
---
## File::OpenText method


Ανοίγει το καθορισμένο υπάρχον αρχείο για ανάγνωση κειμένου χρησιμοποιώντας κωδικοποίηση UTF-8 χωρίς κοινή χρήση.

```cpp
static StreamReaderPtr System::IO::File::OpenText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Η διαδρομή του αρχείου που θα ανοιχθεί |
| encoding | const EncodingPtr\& | Η κωδικοποίηση χαρακτήρων που θα χρησιμοποιηθεί |

### ReturnValue

Ένας δείκτης κοινής χρήσης προς ένα αντικείμενο [StreamWriter](../../streamwriter/) που σχετίζεται με το ανοιγμένο αρχείο

## Δείτε επίσης

* Typedef [StreamReaderPtr](../../../system/streamreaderptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
