---
title: "System::ObjectExt::UnknownIsNull μέθοδος"
linktitle: "UnknownIsNull"
second_title: "Aspose.Page για C++"
description: "System::ObjectExt::UnknownIsNull μέθοδος. Ελέγχει εάν το αντικείμενο άγνωστου τύπου είναι nullptr. Υπερφόρτωση για μη-σκαλαρικούς τύπους σε C++."
type: docs
weight: 1700
url: /el/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


Ελέγχει αν το αντικείμενο άγνωστου τύπου είναι nullptr. Υπερφόρτωση για μη-σκαλαρικούς τύπους.

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | [Object](../../object/) τύπος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | T | [Object](../../object/) για έλεγχο. |

### ReturnValue

Αληθές εάν 'obj == nullptr' είναι αληθές, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


Ελέγχει αν το αντικείμενο άγνωστου τύπου είναι nullptr. Υπερφόρτωση για σκαλαρικούς τύπους.

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | [Object](../../object/) τύπος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | T | [Object](../../object/) για έλεγχο. |

### ReturnValue

Πάντα επιστρέφει false.

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
