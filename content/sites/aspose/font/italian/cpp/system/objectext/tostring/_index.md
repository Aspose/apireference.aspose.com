---
title: "Metodo System::ObjectExt::ToString"
linktitle: "ToString"
second_title: "Aspose.Font per C++"
description: "Metodo System::ObjectExt::ToString. Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++ in C++."
type: docs
weight: 1400
url: /it/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++.

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const char_t * | letterale [String](../../string/) da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo [Nullable](../../nullable/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | oggetto [Nullable](../../nullable/) da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo [Enum](../../enum/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | valore [Enum](../../enum/) da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo smart pointer. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | valore [SmartPtr](../../smartptr/) da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo struttura. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | valore struttura da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&&) method


Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo scalare. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T\&& | valore scalare da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&&) method


Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo scalare. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T\&& | valore scalare da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo smart pointer o [ExceptionWrapper](../../exceptionwrapper/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T\& | smart pointer o [ExceptionWrapper](../../exceptionwrapper/) da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo scalare. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T\& | valore scalare da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo struttura. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T\& | valore struttura da convertire in stringa. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
