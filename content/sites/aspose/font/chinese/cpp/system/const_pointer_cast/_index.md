---
title: "System::const_pointer_cast 方法"
linktitle: "const_pointer_cast"
second_title: "Aspose.Font 适用于 C++"
description: "System::const_pointer_cast 方法。使用 C++ 中的 const_cast 对智能指针进行转换。"
type: docs
weight: 16100
url: /zh/cpp/system/const_pointer_cast/
---
## System::const_pointer_cast method


使用 const_cast 对智能指针进行转换。

```cpp
template<class Y,class X> SmartPtr<Y> System::const_pointer_cast(SmartPtr<X> const &x)
```


| 参数 | 描述 |
| --- | --- |
| X | 源指针所指对象的类型。 |
| Y | 目标指针所指对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | SmartPtr\<X\> const\& | 源指针。 |

### ReturnValue

转换后的指针。

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
