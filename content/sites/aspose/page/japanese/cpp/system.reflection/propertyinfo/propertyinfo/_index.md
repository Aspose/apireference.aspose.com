---
title: "System::Reflection::PropertyInfo::PropertyInfo コンストラクタ"
linktitle: "PropertyInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Reflection::PropertyInfo::PropertyInfo コンストラクタ。コンストラクタ。C++ で const ゲッタのみを持つプロパティです。"
type: docs
weight: 100
url: /ja/cpp/system.reflection/propertyinfo/propertyinfo/
---
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


コンストラクタ。const getter のみを持つプロパティ。

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| パラメーター | 説明 |
| --- | --- |
| PropertyType | プロパティの型。 |
| ClassType | プロパティが属するクラスの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | プロパティ名。 |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | ゲッターメソッド。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


コンストラクタ。非 const getter のみを持つプロパティ。

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| パラメーター | 説明 |
| --- | --- |
| PropertyType | プロパティの型。 |
| ClassType | プロパティが属するクラスの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | プロパティ名。 |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | ゲッターメソッド。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)() const) constructor


const getter を持つクラスからブール型プロパティ情報を構築します。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)() const)
```


| パラメーター | 説明 |
| --- | --- |
| ClassType | プロパティが属するクラスの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | プロパティ名。 |
| set_prop_method | void(ClassType::*)(bool) | セッターメソッド。 |
| get_prop_method | bool(ClassType::*)() const | ゲッターメソッド。 |

## 参照

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)()) constructor


ブール型プロパティ情報を構築します。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)())
```


| パラメーター | 説明 |
| --- | --- |
| ClassType | プロパティが属するクラスの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | プロパティ名。 |
| set_prop_method | void(ClassType::*)(bool) | セッターメソッド。 |
| get_prop_method | bool(ClassType::*)() | ゲッターメソッド。 |

## 参照

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) constructor


const getter を持つクラスから int64_t プロパティ情報を構築します。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)() const)
```


| パラメーター | 説明 |
| --- | --- |
| ClassType | プロパティが属するクラスの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | プロパティ名。 |
| set_prop_method | void(ClassType::*)(int64_t) | セッターメソッド。 |
| get_prop_method | int64_t(ClassType::*)() const | ゲッターメソッド。 |

## 参照

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) constructor


int64_t プロパティ情報を構築します。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)())
```


| パラメーター | 説明 |
| --- | --- |
| ClassType | プロパティが属するクラスの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | プロパティ名。 |
| set_prop_method | void(ClassType::*)(int64_t) | セッターメソッド。 |
| get_prop_method | int64_t(ClassType::*)() | ゲッターメソッド。 |

## 参照

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) constructor


クラスから const getter を持つ [Decimal](../../../system/decimal/) プロパティ情報を構築します。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)() const)
```


| パラメーター | 説明 |
| --- | --- |
| ClassType | プロパティが属するクラスの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | プロパティ名。 |
| set_prop_method | void(ClassType::*)(System::Decimal) | セッターメソッド。 |
| get_prop_method | System::Decimal(ClassType::*)() const | ゲッターメソッド。 |

## 参照

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) constructor


[Decimal](../../../system/decimal/) プロパティ情報を構築します。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)())
```


| パラメーター | 説明 |
| --- | --- |
| ClassType | プロパティが属するクラスの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | プロパティ名。 |
| set_prop_method | void(ClassType::*)(System::Decimal) | セッターメソッド。 |
| get_prop_method | System::Decimal(ClassType::*)() | ゲッターメソッド。 |

## 参照

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) constructor


コンストラクタ。 const getter のみを持つ [Nullable](../../../system/nullable/) プロパティ。

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)() const)
```


| パラメーター | 説明 |
| --- | --- |
| PropertyType | プロパティの型。 |
| ClassType | プロパティが属するクラスの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | プロパティ名。 |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | セッターメソッド。 |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() const | ゲッターメソッド。 |

## 参照

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) constructor


コンストラクタ。 setter と getter を持つ [Nullable](../../../system/nullable/) プロパティ。

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)())
```


| パラメーター | 説明 |
| --- | --- |
| PropertyType | プロパティの型。 |
| ClassType | プロパティが属するクラスの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | プロパティ名。 |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | セッターメソッド。 |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() | ゲッターメソッド。 |

## 参照

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


コンストラクタ。

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| パラメーター | 説明 |
| --- | --- |
| PropertyType | プロパティの型。 |
| ClassType | プロパティが属するクラスの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | プロパティ名。 |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | セッターメソッド。 |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | ゲッターメソッド。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


コンストラクタ。 getter のみを持つ [Object](../../../system/object/) プロパティ。

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| パラメーター | 説明 |
| --- | --- |
| PropertyType | プロパティの型。 |
| ClassType | プロパティが属するクラスの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | プロパティ名。 |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | セッターメソッド。 |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | ゲッターメソッド。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) constructor


const getter を持つクラスから文字列プロパティ情報を構築します。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)() const)
```


| パラメーター | 説明 |
| --- | --- |
| ClassType | プロパティが属するクラスの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | プロパティ名。 |
| set_prop_method | void(ClassType::*)(System::String) | セッターメソッド。 |
| get_prop_method | System::String(ClassType::*)() const | ゲッターメソッド。 |

## 参照

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) constructor


文字列プロパティ情報を構築します。

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)())
```


| パラメーター | 説明 |
| --- | --- |
| ClassType | プロパティが属するクラスの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | プロパティ名。 |
| set_prop_method | void(ClassType::*)(System::String) | セッターメソッド。 |
| get_prop_method | System::String(ClassType::*)() | ゲッターメソッド。 |

## 参照

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
