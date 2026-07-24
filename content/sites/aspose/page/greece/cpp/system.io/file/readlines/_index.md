---
title: "System::IO::File::ReadLines μέθοδος"
linktitle: "ReadLines"
second_title: "Aspose.Page για C++"
description: "System::IO::File::ReadLines μέθοδος. Διαβάζει το περιεχόμενο του καθορισμένου αρχείου κειμένου γραμμή προς γραμμή χρησιμοποιώντας την καθορισμένη κωδικοποίηση χαρακτήρων και επιστρέφει επαναληπτική συλλογή συμβολοσειρών, η καθεμία από τις οποίες αντιπροσωπεύει μια μοναδική γραμμή του περιεχομένου του αρχείου σε C++."
type: docs
weight: 2600
url: /el/cpp/system.io/file/readlines/
---
## File::ReadLines method


Διαβάζει το περιεχόμενο του καθορισμένου αρχείου κειμένου γραμμή προς γραμμή χρησιμοποιώντας την καθορισμένη κωδικοποίηση χαρακτήρων και επιστρέφει μια συλλογή επαναληπτικών συμβολοσειρών, όπου καθεμία αντιπροσωπεύει μια μοναδική γραμμή του περιεχομένου του αρχείου.

```cpp
static SharedPtr<Collections::Generic::IEnumerable<String>> System::IO::File::ReadLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Η διαδρομή του αρχείου που θα διαβαστεί |
| encoding | const EncodingPtr\& | Η κωδικοποίηση χαρακτήρων που θα χρησιμοποιηθεί |

### ReturnValue

Μια συλλογή επαναλήψιμων συμβολοσειρών που αντιπροσωπεύει το περιεχόμενο του καθορισμένου αρχείου

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
