---
title: "System::Reflection::PropertyInfo::PropertyInfo 构造函数"
linktitle: "PropertyInfo"
second_title: "Aspose.Page 适用于 C++"
description: "System::Reflection::PropertyInfo::PropertyInfo 构造函数。构造函数。属性在 C++ 中仅具有 const getter。"
type: docs
weight: 100
url: /zh/cpp/system.reflection/propertyinfo/propertyinfo/
---
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


构造函数。仅具有 const getter 的属性。

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parameter | 描述 |
| --- | --- |
| PropertyType | 属性的类型。 |
| ClassType | 属性所属类的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性名称。 |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | 获取器方法。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


构造函数。仅具有非 const getter 的属性。

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parameter | 描述 |
| --- | --- |
| PropertyType | 属性的类型。 |
| ClassType | 属性所属类的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性名称。 |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | 获取器方法。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)() const) constructor


从具有 const getter 的类构造布尔属性信息。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)() const)
```


| Parameter | 描述 |
| --- | --- |
| ClassType | 属性所属类的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性名称。 |
| set_prop_method | void(ClassType::*)(bool) | 设置器方法。 |
| get_prop_method | bool(ClassType::*)() const | 获取器方法。 |

## 另见

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)()) constructor


构造布尔属性信息。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)())
```


| Parameter | 描述 |
| --- | --- |
| ClassType | 属性所属类的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性名称。 |
| set_prop_method | void(ClassType::*)(bool) | 设置器方法。 |
| get_prop_method | bool(ClassType::*)() | 获取器方法。 |

## 另见

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) constructor


从具有 const getter 的类构造 int64_t 属性信息。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)() const)
```


| Parameter | 描述 |
| --- | --- |
| ClassType | 属性所属类的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性名称。 |
| set_prop_method | void(ClassType::*)(int64_t) | 设置器方法。 |
| get_prop_method | int64_t(ClassType::*)() const | 获取器方法。 |

## 另见

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) constructor


构造 int64_t 属性信息。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)())
```


| Parameter | 描述 |
| --- | --- |
| ClassType | 属性所属类的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性名称。 |
| set_prop_method | void(ClassType::*)(int64_t) | 设置器方法。 |
| get_prop_method | int64_t(ClassType::*)() | 获取器方法。 |

## 另见

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) constructor


从类构造具有 const getter 的 [Decimal](../../../system/decimal/) 属性信息。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)() const)
```


| Parameter | 描述 |
| --- | --- |
| ClassType | 属性所属类的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性名称。 |
| set_prop_method | void(ClassType::*)(System::Decimal) | 设置器方法。 |
| get_prop_method | System::Decimal(ClassType::*)() const | 获取器方法。 |

## 另见

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) constructor


构造 [Decimal](../../../system/decimal/) 属性信息。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)())
```


| Parameter | 描述 |
| --- | --- |
| ClassType | 属性所属类的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性名称。 |
| set_prop_method | void(ClassType::*)(System::Decimal) | 设置器方法。 |
| get_prop_method | System::Decimal(ClassType::*)() | 获取器方法。 |

## 另见

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) constructor


构造函数。仅具有 const getter 的 [Nullable](../../../system/nullable/) 属性。

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)() const)
```


| Parameter | 描述 |
| --- | --- |
| PropertyType | 属性的类型。 |
| ClassType | 属性所属类的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性名称。 |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | 设置器方法。 |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() const | 获取器方法。 |

## 另见

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) constructor


构造函数。具有 setter 和 getter 的 [Nullable](../../../system/nullable/) 属性。

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)())
```


| Parameter | 描述 |
| --- | --- |
| PropertyType | 属性的类型。 |
| ClassType | 属性所属类的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性名称。 |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | 设置器方法。 |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() | 获取器方法。 |

## 另见

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


构造函数。

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parameter | 描述 |
| --- | --- |
| PropertyType | 属性的类型。 |
| ClassType | 属性所属类的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性名称。 |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | 设置器方法。 |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | 获取器方法。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


构造函数。仅具有 getter 的 [Object](../../../system/object/) 属性。

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parameter | 描述 |
| --- | --- |
| PropertyType | 属性的类型。 |
| ClassType | 属性所属类的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性名称。 |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | 设置器方法。 |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | 获取器方法。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) constructor


从具有 const getter 的类构造字符串属性信息。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)() const)
```


| Parameter | 描述 |
| --- | --- |
| ClassType | 属性所属类的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性名称。 |
| set_prop_method | void(ClassType::*)(System::String) | 设置器方法。 |
| get_prop_method | System::String(ClassType::*)() const | 获取器方法。 |

## 另见

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) constructor


构造字符串属性信息。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)())
```


| Parameter | 描述 |
| --- | --- |
| ClassType | 属性所属类的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性名称。 |
| set_prop_method | void(ClassType::*)(System::String) | 设置器方法。 |
| get_prop_method | System::String(ClassType::*)() | 获取器方法。 |

## 另见

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
