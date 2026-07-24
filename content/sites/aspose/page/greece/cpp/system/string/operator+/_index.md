---
title: "μέθοδος System::String::operator+"
linktitle: "operator+"
second_title: "Aspose.Page για C++"
description: "μέθοδος System::String::operator+. Προσθέτει χαρακτήρα στο τέλος της συμβολοσειράς σε C++."
type: docs
weight: 2800
url: /el/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


Προσθέτει χαρακτήρα στο τέλος της συμβολοσειράς.

```cpp
String System::String::operator+(char_t x) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| x | char_t | Χαρακτήρας για προσθήκη. |

### ReturnValue

[String](../) concatenation result.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const String\& | [String](../) για προσθήκη στο τέλος του τρέχοντος. |

### ReturnValue

Συγκολλημένη συμβολοσειρά.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Μία από τις μορφές κυριολεκτικού συμβολοσειράς ή δείκτη συμβολοσειράς χαρακτήρων. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| arg | const T\& | Οντότητα για σύνδεση με την τρέχουσα συμβολοσειρά. |

### ReturnValue

Συγκολλημένη συμβολοσειρά.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


Προσθέτει την αναπαράσταση σε συμβολοσειρά του αντικειμένου τύπου αναφοράς στο τέλος της συμβολοσειράς.

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T | τύπος δείκτη. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) για μετατροπή σε συμβολοσειρά χρησιμοποιώντας την κλήση [ToString()](../tostring/) και για προσθήκη στην τρέχουσα συμβολοσειρά. |

### ReturnValue

[String](../) concatenation result.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


Προσθέτει την αναπαράσταση της συμβολοσειράς του αντικειμένου τύπου τιμής στο τέλος της συμβολοσειράς.

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος τιμής για να κληθεί το [ToString()](../tostring/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) για μετατροπή σε συμβολοσειρά χρησιμοποιώντας την κλήση [ToString()](../tostring/) και για προσθήκη στην τρέχουσα συμβολοσειρά. |

### ReturnValue

[String](../) concatenation result.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(double) const method


Προσθέτει την αναπαράσταση σε συμβολοσειρά της τιμής κινητής υποδιαστολής στο τέλος της συμβολοσειράς.

```cpp
String System::String::operator+(double d) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| d | double | Τιμή για μετατροπή σε συμβολοσειρά και προσθήκη. |

### ReturnValue

[String](../) concatenation result.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int) const method


Προσθέτει την αναπαράσταση σε συμβολοσειρά της ακέραιας τιμής στο τέλος της συμβολοσειράς.

```cpp
String System::String::operator+(int i) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| i | int | Ακέραια τιμή για μετατροπή σε συμβολοσειρά και προσθήκη. |

### ReturnValue

[String](../) concatenation result.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int64_t) const method


Προσθέτει την αναπαράσταση σε συμβολοσειρά της ακέραιας τιμής στο τέλος της συμβολοσειράς.

```cpp
String System::String::operator+(int64_t v) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| v | int64_t | Τιμή για μετατροπή σε συμβολοσειρά και προσθήκη σε προσθήκη. |

### ReturnValue

[String](../) concatenation result.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(T) const method


Προσθέτει την αναπαράσταση σε συμβολοσειρά της λογικής τιμής στο τέλος της συμβολοσειράς.

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος τιμής για συνένωση με συμβολοσειρά. Πρέπει να είναι bool |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| arg | T | Τιμή [Boolean](../../boolean/) για μετατροπή σε συμβολοσειρά και προσθήκη. |

### ReturnValue

[String](../) concatenation result.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(uint32_t) const method


Προσθέτει την αναπαράσταση σε συμβολοσειρά της μη-υπογεγραμμένης ακέραιας τιμής στο τέλος της συμβολοσειράς.

```cpp
String System::String::operator+(uint32_t i) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| i | uint32_t | Τιμή για μετατροπή σε συμβολοσειρά και προσθήκη. |

### ReturnValue

[String](../) concatenation result.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
