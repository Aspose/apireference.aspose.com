---
title: "System::ObjectExt::UnknownToObject 方法"
linktitle: "UnknownToObject"
second_title: "Aspose.Page 适用于 C++"
description: "System::ObjectExt::UnknownToObject 方法。将未知类型转换为 Object，处理 C++ 中智能指针类型和值类型的情况。"
type: docs
weight: 1800
url: /zh/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


将未知类型转换为 [Object](../../object/)，处理智能指针类型和数值类型的情况。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| Parameter | 描述 |
| --- | --- |
| T | 要转换为 [Object](../../object/) 的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) 待转换。 |

### ReturnValue

指向 [Object](../../object/) 的智能指针，可为已转换的指针或装箱值。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownToObject(T) method


将未知类型转换为 [Object](../../object/)，处理智能指针类型和数值类型的情况。

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| Parameter | 描述 |
| --- | --- |
| T | 要转换为 [Object](../../object/) 的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | T | [Object](../../object/) 待转换。 |

### ReturnValue

指向 [Object](../../object/) 的智能指针，可为已转换的指针或装箱值。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
