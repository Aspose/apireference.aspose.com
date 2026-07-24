---
title: "System::Reflection::PropertyInfo::GetValue 方法"
linktitle: "GetValue"
second_title: "Aspose.Page 适用于 C++"
description: "System::Reflection::PropertyInfo::GetValue 方法。获取 C++ 中特定对象的属性值。"
type: docs
weight: 400
url: /zh/cpp/system.reflection/propertyinfo/getvalue/
---
## PropertyInfo::GetValue(System::SharedPtr\<System::Object\>) method


从特定对象获取属性值。

```cpp
System::SharedPtr<System::Object> System::Reflection::PropertyInfo::GetValue(System::SharedPtr<System::Object> obj)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | System::SharedPtr\<System::Object\> | [Object](../../../system/object/) 用于读取属性的对象。 |

### ReturnValue

指定对象的指定属性的值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::GetValue(System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) method


从特定对象获取属性值。

```cpp
System::SharedPtr<System::Object> System::Reflection::PropertyInfo::GetValue(System::SharedPtr<System::Object> obj, System::ArrayPtr<System::SharedPtr<System::Object>> indexer)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | System::SharedPtr\<System::Object\> | [Object](../../../system/object/) 用于读取属性的对象。 |
| 索引器 | System::ArrayPtr\<System::SharedPtr\<System::Object\>\> | 这些是索引属性的可选索引值。对于非索引属性，此值应为 null。 |

### ReturnValue

指定对象的指定属性的值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
