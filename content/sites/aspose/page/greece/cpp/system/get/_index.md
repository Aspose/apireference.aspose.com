---
title: "System::Get μέθοδος"
linktitle: "Ανάκτηση"
second_title: "Aspose.Page για C++"
description: "System::Get μέθοδος. Συνάρτηση για λήψη του N‑ου στοιχείου του δοσμένου πλειάδας. Υπερφόρτωση για βασικό αντικείμενο σε C++."
type: docs
weight: 20700
url: /el/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


Συνάρτηση για λήψη του N‑ου στοιχείου του δοσμένου πλειάδας. Υπερφόρτωση για βασικό αντικείμενο.

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| Parameter | Περιγραφή |
| --- | --- |
| N | δείκτης στοιχείου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| αντικείμενο | const SharedPtr\<Object\>\& | αντικείμενο προς επιθεώρηση. |

### ReturnValue

τιμή του N‑ου στοιχείου της πλειάδας μετατρεπόμενη σε αντικείμενο.

## Δείτε επίσης

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


Συνάρτηση για λήψη του N‑ου στοιχείου του δοσμένου πλειάδας. Υπερφόρτωση για κοινά δείκτες.

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| Parameter | Περιγραφή |
| --- | --- |
| N | δείκτης στοιχείου. |
| T | τύπος του επιθεωρημένου αντικειμένου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| αντικείμενο | const SharedPtr\<T\>\& | αντικείμενο προς επιθεώρηση. |

### ReturnValue

τιμή του N‑ου στοιχείου της πλειάδας.

## Δείτε επίσης

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const T\&) method


Συνάρτηση για λήψη του N‑ου στοιχείου του δοσμένου πλειάδας. Υπερφόρτωση για αντικείμενα με μέθοδο Deconstruct.

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| Parameter | Περιγραφή |
| --- | --- |
| N | δείκτης στοιχείου. |
| T | τύπος του επιθεωρημένου αντικειμένου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| αντικείμενο | const T\& | αντικείμενο προς επιθεώρηση. |

### ReturnValue

τιμή του N‑ου στοιχείου της πλειάδας.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


Λαμβάνει το N‑ο στοιχείο της πλειάδας τιμών.

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| Parameter | Περιγραφή |
| --- | --- |
| N | δείκτης στοιχείου. |
| Παράμετροι | στοιχεία πλειάδας. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| πλειάδα | const ValueTuple\<Args...\>\& | πλειάδα για λήψη στοιχείου από. |

### ReturnValue

τιμή του N‑ου στοιχείου της πλειάδας.

## Δείτε επίσης

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
