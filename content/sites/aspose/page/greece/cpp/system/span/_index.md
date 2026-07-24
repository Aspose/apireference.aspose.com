---
title: "System::Span class"
linktitle: "Span"
second_title: "Aspose.Page για C++"
description: "System::Span class. Αντιπροσωπεύει μια συνεχόμενη περιοχή αυθαίρετης μνήμης παρόμοια με το std::span του C++20''s std::span in C++."
type: docs
weight: 5700
url: /el/cpp/system/span/
---
## Span class


Αντιπροσωπεύει μια συνεχόμενη περιοχή αυθαίρετης μνήμης παρόμοια με το std::span του C++20.

```cpp
template<typename T>class Span : public System::Details::SpanCore<T, Span<T>, Span<T>>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος των στοιχείων στο span. Αυτή η κλάση παρέχει έναν ασφαλή ως προς τον τύπο τρόπο εργασίας με συνεχόμενες ακολουθίες αντικειμένων. Μπορεί να χρησιμοποιηθεί για την περιτύλιξη πινάκων, πινάκων στη στοίβα ή ακατέργαστων δεικτών διατηρώντας τον έλεγχο ορίων. Το [Span](./) δεν κατέχει τη μνήμη στην οποία δείχνει - είναι μόνο μια προβολή στην υπάρχουσα μνήμη. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clear](./clear/)() const | Καθαρίζει το περιεχόμενο του span ορίζοντας όλα τα στοιχεία στην προεπιλεγμένη τιμή. |
| [Fill](./fill/)(const T\&) const | Γεμίζει το span με την καθορισμένη τιμή. |
| static [to_Span](./to_span/)(const typename BaseType::ArrayPtrT\&) | Μετατρέπει έναν πίνακα σε ένα [Span](./). |

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
