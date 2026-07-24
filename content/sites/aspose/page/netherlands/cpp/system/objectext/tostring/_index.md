---
title: "System::ObjectExt::ToString methode"
linktitle: "ToString"
second_title: "Aspose.Page voor C++"
description: "System::ObjectExt::ToString methode. Vervanging voor de C# ToString methode om te werken op elk C++-type in C++."
type: docs
weight: 1300
url: /nl/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


Vervanging voor de C# ToString-methode om te werken op elk C++ type.

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const char_t * | [String](../../string/) literal om te converteren naar string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Zie ook

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


Vervanging voor de C# ToString-methode om te werken op elk C++ type.

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | [Nullable](../../nullable/) type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | [Nullable](../../nullable/) object om te converteren naar string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Zie ook

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Vervanging voor de C# ToString-methode om te werken op elk C++ type.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | [Enum](../../enum/) type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T\& | [Enum](../../enum/) waarde om te converteren naar string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Zie ook

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Vervanging voor de C# ToString-methode om te werken op elk C++ type.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Slimme pointer type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T\& | [SmartPtr](../../smartptr/) waarde om te converteren naar string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Zie ook

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Vervanging voor de C# ToString-methode om te werken op elk C++ type.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Structuurtype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T\& | Structuurwaarde om te converteren naar string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Zie ook

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Vervanging voor de C# ToString-methode om te werken op elk C++ type.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Scalair type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | T\&& | Scalair waarde om te converteren naar string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Zie ook

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Vervanging voor de C# ToString-methode om te werken op elk C++ type.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Scalair type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | T\&& | Scalair waarde om te converteren naar string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Zie ook

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Vervanging voor de C# ToString-methode om te werken op elk C++ type.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Smart pointer-type of [ExceptionWrapper](../../exceptionwrapper/). |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | T\& | Smart pointer of [ExceptionWrapper](../../exceptionwrapper/) om te converteren naar string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Zie ook

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Vervanging voor de C# ToString-methode om te werken op elk C++ type.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Scalair type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | T\& | Scalair waarde om te converteren naar string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Zie ook

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Vervanging voor de C# ToString-methode om te werken op elk C++ type.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Structuurtype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | T\& | Structuurwaarde om te converteren naar string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Zie ook

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
