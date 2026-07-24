---
title: "System::Guid::Guid 构造函数"
linktitle: "Guid"
second_title: "Aspose.Page 适用于 C++"
description: "System::Guid::Guid 构造函数。构造一个表示全为零的 GUID 的对象（在 C++ 中）。"
type: docs
weight: 100
url: /zh/cpp/system/guid/guid/
---
## Guid::Guid() constructor


构造一个表示全为零的 GUID 的对象。

```cpp
System::Guid::Guid()
```

## 另见

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const ArrayPtr\<uint8_t\>\&) constructor


构造一个将 GUID 表示为无符号 8 位整数数组的对象。

```cpp
System::Guid::Guid(const ArrayPtr<uint8_t> &b)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| b | const ArrayPtr\<uint8_t\>\& | 包含 GUID 各字节的字节数组 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const Guid\&) constructor


构造一个表示与指定对象相同 GUID 的对象。

```cpp
System::Guid::Guid(const Guid &guid)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| guid | const Guid\& | 要从中复制 GUID 值的 [Guid](../) 对象 |

## 另见

* Class [Guid](../)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const String\&) constructor


构造一个将 GUID 表示为字符串的对象。

```cpp
System::Guid::Guid(const String &g)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| g | const String\& | 将由正在构造的对象表示的 GUID 的字符串表示形式 |

## 另见

* Class [String](../../string/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const System::Details::ArrayView\<uint8_t\>\&) constructor


构造一个将 GUID 表示为无符号 8 位整数数组视图的对象。

```cpp
System::Guid::Guid(const System::Details::ArrayView<uint8_t> &b)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| b | const System::Details::ArrayView\<uint8_t\>\& | 包含 GUID 各字节的字节数组 |

## 另见

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) constructor


从指定的 GUID 组件构造 [Guid](../) 类的实例。

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const ArrayPtr<uint8_t> &d)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 一个 | int32_t | GUID 的第 0-31 位 |
| b | int16_t | GUID 的第 32-47 位 |
| c | int16_t | GUID 的第 48-63 位 |
| d | const ArrayPtr\<uint8_t\>\& | 包含 GUID 第 64-127 位的字节数组 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) constructor


从指定的 GUID 组件构造 [Guid](../) 类的实例。

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const System::Details::ArrayView<uint8_t> &d)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 一个 | int32_t | GUID 的第 0-31 位 |
| b | int16_t | GUID 的第 32-47 位 |
| c | int16_t | GUID 的第 48-63 位 |
| d | const System::Details::ArrayView\<uint8_t\>\& | 包含 GUID 第 64-127 位的字节数组视图 |

## 另见

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


从指定的无符号整数和字节构造 [Guid](../) 类的实例。

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 一个 | int32_t | GUID 的第 0-31 位 |
| b | int16_t | GUID 的第 32-47 位 |
| c | int16_t | GUID 的第 48-63 位 |
| d | uint8_t | GUID 的第 64-71 位 |
| e | uint8_t | GUID 的第 72-79 位 |
| f | uint8_t | GUID 的第 80-87 位 |
| g | uint8_t | GUID 的第 88-95 位 |
| h | uint8_t | GUID 的第 96-103 位 |
| i | uint8_t | GUID 的第 104-111 位 |
| j | uint8_t | GUID 的第 112-119 位 |
| k | uint8_t | GUID 的第 120-127 位 |

## 另见

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


从指定的无符号整数和字节构造 [Guid](../) 类的实例。

```cpp
System::Guid::Guid(uint32_t a, uint16_t b, uint16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 一个 | uint32_t | GUID 的第 0-31 位 |
| b | uint16_t | GUID 的第 32-47 位 |
| c | uint16_t | GUID 的第 48-63 位 |
| d | uint8_t | GUID 的第 64-71 位 |
| e | uint8_t | GUID 的第 72-79 位 |
| f | uint8_t | GUID 的第 80-87 位 |
| g | uint8_t | GUID 的第 88-95 位 |
| h | uint8_t | GUID 的第 96-103 位 |
| i | uint8_t | GUID 的第 104-111 位 |
| j | uint8_t | GUID 的第 112-119 位 |
| k | uint8_t | GUID 的第 120-127 位 |

## 另见

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
