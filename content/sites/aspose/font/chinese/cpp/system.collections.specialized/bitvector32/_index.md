---
title: "System::Collections::Specialized::BitVector32 类"
linktitle: "BitVector32"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Specialized::BitVector32 类。提供一个简单轻量的位向量，可轻松以整数或 Boolean 方式访问 32 位存储（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.collections.specialized/bitvector32/
---
## BitVector32 class


提供一个简单轻量的位向量，可轻松以整数或 [Boolean](../../system/boolean/) 方式访问 32 位存储。

```cpp
class BitVector32
```

## Nested classes

* Class [Section](./section/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [BitVector32](./bitvector32/)() | 初始化一个新的空的 [BitVector32](./) 实例。 |
| [BitVector32](./bitvector32/)(int32_t) | 使用指定的内部数据初始化一个新的 [BitVector32](./) 结构实例。 |
| [BitVector32](./bitvector32/)(const BitVector32\&) | 使用指定值中的信息初始化一个新的 [BitVector32](./) 结构实例。 |
| static [CreateMask](./createmask/)() | 创建系列中的第一个掩码。 |
| static [CreateMask](./createmask/)(int32_t) | 创建系列中的下一个掩码。 |
| static [CreateSection](./createsection/)(int16_t) | 创建系列中的第一个区段，使用指定的最大值。 |
| static [CreateSection](./createsection/)(int16_t, BitVector32::Section) | 创建系列中的下一个区段，使用指定的最大值。 |
| [Equals](./equals/)(const BitVector32\&) | 确定指定的对象是否与当前对象相同。 |
| [get_Data](./get_data/)() | 返回存储在此位向量中的原始数据…… |
| [GetHashCode](./gethashcode/)() const | 返回当前对象的哈希码。 |
| [idx_get](./idx_get/)(int32_t) | 获取一个值，指示所有指定的位是否已设置。 |
| [idx_get](./idx_get/)(BitVector32::Section) | 获取指定区段的值。 |
| [idx_set](./idx_set/)(int32_t, bool) | 设置一个值，指示所有指定的位是否已设置。 |
| [idx_set](./idx_set/)(BitVector32::Section, int32_t) | 为指定的节设置值。 |
| static [ToString](./tostring/)(const BitVector32\&) | 将 value 参数表示的值转换为字符串。 |
| [ToString](./tostring/)() const | 将当前对象表示的值转换为字符串。 |
## 另见

* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Font for C++](../../)
