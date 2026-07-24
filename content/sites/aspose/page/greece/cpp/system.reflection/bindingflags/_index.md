---
title: "Απαρίθμηση System::Reflection::BindingFlags"
linktitle: "BindingFlags"
second_title: "Aspose.Page για C++"
description: "Απαρίθμηση System::Reflection::BindingFlags. Ορίζει τα μέλη και τις λειτουργίες αναζήτησης τύπων και τις συνδέσεις σε C++."
type: docs
weight: 1100
url: /el/cpp/system.reflection/bindingflags/
---
## BindingFlags enum


Ορίζει μέλη και τρόπους αναζήτησης τύπων και δεσμεύσεων.

```cpp
enum class BindingFlags
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| Default | 0 | Καμία ειδική επιλογή. |
| IgnoreCase | 1 | Αγνοήστε τη διάκριση πεζών-κεφαλαίων του ονόματος κατά την αναζήτηση του αντικειμένου. |
| DeclaredOnly | 2 | Αναζητήστε μόνο τα μέλη που δηλώνονται στον τύπο και όχι στους βασικούς τύπους. |
| Instance | 4 | Περιηγηθείτε στα μέλη του στιγμιότυπου. |
| Στατικό | 8 | Περιηγηθείτε στα στατικά μέλη. |
| Δημόσιο | 16 | Περιηγηθείτε στα δημόσια μέλη. |
| NonPublic | 32 | Περιηγηθείτε στα μη-δημόσια μέλη. |
| FlattenHierarchy | 64 | Περιηγηθείτε στα δημόσια και προστατευμένα στατικά μέλη του βασικού τύπου. |
| InvokeMethod | 256 | Καλεί τη μέθοδο. |
| CreateInstance | 512 | Δημιουργεί ένα στιγμιότυπο του αντανακλούμενου τύπου. |
| GetField | 1024 | Λαμβάνει την τιμή του πεδίου. |
| SetField | 2048 | Ορίζει την τιμή του πεδίου. |
| GetProperty | 4096 | Λαμβάνει την τιμή της ιδιότητας. |
| SetProperty | 8192 | Ορίζει την τιμή της ιδιότητας. |
| PutDispProperty | 16384 | Τοποθετεί ιδιότητα COM. |
| PutRefDispProperty | 32768 | Τοποθετεί ιδιότητα αναφοράς COM. |
| ExactBinding | 65536 | Η σύνδεση τύπου πρέπει να είναι ακριβής, χωρίς καμία αλλαγή τύπου. |
| SuppressChangeType | 131072 | Δεν υποστηρίζεται. |
| OptionalParamBinding | 262144 | Επιλέγει υπερφόρτωση βάσει του αριθμού των ορισμάτων. |
| IgnoreReturn | 16777216 | Αγνοεί την τιμή επιστροφής του COM interop. |

## Δείτε επίσης

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
