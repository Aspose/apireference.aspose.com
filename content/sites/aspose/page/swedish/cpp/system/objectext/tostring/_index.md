---
title: "System::ObjectExt::ToString metod"
linktitle: "ToString"
second_title: "Aspose.Page för C++"
description: "System::ObjectExt::ToString metod. Ersättning för C# ToString‑metod för att fungera på alla C++‑typer i C++."
type: docs
weight: 1300
url: /sv/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer.

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const char_t * | [String](../../string/) literal för att konvertera till sträng. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Se även

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer.

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | [Nullable](../../nullable/) typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | [Nullable](../../nullable/) objekt för att konvertera till sträng. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Se även

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | [Enum](../../enum/) typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const T\& | [Enum](../../enum/) värde för att konvertera till sträng. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Se även

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Smart‑pekare typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const T\& | [SmartPtr](../../smartptr/) värde för att konvertera till sträng. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Se även

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Strukturtyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const T\& | Strukturvärde för att konvertera till sträng. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Se även

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Skalär typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | T\&& | Skalärt värde för att konvertera till sträng. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Se även

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Skalär typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | T\&& | Skalärt värde för att konvertera till sträng. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Se även

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Smart‑pekare typ eller [ExceptionWrapper](../../exceptionwrapper/). |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | T\& | Smart‑pekare eller [ExceptionWrapper](../../exceptionwrapper/) för att konvertera till sträng. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Se även

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Skalär typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | T\& | Skalärt värde för att konvertera till sträng. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Se även

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Strukturtyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | T\& | Strukturvärde för att konvertera till sträng. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Se även

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
