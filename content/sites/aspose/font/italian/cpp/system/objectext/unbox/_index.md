---
title: "metodo System::ObjectExt::Unbox"
linktitle: "Unbox"
second_title: "Aspose.Font per C++"
description: "metodo System::ObjectExt::Unbox. Esegue l'unboxing dei tipi valore dopo la conversione in Object. Implementazione per i tipi enum in C++."
type: docs
weight: 1500
url: /it/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Esegue l'unboxing dei tipi valore dopo la conversione in [Object](../../object/). Implementazione per i tipi enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo [Enum](../../enum/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) da unboxare. |

### ReturnValue

[Enum](../../enum/) value.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Esegue l'unboxing dei tipi valore dopo la conversione in [Object](../../object/). Implementazione per tipi non enum e non nullable.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo valore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) da unboxare. |

### ReturnValue

Valore unboxed.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Esegue l'unboxing dei tipi valore dopo la conversione in [Object](../../object/). Implementazione per tipi non enum e non nullable.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo valore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) da unboxare. |

### ReturnValue

Valore unboxed.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Deincapsula i valori stringa.

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) da unboxare |

### ReturnValue

[String](../../string/) representation of boxed string, can be null if boxed string was null.

## Vedi anche

* Class [String](../../string/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(E) method


Deincapsula i tipi enum in intero.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo intero di destinazione. |
| E | Tipo enum di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| e | E | Valore da unboxare. |

### ReturnValue

Rappresentazione intera dell'enum.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(E) method


Converte i tipi enum.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo enum di destinazione. |
| E | Tipo enum di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| e | E | Valore da unboxare. |

### ReturnValue

Valore enum convertito.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
