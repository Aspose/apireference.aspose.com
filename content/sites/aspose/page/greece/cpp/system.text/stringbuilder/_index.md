---
title: "System::Text::StringBuilder κλάση"
linktitle: "StringBuilder"
second_title: "Aspose.Page για C++"
description: "System::Text::StringBuilder κλάση. Προσωρινή μνήμη για τη συσσώρευση συμβολοσειράς τμήμα προς τμήμα. Αυτός ο τύπος μπορεί να εκχωρηθεί είτε στη στοίβα ως τύπο τιμής είτε στη σωρού χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Μόλις το αντικείμενο εκχωρηθεί, μην αναμειγνύετε αυτές τις δύο περιπτώσεις χρήσης: η ύπαρξη δεικτών SmartPtr προς αντικείμενα που έχουν εκχωρηθεί στη στοίβα απαγορεύεται αυστηρά σε C++."
type: docs
weight: 2400
url: /el/cpp/system.text/stringbuilder/
---
## StringBuilder class


[Buffer](../../system/buffer/) to accumulate string part by part. This type can be allocated either in stack as value type or in heap using [System::MakeObject()](../../system/makeobject/) function. Once the object is allocated, never mix up these two usecases: having [SmartPtr](../../system/smartptr/) pointers onto stack-allocated objects is strictly prohibited.

```cpp
class StringBuilder : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Append](./append/)(char_t) | Προσθέτει χαρακτήρα στον builder. |
| [Append](./append/)(char_t, int) | Προσθέτει χαρακτήρες στον builder. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&) | Προσθέτει πίνακα χαρακτήρων στον builder. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&, int, int) | Προσθέτει τμήμα πίνακα χαρακτήρων στον builder. |
| [Append](./append/)(const String\&) | Προσθέτει συμβολοσειρά στον builder. |
| [Append](./append/)(const String\&, int, int) | Προσθέτει τμήμα συμβολοσειράς στον builder. |
| [Append](./append/)(const SharedPtr\<T\>\&) | Προσθέτει τη συμβολοσειρά αναπαράστασης του αντικειμένου στον builder. |
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | Προσθέτει το περιεχόμενο του builder στον builder. |
| [Append](./append/)(float) | Προσθέτει τιμή κινητής υποδιαστολής στον builder. |
| [Append](./append/)(double) | Προσθέτει τιμή κινητής υποδιαστολής στον builder. |
| [Append](./append/)(int) | Προσθέτει ακέραια τιμή στον builder. |
| [Append](./append/)(T) | Προσθέτει αριθμητική τιμή στον builder. |
| [Append](./append/)(E) | Προσθέτει την αναπαράσταση της τιμής enum ως συμβολοσειρά στον builder. |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | Προσθέτει μορφοποιημένη συμβολοσειρά στον builder. |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | Προσθέτει μορφοποιημένη συμβολοσειρά στον builder. |
| [AppendLine](./appendline/)() | Προσθέτει χαρακτήρα νέας γραμμής στον builder. |
| [AppendLine](./appendline/)(const String\&) | Προσθέτει συμβολοσειρά ακολουθούμενη από χαρακτήρα νέας γραμμής στον builder. |
| [Clear](./clear/)() | Αφαιρεί όλους τους χαρακτήρες από τον builder. |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | Αντιγράφει τα δεδομένα του builder σε υπάρχουσες θέσεις του πίνακα. |
| [get_Capacity](./get_capacity/)() const | Επιστρέφει τη τρέχουσα χωρητικότητα του string builder. |
| [get_Length](./get_length/)() const | Επιστρέφει το μήκος της συμβολοσειράς που βρίσκεται αυτή τη στιγμή στο builder. |
| [idx_get](./idx_get/)(int) const | Λαμβάνει τον χαρακτήρα στη συγκεκριμένη θέση. |
| [idx_set](./idx_set/)(int, char_t) | Ορίζει τον χαρακτήρα στη συγκεκριμένη θέση. |
| [Insert](./insert/)(int, const String\&) | Εισάγει συμβολοσειρά στη σταθερή θέση του builder. |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | Εισάγει επαναλαμβανόμενη συμβολοσειρά στη σταθερή θέση του builder. |
| [Insert](./insert/)(int, char_t) | Εισάγει χαρακτήρα στη σταθερή θέση του builder. |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | Εισάγει χαρακτήρες στη σταθερή θέση του builder. |
| [Insert](./insert/)(int, T) | Εισάγει τιμή στη σταθερή θέση του builder. |
| [operator[]](./operator[]/)(int) const | Λαμβάνει τον χαρακτήρα στη συγκεκριμένη θέση. |
| [Remove](./remove/)(int, int) | Αφαιρεί τμήμα από τον builder. |
| [Replace](./replace/)(const String\&, const String\&) | Αντικαθιστά υποσυμβολοσειρά μέσω του builder. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Αντικαθιστά υποσυμβολοσειρά μέσω της περιοχής του builder. |
| [Replace](./replace/)(char_t, char_t) | Αντικαθιστά χαρακτήρα μέσω του builder. |
| [Replace](./replace/)(char_t, char_t, int, int) | Αντικαθιστά χαρακτήρα μέσω της περιοχής του builder. |
| [set_Capacity](./set_capacity/)(int) | Ορίζει τη τρέχουσα χωρητικότητα του string builder. |
| [set_Length](./set_length/)(int) | Κόβει ή επεκτείνει το string builder στο καθορισμένο μήκος. |
| [StringBuilder](./stringbuilder/)() | Κατασκευαστής. |
| [StringBuilder](./stringbuilder/)(int) | Κατασκευαστής. |
| [StringBuilder](./stringbuilder/)(const String\&) | Κατασκευαστής. |
| [StringBuilder](./stringbuilder/)(const String\&, int) | Κατασκευαστής. |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | Κατασκευαστής. |
| [ToString](./tostring/)() const override | Επιστρέφει τη συμβολοσειρά που περιέχεται αυτή τη στιγμή στο builder. |
| [ToString](./tostring/)(int, int) const | Επιστρέφει την υποσυμβολοσειρά που περιέχεται αυτή τη στιγμή στο builder. |
| [~StringBuilder](./~stringbuilder/)() | Καταστροφέας. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
