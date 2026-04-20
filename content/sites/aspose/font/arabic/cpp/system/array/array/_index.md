---
title: "منشئ System::Array::Array"
linktitle: "المصفوفة"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::Array::Array. ينشئ مصفوفة فارغة في C++."
type: docs
weight: 100
url: /ar/cpp/system/array/array/
---
## Array::Array() constructor


ينشئ مصفوفة فارغة.

```cpp
System::Array<T>::Array()
```

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const std::array\<UnderlyingType, InitArraySize\>\&) constructor


ينشئ كائنًا من [Array](../) ويملأه بالقيم من المصفوفة المحددة التي تحتوي على عناصر من النوع **[UnderlyingType](../underlyingtype/)**.

```cpp
template<std::size_t> System::Array<T>::Array(const std::array<UnderlyingType, InitArraySize> &init)
```


| معامل | الوصف |
| --- | --- |
| InitArraySize | عدد العناصر في مصفوفة **init**. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| init | const std::array\<UnderlyingType, InitArraySize\>\& | [Array](../) للنسخ إلى المصفوفة التي يتم إنشاؤها. |

## انظر أيضًا

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const std::vector\<Q\>\&) constructor


ينشئ كائنًا من نوع [Array](../) ويملأه بالقيم المنسوخة من كائن std::vector يكون نوع قيمه هو نفسه **T** لكنه مختلف عن **[UnderlyingType](../underlyingtype/)**.

```cpp
template<typename Q,typename> System::Array<T>::Array(const std::vector<Q> &value)
```


| معامل | الوصف |
| --- | --- |
| Q | نوع عناصر كائن std::vector الذي تُنسخ العناصر منه |

| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const std::vector\<Q\>\& | std::vector لنسخ القيم منه |

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const vector_t\&) constructor


منشئ النسخ.

```cpp
System::Array<T>::Array(const vector_t &assgn)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| assgn | const vector_t\& | std::vector لنسخ القيم منه |

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(int, const T\&) constructor


منشئ تعبئة.

```cpp
System::Array<T>::Array(int count, const T &init=T())
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| count | int | الحجم الأولي للمصفوفة |
| init | const T\& | القيمة الأولية المستخدمة لملء المصفوفة |

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(int, const T) constructor


منشئ تعبئة.

```cpp
System::Array<T>::Array(int count, const T inits[])
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| count | int | الحجم الأولي للمصفوفة |
| تهيئات | const T | القيم لملء المصفوفة |

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::initializer_list\<bool\>, int) constructor


ينشئ كائن [Array](../) ويملأه بالقيم من قائمة التهيئة المحددة التي تحتوي على عناصر من نوع bool.

```cpp
System::Array<T>::Array(std::initializer_list<bool> init, int=0)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| init | std::initializer_list\<bool\> | قائمة تهيئة تحتوي على عناصر لتعبئة المصفوفة بها |

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::initializer_list\<UnderlyingType\>) constructor


ينشئ كائن [Array](../) ويملأه بالقيم من قائمة التهيئة المحددة التي تحتوي على عناصر من نوع **[UnderlyingType](../underlyingtype/)**.

```cpp
System::Array<T>::Array(std::initializer_list<UnderlyingType> init)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| init | std::initializer_list\<UnderlyingType\> | قائمة تهيئة تحتوي على عناصر لتعبئة المصفوفة بها |

## انظر أيضًا

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::vector\<Q\>\&&) constructor


ينشئ كائن [Array](../) ويملأه بالقيم المنقولة من كائن std::vector يكون نوع قيمه هو نفسه **T** لكنه مختلف عن **[UnderlyingType](../underlyingtype/)**.

```cpp
template<typename Q,typename> System::Array<T>::Array(std::vector<Q> &&value)
```


| معامل | الوصف |
| --- | --- |
| Q | نوع عناصر كائن std::vector الذي تُنقل العناصر منه |

| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | std::vector\<Q\>\&& | std::vector لنسخ القيم منه |

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) constructor


منشئ تعبئة.

```cpp
template<typename ValueType> System::Array<T>::Array(typename std::enable_if<std::is_arithmetic<T>::value &&std::is_arithmetic<ValueType>::value &&std::is_convertible<ValueType, T>::value, int>::type count, ValueType init)
```


| معامل | الوصف |
| --- | --- |
| ValueType | نوع القيمة الأولية |

| معامل | نوع | الوصف |
| --- | --- | --- |
| count | typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type | الحجم الأولي للمصفوفة |
| init | ValueType | القيمة الأولية المستخدمة لملء المصفوفة |

## انظر أيضًا

* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(vector_t\&&) constructor


منشئ نقل.

```cpp
System::Array<T>::Array(vector_t &&value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | vector_t\&& | std::vector، العناصر التي يتم الحصول عليها بواسطة المصفوفة |

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
