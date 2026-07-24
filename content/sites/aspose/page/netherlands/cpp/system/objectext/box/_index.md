---
title: "System::ObjectExt::Box methode"
linktitle: "Box"
second_title: "Aspose.Page voor C++"
description: "System::ObjectExt::Box methode. Verpakt tekenreekswaarden in C++."
type: docs
weight: 200
url: /nl/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


Verpakt string‑waarden.

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const String\& | Waarde om te verpakken. |

### ReturnValue

Verpakte waarde of null, als de brontekenreeks null is.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Verpakt waardetypen voor conversie naar [Object](../../object/). Implementatie voor enumtypen.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Beschrijving |
| --- | --- |
| T | [Enum](../../enum/) type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const T\& | [Enum](../../enum/) waarde om te boxen. |

### ReturnValue

Slimme pointer naar object dat de verpakte waarde bewaart.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Verpakt waardetypen voor conversie naar [Object](../../object/). Implementatie voor niet-enumtypen.

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Waarde‑type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const T\& | Waarde om te verpakken. |

### ReturnValue

Slimme pointer naar object dat de verpakte waarde bewaart.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Verpakt [Nullable](../../nullable/) typen voor conversie naar [Object](../../object/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Waarde‑type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const T\& | Waarde om te verpakken. |

### ReturnValue

Slimme pointer naar object dat de verpakte waarde bewaart.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
