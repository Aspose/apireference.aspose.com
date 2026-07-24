---
title: "System::String::IndexOfAny μέθοδος"
linktitle: "IndexOfAny"
second_title: "Aspose.Page για C++"
description: "System::String::IndexOfAny method. Αναζήτηση χαρακτήρα προς τα εμπρός σε C++."
type: docs
weight: 1600
url: /el/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


Αναζήτηση χαρακτήρα προς τα εμπρός.

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| c | char_t | Χαρακτήρας προς αναζήτηση. |
| startIndex | int | Δείκτης από όπου ξεκινά η αναζήτηση. |

### ReturnValue

Δείκτης της πρώτης θέσης χαρακτήρα από το startIndex ή -1 εάν δεν βρεθεί.

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


Αναζητά οποιονδήποτε από τους δοθέντες χαρακτήρες σε ολόκληρη τη συμβολοσειρά. Συγκρίνει τον πρώτο χαρακτήρα της συμβολοσειράς με όλους τους χαρακτήρες στο anyOf, έπειτα συγκρίνει τον δεύτερο κ.λπ. Επιστρέφει το δείκτη του πρώτου που ταιριάζει με οποιονδήποτε από τους στόχους χαρακτήρες.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) χαρακτήρων προς αναζήτηση. Η σειρά δεν έχει σημασία. |

### ReturnValue

Δείκτης του πρώτου αντιστοιχούντος χαρακτήρα ή -1 εάν δεν βρεθεί.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Αναζητά οποιονδήποτε από τους δοθέντες χαρακτήρες σε υποσυμβολοσειρά. Συγκρίνει τον πρώτο χαρακτήρα της συμβολοσειράς με όλους τους χαρακτήρες στο anyOf, έπειτα συγκρίνει τον δεύτερο κ.λπ. Επιστρέφει το δείκτη του πρώτου που ταιριάζει με οποιονδήποτε από τους στόχους χαρακτήρες.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) χαρακτήρων προς αναζήτηση. Η σειρά δεν έχει σημασία. |
| startindex | int32_t | Δείκτης από τον οποίο ξεκινά η αναζήτηση. |

### ReturnValue

Δείκτης του πρώτου αντιστοιχούντος χαρακτήρα ή -1 εάν δεν βρεθεί.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Αναζητά οποιονδήποτε από τους δοθέντες χαρακτήρες σε υποσυμβολοσειρά. Συγκρίνει τον πρώτο χαρακτήρα της συμβολοσειράς με όλους τους χαρακτήρες στο anyOf, έπειτα συγκρίνει τον δεύτερο κ.λπ. Επιστρέφει το δείκτη του πρώτου που ταιριάζει με οποιονδήποτε από τους στόχους χαρακτήρες.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) χαρακτήρων προς αναζήτηση. Η σειρά δεν έχει σημασία. |
| startindex | int32_t | Δείκτης από τον οποίο ξεκινά η αναζήτηση. |
| count | int32_t | Αριθμός χαρακτήρων προς εξέταση. |

### ReturnValue

Δείκτης του πρώτου αντιστοιχούντος χαρακτήρα ή -1 εάν δεν βρεθεί.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


Κατ' αυτόν τον τρόπο αναζητά όλους τους χαρακτήρες του str σε αυτό. Εάν βρεθεί ο πρώτος χαρακτήρας, επιστρέφεται η θέση του, διαφορετικά αναζητείται ο δεύτερος και ούτω καθεξής.

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const String\& | [String](../) των χαρακτήρων προς αναζήτηση. Η σειρά των χαρακτήρων έχει σημασία. |
| startIndex | int | Θέση από την οποία ξεκινά η αναζήτηση. |

### ReturnValue

Δείκτης του πρώτου ευρεθέντος χαρακτήρα ή -1 αν δεν βρεθεί κανένας.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
