---
title: "Metodo System::ObjectExt::Is"
linktitle: "È"
second_title: "Aspose.Font per C++"
description: "Metodo System::ObjectExt::Is. Implementa la traduzione dell'operatore ''is''. Specializzazione per i literal stringa in C++."
type: docs
weight: 1100
url: /it/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per letterale stringa.

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) letterale. |

### ReturnValue

Vero se 'is' restituisce true, false altrimenti.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per i tipi wrapper di eccezione.

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/) per testare l'operatore 'is'. |

### ReturnValue

Vero se 'is' restituisce true, false altrimenti.

## Vedi anche

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per il tipo [Nullable](../../nullable/).

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Nullable\<U\>\& | tipo [Nullable](../../nullable/). |

### ReturnValue

Vero se 'is' restituisce true, false altrimenti.

## Vedi anche

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Object\&) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per i tipi valore.

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) per testare l'operatore 'is'. |

### ReturnValue

Vero se 'is' restituisce true, false altrimenti.

## Vedi anche

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Object\&) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per i tipi non convertibili.

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) per testare l'operatore 'is'. |

### ReturnValue

Restituisce sempre false poiché i tipi non sono convertibili.

## Vedi anche

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per tipi nullable.

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) per testare l'operatore 'is'. |

### ReturnValue

Vero se 'is' restituisce true, false altrimenti.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per tipi incapsulabili con l'operatore == definito.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) per testare l'operatore 'is'. |

### ReturnValue

Vero se 'is' restituisce true, false altrimenti.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per tipi incapsulabili senza l'operatore == definito.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) per testare l'operatore 'is'. |

### ReturnValue

Vero se 'is' restituisce true, false altrimenti.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per i tipi puntatore.

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) per testare l'operatore 'is'. |

### ReturnValue

Vero se 'is' restituisce true, false altrimenti.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per tipi enum.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |
| U | Tipo dell'oggetto puntato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) per testare l'operatore 'is'. |

### ReturnValue

Vero se 'is' restituisce true, false altrimenti.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per tipi valore incapsulati in interfacce.

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |
| V | Tipo dell'oggetto puntato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/) per testare l'operatore 'is'. |

### ReturnValue

Vero se 'is' restituisce true, false altrimenti.

## Vedi anche

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const T\&) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per i tipi boxabili (valore) che sono esattamente questi.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) per testare l'operatore 'is'. Ignorato. |

### ReturnValue

Sempre vero

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const U\&) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per i tipi puntatore ottimizzati per le classi 'final'.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |
| U | Tipo testato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) per testare l'operatore 'is'. |

### ReturnValue

Vero se 'is' restituisce true, false altrimenti.

## Vedi anche

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const U\&) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per i tipi puntatore.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |
| U | Tipo testato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) per testare l'operatore 'is'. |

### ReturnValue

Vero se 'is' restituisce true, false altrimenti.

## Vedi anche

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per tipi enum rispetto a puntatori deboli.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |
| U | Tipo dell'oggetto puntato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/) per testare l'operatore 'is'. |

### ReturnValue

Vero se 'is' restituisce true, false altrimenti.

## Vedi anche

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(int32_t) method


Implementa la traduzione dell'operatore 'is'. Specializzazione per letterale intero.

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int32_t | letterale intero. |

### ReturnValue

Vero se 'is' restituisce true, false altrimenti.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
