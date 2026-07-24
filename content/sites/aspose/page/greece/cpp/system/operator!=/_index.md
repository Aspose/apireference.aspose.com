---
title: "Μέθοδος System::operator!="
linktitle: "operator!="
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο operator!= της κλάσης σε C++."
type: docs
weight: 25800
url: /el/cpp/system/operator!=/
---
## System::operator!=(ArraySegment\<T\>, ArraySegment\<T\>) method




```cpp
template<typename T> bool System::operator!=(ArraySegment<T> a, ArraySegment<T> b)
```

## Δείτε επίσης

* Class [ArraySegment](../arraysegment/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(Chars\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class Chars,typename std::enable_if< IsStringLiteral< Chars, char_t >::value >::type *> bool System::operator!=(Chars &left, const String &right)
```


| Parameter | Περιγραφή |
| --- | --- |
| Chars | [String](../string/) τύπος κυριολεκτικού. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| left | Chars\& | [String](../string/) κυριολεκτικό για σύγκριση. |
| right | const String\& | [String](../string/) για σύγκριση. |

### ReturnValue

ψευδές αν οι συμβολοσειρές ταιριάζουν, αληθές διαφορετικά.

## Δείτε επίσης

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SharedPtr\<Object\>\&, const String\&) method


[Object](../object/) and string comparison.

```cpp
bool System::operator!=(const SharedPtr<Object> &left, const String &right)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| left | const SharedPtr\<Object\>\& | [Object](../object/) για μετατροπή σε συμβολοσειρά και σύγκριση. |
| right | const String\& | [String](../string/) για σύγκριση. |

### ReturnValue

ψευδές αν η αναπαράσταση της αντικειμένου σε συμβολοσειρά ισούται με τη συμβολοσειρά, αληθές διαφορετικά.

## Δείτε επίσης

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) method


Καθορίζει αν οι URI που αντιπροσωπεύονται από το τρέχον και το καθορισμένο αντικείμενο δεν είναι ίσοι.

```cpp
bool System::operator!=(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | Το πρώτο αντικείμενο [Uri](../uri/) για σύγκριση |
| uri2 | const SharedPtr\<Uri\>\& | Το δεύτερο αντικείμενο [Uri](../uri/) για σύγκριση |

### ReturnValue

Αληθές αν οι URI δεν είναι ίσοι, διαφορετικά - ψευδές

## Δείτε επίσης

* Typedef [SharedPtr](../sharedptr/)
* Class [Uri](../uri/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SmartPtr\<X\>\&, const SmartPtr\<Y\>\&) method


Η μη-ισότητα συγκρίνει δύο έξυπνους δείκτες.

```cpp
template<class X,class Y> bool System::operator!=(const SmartPtr<X> &x, const SmartPtr<Y> &y)
```


| Parameter | Περιγραφή |
| --- | --- |
| X | Τύπος του αντικειμένου που δείχνει ο πρώτος δείκτης. |
| Y | Τύπος του αντικειμένου που δείχνει ο δεύτερος δείκτης. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | Πρώτος δείκτης για σύγκριση. |
| y | const SmartPtr\<Y\>\& | Δεύτερος δείκτης για σύγκριση. |

### ReturnValue

Ψευδές αν οι δείκτες ταιριάζουν, αληθές διαφορετικά.

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SmartPtr\<X\>\&, const Y *) method


Σύγκριση ανισότητας έξυπνου δείκτη έναντι απλού (C) δείκτη.

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, Y>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator!=(const SmartPtr<X> &x, const Y *y)
```


| Parameter | Περιγραφή |
| --- | --- |
| X | Τύπος έξυπνου δείκτη. |
| Y | Τύπος απλού δείκτη. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | Έξυπνος δείκτης για σύγκριση (αριστερά). |
| y | const Y * | δείκτης για σύγκριση (δεξιά). |

### ReturnValue

Ψευδές αν οι δείκτες ταιριάζουν, αληθές διαφορετικά.

## Δείτε επίσης

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const T1\&, const Nullable\<T2\>\&) method


Καθορίζει εάν η καθορισμένη τιμή δεν είναι ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../nullable/) εφαρμόζοντας το [operator!=()](./) σε αυτές τις τιμές.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator!=(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Ο τύπος της πρώτης τιμής συγκρίσεως |
| T2 | Ο υποκείμενος τύπος του αντικειμένου [Nullable](../nullable/) που αντιπροσωπεύει τη δεύτερη τιμή συγκρίσεως |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| κάποιο | const T1\& | Μια σταθερή αναφορά στην τιμή που θα χρησιμοποιηθεί ως η πρώτη τιμή συγκρίσεως |
| other | const Nullable\<T2\>\& | Μια σταθερή αναφορά στο αντικείμενο [Nullable](../nullable/) της οποίας η αντιπροσωπευόμενη τιμή θα χρησιμοποιηθεί ως η δεύτερη τιμή συγκρίσεως |

### ReturnValue

Αληθές εάν οι συγκρίσεις δεν είναι ίσες, διαφορετικά - ψευδές

## Δείτε επίσης

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const X *, const SmartPtr\<Y\>\&) method


Σύγκριση ισότητας έξυπνου δείκτη έναντι απλού (C) δείκτη.

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, X>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator!=(const X *x, const SmartPtr<Y> &y)
```


| Parameter | Περιγραφή |
| --- | --- |
| X | Τύπος απλού δείκτη. |
| Y | Τύπος έξυπνου δείκτη. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| x | const X * | δείκτης για σύγκριση (δεξιά). |
| y | const SmartPtr\<Y\>\& | Έξυπνος δείκτης για σύγκριση (αριστερά). |

### ReturnValue

Ψευδές αν οι δείκτες ταιριάζουν, αληθές διαφορετικά.

## Δείτε επίσης

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(SmartPtr\<X\> const\&, std::nullptr_t) method


Ελέγχει εάν ο έξυπνος δείκτης δεν είναι null.

```cpp
template<class X> bool System::operator!=(SmartPtr<X> const &x, std::nullptr_t)
```


| Parameter | Περιγραφή |
| --- | --- |
| X | Τύπος του αντικειμένου που δείχνει ο δείκτης. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| x | SmartPtr\<X\> const\& | Δείκτης για έλεγχο. |

### ReturnValue

Ψευδές εάν ο δείκτης είναι null, αληθές διαφορετικά.

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator!=(std::nullptr_t, const DateTimeOffset &)
```

## Δείτε επίσης

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const Nullable\<T\>\&) method


Καθορίζει εάν το καθορισμένο αντικείμενο [Nullable](../nullable/) αντιπροσωπεύει μια τιμή που δεν είναι ίση με null.

```cpp
template<typename T> bool System::operator!=(std::nullptr_t, const Nullable<T> &other)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| other | std::nullptr_t | Μια σταθερή αναφορά σε ένα αντικείμενο [Nullable](../nullable/) για δοκιμή |

### ReturnValue

Αληθές εάν το καθορισμένο αντικείμενο αντιπροσωπεύει μη null τιμή, ψευδές διαφορετικά

## Δείτε επίσης

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const String\&) method


Ελέγχει εάν η συμβολοσειρά είναι null.

```cpp
bool System::operator!=(std::nullptr_t, const String &str)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | std::nullptr_t | [String](../string/) για έλεγχο. |

### ReturnValue

ψευδές εάν η συμβολοσειρά είναι null, αληθές διαφορετικά.

## Δείτε επίσης

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, DateTime) method




```cpp
bool System::operator!=(std::nullptr_t, DateTime)
```

## Δείτε επίσης

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, SmartPtr\<X\> const\&) method


Ελέγχει εάν ο έξυπνος δείκτης δεν είναι null.

```cpp
template<class X> bool System::operator!=(std::nullptr_t, SmartPtr<X> const &x)
```


| Parameter | Περιγραφή |
| --- | --- |
| X | Τύπος του αντικειμένου που δείχνει ο δείκτης. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| x | std::nullptr_t | Δείκτης για έλεγχο. |

### ReturnValue

Ψευδές εάν ο δείκτης είναι null, αληθές διαφορετικά.

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator!=(std::nullptr_t, TimeSpan)
```

## Δείτε επίσης

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(T\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class T,typename std::enable_if< IsStringPointer< T, char_t >::value >::type *> bool System::operator!=(T &left, const String &right)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος δείκτη [String](../string/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| left | T\& | [String](../string/) δείκτης για σύγκριση. |
| right | const String\& | [String](../string/) για σύγκριση. |

### ReturnValue

ψευδές αν οι συμβολοσειρές ταιριάζουν, αληθές διαφορετικά.

## Δείτε επίσης

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
