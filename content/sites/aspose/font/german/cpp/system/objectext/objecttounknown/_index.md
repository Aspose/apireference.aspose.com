---
title: "System::ObjectExt::ObjectToUnknown Methode"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Font für C++"
description: "System::ObjectExt::ObjectToUnknown Methode. Konvertiert Object zu einem unbekannten Typ und behandelt sowohl Smart‑Pointer‑Typen als auch bpxed‑Wert‑Situationen in C++."
type: docs
weight: 1300
url: /de/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Konvertiert [Object](../../object/) zu einem unbekannten Typ und behandelt sowohl Smart‑Pointer‑Typen als auch bpxed‑Wert‑Situationen.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ, zu dem [Object](../../object/) konvertiert werden soll. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) zum Konvertieren. |

### ReturnValue

Entweder ungepackter Wert oder konvertierter Zeiger.

## Siehe auch

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Konvertiert [Object](../../object/) zu einem unbekannten Typ und behandelt sowohl Smart‑Pointer‑Typen als auch gepackte Wert‑Situationen.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ, zu dem [Object](../../object/) konvertiert werden soll. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) zum Konvertieren. |

### ReturnValue

Entweder ungepackter Wert oder konvertierter Zeiger.

## Siehe auch

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
