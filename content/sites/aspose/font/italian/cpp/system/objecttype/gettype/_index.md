---
title: "metodo System::ObjectType::GetType"
linktitle: "GetType"
second_title: "Aspose.Font per C++"
description: "metodo System::ObjectType::GetType. Implementa la traduzione di typeof(). Sovraccarico per tipi primitivi in C++."
type: docs
weight: 100
url: /it/cpp/system/objecttype/gettype/
---
## ObjectType::GetType() method


Implementa la traduzione di typeof(). Sovraccarico per tipi primitivi.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value &&!std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo primitivo. |

### ReturnValue

Riferimento costante alla struttura [TypeInfo](../../typeinfo/) che descrive il tipo specificato.

## Vedi anche

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementa la traduzione di typeof(). Sovraccarico per tipi enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo primitivo. |

### ReturnValue

Riferimento costante alla struttura [TypeInfo](../../typeinfo/) che descrive il tipo specificato.

## Vedi anche

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementa la traduzione di typeof(). Sovraccarico per strutture e puntatori.

```cpp
template<typename T> static std::enable_if<(!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsBoxable<T>::value)||IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo primitivo. |

### ReturnValue

Riferimento costante alla struttura [TypeInfo](../../typeinfo/) che descrive la struttura specificata.

## Vedi anche

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementa la traduzione di typeof(). Sovraccarico per [Nullable](../../nullable/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo [Nullable](../../nullable/). |

### ReturnValue

Riferimento costante alla struttura [TypeInfo](../../typeinfo/) che descrive la struttura specificata.

## Vedi anche

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementa la traduzione di typeof(). Sovraccarico per MutlicastDelegate.

```cpp
template<typename T> static std::enable_if<detail::is_a<T, MulticastDelegate>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo MutlicastDelegate. |

### ReturnValue

Riferimento costante alla struttura [TypeInfo](../../typeinfo/) che descrive la struttura specificata.

## Vedi anche

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementa la traduzione di typeof(). Sovraccarico per strutture e puntatori.

```cpp
template<typename T> static std::enable_if<!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&IsBoxable<T>::value &&!detail::is_a<T, MulticastDelegate>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo primitivo. |

### ReturnValue

Riferimento costante alla struttura [TypeInfo](../../typeinfo/) che descrive la struttura specificata o il tipo puntato se richiesto per [SmartPtr](../../smartptr/).

## Vedi anche

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementa la traduzione di typeof(). Sovraccarico per uint8_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Vedi anche

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementa la traduzione di typeof(). Sovraccarico per char16_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Vedi anche

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementa la traduzione di typeof(). Sovraccarico per int32_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Vedi anche

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementa la traduzione di typeof(). Sovraccarico per int64_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Vedi anche

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementa la traduzione di typeof(). Sovraccarico per bool.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Vedi anche

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementa la traduzione di typeof(). Sovraccarico per [Void](../../void/).

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Vedi anche

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const String\&) method


Implementa la traduzione di typeof(). Sovraccarico per tipo stringa.

```cpp
static const System::TypeInfo & System::ObjectType::GetType(const String &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo primitivo. |

### ReturnValue

Riferimento costante alla struttura [TypeInfo](../../typeinfo/) che descrive il tipo [String](../../string/).

## Vedi anche

* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


Implementa la traduzione di typeof(). Sovraccarico per puntatori intelligenti.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di oggetto puntatore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) per ottenere [TypeInfo](../../typeinfo/). |

### ReturnValue

Riferimento costante alla struttura [TypeInfo](../../typeinfo/) che descrive la classe finale dell'oggetto passato.

## Vedi anche

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


Implementa la traduzione di typeof(). Sovraccarico per strutture.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo struttura. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) per ottenere [TypeInfo](../../typeinfo/). |

### ReturnValue

Riferimento costante alla struttura [TypeInfo](../../typeinfo/) che descrive la classe finale dell'oggetto passato.

## Vedi anche

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


Implementa la traduzione di typeof(). Sovraccarico per eccezioni.

```cpp
template<typename T> static std::enable_if<IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo [Exception](../../exception/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) per ottenere [TypeInfo](../../typeinfo/). |

### ReturnValue

Riferimento costante alla struttura [TypeInfo](../../typeinfo/) che descrive la classe finale dell'oggetto passato.

## Vedi anche

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T) method


Implementa la traduzione di typeof(). Sovraccarico per tipi primitivi.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value||std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo primitivo. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

Riferimento costante alla struttura [TypeInfo](../../typeinfo/) che descrive il tipo dell'oggetto passato.

## Vedi anche

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T) method


Implementa la traduzione di typeof(). Sovraccarico per i tipi [Nullable](../../nullable/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo [Nullable](../../nullable/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

Riferimento costante alla struttura [TypeInfo](../../typeinfo/) che descrive il tipo dell'oggetto passato.

## Vedi anche

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
