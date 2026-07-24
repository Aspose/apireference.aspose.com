---
title: "System::operator- μέθοδος"
linktitle: "operator-"
second_title: "Aspose.Page για C++"
description: "System::operator- μέθοδος. Επιστρέφει ένα νέο αντικείμενο της κλάσης Decimal που αντιπροσωπεύει μια τιμή που είναι το αποτέλεσμα της αφαίρεσης της τιμής που αντιπροσωπεύεται από το συγκεκριμένο αντικείμενο Decimal από την καθορισμένη τιμή σε C++."
type: docs
weight: 28100
url: /el/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


Επιστρέφει ένα νέο αντικείμενο της κλάσης [Decimal](../decimal/) που αντιπροσωπεύει μια τιμή που είναι το αποτέλεσμα της αφαίρεσης της τιμής που αντιπροσωπεύεται από το συγκεκριμένο αντικείμενο [Decimal](../decimal/) από την καθορισμένη τιμή.

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| x | const T\& | Η τιμή από την οποία θα αφαιρεθεί. |
| d | const Decimal\& | Το αντικείμενο [Decimal](../decimal/) που αντιπροσωπεύει την αφαιρεθείσα τιμή |

### ReturnValue

Μια νέα παρουσία της κλάσης [Decimal](../decimal/) που αντιπροσωπεύει μια τιμή που είναι το αποτέλεσμα της αφαίρεσης της τιμής που αντιπροσωπεύεται από **d** από το **x**.

## Δείτε επίσης

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


Αφαιρεί μη-μηδενικές και μηδενικές τιμές.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
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

Αποτέλεσμα υποσταθμού.

## Δείτε επίσης

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


Υπολογίζει τον αριθμό ημερών μεταξύ δύο ημερών της εβδομάδας.

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ένα | DayOfWeek | Ο μειωτέος |
| b | DayOfWeek | Ο αφαιρετέος |

### ReturnValue

Ο αριθμός ημερών μεταξύ των εργάσιμων ημερών **a** και **b**· η τιμή επιστροφής είναι αρνητικός αριθμός εάν *goes* μετά ****

## Δείτε επίσης

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Αποσυνδέει όλες τις κλήσεις επιστροφής στο δεξιό delegate από το τέλος της λίστας κλήσεων επιστροφής του αριστερού delegate.

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | Το delegate από το οποίο θα αφαιρεθούν οι κλήσεις επιστροφής. |
| rhv | MulticastDelegate\<T\> | Το delegate του οποίου οι κλήσεις επιστροφής θα αφαιρεθούν. |

### ReturnValue

Επιστρέφει ένα delegate που περιέχει τις κλήσεις επιστροφής της αριστερής τιμής, αλλά χωρίς εκείνες της δεξιάς τιμής.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
