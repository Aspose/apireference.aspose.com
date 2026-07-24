---
title: "System::MakeSharedPtr 方法"
linktitle: "MakeSharedPtr"
second_title: "Aspose.Page 适用于 C++"
description: "System::MakeSharedPtr 方法。将原始指针转换为智能指针。针对 const 指针的重载。当在 C# 方法中使用 ''this'' 变量并在 C++ 中被翻译为 const 时非常有用。"
type: docs
weight: 24800
url: /zh/cpp/system/makesharedptr/
---
## System::MakeSharedPtr(const X *) method


将原始指针转换为智能指针。针对 const 指针的重载。当在 C# 方法中使用 'this' 变量并在 C++ 中被翻译为 const 时非常有用。

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(const X *p)
```


| Parameter | 描述 |
| --- | --- |
| X | 指向的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| p | const X * | 指向对象的原始指针。 |

### ReturnValue

指向对象的共享智能指针。

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeSharedPtr(X *) method


将原始指针转换为智能指针。

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(X *p)
```


| Parameter | 描述 |
| --- | --- |
| X | 指向的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| p | X * | 指向对象的原始指针。 |

### ReturnValue

指向对象的共享智能指针。

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
