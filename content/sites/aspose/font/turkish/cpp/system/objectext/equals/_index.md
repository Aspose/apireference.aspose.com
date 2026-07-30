---
title: "System::ObjectExt::Equals yöntemi"
linktitle: "Eşittir"
second_title: "Aspose.Font için C++"
description: "System::ObjectExt::Equals yöntemi. C# Object.Equals çağrılarına, C++'da herhangi bir tip için çalışan bir ikame. C++'da string literal için string karşılaştırmasıyla aşırı yükleme."
type: docs
weight: 800
url: /tr/cpp/system/objectext/equals/
---
## ObjectExt::Equals(const char_t(&), String) method


C# [Object.Equals](../../object/equals/) çağrıları için ikame, C++'ta herhangi bir tipte çalışır. Dize karşılaştırmasıyla dize sabiti için aşırı yükleme.

```cpp
template<size_t> static bool System::ObjectExt::Equals(const char_t(&obj)[N], String another)
```


| Parametre | Açıklama |
| --- | --- |
| N | [String](../../string/) sabiti boyutu. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const char_t(&) | [String](../../string/) literalı. |
| another | String | [String](../../string/). |

### ReturnValue

Dizeler eşleşiyorsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const double\&, const double\&) method


IEC 60559:1989'a göre NaN'in hiçbir değere, NaN dahil, eşit olmamasına rağmen, iki NaN'in eşit kabul edildiği C# tarzı kayan nokta karşılaştırmasını taklit eder.

```cpp
bool System::ObjectExt::Equals(const double &obj, const double &another)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const double\& | LHS kayan nokta değeri. |
| başka | const double\& | RHS kayan nokta değeri. |

### ReturnValue

**obj** ve **another** her ikisi de NaN ise ya da eşitse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const float\&, const float\&) method


IEC 60559:1989'a göre NaN'in hiçbir değere, NaN dahil, eşit olmamasına rağmen, iki NaN'in eşit kabul edildiği C# tarzı kayan nokta karşılaştırmasını taklit eder.

```cpp
bool System::ObjectExt::Equals(const float &obj, const float &another)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const float\& | LHS kayan nokta değeri. |
| başka | const float\& | RHS kayan nokta değeri. |

### ReturnValue

**obj** ve **another** her ikisi de NaN ise ya da eşitse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method




```cpp
template<typename T,typename T2> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


C# [Object.Equals](../../object/equals/) çağrıları için ikame, C++'ta herhangi bir tipte çalışır. Akıllı işaretçi tipleri için aşırı yükleme.

```cpp
template<typename T,typename T2> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parametre | Açıklama |
| --- | --- |
| T | İlk nesne tipi. |
| T2 | İkinci nesne tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const T\& | İlk nesne. |
| başka | const T2\& | İkinci nesne. |

### ReturnValue

Nesneler eşit kabul ediliyorsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


C# [Object.Equals](../../object/equals/) çağrıları için ikame, C++'ta herhangi bir tipte çalışır. Skaler tipler için aşırı yükleme.

```cpp
template<typename T,typename T2> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parametre | Açıklama |
| --- | --- |
| T | İlk nesne tipi. |
| T2 | İkinci nesne tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const T\& | İlk nesne. |
| başka | const T2\& | İkinci nesne. |

### ReturnValue

Nesneler eşit kabul ediliyorsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(T, const T2\&) method


C# [Object.Equals](../../object/equals/) çağrıları için ikame, C++'ta herhangi bir tipte çalışır. Yapı tipleri için aşırı yükleme.

```cpp
template<typename T,typename T2> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(T obj, const T2 &another)
```


| Parametre | Açıklama |
| --- | --- |
| T | İlk nesne tipi. |
| T2 | İkinci nesne tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | T | İlk nesne. |
| başka | const T2\& | İkinci nesne. |

### ReturnValue

Nesneler eşit kabul ediliyorsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
