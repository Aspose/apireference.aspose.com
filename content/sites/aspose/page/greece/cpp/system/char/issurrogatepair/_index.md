---
title: "System::Char::IsSurrogatePair μέθοδος"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Page για C++"
description: "System::Char::IsSurrogatePair μέθοδος. Καθορίζει εάν οι δύο καθορισμένοι χαρακτήρες αποτελούν ζεύγος αντιπροσωπευτικών UTF-16 στην C++."
type: docs
weight: 1700
url: /el/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


Καθορίζει εάν οι δύο καθορισμένοι χαρακτήρες για ένα ζεύγος υποκατάστασης UTF-16.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| highSurrogate | char_t | Ένας χαρακτήρας που ελέγχεται για το αν είναι υψηλό αντιπρόσωπο |
| lowSurrogate | char_t | Ένας χαρακτήρας που ελέγχεται για το αν είναι χαμηλό αντιπρόσωπο |

### ReturnValue

Αληθές εάν οι καθορισμένοι χαρακτήρες σχηματίζουν ζεύγος αντιπροσωπευτικών, διαφορετικά - ψευδές

## Δείτε επίσης

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


Καθορίζει εάν δύο διαδοχικοί χαρακτήρες στον καθορισμένο buffer χαρακτήρων αποτελούν ζεύγος υποκατάστασης.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const String\& | Μια συμβολοσειρά |
| δείκτης | int | Ένας δείκτης μηδενικής βάσης στο καθορισμένο buffer από όπου αρχίζει η ακολουθία χαρακτήρων προς έλεγχο |

### ReturnValue

Αληθές εάν οι καθορισμένοι χαρακτήρες είναι ζεύγος αντιπροσώπου, διαφορετικά - ψευδές

## Δείτε επίσης

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
