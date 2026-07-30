---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::MulticastDelegate 方法"
linktitle: "MulticastDelegate"
second_title: "Aspose.Font 适用于 C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::MulticastDelegate 方法。构造一个空集合（在 C++ 中）。"
type: docs
weight: 100
url: /zh/cpp/system/multicastdelegate_returntype(argumenttypes...)_/multicastdelegate/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::MulticastDelegate() method


构造一个空集合。

```cpp
System::MulticastDelegate<ReturnType(ArgumentTypes...)>::MulticastDelegate()
```

## 另见

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::MulticastDelegate(Callback\&&) method


构造一个实例并将指定的委托放入委托集合。

```cpp
System::MulticastDelegate<ReturnType(ArgumentTypes...)>::MulticastDelegate(Callback &&initial)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 初始 | Callback\\&& | 要放入委托集合的委托 |

## 另见

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::MulticastDelegate(const MulticastDelegate\&) method


对委托集合执行浅拷贝。

```cpp
System::MulticastDelegate<ReturnType(ArgumentTypes...)>::MulticastDelegate(const MulticastDelegate &o)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| o | const MulticastDelegate\& | 用于复制委托集合的 MulticastDelegate 类实例。 |

## 另见

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::MulticastDelegate(MulticastDelegate\&&) method


移动构造函数。

```cpp
System::MulticastDelegate<ReturnType(ArgumentTypes...)>::MulticastDelegate(MulticastDelegate &&o) noexcept
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| o | MulticastDelegate\&& | 用于移动委托集合的 MulticastDelegate 类实例。 |

## 另见

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::MulticastDelegate(std::function\<ReturnType(ArgumentTypes...)>) method


构造一个实例并将指定的值放入委托集合。

```cpp
System::MulticastDelegate<ReturnType(ArgumentTypes...)>::MulticastDelegate(std::function<ReturnType(ArgumentTypes...)> arg)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg | std::function\\<ReturnType(ArgumentTypes...)> | 要放入委托集合的值 |

## 另见

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::MulticastDelegate(std::nullptr_t) method


等同于默认构造函数。

```cpp
System::MulticastDelegate<ReturnType(ArgumentTypes...)>::MulticastDelegate(std::nullptr_t)
```

## 另见

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::MulticastDelegate(T) method


构造一个实例并将指定的值放入委托集合。

```cpp
template<class T,typename> System::MulticastDelegate<ReturnType(ArgumentTypes...)>::MulticastDelegate(T arg)
```


| 参数 | 描述 |
| --- | --- |
| T | 新构造实例的委托集合中要放入的值的类型；该类型必须能够转换为 [Callback](../callback/) 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg | T | 要放入委托集合的值 |

## 另见

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
