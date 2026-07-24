---
title: "System::Object::Equals method"
linktitle: "Ισούται"
second_title: "Aspose.Page για C++"
description: "System::Object::Equals method. Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία C# Object.Equals σε C++."
type: docs
weight: 300
url: /el/cpp/system/object/equals/
---
## Object::Equals(ptr) method


Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία C# [Object.Equals](./).

```cpp
virtual bool System::Object::Equals(ptr obj)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | ptr | [Object](../) για σύγκριση με το τρέχον. |

### ReturnValue

True εάν τα αντικείμενα θεωρούνται ίσα και false διαφορετικά.

## Δείτε επίσης

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(double const\&, double const\&) method


Εξομοιώνει τη σύγκριση κινητής υποδιαστολής σε στυλ C# όπου δύο NaN θεωρούνται ίσα, παρόλο που σύμφωνα με το IEC 60559:1989 το NaN δεν είναι ίσο με καμία τιμή, συμπεριλαμβανομένου του NaN.

```cpp
bool System::Object::Equals(double const &objA, double const &objB)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| objA | double const\& | Τιμή κινητής υποδιαστολής αριστερού μέλους (LHS). |
| objB | double const\& | Τιμή κινητής υποδιαστολής δεξιού μέλους (RHS). |

### ReturnValue

Αληθές εάν **objA** και **objB** είναι και τα δύο NaN ή ίσα, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(float const\&, float const\&) method


Εξομοιώνει τη σύγκριση κινητής υποδιαστολής σε στυλ C# όπου δύο NaN θεωρούνται ίσα, παρόλο που σύμφωνα με το IEC 60559:1989 το NaN δεν είναι ίσο με καμία τιμή, συμπεριλαμβανομένου του NaN.

```cpp
bool System::Object::Equals(float const &objA, float const &objB)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| objA | float const\& | Τιμή κινητής υποδιαστολής αριστερού μέλους (LHS). |
| objB | float const\& | Τιμή κινητής υποδιαστολής δεξιού μέλους (RHS). |

### ReturnValue

Αληθές εάν **objA** και **objB** είναι και τα δύο NaN ή ίσα, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


Συγκρίνει αντικείμενα τύπου αναφοράς σε στυλ C#.

```cpp
template<typename T1,typename T2> static std::enable_if<IsSmartPtr<T1>::value &&IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Τύπος του πρώτου αντικειμένου για σύγκριση. |
| T2 | Τύπος του δεύτερου αντικειμένου για σύγκριση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| objA | T1 const\& | Πρώτο αντικείμενο για σύγκριση. |
| objB | T2 const\& | Δεύτερο αντικείμενο για σύγκριση. |

### ReturnValue

Αληθές εάν τα αντικείμενα ταιριάζουν είτε με αναφορά είτε σημασιολογικά (με σύγκριση παρόμοια με [Object.Equals](./)), ψευδές διαφορετικά.

## Δείτε επίσης

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


Συγκρίνει αντικείμενα τύπου τιμής σε στυλ C#.

```cpp
template<typename T1,typename T2> static std::enable_if<!IsSmartPtr<T1>::value &&!IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Τύπος του πρώτου αντικειμένου για σύγκριση. |
| T2 | Τύπος του δεύτερου αντικειμένου για σύγκριση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| objA | T1 const\& | Πρώτο αντικείμενο για σύγκριση. |
| objB | T2 const\& | Δεύτερο αντικείμενο για σύγκριση. |

### ReturnValue

Αληθές εάν τα αντικείμενα θεωρούνται ίσα από τον διαθέσιμο τελεστή ισότητας, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
