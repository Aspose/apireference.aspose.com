---
title: GetType()
second_title: Aspose.Slides for C++ API Reference
description: Implements typeof() translation. Overload for smart pointers.
type: docs
weight: 1
url: /cpp/system/objectext/gettype/
---
## ObjectExt::GetType(const T\&) method


Implements typeof() translation. Overload for smart pointers.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, constSystem::TypeInfo &>::type System::ObjectExt::GetType(const T &obj)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| T | Pointer object type. |

### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) to get [TypeInfo](../../typeinfo/) for. |

### Return Value

Const reference to [TypeInfo](../../typeinfo/) structure describing the final class of object passed.

## ObjectExt::GetType(const T\&) method


Implements typeof() translation. Overload for structures.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectExt::GetType(const T &obj)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| T | Structure type. |

### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) to get [TypeInfo](../../typeinfo/) for. |

### Return Value

Const reference to [TypeInfo](../../typeinfo/) structure describing the final class of object passed.

## ObjectExt::GetType(const T\&) method


Implements typeof() translation. Overload for exceptions.

```cpp
template<typename T> static std::enable_if<IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectExt::GetType(const T &obj)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| T | Exception type. |

### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) to get [TypeInfo](../../typeinfo/) for. |

### Return Value

Const reference to [TypeInfo](../../typeinfo/) structure describing the final class of object passed.

## ObjectExt::GetType(const T) method


Implements typeof() translation. Overload for primitive types.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value||std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectExt::GetType(const T obj)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| T | Primitive type. |

### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| obj | const T | IGNORED |

### Return Value

Const reference to [TypeInfo](../../typeinfo/) structure describing the type of object passed.

## ObjectExt::GetType(const T) method


Implements typeof() translation. Overload for [Nullable](../../nullable/) types.

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectExt::GetType(const T obj)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| T | [Nullable](../../nullable/) type. |

### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| obj | const T | IGNORED |

### Return Value

Const reference to [TypeInfo](../../typeinfo/) structure describing the type of object passed.

## ObjectExt::GetType() method


Implements typeof() translation. Overload for primitive types.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value &&!std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectExt::GetType()
```


### Template parameters

| Parameter | Description |
| --- | --- |
| T | Primitive type. |

### Return Value

Const reference to [TypeInfo](../../typeinfo/) structure describing the type specified.

## ObjectExt::GetType() method


Implements typeof() translation. Overload for enum types.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectExt::GetType()
```


### Template parameters

| Parameter | Description |
| --- | --- |
| T | Primitive type. |

### Return Value

Const reference to [TypeInfo](../../typeinfo/) structure describing the type specified.

## ObjectExt::GetType() method


Implements typeof() translation. Overload for structures and pointers.

```cpp
template<typename T> static std::enable_if<(!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsFullyBoxable<T>::value)||IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectExt::GetType()
```


### Template parameters

| Parameter | Description |
| --- | --- |
| T | Primitive type. |

### Return Value

Const reference to [TypeInfo](../../typeinfo/) structure describing the strcture specified.

## ObjectExt::GetType() method


Implements typeof() translation. Overload for [Nullable](../../nullable/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectExt::GetType()
```


### Template parameters

| Parameter | Description |
| --- | --- |
| T | [Nullable](../../nullable/) type. |

### Return Value

Const reference to [TypeInfo](../../typeinfo/) structure describing the strcture specified.

## ObjectExt::GetType() method


Implements typeof() translation. Overload for structures and pointers. IsFullyBoxable used because trying to specify [BoxedValue](../../boxedvalue/) template without equal operator will cause compilation error.

```cpp
template<typename T> static std::enable_if<!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&IsFullyBoxable<T>::value &&!IsNullable<T>::value &&!IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectExt::GetType()
```


### Template parameters

| Parameter | Description |
| --- | --- |
| T | Primitive type. |

### Return Value

Const reference to [TypeInfo](../../typeinfo/) structure describing the strcture specified or pointee type if called for [SmartPtr](../../smartptr/).

## ObjectExt::GetType(const String\&) method


Implements typeof() translation. Overload for string type.

```cpp
static const System::TypeInfo & System::ObjectExt::GetType(const String &obj)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| T | Primitive type. |

### Return Value

Const reference to [TypeInfo](../../typeinfo/) structure describing [String](../../string/) type.

## ObjectExt::GetType() method


Implements typeof() translation. Overload for **uint8_t**.

```cpp
const System::TypeInfo & System::ObjectExt::GetType()
```

## ObjectExt::GetType() method


Implements typeof() translation. Overload for char16_t.

```cpp
const System::TypeInfo & System::ObjectExt::GetType()
```

## ObjectExt::GetType() method


Implements typeof() translation. Overload for **int32_t**.

```cpp
const System::TypeInfo & System::ObjectExt::GetType()
```

## ObjectExt::GetType() method


Implements typeof() translation. Overload for **int64_t**.

```cpp
const System::TypeInfo & System::ObjectExt::GetType()
```

## ObjectExt::GetType() method


Implements typeof() translation. Overload for bool.

```cpp
const System::TypeInfo & System::ObjectExt::GetType()
```

## ObjectExt::GetType() method


Implements typeof() translation. Overload for [Void](../../void/).

```cpp
const System::TypeInfo & System::ObjectExt::GetType()
```

## See Also

* Class [ObjectExt](./)
* Class [TypeInfo](../typeinfo/)
* Class [String](../string/)
* Struct [IsSmartPtr](../issmartptr/)
* Struct [IsExceptionWrapper](../isexceptionwrapper/)
* Struct [IsNullable](../isnullable/)
* Namespace [System](../)
* Library [Aspose.Slides](../../)