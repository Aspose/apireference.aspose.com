---
title: "System::ObjectExt::UnknownToObject-Methode"
linktitle: "UnknownToObject"
second_title: "Aspose.Font für C++"
description: "System::ObjectExt::UnknownToObject-Methode. Konvertiert einen unbekannten Typ zu Object und behandelt sowohl Smart‑Pointer‑Typen als auch Werttyp‑Situationen in C++."
type: docs
weight: 1900
url: /de/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


Konvertiert einen unbekannten Typ zu [Object](../../object/), wobei sowohl Smart‑Pointer‑Typen als auch Werttyp‑Situationen behandelt werden.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ, der zu [Object](../../object/) konvertiert werden soll. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) zum Konvertieren. |

### ReturnValue

Smart‑Pointer zu [Object](../../object/), entweder ein konvertierter Zeiger oder ein verpackter Wert.

## Siehe auch

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::UnknownToObject(T) method


Konvertiert einen unbekannten Typ zu [Object](../../object/), wobei sowohl Smart‑Pointer‑Typen als auch Werttyp‑Situationen behandelt werden.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ, der zu [Object](../../object/) konvertiert werden soll. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | T | [Object](../../object/) zum Konvertieren. |

### ReturnValue

Smart‑Pointer zu [Object](../../object/), entweder ein konvertierter Zeiger oder ein verpackter Wert.

## Siehe auch

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
