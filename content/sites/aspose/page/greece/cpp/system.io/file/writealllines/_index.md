---
title: "System::IO::File::WriteAllLines μέθοδος"
linktitle: "WriteAllLines"
second_title: "Aspose.Page για C++"
description: "System::IO::File::WriteAllLines μέθοδος. Δημιουργεί ένα νέο αρχείο κειμένου ή αντικαθιστά το υπάρχον και γράφει όλες τις συμβολοσειρές από τον καθορισμένο πίνακα συμβολοσειρών σε αυτό, κάθε συμβολοσειρά σε νέα γραμμή, χρησιμοποιώντας την καθορισμένη κωδικοποίηση σε C++."
type: docs
weight: 3600
url: /el/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


Δημιουργεί ένα νέο αρχείο κειμένου ή αντικαθιστά το υπάρχον και γράφει όλες τις συμβολοσειρές από τον καθορισμένο πίνακα συμβολοσειρών σε αυτό, κάθε συμβολοσειρά σε νέα γραμμή, χρησιμοποιώντας την καθορισμένη κωδικοποίηση.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Το αρχείο για δημιουργία ή αντικατάσταση |
| περιεχόμενα | const ArrayPtr\<String\>\& | Ένας πίνακας συμβολοσειρών |
| encoding | const EncodingPtr\& | Η κωδικοποίηση χαρακτήρων που θα χρησιμοποιηθεί |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


Δημιουργεί ένα νέο αρχείο κειμένου ή αντικαθιστά το υπάρχον και γράφει όλες τις συμβολοσειρές από την καθορισμένη επαναληπτική συλλογή συμβολοσειρών σε αυτό, κάθε συμβολοσειρά σε νέα γραμμή, χρησιμοποιώντας την καθορισμένη κωδικοποίηση.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Το αρχείο για δημιουργία ή αντικατάσταση |
| περιεχόμενα | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Μια επαναληπτική συλλογή συμβολοσειρών |
| encoding | const EncodingPtr\& | Η κωδικοποίηση χαρακτήρων που θα χρησιμοποιηθεί |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
