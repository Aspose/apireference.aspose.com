---
title: "System::String::LastIndexOfAny method"
linktitle: "LastIndexOfAny"
second_title: "Aspose.Page για C++"
description: "System::String::LastIndexOfAny method. Αναζητά οποιονδήποτε από τους δοθέντες χαρακτήρες σε ολόκληρη τη συμβολοσειρά προς τα πίσω. Συγκρίνει τον τελευταίο χαρακτήρα της συμβολοσειράς με όλους τους χαρακτήρες στο anyOf, έπειτα τον προηγούμενο και ούτω καθεξής. Επιστρέφει το δείκτη της πρώτης αντιστοιχίας που βρέθηκε σε C++."
type: docs
weight: 2500
url: /el/cpp/system/string/lastindexofany/
---
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&) const method


Αναζητά οποιονδήποτε από τους δοθέντες χαρακτήρες σε ολόκληρη τη συμβολοσειρά προς τα πίσω. Συγκρίνει τον τελευταίο χαρακτήρα της συμβολοσειράς με όλους τους χαρακτήρες στο anyOf, έπειτα συγκρίνει τον προηγούμενο κ.λπ. Επιστρέφει το δείκτη του πρώτου ευρέθέντος αντιστοιχίας.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) χαρακτήρων προς αναζήτηση. Η σειρά δεν έχει σημασία. |

### ReturnValue

Δείκτης του τελευταίου χαρακτήρα που ταιριάζει ή -1 αν δεν βρεθεί.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Αναζητά οποιονδήποτε από τους δοθέντες χαρακτήρες σε υποσυμβολοσειρά προς τα πίσω. Συγκρίνει τον τελευταίο χαρακτήρα της συμβολοσειράς με όλους τους χαρακτήρες στο anyOf, έπειτα συγκρίνει τον προηγούμενο κ.λπ. Επιστρέφει το δείκτη του πρώτου ευρέθέντος αντιστοιχίας.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) χαρακτήρων προς αναζήτηση. Η σειρά δεν έχει σημασία. |
| startindex | int32_t | Δείκτης από τον οποίο ξεκινά η αναζήτηση. |

### ReturnValue

Δείκτης του τελευταίου χαρακτήρα που ταιριάζει ή -1 αν δεν βρεθεί.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Αναζητά οποιονδήποτε από τους δοθέντες χαρακτήρες σε υποσυμβολοσειρά προς τα πίσω. Συγκρίνει τον τελευταίο χαρακτήρα της συμβολοσειράς με όλους τους χαρακτήρες στο anyOf, έπειτα συγκρίνει τον προηγούμενο κ.λπ. Επιστρέφει το δείκτη του πρώτου ευρέθέντος αντιστοιχίας.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) χαρακτήρων προς αναζήτηση. Η σειρά δεν έχει σημασία. |
| startindex | int32_t | Δείκτης από τον οποίο ξεκινά η αναζήτηση. |
| count | int32_t | Αριθμός χαρακτήρων προς εξέταση. |

### ReturnValue

Δείκτης του τελευταίου χαρακτήρα που ταιριάζει ή -1 αν δεν βρεθεί.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
