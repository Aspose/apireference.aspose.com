---
title: "System::ObjectType::GetType 方法"
linktitle: "GetType"
second_title: "Aspose.Font 适用于 C++"
description: "System::ObjectType::GetType 方法。实现 typeof() 的翻译。针对 C++ 中原始类型的重载。"
type: docs
weight: 100
url: /zh/cpp/system/objecttype/gettype/
---
## ObjectType::GetType() method


实现 typeof() 翻译。针对原始类型的重载。

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value &&!std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| 参数 | 描述 |
| --- | --- |
| T | 原始类型。 |

### ReturnValue

对描述指定类型的 [TypeInfo](../../typeinfo/) 结构的 const 引用。

## 另见

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


实现 typeof() 翻译。针对枚举类型的重载。

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| 参数 | 描述 |
| --- | --- |
| T | 原始类型。 |

### ReturnValue

对描述指定类型的 [TypeInfo](../../typeinfo/) 结构的 const 引用。

## 另见

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


实现 typeof() 翻译。针对结构体和指针的重载。

```cpp
template<typename T> static std::enable_if<(!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsBoxable<T>::value)||IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| 参数 | 描述 |
| --- | --- |
| T | 原始类型。 |

### ReturnValue

对描述指定结构的 [TypeInfo](../../typeinfo/) 结构的 const 引用。

## 另见

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


实现 typeof() 的翻译。针对 [Nullable](../../nullable/) 的重载。

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| 参数 | 描述 |
| --- | --- |
| T | [Nullable](../../nullable/) 类型。 |

### ReturnValue

对描述指定结构的 [TypeInfo](../../typeinfo/) 结构的 const 引用。

## 另见

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


实现 typeof() 翻译。针对 MutlicastDelegate 的重载。

```cpp
template<typename T> static std::enable_if<detail::is_a<T, MulticastDelegate>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| 参数 | 描述 |
| --- | --- |
| T | MutlicastDelegate 类型。 |

### ReturnValue

对描述指定结构的 [TypeInfo](../../typeinfo/) 结构的 const 引用。

## 另见

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


实现 typeof() 翻译。针对结构体和指针的重载。

```cpp
template<typename T> static std::enable_if<!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&IsBoxable<T>::value &&!detail::is_a<T, MulticastDelegate>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| 参数 | 描述 |
| --- | --- |
| T | 原始类型。 |

### ReturnValue

对描述指定结构的 [TypeInfo](../../typeinfo/) 结构的 const 引用，或在针对 [SmartPtr](../../smartptr/) 时的指向类型。

## 另见

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


实现 typeof() 翻译。针对 uint8_t 的重载。

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 另见

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


实现 typeof() 的翻译。针对 char16_t 的重载。

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 另见

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


实现 typeof() 的翻译。针对 int32_t 的重载。

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 另见

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


实现 typeof() 的翻译。针对 int64_t 的重载。

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 另见

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


实现 typeof() 的翻译。针对 bool 的重载。

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 另见

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


实现 typeof() 的翻译。针对 [Void](../../void/) 的重载。

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 另见

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const String\&) method


实现 typeof() 翻译。针对字符串类型的重载。

```cpp
static const System::TypeInfo & System::ObjectType::GetType(const String &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 原始类型。 |

### ReturnValue

对描述 [String](../../string/) 类型的 [TypeInfo](../../typeinfo/) 结构的 const 引用。

## 另见

* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


实现 typeof() 翻译。针对智能指针的重载。

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 指针对象类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const T\& | 用于获取 [TypeInfo](../../typeinfo/) 的 [Object](../../object/)。 |

### ReturnValue

对描述传入对象最终类的 [TypeInfo](../../typeinfo/) 结构的 const 引用。

## 另见

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


实现 typeof() 翻译。针对结构体的重载。

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 结构体类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const T\& | 用于获取 [TypeInfo](../../typeinfo/) 的 [Object](../../object/)。 |

### ReturnValue

对描述传入对象最终类的 [TypeInfo](../../typeinfo/) 结构的 const 引用。

## 另见

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


实现 typeof() 翻译。针对异常的重载。

```cpp
template<typename T> static std::enable_if<IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | [Exception](../../exception/) 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const T\& | 用于获取 [TypeInfo](../../typeinfo/) 的 [Object](../../object/)。 |

### ReturnValue

对描述传入对象最终类的 [TypeInfo](../../typeinfo/) 结构的 const 引用。

## 另见

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T) method


实现 typeof() 翻译。针对原始类型的重载。

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value||std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 原始类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

对描述传入对象类型的 [TypeInfo](../../typeinfo/) 结构的 const 引用。

## 另见

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T) method


实现 typeof() 的翻译。针对 [Nullable](../../nullable/) 类型的重载。

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| 参数 | 描述 |
| --- | --- |
| T | [Nullable](../../nullable/) 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

对描述传入对象类型的 [TypeInfo](../../typeinfo/) 结构的 const 引用。

## 另见

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
