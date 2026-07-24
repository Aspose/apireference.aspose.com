---
title: "System::Reflection::FieldAttributes enum"
linktitle: "FieldAttributes"
second_title: "Aspose.Page για C++"
description: "System::Reflection::FieldAttributes enum. Αντικατοπτρισμένα χαρακτηριστικά πεδίου σε C++."
type: docs
weight: 1200
url: /el/cpp/system.reflection/fieldattributes/
---
## FieldAttributes enum


Ανακλώμενα χαρακτηριστικά πεδίου.

```cpp
enum class FieldAttributes
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| FieldAccessMask | 7 | Μάσκα πρόσβασης μέλους. Χρησιμοποιήστε αυτή τη μάσκα για να ανακτήσετε πληροφορίες προσβασιμότητας. |
| PrivateScope | 0 | Μη αναφορικά μέλη. |
| Private | 1 | Ιδιωτικά μέλη. |
| FamANDAssem | 2 | Ιδιωτικά και μέλη με εμβέλεια συναρμολόγησης. |
| Assembly | 3 | Μέλη με εμβέλεια συναρμολόγησης. |
| Οικογένεια | 4 | Μέλη προσβάσιμα κατά τύπο και υποτύπους. |
| FamORAssem | 5 | Μέλη προσβάσιμα κατά τύπο, υπο-τύπους και συναρμολόγηση. |
| Δημόσιο | 6 | Μέλη προσβάσιμα από οποιονδήποτε. |
| Στατικό | 16 | Στατικά μέλη σε αντίθεση με τα μέλη παραδείγματος. |
| InitOnly | 32 | Σταθερά μέλη που μπορούν μόνο να αρχικοποιηθούν αλλά δεν μπορούν να αλλάξουν. |
| Literal | 64 | Μέλη σταθερά κατά χρόνο μεταγλώττισης. |
| NotSerialized | 128 | Μη σειριοποιημένα μέλη. |
| SpecialName | 512 | Ειδικό πεδίο ενός από τα παρακάτω ονόματα. |
| PinvokeImpl | 8192 | Υλοποίηση προώθησης Interop. |
| ReservedMask | 38144 | Κρατημένες σημαίες μόνο για χρήση σε χρόνο εκτέλεσης. |
| RTSpecialName | 1024 | Το Runtime θα πρέπει να ελέγξει την κωδικοποίηση του ονόματος. |
| HasFieldMarshal | 4096 | Οι πληροφορίες διαμεταγωγής είναι παρούσες. |
| HasDefault | 32768 | Η προεπιλεγμένη τιμή είναι παρούσα. |
| HasFieldRVA | 256 | Το RVA είναι παρόν. |

## Δείτε επίσης

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
