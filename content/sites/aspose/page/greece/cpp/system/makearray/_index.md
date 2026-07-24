---
title: "System::MakeArray μέθοδος"
linktitle: "ΔημιουργίαΠίνακα"
second_title: "Aspose.Page για C++"
description: "System::MakeArray μέθοδος. Μια συνάρτηση κατασκευής που δημιουργεί ένα νέο αντικείμενο Array περνώντας τα καθορισμένα ορίσματα στον κατασκευαστή του σε C++."
type: docs
weight: 24000
url: /el/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


Μια συνάρτηση κατασκευής που δημιουργεί ένα νέο αντικείμενο [Array](../array/) περνώντας τα καθορισμένα ορίσματα στον κατασκευαστή του.

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος των στοιχείων του αντικειμένου [Array](../array/) που δημιουργεί η συνάρτηση |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| args | Args\&&... | Τα ορίσματα που περνιούνται στον κατασκευαστή του αντικειμένου [Array](../array/) που κατασκευάζεται |

### ReturnValue

Ένας έξυπνος δείκτης που δείχνει στο κατασκευασμένο αντικείμενο [Array](../array/)

## Δείτε επίσης

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


Μια συνάρτηση κατασκευής που δημιουργεί ένα νέο αντικείμενο [Array](../array/) περνώντας τα καθορισμένα ορίσματα στον κατασκευαστή του.

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος των στοιχείων του αντικειμένου [Array](../array/) που δημιουργεί η συνάρτηση |
| Ακέραιο | Τύπος μεγέθους πίνακα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| size | Ακέραιο | Μέγεθος του πίνακα που δημιουργείται. |
| args | Args\&&... | Τα ορίσματα που περνιούνται στον κατασκευαστή του αντικειμένου [Array](../array/) που κατασκευάζεται |

### ReturnValue

Ένας έξυπνος δείκτης που δείχνει στο κατασκευασμένο αντικείμενο [Array](../array/)

## Δείτε επίσης

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


Μια συνάρτηση κατασκευής που δημιουργεί ένα νέο αντικείμενο [Array](../array/), το γεμίζει με τα στοιχεία από τη καθορισμένη λίστα αρχικοποίησης και επιστρέφει έναν έξυπνο δείκτη που δείχνει στο αντικείμενο [Array](../array/).

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος των στοιχείων του αντικειμένου [Array](../array/) που δημιουργεί η συνάρτηση |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| init | std::initializer_list\<T\> | Η λίστα αρχικοποίησης που περιέχει τα στοιχεία για να γεμίσει τον πίνακα |

### ReturnValue

Ένας έξυπνος δείκτης που δείχνει στο κατασκευασμένο αντικείμενο [Array](../array/)

## Δείτε επίσης

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
