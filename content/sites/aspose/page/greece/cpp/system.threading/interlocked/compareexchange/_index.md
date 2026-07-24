---
title: "μέθοδος System::Threading::Interlocked::CompareExchange"
linktitle: "CompareExchange"
second_title: "Aspose.Page για C++"
description: "μέθοδος System::Threading::Interlocked::CompareExchange. Συγκρίνει-ανταλλάσσει την τιμή σε μια μεταβλητή: ελέγχει αν η μεταβλητή είναι ίση με συγκεκριμένη τιμή και αποθηκεύει τη νέα τιμή μόνο εάν η αποθηκευμένη τιμή ταιριάζει με την αναμενόμενη σε C++."
type: docs
weight: 200
url: /el/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


Συγκρίνει-ανταλλάσσει την τιμή σε μεταβλητή: ελέγχει αν η μεταβλητή είναι ίση με συγκεκριμένη τιμή και αποθηκεύει τη νέα τιμή μόνο εάν η αποθηκευμένη τιμή ταιριάζει με την αναμενόμενη.

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| location1 | int32_t\& | Αναφορά μεταβλητής για αλλαγή. |
| τιμή | int32_t | Τιμή για αποθήκευση. |
| comparand | int32_t | Τιμή για σύγκριση με την τιμή της μεταβλητής πριν την ανταλλαγή. |
| επιτυχία | bool\& | Αναφορά σε μεταβλητή που ορίζεται σε true εάν πραγματοποιηθεί η ανταλλαγή και σε false διαφορετικά. |

### ReturnValue

Τιμή της μεταβλητής στην έναρξη της λειτουργίας, ανεξάρτητα αν έχει αλλάξει ή όχι.

## Δείτε επίσης

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Συγκρίνει-ανταλλάσσει την τιμή σε μεταβλητή: ελέγχει αν η μεταβλητή είναι ίση με συγκεκριμένη τιμή και αποθηκεύει τη νέα τιμή μόνο εάν η αποθηκευμένη τιμή ταιριάζει με την αναμενόμενη.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος μεταβλητής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| location1 | T\& | Αναφορά μεταβλητής για αλλαγή. |
| τιμή | T | Τιμή για αποθήκευση. |
| comparand | T | Τιμή για σύγκριση με την τιμή της μεταβλητής πριν την ανταλλαγή. |

### ReturnValue

Τιμή της μεταβλητής στην έναρξη της λειτουργίας, ανεξάρτητα αν έχει αλλάξει ή όχι.

## Δείτε επίσης

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Συγκρίνει-ανταλλάσσει την τιμή σε μεταβλητή: ελέγχει αν η μεταβλητή είναι ίση με συγκεκριμένη τιμή και αποθηκεύει τη νέα τιμή μόνο εάν η αποθηκευμένη τιμή ταιριάζει με την αναμενόμενη. Δεν έχει υλοποιηθεί.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος μεταβλητής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| location1 | T\& | Αναφορά μεταβλητής για αλλαγή. |
| τιμή | T | Τιμή για αποθήκευση. |
| comparand | T | Τιμή για σύγκριση με την τιμή της μεταβλητής πριν την ανταλλαγή. |

### ReturnValue

Τιμή της μεταβλητής στην έναρξη της λειτουργίας, ανεξάρτητα αν έχει αλλάξει ή όχι.

## Δείτε επίσης

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
