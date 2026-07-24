---
title: "System::Reflection::PropertyInfo::PropertyInfo कन्स्ट्रक्टर"
linktitle: "PropertyInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Reflection::PropertyInfo::PropertyInfo कन्स्ट्रक्टर। कन्स्ट्रक्टर। C++ में केवल const गेटर वाली प्रॉपर्टी।"
type: docs
weight: 100
url: /hi/cpp/system.reflection/propertyinfo/propertyinfo/
---
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


कंस्ट्रक्टर। केवल const गेटर वाली प्रॉपर्टी।

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| पैरामीटर | विवरण |
| --- | --- |
| PropertyType | प्रॉपर्टी का प्रकार। |
| ClassType | उस क्लास का प्रकार जिससे प्रॉपर्टी संबंधित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रॉपर्टी नाम। |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | गेटर मेथड। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


कंस्ट्रक्टर। केवल non-const गेटर वाली प्रॉपर्टी।

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| पैरामीटर | विवरण |
| --- | --- |
| PropertyType | प्रॉपर्टी का प्रकार। |
| ClassType | उस क्लास का प्रकार जिससे प्रॉपर्टी संबंधित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रॉपर्टी नाम। |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | गेटर मेथड। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)() const) constructor


कॉनस्ट गेटर वाले क्लास से बूलियन प्रॉपर्टी जानकारी बनाता है।

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)() const)
```


| पैरामीटर | विवरण |
| --- | --- |
| ClassType | उस क्लास का प्रकार जिससे प्रॉपर्टी संबंधित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रॉपर्टी नाम। |
| set_prop_method | void(ClassType::*)(bool) | सेटर मेथड। |
| get_prop_method | bool(ClassType::*)() const | गेटर मेथड। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)()) constructor


बूलियन प्रॉपर्टी जानकारी बनाता है।

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)())
```


| पैरामीटर | विवरण |
| --- | --- |
| ClassType | उस क्लास का प्रकार जिससे प्रॉपर्टी संबंधित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रॉपर्टी नाम। |
| set_prop_method | void(ClassType::*)(bool) | सेटर मेथड। |
| get_prop_method | bool(ClassType::*)() | गेटर मेथड। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) constructor


कॉनस्ट गेटर वाले क्लास से int64_t प्रॉपर्टी जानकारी बनाता है।

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)() const)
```


| पैरामीटर | विवरण |
| --- | --- |
| ClassType | उस क्लास का प्रकार जिससे प्रॉपर्टी संबंधित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रॉपर्टी नाम। |
| set_prop_method | void(ClassType::*)(int64_t) | सेटर मेथड। |
| get_prop_method | int64_t(ClassType::*)() const | गेटर मेथड। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) constructor


int64_t प्रॉपर्टी जानकारी बनाता है।

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)())
```


| पैरामीटर | विवरण |
| --- | --- |
| ClassType | उस क्लास का प्रकार जिससे प्रॉपर्टी संबंधित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रॉपर्टी नाम। |
| set_prop_method | void(ClassType::*)(int64_t) | सेटर मेथड। |
| get_prop_method | int64_t(ClassType::*)() | गेटर मेथड। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) constructor


क्लास से const गेटर के साथ [Decimal](../../../system/decimal/) प्रॉपर्टी जानकारी निर्माण करता है।

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)() const)
```


| पैरामीटर | विवरण |
| --- | --- |
| ClassType | उस क्लास का प्रकार जिससे प्रॉपर्टी संबंधित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रॉपर्टी नाम। |
| set_prop_method | void(ClassType::*)(System::Decimal) | सेटर मेथड। |
| get_prop_method | System::Decimal(ClassType::*)() const | गेटर मेथड। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) constructor


[Decimal](../../../system/decimal/) प्रॉपर्टी जानकारी निर्माण करता है।

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)())
```


| पैरामीटर | विवरण |
| --- | --- |
| ClassType | उस क्लास का प्रकार जिससे प्रॉपर्टी संबंधित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रॉपर्टी नाम। |
| set_prop_method | void(ClassType::*)(System::Decimal) | सेटर मेथड। |
| get_prop_method | System::Decimal(ClassType::*)() | गेटर मेथड। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) constructor


कंस्ट्रक्टर। केवल const गेटर वाला [Nullable](../../../system/nullable/) प्रॉपर्टी।

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)() const)
```


| पैरामीटर | विवरण |
| --- | --- |
| PropertyType | प्रॉपर्टी का प्रकार। |
| ClassType | उस क्लास का प्रकार जिससे प्रॉपर्टी संबंधित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रॉपर्टी नाम। |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | सेटर मेथड। |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() const | गेटर मेथड। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) constructor


कंस्ट्रक्टर। सेट्टर और गेटर वाला [Nullable](../../../system/nullable/) प्रॉपर्टी।

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)())
```


| पैरामीटर | विवरण |
| --- | --- |
| PropertyType | प्रॉपर्टी का प्रकार। |
| ClassType | उस क्लास का प्रकार जिससे प्रॉपर्टी संबंधित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रॉपर्टी नाम। |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | सेटर मेथड। |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() | गेटर मेथड। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


निर्माता।

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| पैरामीटर | विवरण |
| --- | --- |
| PropertyType | प्रॉपर्टी का प्रकार। |
| ClassType | उस क्लास का प्रकार जिससे प्रॉपर्टी संबंधित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रॉपर्टी नाम। |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | सेटर मेथड। |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | गेटर मेथड। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


कंस्ट्रक्टर। केवल गेटर वाला [Object](../../../system/object/) प्रॉपर्टी।

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| पैरामीटर | विवरण |
| --- | --- |
| PropertyType | प्रॉपर्टी का प्रकार। |
| ClassType | उस क्लास का प्रकार जिससे प्रॉपर्टी संबंधित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रॉपर्टी नाम। |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | सेटर मेथड। |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | गेटर मेथड। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) constructor


const गेटर वाली क्लास से स्ट्रिंग प्रॉपर्टी जानकारी बनाता है।

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)() const)
```


| पैरामीटर | विवरण |
| --- | --- |
| ClassType | उस क्लास का प्रकार जिससे प्रॉपर्टी संबंधित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रॉपर्टी नाम। |
| set_prop_method | void(ClassType::*)(System::String) | सेटर मेथड। |
| get_prop_method | System::String(ClassType::*)() const | गेटर मेथड। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) constructor


स्ट्रिंग प्रॉपर्टी जानकारी बनाता है।

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)())
```


| पैरामीटर | विवरण |
| --- | --- |
| ClassType | उस क्लास का प्रकार जिससे प्रॉपर्टी संबंधित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रॉपर्टी नाम। |
| set_prop_method | void(ClassType::*)(System::String) | सेटर मेथड। |
| get_prop_method | System::String(ClassType::*)() | गेटर मेथड। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
