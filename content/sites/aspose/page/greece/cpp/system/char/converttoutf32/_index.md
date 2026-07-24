---
title: "System::Char::ConvertToUtf32 μέθοδος"
linktitle: "ConvertToUtf32"
second_title: "Aspose.Page για C++"
description: "System::Char::ConvertToUtf32 μέθοδος. Μετατρέπει το καθορισμένο ζεύγος αντιπροσώπου UTF-16 σε μονάδα κώδικα UTF-32 σε C++."
type: docs
weight: 200
url: /el/cpp/system/char/converttoutf32/
---
## Char::ConvertToUtf32(char_t, char_t) method


Μετατρέπει το καθορισμένο ζεύγος διαδεκτών UTF-16 σε μονάδα κώδικα UTF-32.

```cpp
static int System::Char::ConvertToUtf32(char_t highSurrogate, char_t lowSurrogate)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| highSurrogate | char_t | Ο υψηλός αντιπρόσωπος του ζεύγους αντιπροσώπου UTF-16 που θα μετατραπεί |
| lowSurrogate | char_t | Ο χαμηλός αντιπρόσωπος του ζεύγους αντιπροσώπου UTF-16 που θα μετατραπεί |

### ReturnValue

Μονάδα κώδικα UTF-32 που προκύπτει από τη μετατροπή

## Δείτε επίσης

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::ConvertToUtf32(const String\&, int) method


Μετατρέπει την τιμή ενός χαρακτήρα κωδικοποιημένου σε UTF-16 ή ζεύγους υποκατάστασης σε καθορισμένη θέση σε μια συμβολοσειρά σε μονάδα κώδικα UTF-32.

```cpp
static int System::Char::ConvertToUtf32(const String &s, int index)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| s | const String\& | Συμβολοσειρά που περιέχει έναν χαρακτήρα ή ζεύγος αντιπροσώπου |
| δείκτης | int | Η θέση δείκτη του χαρακτήρα ή του ζεύγους αντιπροσώπου στην καθορισμένη συμβολοσειρά |

### ReturnValue

Μονάδα κώδικα UTF-32 που προκύπτει από τη μετατροπή

## Δείτε επίσης

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
