---
title: "System::ObjectType::GetType methode"
linktitle: "GetType"
second_title: "Aspose.Page voor C++"
description: "System::ObjectType::GetType methode. Implementeert de vertaling van typeof(). Overload voor primitieve types in C++."
type: docs
weight: 100
url: /nl/cpp/system/objecttype/gettype/
---
## ObjectType::GetType() method


Implementeert typeof()-vertaling. Overload voor primitieve types.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value &&!std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Beschrijving |
| --- | --- |
| T | Primitief type. |

### ReturnValue

Constante referentie naar de [TypeInfo](../../typeinfo/) structuur die het opgegeven type beschrijft.

## Zie ook

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementeert typeof()-vertaling. Overload voor enum‑types.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Beschrijving |
| --- | --- |
| T | Primitief type. |

### ReturnValue

Constante referentie naar de [TypeInfo](../../typeinfo/) structuur die het opgegeven type beschrijft.

## Zie ook

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementeert typeof()-vertaling. Overload voor structuren en pointers.

```cpp
template<typename T> static std::enable_if<(!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsBoxable<T>::value)||IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Beschrijving |
| --- | --- |
| T | Primitief type. |

### ReturnValue

Constante referentie naar de [TypeInfo](../../typeinfo/) structuur die de opgegeven structuur beschrijft.

## Zie ook

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementeert de vertaling van typeof(). Overload voor [Nullable](../../nullable/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Beschrijving |
| --- | --- |
| T | [Nullable](../../nullable/) type. |

### ReturnValue

Constante referentie naar de [TypeInfo](../../typeinfo/) structuur die de opgegeven structuur beschrijft.

## Zie ook

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementeert typeof()-vertaling. Overload voor MutlicastDelegate.

```cpp
template<typename T> static std::enable_if<detail::is_a<T, MulticastDelegate>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Beschrijving |
| --- | --- |
| T | MutlicastDelegate type. |

### ReturnValue

Constante referentie naar de [TypeInfo](../../typeinfo/) structuur die de opgegeven structuur beschrijft.

## Zie ook

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementeert typeof()-vertaling. Overload voor structuren en pointers.

```cpp
template<typename T> static std::enable_if<!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&IsBoxable<T>::value &&!detail::is_a<T, MulticastDelegate>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Beschrijving |
| --- | --- |
| T | Primitief type. |

### ReturnValue

Constante referentie naar de [TypeInfo](../../typeinfo/) structuur die de opgegeven structuur beschrijft of het pointee-type als het wordt aangeroepen voor [SmartPtr](../../smartptr/).

## Zie ook

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementeert typeof()-vertaling. Overload voor uint8_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Zie ook

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementeert typeof() vertaling. Overload voor char16_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Zie ook

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementeert typeof() vertaling. Overload voor int32_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Zie ook

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementeert typeof() vertaling. Overload voor int64_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Zie ook

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementeert typeof() vertaling. Overload voor bool.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Zie ook

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementeert typeof() vertaling. Overload voor [Void](../../void/).

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Zie ook

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const String\&) method


Implementeert typeof()-vertaling. Overload voor stringtype.

```cpp
static const System::TypeInfo & System::ObjectType::GetType(const String &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Primitief type. |

### ReturnValue

Constante referentie naar [TypeInfo](../../typeinfo/) structuur die het [String](../../string/) type beschrijft.

## Zie ook

* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


Implementeert typeof()-vertaling. Overload voor slimme pointers.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Pointer objecttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) om [TypeInfo](../../typeinfo/) te verkrijgen. |

### ReturnValue

Constante referentie naar [TypeInfo](../../typeinfo/) structuur die de uiteindelijke klasse van het doorgegeven object beschrijft.

## Zie ook

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


Implementeert typeof()-vertaling. Overload voor structuren.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Structuurtype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) om [TypeInfo](../../typeinfo/) te verkrijgen. |

### ReturnValue

Constante referentie naar [TypeInfo](../../typeinfo/) structuur die de uiteindelijke klasse van het doorgegeven object beschrijft.

## Zie ook

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


Implementeert typeof()-vertaling. Overload voor uitzonderingen.

```cpp
template<typename T> static std::enable_if<IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | [Exception](../../exception/) type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) om [TypeInfo](../../typeinfo/) te verkrijgen. |

### ReturnValue

Constante referentie naar [TypeInfo](../../typeinfo/) structuur die de uiteindelijke klasse van het doorgegeven object beschrijft.

## Zie ook

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T) method


Implementeert typeof()-vertaling. Overload voor primitieve types.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value||std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Primitief type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

Constante referentie naar [TypeInfo](../../typeinfo/) structuur die het type van het doorgegeven object beschrijft.

## Zie ook

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T) method


Implementeert typeof() vertaling. Overload voor [Nullable](../../nullable/) types.

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | [Nullable](../../nullable/) type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

Constante referentie naar [TypeInfo](../../typeinfo/) structuur die het type van het doorgegeven object beschrijft.

## Zie ook

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
