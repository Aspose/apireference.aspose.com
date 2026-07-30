---
title: "System::MakeSharedPtr method"
linktitle: "MakeSharedPtr"
second_title: "Aspose.Font 适用于 C++"
description: "System::MakeSharedPtr method. 将原始指针转换为智能指针。针对 const 指针的重载。例如在 C# 方法中使用 ''this'' 变量并在 C++ 中被翻译为 const 时，这非常有用。"
type: docs
weight: 24900
url: /zh/cpp/system/makesharedptr/
---
## System::MakeSharedPtr(const X *) method


将原始指针转换为智能指针。针对 const 指针的重载。例如在 C# 方法中使用 'this' 变量并在 C++ 中被翻译为 const 时，这非常有用。

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(const X *p)
```


| 参数 | 描述 |
| --- | --- |
| X | 被指向的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| p | const X * | 指向对象的原始指针。 |

### ReturnValue

指向对象的共享智能指针。

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeSharedPtr(X *) method


将原始指针转换为智能指针。

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(X *p)
```


| 参数 | 描述 |
| --- | --- |
| X | 被指向的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| p | X * | 指向对象的原始指针。 |

### ReturnValue

指向对象的共享智能指针。

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
