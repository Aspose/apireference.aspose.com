---
title: "μέθοδος System::Threading::Interlocked::Exchange"
linktitle: "Ανταλλαγή"
second_title: "Aspose.Page για C++"
description: "μέθοδος System::Threading::Interlocked::Exchange. Ανταλλάσσει την τιμή σε μια μεταβλητή: αποθηκεύει τη νέα τιμή και επιστρέφει την τιμή που είχε η μεταβλητή αμέσως πριν την αποθήκευση σε C++."
type: docs
weight: 400
url: /el/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


Ανταλλάσσει την τιμή σε μεταβλητή: αποθηκεύει τη νέα τιμή και επιστρέφει την τιμή που είχε η μεταβλητή αμέσως πριν την αποθήκευση.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος μεταβλητής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| location1 | T\& | Αναφορά μεταβλητής για αλλαγή. |
| τιμή | T | Τιμή για αποθήκευση. |

### ReturnValue

Τιμή της μεταβλητής ακριβώς πριν αλλάξει.

## Δείτε επίσης

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::Exchange(T\&, T) method


Ανταλλάσσει την τιμή σε μεταβλητή: αποθηκεύει τη νέα τιμή και επιστρέφει την τιμή που είχε η μεταβλητή αμέσως πριν την αποθήκευση. Δεν έχει υλοποιηθεί.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος μεταβλητής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| location1 | T\& | Αναφορά μεταβλητής για αλλαγή. |
| τιμή | T | Τιμή για αποθήκευση. |

### ReturnValue

Τιμή της μεταβλητής ακριβώς πριν αλλάξει.

## Δείτε επίσης

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
