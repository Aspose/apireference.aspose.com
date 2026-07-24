---
title: "System::ObjectExt::Box-metod"
linktitle: "Box"
second_title: "Aspose.Page för C++"
description: "System::ObjectExt::Box-metod. Packar in strängvärden i C++."
type: docs
weight: 200
url: /sv/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


Packar strängvärden.

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const String\& | Värde att packa in. |

### ReturnValue

Inpackat värde eller null, om källsträngen är null.

## Se även

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Packar in värdetyper för konvertering till [Object](../../object/). Implementation för enum-typer.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Beskrivning |
| --- | --- |
| T | [Enum](../../enum/) typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const T\& | [Enum](../../enum/)-värde att packa in. |

### ReturnValue

Smart-pekare till objekt som behåller inpackat värde.

## Se även

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Packar in värdetyper för konvertering till [Object](../../object/). Implementation för icke-enum-typer.

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Värdetyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const T\& | Värde att packa in. |

### ReturnValue

Smart-pekare till objekt som behåller inpackat värde.

## Se även

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Packar in [Nullable](../../nullable/)-typer för konvertering till [Object](../../object/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Värdetyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const T\& | Värde att packa in. |

### ReturnValue

Smart-pekare till objekt som behåller inpackat värde.

## Se även

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
