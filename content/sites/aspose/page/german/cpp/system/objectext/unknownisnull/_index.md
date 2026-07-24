---
title: "System::ObjectExt::UnknownIsNull Methode"
linktitle: "UnknownIsNull"
second_title: "Aspose.Page für C++"
description: "System::ObjectExt::UnknownIsNull Methode. Prüft, ob ein Objekt unbekannten Typs nullptr ist. Überladung für nicht-skalare Typen in C++."
type: docs
weight: 1700
url: /de/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


Prüft, ob ein Objekt unbekannten Typs nullptr ist. Überladung für nicht-skalare Typen.

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | [Object](../../object/) Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | T | [Object](../../object/) zum Prüfen. |

### ReturnValue

Wahr, wenn 'obj == nullptr' wahr ist, sonst falsch.

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


Prüft, ob ein Objekt unbekannten Typs nullptr ist. Überladung für skalare Typen.

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | [Object](../../object/) Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | T | [Object](../../object/) zum Prüfen. |

### ReturnValue

Gibt immer false zurück.

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
