---
title: "System::ObjectExt::ObjectToUnknown 方法"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Page 适用于 C++"
description: "System::ObjectExt::ObjectToUnknown 方法。将 Object 转换为未知类型，处理 C++ 中的智能指针类型和装箱值情况。"
type: docs
weight: 1200
url: /zh/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


将 [Object](../../object/) 转换为未知类型，处理智能指针类型和装箱值情况。

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | 描述 |
| --- | --- |
| T | 要将 [Object](../../object/) 转换成的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) 待转换。 |

### ReturnValue

解箱后的值或转换后的指针。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


将 [Object](../../object/) 转换为未知类型，处理智能指针类型和装箱值情况。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | 描述 |
| --- | --- |
| T | 要将 [Object](../../object/) 转换成的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) 待转换。 |

### ReturnValue

解箱后的值或转换后的指针。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
