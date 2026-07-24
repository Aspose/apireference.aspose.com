---
title: "System::operator+ method"
linktitle: "operator+"
second_title: "Aspose.Page για C++"
description: "System::operator+ method. Συνένωση συμβολοσειρών σε C++."
type: docs
weight: 27500
url: /el/cpp/system/operator+/
---
## System::operator+(const char_t, const String\&) method


[String](../string/) concatenation.

```cpp
String System::operator+(const char_t left, const String &right)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| αριστερά | const char_t | Χαρακτήρας για συγκόλληση σε συμβολοσειρά. |
| right | const String\& | [String](../string/) για συγκόλληση. |

### ReturnValue

Συγκολλημένη συμβολοσειρά.

## Δείτε επίσης

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T\&, const Decimal\&) method


Επιστρέφει ένα νέο αντικείμενο της κλάσης [Decimal](../decimal/) που αντιπροσωπεύει μια τιμή που είναι το άθροισμα της καθορισμένης τιμής και της τιμής που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Decimal](../decimal/).

```cpp
template<typename T,typename _> Decimal System::operator+(const T &x, const Decimal &d)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| x | const T\& | Ο πρώτος πρόσθετος |
| d | const Decimal\& | Η σταθερή αναφορά στο αντικείμενο [Decimal](../decimal/) που αντιπροσωπεύει τον δεύτερο πρόσθετο |

### ReturnValue

Ένα νέο αντικείμενο της κλάσης [Decimal](../decimal/) που αντιπροσωπεύει μια τιμή που είναι το άθροισμα του **x** και της τιμής που αντιπροσωπεύεται από το **d**.

## Δείτε επίσης

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T1\&, const Nullable\<T2\>\&) method


Αθροίζει τιμές μη-μηδενικές και τιμές με δυνατότητα null.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some+other.get_Value())> System::operator+(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Τύπος αριστερού τελεστή. |
| T2 | Τύπος δεξιού τελεστή. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| κάποιο | const T1\& | Αριστερός τελεστής. |
| άλλο | const Nullable\<T2\>\& | Δεξιός τελεστής. |

### ReturnValue

Αποτέλεσμα άθροισης.

## Δείτε επίσης

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Συνδέει όλες τις κλήσεις επιστροφής από τον δεξιό αντιπρόσωπο στο τέλος της λίστας κλήσεων επιστροφής του αριστερού αντιπροσώπου.

```cpp
template<typename T> MulticastDelegate<T> System::operator+(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | Ο αντιπρόσωπος στον οποίο προστίθενται οι κλήσεις επιστροφής. |
| rhv | MulticastDelegate\<T\> | Ο αντιπρόσωπος του οποίου προστίθενται οι κλήσεις επιστροφής. |

### ReturnValue

Επιστρέφει έναν αντιπρόσωπο που περιέχει τις κλήσεις επιστροφής της αριστερής τιμής και στη συνέχεια τις δεξιές.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringLiteral<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | [String](../string/) τύπος κυριολεκτικού. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| αριστερά | T\& | Κυριολεκτικό για συνένωση σε συμβολοσειρά. |
| right | const String\& | [String](../string/) για συγκόλληση. |

### ReturnValue

Συγκολλημένη συμβολοσειρά.

## Δείτε επίσης

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringPointer<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος δείκτη [String](../string/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| left | T\& | [String](../string/) δείκτης για συνένωση σε συμβολοσειρά. |
| right | const String\& | [String](../string/) για συγκόλληση. |

### ReturnValue

Συγκολλημένη συμβολοσειρά.

## Δείτε επίσης

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
