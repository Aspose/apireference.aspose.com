---
title: "System::Array::Array 构造函数"
linktitle: "数组"
second_title: "Aspose.Page 适用于 C++"
description: "System::Array::Array 构造函数。构造一个在 C++ 中的空数组。"
type: docs
weight: 100
url: /zh/cpp/system/array/array/
---
## Array::Array() constructor


构造一个空数组。

```cpp
System::Array<T>::Array()
```

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::array\<UnderlyingType, InitArraySize\>\&) constructor


构造一个 [Array](../) 对象，并用指定数组中的值填充，该数组包含 **[UnderlyingType](../underlyingtype/)** 类型的元素。

```cpp
template<std::size_t> System::Array<T>::Array(const std::array<UnderlyingType, InitArraySize> &init)
```


| Parameter | 描述 |
| --- | --- |
| InitArraySize | **init** 数组的元素数量。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| init | const std::array\<UnderlyingType, InitArraySize\>\& | 要复制到正在构造的数组中的 [Array](../)。 |

## 另见

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::vector\<Q\>\&) constructor


构造一个 [Array](../) 对象，并用从 std::vector 对象复制的值填充，该对象的值类型与 **T** 相同，但不同于 **[UnderlyingType](../underlyingtype/)**。

```cpp
template<typename Q,typename> System::Array<T>::Array(const std::vector<Q> &value)
```


| Parameter | 描述 |
| --- | --- |
| Q | 要从中复制元素的 std::vector 对象的元素类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const std::vector\<Q\>\& | 用于复制值的 std::vector |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const vector_t\&) constructor


拷贝构造函数。

```cpp
System::Array<T>::Array(const vector_t &assgn)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| assgn | const vector_t\& | 用于复制值的 std::vector |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T\&) constructor


填充构造函数。

```cpp
System::Array<T>::Array(int count, const T &init=T())
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| count | int | 数组的初始大小 |
| init | const T\& | 用于填充数组的初始值 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T) constructor


填充构造函数。

```cpp
System::Array<T>::Array(int count, const T inits[])
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| count | int | 数组的初始大小 |
| inits | const T | 用于填充数组的值 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<bool\>, int) constructor


构造一个 [Array](../) 对象，并使用指定的初始化列表中包含 bool 类型元素的值来填充它。

```cpp
System::Array<T>::Array(std::initializer_list<bool> init, int=0)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| init | std::initializer_list\<bool\> | 包含用于填充数组的元素的初始化列表 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<UnderlyingType\>) constructor


构造一个 [Array](../) 对象，并使用指定的初始化列表中包含 **[UnderlyingType](../underlyingtype/)** 类型元素的值来填充它。

```cpp
System::Array<T>::Array(std::initializer_list<UnderlyingType> init)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| init | std::initializer_list\<UnderlyingType\> | 包含用于填充数组的元素的初始化列表 |

## 另见

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::vector\<Q\>\&&) constructor


构造一个 [Array](../) 对象，并使用从 std::vector 对象中移动的值来填充它，该对象的值类型与 **T** 相同，但不同于 **[UnderlyingType](../underlyingtype/)**。

```cpp
template<typename Q,typename> System::Array<T>::Array(std::vector<Q> &&value)
```


| Parameter | 描述 |
| --- | --- |
| Q | 要移动元素的 std::vector 对象的元素类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | std::vector\<Q\>\&& | 用于复制值的 std::vector |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) constructor


填充构造函数。

```cpp
template<typename ValueType> System::Array<T>::Array(typename std::enable_if<std::is_arithmetic<T>::value &&std::is_arithmetic<ValueType>::value &&std::is_convertible<ValueType, T>::value, int>::type count, ValueType init)
```


| Parameter | 描述 |
| --- | --- |
| ValueType | 初始值的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| count | typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type | 数组的初始大小 |
| init | ValueType | 用于填充数组的初始值 |

## 另见

* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(vector_t\&&) constructor


移动构造函数。

```cpp
System::Array<T>::Array(vector_t &&value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | vector_t\&& | std::vector，数组获取其元素 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
