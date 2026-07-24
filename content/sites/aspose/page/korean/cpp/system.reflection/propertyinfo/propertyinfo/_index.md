---
title: "System::Reflection::PropertyInfo::PropertyInfo 생성자"
linktitle: "PropertyInfo"
second_title: "C++용 Aspose.Page"
description: "System::Reflection::PropertyInfo::PropertyInfo 생성자. 생성자. C++에서 const getter만 있는 속성."
type: docs
weight: 100
url: /ko/cpp/system.reflection/propertyinfo/propertyinfo/
---
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


생성자. const getter만 있는 속성.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| 매개변수 | 설명 |
| --- | --- |
| PropertyType | 속성의 타입. |
| ClassType | 속성이 속한 클래스의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성 이름. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Getter 메서드. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


생성자. non-const getter만 있는 속성.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| 매개변수 | 설명 |
| --- | --- |
| PropertyType | 속성의 타입. |
| ClassType | 속성이 속한 클래스의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성 이름. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Getter 메서드. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)() const) constructor


const getter가 있는 클래스에서 부울 속성 정보를 구성합니다.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)() const)
```


| 매개변수 | 설명 |
| --- | --- |
| ClassType | 속성이 속한 클래스의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성 이름. |
| set_prop_method | void(ClassType::*)(bool) | Setter 메서드. |
| get_prop_method | bool(ClassType::*)() const | Getter 메서드. |

## 또 보기

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)()) constructor


부울 속성 정보를 구성합니다.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)())
```


| 매개변수 | 설명 |
| --- | --- |
| ClassType | 속성이 속한 클래스의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성 이름. |
| set_prop_method | void(ClassType::*)(bool) | Setter 메서드. |
| get_prop_method | bool(ClassType::*)() | Getter 메서드. |

## 또 보기

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) constructor


const getter가 있는 클래스에서 int64_t 속성 정보를 구성합니다.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)() const)
```


| 매개변수 | 설명 |
| --- | --- |
| ClassType | 속성이 속한 클래스의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성 이름. |
| set_prop_method | void(ClassType::*)(int64_t) | Setter 메서드. |
| get_prop_method | int64_t(ClassType::*)() const | Getter 메서드. |

## 또 보기

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) constructor


int64_t 속성 정보를 구성합니다.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)())
```


| 매개변수 | 설명 |
| --- | --- |
| ClassType | 속성이 속한 클래스의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성 이름. |
| set_prop_method | void(ClassType::*)(int64_t) | Setter 메서드. |
| get_prop_method | int64_t(ClassType::*)() | Getter 메서드. |

## 또 보기

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) constructor


클래스에서 const getter를 사용하여 [Decimal](../../../system/decimal/) 속성 정보를 생성합니다.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)() const)
```


| 매개변수 | 설명 |
| --- | --- |
| ClassType | 속성이 속한 클래스의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성 이름. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Setter 메서드. |
| get_prop_method | System::Decimal(ClassType::*)() const | Getter 메서드. |

## 또 보기

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) constructor


[Decimal](../../../system/decimal/) 속성 정보를 생성합니다.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)())
```


| 매개변수 | 설명 |
| --- | --- |
| ClassType | 속성이 속한 클래스의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성 이름. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Setter 메서드. |
| get_prop_method | System::Decimal(ClassType::*)() | Getter 메서드. |

## 또 보기

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) constructor


생성자. const getter만 있는 [Nullable](../../../system/nullable/) 속성.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)() const)
```


| 매개변수 | 설명 |
| --- | --- |
| PropertyType | 속성의 타입. |
| ClassType | 속성이 속한 클래스의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성 이름. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Setter 메서드. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() const | Getter 메서드. |

## 또 보기

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) constructor


생성자. setter와 getter가 있는 [Nullable](../../../system/nullable/) 속성.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)())
```


| 매개변수 | 설명 |
| --- | --- |
| PropertyType | 속성의 타입. |
| ClassType | 속성이 속한 클래스의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성 이름. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Setter 메서드. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() | Getter 메서드. |

## 또 보기

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


생성자.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| 매개변수 | 설명 |
| --- | --- |
| PropertyType | 속성의 타입. |
| ClassType | 속성이 속한 클래스의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성 이름. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Setter 메서드. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Getter 메서드. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


생성자. getter만 있는 [Object](../../../system/object/) 속성.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| 매개변수 | 설명 |
| --- | --- |
| PropertyType | 속성의 타입. |
| ClassType | 속성이 속한 클래스의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성 이름. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Setter 메서드. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Getter 메서드. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) constructor


const getter가 있는 클래스에서 문자열 속성 정보를 구성합니다.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)() const)
```


| 매개변수 | 설명 |
| --- | --- |
| ClassType | 속성이 속한 클래스의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성 이름. |
| set_prop_method | void(ClassType::*)(System::String) | Setter 메서드. |
| get_prop_method | System::String(ClassType::*)() const | Getter 메서드. |

## 또 보기

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) constructor


문자열 속성 정보를 구성합니다.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)())
```


| 매개변수 | 설명 |
| --- | --- |
| ClassType | 속성이 속한 클래스의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 속성 이름. |
| set_prop_method | void(ClassType::*)(System::String) | Setter 메서드. |
| get_prop_method | System::String(ClassType::*)() | Getter 메서드. |

## 또 보기

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
