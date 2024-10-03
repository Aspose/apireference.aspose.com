---
title: System::ObjectExt::Box method
linktitle: Box
second_title: Aspose.Page for C++
description: 'System::ObjectExt::Box method. Boxes value types for converting to Object. Implementation for enum types in C++.'
type: docs
weight: 400
url: /cpp/system/objectext/box/
---
## ObjectExt::Box(const T\&) method


Boxes value types for converting to [Object](../../object/). Implementation for enum types.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Description |
| --- | --- |
| T | [Enum](../../enum/) type. |

| Parameter | Type | Description |
| --- | --- | --- |
| value | const T\& | [Enum](../../enum/) value to box. |

### ReturnValue

Smart pointer to object keeping boxed value.

## See Also

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Boxes value types for converting to [Object](../../object/). Implementation for non-enum types.

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Description |
| --- | --- |
| T | Value type. |

| Parameter | Type | Description |
| --- | --- | --- |
| value | const T\& | Value to box. |

### ReturnValue

Smart pointer to object keeping boxed value.

## See Also

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Boxes [Nullable](../../nullable/) types for converting to [Object](../../object/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Description |
| --- | --- |
| T | Value type. |

| Parameter | Type | Description |
| --- | --- | --- |
| value | const T\& | Value to box. |

### ReturnValue

Smart pointer to object keeping boxed value.

## See Also

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const String\&) method


Boxes string values.

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| Parameter | Type | Description |
| --- | --- | --- |
| value | const String\& | Value to box. |

### ReturnValue

Boxed value or null, if source string is null.

## See Also

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
