---
title: "System::ObjectExt::Equals methode"
linktitle: "Gelijk"
second_title: "Aspose.Page voor C++"
description: "System::ObjectExt::Equals methode. Vervanging voor C# Object.Equals-aanroepen die werken voor elk type in C++. Overload voor stringliteral met stringvergelijking in C++."
type: docs
weight: 700
url: /nl/cpp/system/objectext/equals/
---
## ObjectExt::Equals(const char_t(&), String) method


Vervanging voor C# [Object.Equals](../../object/equals/) aanroepen die werken voor elk type in C++. Overload voor stringliteral met stringvergelijking.

```cpp
template<size_t> static bool System::ObjectExt::Equals(const char_t(&obj)[N], String another)
```


| Parameter | Beschrijving |
| --- | --- |
| N | [String](../../string/) literalgrootte. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const char_t(&) | [String](../../string/) letterlijke. |
| another | String | [String](../../string/). |

### ReturnValue

True als strings overeenkomen, anders false.

## Zie ook

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const double\&, const double\&) method


Emuleert C#-stijl zwevendekommagetallen vergelijking waarbij twee NaN's als gelijk worden beschouwd, hoewel volgens IEC 60559:1989 NaN niet gelijk is aan enige waarde, inclusief NaN.

```cpp
bool System::ObjectExt::Equals(const double &obj, const double &another)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const double\& | LHS zwevendekommagetal. |
| another | const double\& | RHS zwevendekommagetal. |

### ReturnValue

True als **obj** en **another** beide NaN zijn of gelijk, anders false.

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const float\&, const float\&) method


Emuleert C#-stijl zwevendekommagetallen vergelijking waarbij twee NaN's als gelijk worden beschouwd, hoewel volgens IEC 60559:1989 NaN niet gelijk is aan enige waarde, inclusief NaN.

```cpp
bool System::ObjectExt::Equals(const float &obj, const float &another)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const float\& | LHS zwevendekommagetal. |
| another | const float\& | RHS zwevendekommagetal. |

### ReturnValue

True als **obj** en **another** beide NaN zijn of gelijk, anders false.

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method




```cpp
template<typename T,typename T2> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


Vervanging voor C# [Object.Equals](../../object/equals/) aanroepen die werken voor elk type in C++. Overload voor smart pointer types.

```cpp
template<typename T,typename T2> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Eerste objecttype. |
| T2 | Tweede objecttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T\& | Eerste object. |
| another | const T2\& | Tweede object. |

### ReturnValue

True als objecten als gelijk worden beschouwd, anders false.

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


Vervanging voor C# [Object.Equals](../../object/equals/) aanroepen die werken voor elk type in C++. Overload voor scalar types.

```cpp
template<typename T,typename T2> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Eerste objecttype. |
| T2 | Tweede objecttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T\& | Eerste object. |
| another | const T2\& | Tweede object. |

### ReturnValue

True als objecten als gelijk worden beschouwd, anders false.

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(T, const T2\&) method


Vervanging voor C# [Object.Equals](../../object/equals/) aanroepen die werken voor elk type in C++. Overload voor structure types.

```cpp
template<typename T,typename T2> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(T obj, const T2 &another)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Eerste objecttype. |
| T2 | Tweede objecttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | T | Eerste object. |
| another | const T2\& | Tweede object. |

### ReturnValue

True als objecten als gelijk worden beschouwd, anders false.

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
