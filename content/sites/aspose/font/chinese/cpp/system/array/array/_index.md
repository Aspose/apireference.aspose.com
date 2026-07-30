---
title: "System::Array::Array 构造函数"
linktitle: "数组"
second_title: "Aspose.Font 适用于 C++"
description: "System::Array::Array 构造函数。构造一个空数组（在 C++ 中）。"
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
* Library [Aspose.Font for C++](../../../)
## Array::Array(const std::array\<UnderlyingType, InitArraySize\>\&) constructor


构造一个 [Array](../) 对象，并用指定数组中的值填充，该数组包含 **[UnderlyingType](../underlyingtype/)** 类型的元素。

```cpp
template<std::size_t> System::Array<T>::Array(const std::array<UnderlyingType, InitArraySize> &init)
```


| 参数 | 描述 |
| --- | --- |
| InitArraySize | **init** 数组的元素数量。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| init | const std::array\<UnderlyingType, InitArraySize\>\& | 用于复制到正在构造的数组中的 [Array](../)。 |

## 另见

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const std::vector\<Q\>\&) constructor


构造一个 [Array](../) 对象，并用从 std::vector 对象复制的值填充，该对象的值类型与 **T** 相同，但不同于 **[UnderlyingType](../underlyingtype/)**。

```cpp
template<typename Q,typename> System::Array<T>::Array(const std::vector<Q> &value)
```


| 参数 | 描述 |
| --- | --- |
| Q | 要从中复制元素的 std::vector 对象的元素类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const std::vector\<Q\>\& | 用于复制值的 std::vector |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const vector_t\&) constructor


拷贝构造函数。

```cpp
System::Array<T>::Array(const vector_t &assgn)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| assgn | const vector_t\& | 用于复制值的 std::vector |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(int, const T\&) constructor


填充构造函数。

```cpp
System::Array<T>::Array(int count, const T &init=T())
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| count | int | 数组的初始大小 |
| init | const T\& | 用于填充数组的初始值 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(int, const T) constructor


填充构造函数。

```cpp
System::Array<T>::Array(int count, const T inits[])
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| count | int | 数组的初始大小 |
| 初始化 | const T | 用于填充数组的值 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::initializer_list\<bool\>, int) constructor


构造一个 [Array](../) 对象，并使用指定的包含 bool 类型元素的初始化列表中的值填充它。

```cpp
System::Array<T>::Array(std::initializer_list<bool> init, int=0)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| init | std::initializer_list\<bool\> | 用于填充数组的元素的初始化列表 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::initializer_list\<UnderlyingType\>) constructor


构造一个 [Array](../) 对象，并使用指定的包含 **[UnderlyingType](../underlyingtype/)** 类型元素的初始化列表中的值填充它。

```cpp
System::Array<T>::Array(std::initializer_list<UnderlyingType> init)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| init | std::initializer_list\<UnderlyingType\> | 用于填充数组的元素的初始化列表 |

## 另见

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::vector\<Q\>\&&) constructor


构造一个 [Array](../) 对象，并使用从 std::vector 对象移动的值填充它，该对象的值类型与 **T** 相同，但不同于 **[UnderlyingType](../underlyingtype/)**。

```cpp
template<typename Q,typename> System::Array<T>::Array(std::vector<Q> &&value)
```


| 参数 | 描述 |
| --- | --- |
| Q | 要从中移动元素的 std::vector 对象的元素类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | std::vector\<Q\>\&& | 用于复制值的 std::vector |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) constructor


填充构造函数。

```cpp
template<typename ValueType> System::Array<T>::Array(typename std::enable_if<std::is_arithmetic<T>::value &&std::is_arithmetic<ValueType>::value &&std::is_convertible<ValueType, T>::value, int>::type count, ValueType init)
```


| 参数 | 描述 |
| --- | --- |
| ValueType | 初始值的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| count | typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type | 数组的初始大小 |
| init | ValueType | 用于填充数组的初始值 |

## 另见

* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(vector_t\&&) constructor


移动构造函数。

```cpp
System::Array<T>::Array(vector_t &&value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | vector_t\&& | std::vector，其元素被数组获取 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
