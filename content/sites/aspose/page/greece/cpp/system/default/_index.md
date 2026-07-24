---
title: "System::Default μέθοδος"
linktitle: "Default"
second_title: "Aspose.Page για C++"
description: "System::Default μέθοδος. Επιστρέφει τη αναφορά στη μοναδική προεπιλεγμένη κατασκευασμένη παρουσία του τύπου εξαίρεσης σε C++."
type: docs
weight: 16200
url: /el/cpp/system/default/
---
## System::Default() method


Επιστρέφει τη αναφορά στη μοναδική προεπιλεγμένη κατασκευασμένη παρουσία του τύπου εξαίρεσης.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος του οποίου η παρουσία επιστρέφεται |

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Default() method


Επιστρέφει τη αναφορά στη μοναδική προεπιλεγμένη κατασκευασμένη παρουσία του μη-εξαίρετου τύπου.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος του οποίου η παρουσία επιστρέφεται |

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
