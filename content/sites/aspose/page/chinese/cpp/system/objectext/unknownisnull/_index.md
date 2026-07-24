---
title: "System::ObjectExt::UnknownIsNull 方法"
linktitle: "UnknownIsNull"
second_title: "Aspose.Page 适用于 C++"
description: "System::ObjectExt::UnknownIsNull 方法。检查未知类型的对象是否为 nullptr。针对 C++ 中的非标量类型的重载。"
type: docs
weight: 1700
url: /zh/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


检查未知类型对象是否为 nullptr。针对非标量类型的重载。

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parameter | 描述 |
| --- | --- |
| T | [Object](../../object/) 类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | T | [Object](../../object/) 用于检查。 |

### ReturnValue

如果 'obj == nullptr' 为真，则为 True；否则为 false。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


检查未知类型对象是否为 nullptr。针对标量类型的重载。

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parameter | 描述 |
| --- | --- |
| T | [Object](../../object/) 类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | T | [Object](../../object/) 用于检查。 |

### ReturnValue

始终返回 false。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
