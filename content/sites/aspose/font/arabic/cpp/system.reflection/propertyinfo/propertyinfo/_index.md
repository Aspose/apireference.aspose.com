---
title: "System::Reflection::PropertyInfo::PropertyInfo مُنشئ"
linktitle: "PropertyInfo"
second_title: "Aspose.Font لـ C++"
description: "System::Reflection::PropertyInfo::PropertyInfo مُنشئ. المُنشئ. خاصية ذات مُستخرج ثابت فقط في C++."
type: docs
weight: 100
url: /ar/cpp/system.reflection/propertyinfo/propertyinfo/
---
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


منشئ. خاصية ذات getter ثابت فقط.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| معامل | الوصف |
| --- | --- |
| PropertyType | نوع الخاصية. |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


منشئ. خاصية ذات getter غير ثابت فقط.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| معامل | الوصف |
| --- | --- |
| PropertyType | نوع الخاصية. |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)() const) constructor


يبني معلومات خاصية منطقية من الفئة باستخدام getter ثابت.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)() const)
```


| معامل | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(bool) | طريقة الضبط. |
| get_prop_method | bool(ClassType::*)() const | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)()) constructor


يبني معلومات خاصية منطقية.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)())
```


| معامل | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(bool) | طريقة الضبط. |
| get_prop_method | bool(ClassType::*)() | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) constructor


يبني معلومات خاصية int64_t من الفئة باستخدام getter ثابت.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)() const)
```


| معامل | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(int64_t) | طريقة الضبط. |
| get_prop_method | int64_t(ClassType::*)() const | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) constructor


يبني معلومات خاصية int64_t.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)())
```


| معامل | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(int64_t) | طريقة الضبط. |
| get_prop_method | int64_t(ClassType::*)() | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) constructor


يبني معلومات خاصية [Decimal](../../../system/decimal/) من الفئة مع مُستخرج ثابت.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)() const)
```


| معامل | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::Decimal) | طريقة الضبط. |
| get_prop_method | System::Decimal(ClassType::*)() const | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) constructor


يبني معلومات خاصية [Decimal](../../../system/decimal/).

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)())
```


| معامل | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::Decimal) | طريقة الضبط. |
| get_prop_method | System::Decimal(ClassType::*)() | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) constructor


منشئ. خاصية [Nullable](../../../system/nullable/) مع مُستخرج ثابت فقط.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)() const)
```


| معامل | الوصف |
| --- | --- |
| PropertyType | نوع الخاصية. |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | طريقة الضبط. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() const | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) constructor


منشئ. خاصية [Nullable](../../../system/nullable/) مع مُحدد ومُستخرج.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)())
```


| معامل | الوصف |
| --- | --- |
| PropertyType | نوع الخاصية. |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | طريقة الضبط. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


المُنشئ.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| معامل | الوصف |
| --- | --- |
| PropertyType | نوع الخاصية. |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | طريقة الضبط. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


منشئ. خاصية [Object](../../../system/object/) مع مُستخرج فقط.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| معامل | الوصف |
| --- | --- |
| PropertyType | نوع الخاصية. |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | طريقة الضبط. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) constructor


يبني معلومات خاصية السلسلة من فئة ذات getter ثابت.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)() const)
```


| معامل | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::String) | طريقة الضبط. |
| get_prop_method | System::String(ClassType::*)() const | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) constructor


يبني معلومات خاصية السلسلة.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)())
```


| معامل | الوصف |
| --- | --- |
| ClassType | نوع الفئة التي تنتمي إليها الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية. |
| set_prop_method | void(ClassType::*)(System::String) | طريقة الضبط. |
| get_prop_method | System::String(ClassType::*)() | طريقة المستخرج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
