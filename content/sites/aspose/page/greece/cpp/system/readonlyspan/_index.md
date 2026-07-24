---
title: "Κλάση System::ReadOnlySpan"
linktitle: "ReadOnlySpan"
second_title: "Aspose.Page για C++"
description: "Κλάση System::ReadOnlySpan. Προώθηση για χρήση μέσα στην κλάση Span σε C++."
type: docs
weight: 5300
url: /el/cpp/system/readonlyspan/
---
## ReadOnlySpan class


Προώθηση για χρήση μέσα στην κλάση [Span](../span/).

```cpp
template<typename T>class ReadOnlySpan : public System::Details::SpanCore<const T, ReadOnlySpan<T>, Span<T>>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος των στοιχείων στο span. Αυτή η κλάση παρέχει έναν type-safe τρόπο για εργασία με συνεχόμενες ακολουθίες αντικειμένων σε read-only τρόπο. Μπορεί να χρησιμοποιηθεί για να τυλίξει πίνακες, στοίβες πινάκων ή ακατέργαστους δείκτες διατηρώντας τον έλεγχο ορίων. Το [ReadOnlySpan](./) δεν κατέχει τη μνήμη στην οποία δείχνει - είναι απλώς μια προβολή στην υπάρχουσα μνήμη. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ReadOnlySpan](./readonlyspan/)(const Span\<T\>\&) | Δημιουργεί ένα span μόνο-ανάγνωσης από ένα κανονικό span. |
| static [to_ReadOnlySpan](./to_readonlyspan/)(const typename BaseType::ArrayPtrT\&) | Μετατρέπει έναν πίνακα σε ένα [ReadOnlySpan](./). |
## Παρατηρήσεις


Αναπαριστά μια read-only συνεχόμενη περιοχή αυθαίρετης μνήμης.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
