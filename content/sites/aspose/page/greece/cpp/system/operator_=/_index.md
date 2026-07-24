---
title: "System::operator<= μέθοδος"
linktitle: "operator<="
second_title: "Aspose.Page για C++"
description: "System::operator<= μέθοδος. Καθορίζει εάν η καθορισμένη τιμή είναι μικρότερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο Nullable εφαρμόζοντας operator<=() σε αυτές τις τιμές σε C++."
type: docs
weight: 31900
url: /el/cpp/system/operator_=/
---
## System::operator<=(const T1\&, const Nullable\<T2\>\&) method


Καθορίζει εάν η καθορισμένη τιμή είναι μικρότερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../nullable/) εφαρμόζοντας [operator<=()](./) σε αυτές τις τιμές.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<=(const T1 &some, const Nullable<T2> &other)
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

Αληθές εάν ο πρώτος συγκριτέος είναι μικρότερος ή ίσος με τον δεύτερο συγκριτέο, διαφορετικά - ψευδές

## Δείτε επίσης

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<=(std::nullptr_t, const DateTimeOffset &)
```

## Δείτε επίσης

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, const Nullable\<T\>\&) method


Πάντα επιστρέφει false.

```cpp
template<typename T> bool System::operator<=(std::nullptr_t, const Nullable<T> &)
```

## Δείτε επίσης

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, DateTime) method




```cpp
bool System::operator<=(std::nullptr_t, DateTime)
```

## Δείτε επίσης

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<=(std::nullptr_t, TimeSpan)
```

## Δείτε επίσης

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
τίτλος: System::operator>= μέθοδος
linktitle: operator>=
second_title: Aspose.Page για C++
περιγραφή: 'System::operator>= μέθοδος. Καθορίζει εάν η καθορισμένη τιμή είναι μεγαλύτερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο Nullable εφαρμόζοντας operator>=() σε αυτές τις τιμές σε C++.'
type: docs
βάρος: 34600
url: /cpp/system/operator_=/
---
## System::operator>=(const T1\&, const Nullable\<T2\>\&) method


Καθορίζει εάν η καθορισμένη τιμή είναι μεγαλύτερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../nullable/) εφαρμόζοντας [operator>=()](./) σε αυτές τις τιμές.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>=(const T1 &some, const Nullable<T2> &other)
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

Αληθές εάν ο πρώτος συγκριτέος είναι μεγαλύτερος ή ίσος με τον δεύτερο συγκριτέο, διαφορετικά - ψευδές

## Δείτε επίσης

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>=(std::nullptr_t, const DateTimeOffset &)
```

## Δείτε επίσης

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, const Nullable\<T\>\&) method


Πάντα επιστρέφει false.

```cpp
template<typename T> bool System::operator>=(std::nullptr_t, const Nullable<T> &)
```

## Δείτε επίσης

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, DateTime) method




```cpp
bool System::operator>=(std::nullptr_t, DateTime)
```

## Δείτε επίσης

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>=(std::nullptr_t, TimeSpan)
```

## Δείτε επίσης

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
