---
title: "Metodo System::ObjectExt::Box"
linktitle: "Box"
second_title: "Aspose.Page per C++"
description: "Metodo System::ObjectExt::Box. Incapsula valori stringa in C++."
type: docs
weight: 200
url: /it/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


Confeziona i valori stringa.

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const String\& | Valore da incapsulare. |

### ReturnValue

Valore incapsulato o null, se la stringa di origine è null.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Incapsula i tipi valore per la conversione a [Object](../../object/). Implementazione per i tipi enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parametro | Descrizione |
| --- | --- |
| T | [Enum](../../enum/) tipo. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const T\& | Valore [Enum](../../enum/) da incapsulare. |

### ReturnValue

Puntatore intelligente a oggetto che conserva il valore incapsulato.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Incapsula i tipi valore per la conversione a [Object](../../object/). Implementazione per i tipi non enum.

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo valore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const T\& | Valore da incapsulare. |

### ReturnValue

Puntatore intelligente a oggetto che conserva il valore incapsulato.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Incapsula i tipi [Nullable](../../nullable/) per la conversione a [Object](../../object/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo valore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const T\& | Valore da incapsulare. |

### ReturnValue

Puntatore intelligente a oggetto che conserva il valore incapsulato.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
