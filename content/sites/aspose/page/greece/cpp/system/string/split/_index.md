---
title: "System::String::Split μέθοδος"
linktitle: "Διαίρεση"
second_title: "Aspose.Page για C++"
description: "System::String::Split μέθοδος. Διαχωρίζει τη συμβολοσειρά ανά χαρακτήρα στην C++."
type: docs
weight: 4300
url: /el/cpp/system/string/split/
---
## String::Split(char_t, int32_t, StringSplitOptions) const method


Διαιρεί τη συμβολοσειρά κατά χαρακτήρα.

```cpp
ArrayPtr<String> System::String::Split(char_t separator, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| separator | char_t | Χαρακτήρας με τον οποίο θα διαχωριστεί η συμβολοσειρά. |
| count | int32_t | Ο μέγιστος αριθμός υποσυμβολοσειρών που θα επιστραφούν. |
| opt | StringSplitOptions | Επιλογές διαχωρισμού. |

### ReturnValue

[Array](../../array/) of substrings.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, StringSplitOptions) const method


Διαιρεί τη συμβολοσειρά κατά χαρακτήρα.

```cpp
ArrayPtr<String> System::String::Split(char_t separator=u' ', StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| separator | char_t | Χαρακτήρας με τον οποίο θα διαχωριστεί η συμβολοσειρά. |
| opt | StringSplitOptions | Επιλογές διαχωρισμού. |

### ReturnValue

[Array](../../array/) of substrings.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, char_t, StringSplitOptions) const method


Διαιρεί τη συμβολοσειρά με έναν από δύο χαρακτήρες.

```cpp
ArrayPtr<String> System::String::Split(char_t separatorA, char_t separatorB, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| separatorA | char_t | Πρώτος χαρακτήρας με τον οποίο θα διαχωριστεί η συμβολοσειρά. |
| separatorB | char_t | Δεύτερος χαρακτήρας με τον οποίο θα διαχωριστεί η συμβολοσειρά. |
| opt | StringSplitOptions | Επιλογές διαχωρισμού. |

### ReturnValue

[Array](../../array/) of substrings.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const method


Διαχωρίζει τη συμβολοσειρά με έναν από τους καθορισμένους χαρακτήρες.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) χαρακτήρων διαχωρισμού. Εάν είναι κενό, οποιοσδήποτε χαρακτήρας κενό διαστήματος θεωρείται διαχωριστής. |
| count | int32_t | Ο μέγιστος αριθμός υποσυμβολοσειρών που θα επιστραφούν. |
| opt | StringSplitOptions | Επιλογές διαχωρισμού. |

### ReturnValue

[Array](../../array/) of substrings.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, StringSplitOptions) const method


Διαχωρίζει τη συμβολοσειρά με έναν από τους καθορισμένους χαρακτήρες.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) χαρακτήρων διαχωρισμού. Εάν είναι κενό, οποιοσδήποτε χαρακτήρας κενό διαστήματος θεωρείται διαχωριστής. |
| opt | StringSplitOptions | Επιλογές διαχωρισμού. |

### ReturnValue

[Array](../../array/) of substrings.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, int, StringSplitOptions) const method


Διαχωρίζει τη συμβολοσειρά με υποσυμβολοσειρά. Προς το παρόν, υποστηρίζει μόνο πίνακα διαχωριστών με μηδέν ή ένα στοιχεία.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) συμβολοσειρών διαχωρισμού. Εάν είναι κενό, δεν γίνεται διαχωρισμός. |
| count | int | Μέγιστος αριθμός στοιχείων στον πίνακα διαχωρισμών. |
| opt | StringSplitOptions | Επιλογές διαχωρισμού. |

### ReturnValue

[Array](../../array/) of substrings.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, StringSplitOptions) const method


Διαχωρίζει τη συμβολοσειρά με υποσυμβολοσειρά.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) συμβολοσειρών διαχωρισμού. Εάν είναι κενό, δεν γίνεται διαχωρισμός. |
| opt | StringSplitOptions | Επιλογές διαχωρισμού. |

### ReturnValue

[Array](../../array/) of substrings.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, int, StringSplitOptions) const method


Διαχωρίζει τη συμβολοσειρά με υποσυμβολοσειρά.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| separator | const String\& | Υποσυμβολοσειρά που λειτουργεί ως διαχωριστής. Εάν είναι κενή, ο χαρακτήρας κενό διαστήματος λειτουργεί ως διαχωριστής. |
| count | int | Μέγιστος αριθμός στοιχείων στον πίνακα διαχωρισμών. |
| opt | StringSplitOptions | Επιλογές διαχωρισμού. |

### ReturnValue

[Array](../../array/) of substrings.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, StringSplitOptions) const method


Διαχωρίζει τη συμβολοσειρά με υποσυμβολοσειρά.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| separator | const String\& | Υποσυμβολοσειρά που λειτουργεί ως διαχωριστής. Εάν είναι κενή, ο χαρακτήρας κενό διαστήματος λειτουργεί ως διαχωριστής. |
| opt | StringSplitOptions | Επιλογές διαχωρισμού. |

### ReturnValue

[Array](../../array/) of substrings.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
