---
title: "System::Object::ReferenceEquals 方法"
linktitle: "ReferenceEquals"
second_title: "Aspose.Font 适用于 C++"
description: "System::Object::ReferenceEquals 方法。Object::ReferenceEquals 在 C++ 中针对字符串和 nullptr 情形的特化。"
type: docs
weight: 1200
url: /zh/cpp/system/object/referenceequals/
---
## Object::ReferenceEquals(String const\&, std::nullptr_t) method


针对字符串和 nullptr 情形的 [Object::ReferenceEquals](./) 特化。

```cpp
bool System::Object::ReferenceEquals(String const &str, std::nullptr_t)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | String const\& | [String](../../string/) 用于与 nullptr 比较。 |

### ReturnValue

如果字符串为 null，则为 true；否则为 false。

## 另见

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(String const\&, String const\&) method


针对字符串情形的 [Object::ReferenceEquals](./) 特化。

```cpp
bool System::Object::ReferenceEquals(String const &str1, String const &str2)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str1 | String const\& | 要比较的第一个字符串。 |
| str2 | String const\& | 要比较的第二个字符串。 |

### ReturnValue

如果字符串匹配则为 true，否则为 false。

## 另见

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(ptr const\&, ptr const\&) method


按引用比较对象。

```cpp
static bool System::Object::ReferenceEquals(ptr const &objA, ptr const &objB)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| objA | ptr const\& | 第一个用于比较的指针。 |
| objB | ptr const\& | 第二个用于比较的指针。 |

### ReturnValue

如果指针匹配则为 true，否则为 false。

## 另见

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(T const\&, std::nullptr_t) method


使用引用比较值类型对象与 nullptr。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, std::nullptr_t)
```


| 参数 | 描述 |
| --- | --- |
| T | 要比较的对象类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| objA | T const\& | 要比较的第一个对象。 |

### ReturnValue

始终返回 false，因为值类型不能为 null。

## 另见

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(T const\&, T const\&) method


按引用比较对象。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, T const &objB)
```


| 参数 | 描述 |
| --- | --- |
| T | 要比较的对象类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| objA | T const\& | 要比较的第一个对象。 |
| objB | T const\& | 要比较的第二个对象。 |

### ReturnValue

如果对象地址匹配则为 true，否则为 false。

## 另见

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
