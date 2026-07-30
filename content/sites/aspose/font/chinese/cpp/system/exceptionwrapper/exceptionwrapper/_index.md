---
title: "System::ExceptionWrapper::ExceptionWrapper 构造函数"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Font 适用于 C++"
description: "System::ExceptionWrapper::ExceptionWrapper 构造函数。该构造函数将参数转发给 Exception 类的构造函数，并在 C++ 中创建持有新 Exception 类实例的智能指针。"
type: docs
weight: 100
url: /zh/cpp/system/exceptionwrapper/exceptionwrapper/
---
## ExceptionWrapper::ExceptionWrapper(Args\&&...) constructor


将参数转发给 [Exception](../../exception/) 类构造函数并创建持有新 [Exception](../../exception/) 类实例的智能指针的构造函数。

```cpp
template<typename ...,typename> System::ExceptionWrapper<T>::ExceptionWrapper(Args &&...args)
```

## 另见

* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ExceptionWrapper::ExceptionWrapper(const ExceptionPtr\&) constructor


构造一个包含传入指针的 [ExceptionWrapper](../) 类实例。

```cpp
System::ExceptionWrapper<T>::ExceptionWrapper(const ExceptionPtr &ptr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ptr | const ExceptionPtr\& | 指向 [Exception](../../exception/) 类实例的智能指针。 |

## 另见

* Typedef [ExceptionPtr](../../exceptionptr/)
* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ExceptionWrapper::ExceptionWrapper(const ExceptionWrapper\&) constructor


拷贝构造函数。

```cpp
System::ExceptionWrapper<T>::ExceptionWrapper(const ExceptionWrapper &other)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 其他 | const ExceptionWrapper\& | 需要复制的包装类的另一个实例。 |

## 另见

* Class [ExceptionWrapper](../)
* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ExceptionWrapper::ExceptionWrapper(ExceptionWrapper\&&) constructor


移动构造函数。

```cpp
System::ExceptionWrapper<T>::ExceptionWrapper(ExceptionWrapper &&other) noexcept
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 其他 | ExceptionWrapper\&& | 需要被移动的包装类的另一个实例。 |

## 另见

* Class [ExceptionWrapper](../)
* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ExceptionWrapper::ExceptionWrapper(std::nullptr_t) constructor


构造一个不代表任何异常的 [ExceptionWrapper](../) 类的空实例。

```cpp
System::ExceptionWrapper<T>::ExceptionWrapper(std::nullptr_t)
```

## 另见

* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
