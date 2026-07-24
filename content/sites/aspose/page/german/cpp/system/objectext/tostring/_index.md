---
title: "System::ObjectExt::ToString Methode"
linktitle: "ToString"
second_title: "Aspose.Page für C++"
description: "System::ObjectExt::ToString Methode. Ersatz für die C# ToString-Methode, um mit jedem C++‑Typ in C++ zu funktionieren."
type: docs
weight: 1300
url: /de/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert.

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const char_t * | [String](../../string/) Literal, um in einen String zu konvertieren. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Siehe auch

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert.

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | [Nullable](../../nullable/) Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | [Nullable](../../nullable/) Objekt, um in einen String zu konvertieren. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Siehe auch

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | [Enum](../../enum/) Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T\& | [Enum](../../enum/) Wert, um in einen String zu konvertieren. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Siehe auch

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Smart‑Pointer Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T\& | [SmartPtr](../../smartptr/) Wert, um in einen String zu konvertieren. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Siehe auch

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Strukturtyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T\& | Strukturwert, um in einen String zu konvertieren. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Siehe auch

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Skalarer Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | T\&& | Skalarwert, um in einen String zu konvertieren. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Siehe auch

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Skalarer Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | T\&& | Skalarwert, um in einen String zu konvertieren. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Siehe auch

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Smart‑Pointer Typ oder [ExceptionWrapper](../../exceptionwrapper/). |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | T\& | Smart‑Pointer oder [ExceptionWrapper](../../exceptionwrapper/), um in einen String zu konvertieren. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Siehe auch

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Skalarer Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | T\& | Skalarwert, um in einen String zu konvertieren. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Siehe auch

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Strukturtyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | T\& | Strukturwert, um in einen String zu konvertieren. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Siehe auch

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
