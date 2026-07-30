---
title: "System::Guid::Guid 构造函数"
linktitle: "Guid"
second_title: "Aspose.Font 适用于 C++"
description: "System::Guid::Guid 构造函数。构造一个在 C++ 中表示全零 GUID 的对象。"
type: docs
weight: 100
url: /zh/cpp/system/guid/guid/
---
## Guid::Guid() constructor


构造一个表示全零 GUID 的对象。

```cpp
System::Guid::Guid()
```

## 另见

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(const ArrayPtr\<uint8_t\>\&) constructor


构造一个将 GUID 表示为无符号 8 位整数数组的对象。

```cpp
System::Guid::Guid(const ArrayPtr<uint8_t> &b)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| b | const ArrayPtr\<uint8_t\>\& | 包含 GUID 各字节的字节数组 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(const Guid\&) constructor


构造一个表示与指定对象相同 GUID 的对象。

```cpp
System::Guid::Guid(const Guid &guid)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| guid | const Guid\& | 要从中复制 GUID 值的 [Guid](../) 对象 |

## 另见

* Class [Guid](../)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(const String\&) constructor


构造一个将 GUID 表示为字符串的对象。

```cpp
System::Guid::Guid(const String &g)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| g | const String\& | 要由正在构造的对象表示的 GUID 的字符串表示形式 |

## 另见

* Class [String](../../string/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(const System::Details::ArrayView\<uint8_t\>\&) constructor


构造一个将 GUID 表示为无符号 8 位整数数组视图的对象。

```cpp
System::Guid::Guid(const System::Details::ArrayView<uint8_t> &b)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| b | const System::Details::ArrayView\<uint8_t\>\& | 包含 GUID 各字节的字节数组 |

## 另见

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) constructor


从指定的 GUID 组件构造 [Guid](../) 类的实例。

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const ArrayPtr<uint8_t> &d)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | int32_t | GUID 的 0-31 位 |
| b | int16_t | GUID 的 32-47 位 |
| c | int16_t | GUID 的 48-63 位 |
| d | const ArrayPtr\<uint8_t\>\& | 包含 GUID 64-127 位的字节数组 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) constructor


从指定的 GUID 组件构造 [Guid](../) 类的实例。

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const System::Details::ArrayView<uint8_t> &d)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | int32_t | GUID 的 0-31 位 |
| b | int16_t | GUID 的 32-47 位 |
| c | int16_t | GUID 的 48-63 位 |
| d | const System::Details::ArrayView\<uint8_t\>\& | 包含 GUID 64-127 位的字节数组视图 |

## 另见

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


从指定的无符号整数和字节构造 [Guid](../) 类的实例。

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | int32_t | GUID 的 0-31 位 |
| b | int16_t | GUID 的 32-47 位 |
| c | int16_t | GUID 的 48-63 位 |
| d | uint8_t | GUID 的 64-71 位 |
| e | uint8_t | GUID 的 72-79 位 |
| f | uint8_t | GUID 的 80-87 位 |
| g | uint8_t | GUID 的 88-95 位 |
| h | uint8_t | GUID 的 96-103 位 |
| i | uint8_t | GUID 的 104-111 位 |
| j | uint8_t | GUID 的第 112-119 位 |
| k | uint8_t | GUID 的第 120-127 位 |

## 另见

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


从指定的无符号整数和字节构造 [Guid](../) 类的实例。

```cpp
System::Guid::Guid(uint32_t a, uint16_t b, uint16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | uint32_t | GUID 的 0-31 位 |
| b | uint16_t | GUID 的 32-47 位 |
| c | uint16_t | GUID 的 48-63 位 |
| d | uint8_t | GUID 的 64-71 位 |
| e | uint8_t | GUID 的 72-79 位 |
| f | uint8_t | GUID 的 80-87 位 |
| g | uint8_t | GUID 的 88-95 位 |
| h | uint8_t | GUID 的 96-103 位 |
| i | uint8_t | GUID 的 104-111 位 |
| j | uint8_t | GUID 的第 112-119 位 |
| k | uint8_t | GUID 的第 120-127 位 |

## 另见

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
