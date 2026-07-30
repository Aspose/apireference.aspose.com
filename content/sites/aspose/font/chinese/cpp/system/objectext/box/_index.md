---
title: "System::ObjectExt::Box 方法"
linktitle: "Box"
second_title: "Aspose.Font 适用于 C++"
description: "System::ObjectExt::Box 方法。对 C++ 中的字符串值进行装箱。"
type: docs
weight: 200
url: /zh/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


对字符串值进行装箱。

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const String\& | 要装箱的值。 |

### ReturnValue

装箱后的值或 null（如果源字符串为 null）。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Box(const T\&) method


将值类型装箱以转换为 [Object](../../object/)。针对枚举类型的实现。

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| 参数 | 描述 |
| --- | --- |
| T | [Enum](../../enum/) 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const T\& | [Enum](../../enum/) 值进行装箱。 |

### ReturnValue

保持装箱值的对象智能指针。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Box(const T\&) method


将值类型装箱以转换为 [Object](../../object/)。针对非枚举类型的实现。

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| 参数 | 描述 |
| --- | --- |
| T | 值类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const T\& | 要装箱的值。 |

### ReturnValue

保持装箱值的对象智能指针。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Box(const T\&) method


将 [Nullable](../../nullable/) 类型装箱以转换为 [Object](../../object/)。

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| 参数 | 描述 |
| --- | --- |
| T | 值类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const T\& | 要装箱的值。 |

### ReturnValue

保持装箱值的对象智能指针。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
