---
title: "System::String::LastIndexOf μέθοδος"
linktitle: "LastIndexOf"
second_title: "Aspose.Page για C++"
description: "System::String::LastIndexOf μέθοδος. Ανάστροφη αναζήτηση χαρακτήρα σε C++."
type: docs
weight: 2400
url: /el/cpp/system/string/lastindexof/
---
## String::LastIndexOf(char_t) const method


Αναζήτηση χαρακτήρα προς τα πίσω.

```cpp
int System::String::LastIndexOf(char_t value) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | char_t | Χαρακτήρας προς αναζήτηση. |

### ReturnValue

Δείκτης της τελευταίας θέσης χαρακτήρα ή -1 αν δεν βρεθεί.

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


Αναζήτηση χαρακτήρα προς τα πίσω.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | char_t | Χαρακτήρας προς αναζήτηση. |
| startIndex | int32_t | Δείκτης από όπου ξεκινά η αναζήτηση. |

### ReturnValue

Δείκτης της τελευταίας θέσης χαρακτήρα από το startIndex ή -1 αν δεν βρεθεί.

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


Αναζήτηση χαρακτήρα προς τα πίσω.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | char_t | Χαρακτήρας προς αναζήτηση. |
| startIndex | int32_t | Δείκτης από όπου ξεκινά η αναζήτηση. |
| count | int32_t | Αριθμός χαρακτήρων προς εξέταση |

### ReturnValue

Δείκτης της τελευταίας θέσης χαρακτήρα από το startIndex ή -1 αν δεν βρεθεί.

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, System::StringComparison) const method


Αναζήτηση προς τα πίσω σε υποσυμβολοσειρά.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const String\& | Υποσυμβολοσειρά προς αναζήτηση. |
| startIndex | int | Θέση στη πηγαία συμβολοσειρά από όπου ξεκινά η αναζήτηση. |
| comparison_type | System::StringComparison | Λειτουργία [Comparison](../../comparison/). |

### ReturnValue

Δείκτης της τελευταίας ευρεθείσας υποσυμβολοσειράς ή -1 αν δεν βρεθεί. Για κενή συμβολοσειρά αναζήτησης, πάντα επιστρέφει το μήκος της συμβολοσειράς.

## Δείτε επίσης

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int) const method


Αναζήτηση προς τα πίσω σε υποσυμβολοσειρά.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex=INT32_MAX) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const String\& | Υποσυμβολοσειρά προς αναζήτηση. |
| startIndex | int | Θέση στη πηγαία συμβολοσειρά από όπου ξεκινά η αναζήτηση. |

### ReturnValue

Δείκτης της τελευταίας ευρεθείσας υποσυμβολοσειράς ή -1 αν δεν βρεθεί. Για κενή συμβολοσειρά αναζήτησης, πάντα επιστρέφει το μήκος της συμβολοσειράς.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, System::StringComparison) const method


Αναζήτηση προς τα πίσω σε υποσυμβολοσειρά.

```cpp
int System::String::LastIndexOf(const String &str, System::StringComparison comparison_type) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const String\& | Υποσυμβολοσειρά προς αναζήτηση. |
| comparison_type | System::StringComparison | Λειτουργία [Comparison](../../comparison/). |

### ReturnValue

Δείκτης της τελευταίας ευρεθείσας υποσυμβολοσειράς ή -1 αν δεν βρεθεί. Για κενή συμβολοσειρά αναζήτησης, πάντα επιστρέφει το μήκος της συμβολοσειράς.

## Δείτε επίσης

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


Αναζήτηση προς τα πίσω σε υποσυμβολοσειρά.

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Υποσυμβολοσειρά προς αναζήτηση. |
| startIndex | int | Θέση στη πηγαία συμβολοσειρά από όπου ξεκινά η αναζήτηση. |
| count | int | Αριθμός χαρακτήρων προς εξέταση. |
| comparisonType | StringComparison | Λειτουργία [Comparison](../../comparison/). |

### ReturnValue

Δείκτης της τελευταίας ευρεθείσας υποσυμβολοσειράς ή -1 αν δεν βρεθεί. Για κενή συμβολοσειρά αναζήτησης, πάντα επιστρέφει startIndex+count.

## Δείτε επίσης

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
