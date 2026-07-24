---
title: "System::ObjectExt::Unbox-methode"
linktitle: "Unbox"
second_title: "Aspose.Page voor C++"
description: "System::ObjectExt::Unbox-methode. Unboxt waardetypen na conversie naar Object. Implementatie voor enum-types in C++."
type: docs
weight: 1400
url: /nl/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Unboxt waardetypen na conversie naar [Object](../../object/). Implementatie voor enum-types.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | [Enum](../../enum/) type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) om te unboxen. |

### ReturnValue

[Enum](../../enum/) value.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Unboxt waardetypen na conversie naar [Object](../../object/). Implementatie voor niet-enum- en niet-nullable types.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Waarde‑type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) om te unboxen. |

### ReturnValue

Unboxte waarde.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Unboxt waardetypen na conversie naar [Object](../../object/). Implementatie voor niet-enum- en niet-nullable types.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Waarde‑type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) om te unboxen. |

### ReturnValue

Unboxte waarde.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Ontdoet string-waarden.

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) om te unboxen |

### ReturnValue

[String](../../string/) representation of boxed string, can be null if boxed string was null.

## Zie ook

* Class [String](../../string/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


Ontdoet enum-typen naar integer.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doel-integertype. |
| E | Bron-enumtype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| e | E | Waarde om te unboxen. |

### ReturnValue

Integerrepresentatie van enum.

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


Converteert enum-typen.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doelenumtype. |
| E | Bron-enumtype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| e | E | Waarde om te unboxen. |

### ReturnValue

Geconverteerde enumwaarde.

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
