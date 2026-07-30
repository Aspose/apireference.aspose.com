---
title: "System::Ref 方法"
linktitle: "Ref"
second_title: "Aspose.Font 适用于 C++"
description: "System::Ref 方法。包装器，以确保 Ref(std::ref(DynamicWeakPtr)) 在 C++ 中工作。"
type: docs
weight: 36700
url: /zh/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


包装器，以确保 Ref(std::ref(DynamicWeakPtr)) 能工作。

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| 参数 | 描述 |
| --- | --- |
| T | 被引用的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 包装器 | const std::reference_wrapper\<T\>\& | std 包装器用于解包。 |

### ReturnValue

在 [System](../):: 中定义的引用类型，而不是在 std 中。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


创建对 [DynamicWeakPtr](../dynamicweakptr/) 对象的引用。翻译器在按引用传递函数参数时使用。

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| 参数 | 描述 |
| --- | --- |
| T | 被指向的类型。 |
| trunkMode | 智能指针本身的模式。 |
| weakLeafs | 必须调用 SetTemplateWeakPtr 方法的模板参数索引。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | 用于创建引用的智能指针。 |

### ReturnValue

智能指针引用。

## 另见

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Ref(T\&) method


获取对象引用的辅助函数。用于确保 [System::DynamicWeakPtr](../dynamicweakptr/) 在赋值后更新被引用的对象。

```cpp
template<typename T> T & System::Ref(T &value)
```


| 参数 | 描述 |
| --- | --- |
| T | 用于创建引用的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | T\& | 用于创建引用的值。 |

### ReturnValue

对传递给此函数的值的引用。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
