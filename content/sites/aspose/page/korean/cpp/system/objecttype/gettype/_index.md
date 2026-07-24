---
title: "System::ObjectType::GetType 메서드"
linktitle: "GetType"
second_title: "C++용 Aspose.Page"
description: "System::ObjectType::GetType 메서드. typeof() 변환을 구현합니다. C++에서 원시 타입에 대한 오버로드."
type: docs
weight: 100
url: /ko/cpp/system/objecttype/gettype/
---
## ObjectType::GetType() method


typeof() 변환을 구현합니다. 기본 타입에 대한 오버로드.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value &&!std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| 매개변수 | 설명 |
| --- | --- |
| T | 원시 타입. |

### ReturnValue

지정된 타입을 설명하는 [TypeInfo](../../typeinfo/) 구조체에 대한 const 참조.

## 또 보기

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() 변환을 구현합니다. 열거형에 대한 오버로드.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| 매개변수 | 설명 |
| --- | --- |
| T | 원시 타입. |

### ReturnValue

지정된 타입을 설명하는 [TypeInfo](../../typeinfo/) 구조체에 대한 const 참조.

## 또 보기

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() 변환을 구현합니다. 구조체와 포인터에 대한 오버로드.

```cpp
template<typename T> static std::enable_if<(!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsBoxable<T>::value)||IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| 매개변수 | 설명 |
| --- | --- |
| T | 원시 타입. |

### ReturnValue

지정된 구조를 설명하는 [TypeInfo](../../typeinfo/) 구조체에 대한 const 참조.

## 또 보기

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() 변환을 구현합니다. [Nullable](../../nullable/)에 대한 오버로드.

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Nullable](../../nullable/) 타입. |

### ReturnValue

지정된 구조를 설명하는 [TypeInfo](../../typeinfo/) 구조체에 대한 const 참조.

## 또 보기

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() 변환을 구현합니다. MutlicastDelegate에 대한 오버로드.

```cpp
template<typename T> static std::enable_if<detail::is_a<T, MulticastDelegate>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| 매개변수 | 설명 |
| --- | --- |
| T | MutlicastDelegate 타입. |

### ReturnValue

지정된 구조를 설명하는 [TypeInfo](../../typeinfo/) 구조체에 대한 const 참조.

## 또 보기

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() 변환을 구현합니다. 구조체와 포인터에 대한 오버로드.

```cpp
template<typename T> static std::enable_if<!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&IsBoxable<T>::value &&!detail::is_a<T, MulticastDelegate>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| 매개변수 | 설명 |
| --- | --- |
| T | 원시 타입. |

### ReturnValue

지정된 구조를 설명하거나 [SmartPtr](../../smartptr/)에 대해 호출될 경우 포인터가 가리키는 타입을 설명하는 [TypeInfo](../../typeinfo/) 구조체에 대한 const 참조.

## 또 보기

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() 변환을 구현합니다. uint8_t에 대한 오버로드.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 또 보기

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() 변환을 구현합니다. char16_t에 대한 오버로드.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 또 보기

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() 변환을 구현합니다. int32_t에 대한 오버로드.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 또 보기

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() 변환을 구현합니다. int64_t에 대한 오버로드.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 또 보기

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() 변환을 구현합니다. bool에 대한 오버로드.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 또 보기

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() 변환을 구현합니다. [Void](../../void/)에 대한 오버로드.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 또 보기

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const String\&) method


typeof() 변환을 구현합니다. 문자열 타입에 대한 오버로드.

```cpp
static const System::TypeInfo & System::ObjectType::GetType(const String &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 원시 타입. |

### ReturnValue

[String](../../string/) 타입을 설명하는 [TypeInfo](../../typeinfo/) 구조체에 대한 const 참조.

## 또 보기

* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


typeof() 변환을 구현합니다. 스마트 포인터에 대한 오버로드.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 포인터 객체 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/)에 대한 [TypeInfo](../../typeinfo/)를 가져오기 위해. |

### ReturnValue

전달된 객체의 최종 클래스를 설명하는 [TypeInfo](../../typeinfo/) 구조체에 대한 const 참조.

## 또 보기

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


typeof() 변환을 구현합니다. 구조체에 대한 오버로드.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 구조체 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/)에 대한 [TypeInfo](../../typeinfo/)를 가져오기 위해. |

### ReturnValue

전달된 객체의 최종 클래스를 설명하는 [TypeInfo](../../typeinfo/) 구조체에 대한 const 참조.

## 또 보기

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


typeof() 변환을 구현합니다. 예외에 대한 오버로드.

```cpp
template<typename T> static std::enable_if<IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Exception](../../exception/) 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/)에 대한 [TypeInfo](../../typeinfo/)를 가져오기 위해. |

### ReturnValue

전달된 객체의 최종 클래스를 설명하는 [TypeInfo](../../typeinfo/) 구조체에 대한 const 참조.

## 또 보기

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T) method


typeof() 변환을 구현합니다. 기본 타입에 대한 오버로드.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value||std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 원시 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

전달된 객체의 타입을 설명하는 [TypeInfo](../../typeinfo/) 구조체에 대한 const 참조.

## 또 보기

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T) method


typeof() 변환을 구현합니다. [Nullable](../../nullable/) 타입에 대한 오버로드.

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Nullable](../../nullable/) 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

전달된 객체의 타입을 설명하는 [TypeInfo](../../typeinfo/) 구조체에 대한 const 참조.

## 또 보기

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
