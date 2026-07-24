---
title: "System::IO::File::AppendAllLines μέθοδος"
linktitle: "AppendAllLines"
second_title: "Aspose.Page για C++"
description: "System::IO::File::AppendAllLines μέθοδος. Προσθέτει συμβολοσειρές από τη συγκεκριμένη συλλογή συμβολοσειρών στο καθορισμένο αρχείο χρησιμοποιώντας την καθορισμένη κωδικοποίηση, γράφοντας κάθε συμβολοσειρά σε νέα γραμμή. Εάν το καθορισμένο αρχείο δεν υπάρχει, δημιουργείται. Το αρχείο κλείνει μετά την εγγραφή όλων των συμβολοσειρών σε C++."
type: docs
weight: 100
url: /el/cpp/system.io/file/appendalllines/
---
## File::AppendAllLines method


Προσθέτει συμβολοσειρές από τη συγκεκριμένη συλλογή συμβολοσειρών στο καθορισμένο αρχείο χρησιμοποιώντας την καθορισμένη κωδικοποίηση, γράφοντας κάθε συμβολοσειρά σε νέα γραμμή. Εάν το καθορισμένο αρχείο δεν υπάρχει, δημιουργείται. Το αρχείο κλείνει μετά την εγγραφή όλων των συμβολοσειρών.

```cpp
static void System::IO::File::AppendAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Η διαδρομή του αρχείου για προσθήκη των συμβολοσειρών |
| περιεχόμενα | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Οι συμβολοσειρές για εγγραφή στο αρχείο |
| encoding | const EncodingPtr\& | Η κωδικοποίηση χαρακτήρων που θα χρησιμοποιηθεί |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
