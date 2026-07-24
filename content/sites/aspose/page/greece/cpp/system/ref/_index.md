---
title: "Μέθοδος System::Ref"
linktitle: "Ref"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Ref. Περιτύλιγμα για να διασφαλιστεί ότι το Ref(std::ref(DynamicWeakPtr)) λειτουργεί σε C++."
type: docs
weight: 36600
url: /el/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


Περιτύλιγμα για να διασφαλιστεί ότι το Ref(std::ref(DynamicWeakPtr)) λειτουργεί.

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Αναφερθόμενος τύπος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| περιτύλιγμα | const std::reference_wrapper\<T\>\& | std περιτύλιγμα για αποσυσκευασία. |

### ReturnValue

Τύπος αναφοράς ορίζεται στο [System](../):: αντί για το std.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


Δημιουργεί αναφορά σε αντικείμενο [DynamicWeakPtr](../dynamicweakptr/). Χρησιμοποιείται από τον μεταγλωττιστή όταν περνιούνται επιχειρήματα συνάρτησης με αναφορά.

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος δείκτη. |
| trunkMode | Λειτουργία του έξυπνου δείκτη αυτού. |
| weakLeafs | Δείκτες των ορισμάτων προτύπου για τα οποία πρέπει να κληθεί η μέθοδος SetTemplateWeakPtr. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | Έξυπνος δείκτης για δημιουργία αναφοράς σε. |

### ReturnValue

Αναφορά έξυπνου δείκτη.

## Δείτε επίσης

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(T\&) method


Βοηθητική συνάρτηση για απόκτηση αναφορών σε αντικείμενα. Χρησιμοποιείται για να εγγυηθεί ότι το [System::DynamicWeakPtr](../dynamicweakptr/) ενημερώνει το αναφερόμενο αντικείμενο μετά από αναθέσεις.

```cpp
template<typename T> T & System::Ref(T &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος για δημιουργία αναφοράς σε. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | T\& | Τιμή για δημιουργία αναφοράς σε. |

### ReturnValue

Αναφορά στην τιμή που περάστηκε σε αυτή τη συνάρτηση.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
