---
title: "System::ObjectExt::Equals μέθοδος"
linktitle: "Ισούται"
second_title: "Aspose.Page για C++"
description: "System::ObjectExt::Equals μέθοδος. Αντικατάσταση για κλήσεις C# Object.Equals που λειτουργούν για οποιονδήποτε τύπο σε C++. Υπερφόρτωση για κυριολεκτικό συμβολοσειράς με σύγκριση συμβολοσειράς σε C++."
type: docs
weight: 700
url: /el/cpp/system/objectext/equals/
---
## ObjectExt::Equals(const char_t(&), String) method


Αντικατάσταση για κλήσεις C# [Object.Equals](../../object/equals/) που λειτουργούν για οποιονδήποτε τύπο σε C++. Υπερφόρτωση για κυριολεκτικό συμβολοσειράς με σύγκριση συμβολοσειράς.

```cpp
template<size_t> static bool System::ObjectExt::Equals(const char_t(&obj)[N], String another)
```


| Parameter | Περιγραφή |
| --- | --- |
| N | [String](../../string/) μέγεθος κυριολεκτικού. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const char_t(&) | [String](../../string/) κυριολεκτικό. |
| another | String | [String](../../string/). |

### ReturnValue

Αληθές εάν οι συμβολοσειρές ταιριάζουν, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const double\&, const double\&) method


Εξομοιώνει τη σύγκριση κινητής υποδιαστολής σε στυλ C# όπου δύο NaN θεωρούνται ίσα, παρόλο που σύμφωνα με το IEC 60559:1989 το NaN δεν είναι ίσο με καμία τιμή, συμπεριλαμβανομένου του NaN.

```cpp
bool System::ObjectExt::Equals(const double &obj, const double &another)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const double\& | Τιμή κινητής υποδιαστολής αριστερού μέλους (LHS). |
| άλλο | const double\& | Τιμή κινητής υποδιαστολής δεξιού μέλους (RHS). |

### ReturnValue

Αληθές εάν το **obj** και το **another** είναι και τα δύο NaN ή ίσα, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const float\&, const float\&) method


Εξομοιώνει τη σύγκριση κινητής υποδιαστολής σε στυλ C# όπου δύο NaN θεωρούνται ίσα, παρόλο που σύμφωνα με το IEC 60559:1989 το NaN δεν είναι ίσο με καμία τιμή, συμπεριλαμβανομένου του NaN.

```cpp
bool System::ObjectExt::Equals(const float &obj, const float &another)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const float\& | Τιμή κινητής υποδιαστολής αριστερού μέλους (LHS). |
| άλλο | const float\& | Τιμή κινητής υποδιαστολής δεξιού μέλους (RHS). |

### ReturnValue

Αληθές εάν το **obj** και το **another** είναι και τα δύο NaN ή ίσα, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method




```cpp
template<typename T,typename T2> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


Αντικατάσταση για κλήσεις C# [Object.Equals](../../object/equals/) που λειτουργούν για οποιονδήποτε τύπο σε C++. Υπερφόρτωση για τύπους έξυπνων δεικτών.

```cpp
template<typename T,typename T2> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Πρώτος τύπος αντικειμένου. |
| T2 | Δεύτερος τύπος αντικειμένου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T\& | Πρώτο αντικείμενο. |
| άλλο | const T2\& | Δεύτερο αντικείμενο. |

### ReturnValue

Αληθές εάν τα αντικείμενα θεωρούνται ίσα, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


Αντικατάσταση για κλήσεις C# [Object.Equals](../../object/equals/) που λειτουργούν για οποιονδήποτε τύπο σε C++. Υπερφόρτωση για αριθμητικούς τύπους.

```cpp
template<typename T,typename T2> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Πρώτος τύπος αντικειμένου. |
| T2 | Δεύτερος τύπος αντικειμένου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T\& | Πρώτο αντικείμενο. |
| άλλο | const T2\& | Δεύτερο αντικείμενο. |

### ReturnValue

Αληθές εάν τα αντικείμενα θεωρούνται ίσα, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(T, const T2\&) method


Αντικατάσταση για κλήσεις C# [Object.Equals](../../object/equals/) που λειτουργούν για οποιονδήποτε τύπο σε C++. Υπερφόρτωση για τύπους δομών.

```cpp
template<typename T,typename T2> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(T obj, const T2 &another)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Πρώτος τύπος αντικειμένου. |
| T2 | Δεύτερος τύπος αντικειμένου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | T | Πρώτο αντικείμενο. |
| άλλο | const T2\& | Δεύτερο αντικείμενο. |

### ReturnValue

Αληθές εάν τα αντικείμενα θεωρούνται ίσα, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
