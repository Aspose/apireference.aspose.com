---
title: "System::Reflection::PropertyInfo::PropertyInfo منشئ"
linktitle: "PropertyInfo"
second_title: "Aspose.Page لـ C++"
description: "System::Reflection::PropertyInfo::PropertyInfo منشئ. منشئ. خاصية ذات مُستخرج ثابت فقط في C++."
type: docs
weight: 100
url: /ar/cpp/system.reflection/propertyinfo/propertyinfo/
---
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


منشئ. خاصية ذات مُستخرج ثابت فقط.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parameter | الوصف |
| --- | --- |
| PropertyType | نوع الخاصية. |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


منشئ. خاصية ذات مُستخرج غير ثابت فقط.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parameter | الوصف |
| --- | --- |
| PropertyType | نوع الخاصية. |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)() const) constructor


يبني معلومات الخاصية المنطقية من الفئة ذات المستخرج الثابت.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)() const)
```


| Parameter | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(bool) | طريقة الضبط. |
| get_prop_method | bool(ClassType::*)() const | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)()) constructor


يبني معلومات الخاصية المنطقية.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)())
```


| Parameter | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(bool) | طريقة الضبط. |
| get_prop_method | bool(ClassType::*)() | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) constructor


يبني معلومات الخاصية int64_t من الفئة ذات المستخرج الثابت.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)() const)
```


| Parameter | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(int64_t) | طريقة الضبط. |
| get_prop_method | int64_t(ClassType::*)() const | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) constructor


يبني معلومات الخاصية int64_t.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)())
```


| Parameter | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(int64_t) | طريقة الضبط. |
| get_prop_method | int64_t(ClassType::*)() | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) constructor


يبني معلومات الخاصية [Decimal](../../../system/decimal/) من الفئة مع getter ثابت.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)() const)
```


| Parameter | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::Decimal) | طريقة الضبط. |
| get_prop_method | System::Decimal(ClassType::*)() const | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) constructor


يبني معلومات الخاصية [Decimal](../../../system/decimal/).

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)())
```


| Parameter | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::Decimal) | طريقة الضبط. |
| get_prop_method | System::Decimal(ClassType::*)() | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) constructor


منشئ. خاصية [Nullable](../../../system/nullable/) مع getter ثابت فقط.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)() const)
```


| Parameter | الوصف |
| --- | --- |
| PropertyType | نوع الخاصية. |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | طريقة الضبط. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() const | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) constructor


منشئ. خاصية [Nullable](../../../system/nullable/) مع setter و getter.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)())
```


| Parameter | الوصف |
| --- | --- |
| PropertyType | نوع الخاصية. |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | طريقة الضبط. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


منشئ.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parameter | الوصف |
| --- | --- |
| PropertyType | نوع الخاصية. |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | طريقة الضبط. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


منشئ. خاصية [Object](../../../system/object/) مع getter فقط.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parameter | الوصف |
| --- | --- |
| PropertyType | نوع الخاصية. |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | طريقة الضبط. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) constructor


يبني معلومات خاصية السلسلة من فئة ذات مُستخرج ثابت.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)() const)
```


| Parameter | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::String) | طريقة الضبط. |
| get_prop_method | System::String(ClassType::*)() const | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) constructor


يبني معلومات خاصية السلسلة.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)())
```


| Parameter | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::String) | طريقة الضبط. |
| get_prop_method | System::String(ClassType::*)() | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
