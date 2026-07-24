---
title: "Metodo System::ObjectExt::ToString"
linktitle: "ToString"
second_title: "Aspose.Page per C++"
description: "Metodo System::ObjectExt::ToString. Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++ in C++."
type: docs
weight: 1300
url: /it/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


Sostituzione per il metodo C# ToString per funzionare su qualsiasi tipo C++.

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const char_t * | [String](../../string/) letterale da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


Sostituzione per il metodo C# ToString per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | [Nullable](../../nullable/) tipo. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | [Nullable](../../nullable/) oggetto da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Sostituzione per il metodo C# ToString per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | [Enum](../../enum/) tipo. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | [Enum](../../enum/) valore da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Sostituzione per il metodo C# ToString per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo smart pointer. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | [SmartPtr](../../smartptr/) valore da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Sostituzione per il metodo C# ToString per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo struttura. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | Valore struttura da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Sostituzione per il metodo C# ToString per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo scalare. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T\&& | Valore scalare da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Sostituzione per il metodo C# ToString per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo scalare. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T\&& | Valore scalare da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Sostituzione per il metodo C# ToString per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo smart pointer o [ExceptionWrapper](../../exceptionwrapper/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T\& | Smart pointer o [ExceptionWrapper](../../exceptionwrapper/) da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Sostituzione per il metodo C# ToString per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo scalare. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T\& | Valore scalare da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Sostituzione per il metodo C# ToString per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo struttura. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T\& | Valore struttura da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
