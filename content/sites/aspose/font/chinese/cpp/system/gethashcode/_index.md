---
title: "System::GetHashCode 方法"
linktitle: "获取哈希码"
second_title: "Aspose.Font 适用于 C++"
description: "System::GetHashCode 方法。 对 std::thread::id 的特化；在 C++ 中返回指定线程对象的哈希码。"
type: docs
weight: 21300
url: /zh/cpp/system/gethashcode/
---
## System::GetHashCode(const std::thread::id\&) method


对 std::thread::id 的特化；返回指定线程对象的哈希码。

```cpp
int System::GetHashCode(const std::thread::id &id)
```

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


返回指定标量值的哈希码。

```cpp
template<typename T> std::enable_if<std::is_scalar<T>::value, int>::type System::GetHashCode(const T &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 函数生成哈希码的值的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const T\& | 用于生成哈希码的值 |

### ReturnValue

为指定值生成的哈希码

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


返回指定对象的哈希码。

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&System::IsSmartPtr<T>::value, int>::type System::GetHashCode(const T &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 函数为其生成哈希码的对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const T\& | 指向用于生成哈希码的对象的 [SmartPtr](../smartptr/) |

### ReturnValue

为指定对象生成的哈希码

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


返回指定异常对象的哈希码。

```cpp
template<typename T> std::enable_if<System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 函数为其生成哈希码的对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const T\& | 包含用于生成哈希码的对象的 [Exception](../exception/) 包装器 |

### ReturnValue

为指定对象生成的哈希码

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


返回指定对象（既不是智能指针也不是异常）的哈希码。

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&!System::IsSmartPtr<T>::value &&!System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 函数为其生成哈希码的对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const T\& | 用于生成哈希码的对象的 const 引用 |

### ReturnValue

为指定对象生成的哈希码

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
