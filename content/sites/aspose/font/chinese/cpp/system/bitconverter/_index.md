---
title: "System::BitConverter 类"
linktitle: "BitConverter"
second_title: "Aspose.Font 适用于 C++"
description: "System::BitConverter 类。包含执行字节序列与值类型相互转换的方法。这是一个没有实例服务的静态类型。您绝不应以任何方式在 C++ 中创建其实例。"
type: docs
weight: 500
url: /zh/cpp/system/bitconverter/
---
## BitConverter class


包含执行字节序列与值类型相互转换的方法。这是一个没有实例服务的静态类型。任何情况下都不应创建其实例。

```cpp
class BitConverter
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [_IsLittleEndian](./_islittleendian/)() | 指示当前架构的字节序。 |
| static [DoubleToInt64Bits](./doubletoint64bits/)(double) | 返回一个 64 位整数值，其二进制表示等于指定双精度浮点值的二进制表示。 |
| static [GetBytes](./getbytes/)(bool) | 将指定的布尔值转换为字节数组。 |
| static [GetBytes](./getbytes/)(char_t) | 将指定的 char_t 值转换为字节数组。 |
| static [GetBytes](./getbytes/)(int16_t) | 将指定的 16 位整数值转换为字节数组。 |
| static [GetBytes](./getbytes/)(int) | 将指定的 32 位整数值转换为字节数组。 |
| static [GetBytes](./getbytes/)(int64_t) | 将指定的 64 位整数值转换为字节数组。 |
| static [GetBytes](./getbytes/)(uint16_t) | 将指定的无符号 16 位整数值转换为字节数组。 |
| static [GetBytes](./getbytes/)(uint32_t) | 将指定的无符号 32 位整数值转换为字节数组。 |
| static [GetBytes](./getbytes/)(uint64_t) | 将指定的无符号 64 位整数值转换为字节数组。 |
| static [GetBytes](./getbytes/)(float) | 将指定的单精度浮点值转换为字节数组。 |
| static [GetBytes](./getbytes/)(double) | 将指定的双精度浮点值转换为字节数组。 |
| static [Int64BitsToDouble](./int64bitstodouble/)(int64_t) | 返回一个双精度浮点值，其值等同于 value。 |
| static [ToBoolean](./toboolean/)(const System::ArrayPtr\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的一个字节转换为布尔值。 |
| static [ToBoolean](./toboolean/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的一个字节转换为布尔值。 |
| static [ToChar](./tochar/)(const System::ArrayPtr\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的两个字节转换为 char_t 值。 |
| static [ToChar](./tochar/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的两个字节转换为 char_t 值。 |
| static [ToDouble](./todouble/)(const System::ArrayPtr\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的八个字节转换为双精度浮点值。 |
| static [ToDouble](./todouble/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的八个字节转换为双精度浮点值。 |
| static [ToInt16](./toint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的两个字节转换为 16 位整数值。 |
| static [ToInt16](./toint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的两个字节转换为 16 位整数值。 |
| static [ToInt32](./toint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的四个字节转换为 32 位整数值。 |
| static [ToInt32](./toint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的四个字节转换为 32 位整数值。 |
| static [ToInt64](./toint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的八个字节转换为 64 位整数值。 |
| static [ToInt64](./toint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的八个字节转换为 64 位整数值。 |
| static [ToSingle](./tosingle/)(const System::ArrayPtr\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的四个字节转换为单精度浮点值。 |
| static [ToSingle](./tosingle/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的四个字节转换为单精度浮点值。 |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, bool, const String\&) | 将指定字节数组的所有值转换为其十六进制字符串表示形式。十六进制表示中使用的字母大小写以及在相邻字节对之间插入的分隔符通过相应参数指定。 |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int) | 从指定索引开始，将指定字节数组的值转换为其十六进制字符串表示形式。 |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int, int) | 将指定字节数组的一段值转换为其十六进制字符串表示形式。 |
| static [ToUInt16](./touint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的两个字节转换为无符号 16 位整数值。 |
| static [ToUInt16](./touint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的两个字节转换为无符号 16 位整数值。 |
| static [ToUInt32](./touint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的四个字节转换为无符号 32 位整数值。 |
| static [ToUInt32](./touint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的四个字节转换为无符号 32 位整数值。 |
| static [ToUInt64](./touint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的八个字节转换为无符号 64 位整数值。 |
| static [ToUInt64](./touint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 将指定数组中从指定索引开始的八个字节转换为无符号 64 位整数值。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [IsLittleEndian](./islittleendian/) | 指示当前架构的字节序。如果架构为小端序则为 true，否则为 false。 |
## 备注



```cpp
#include <system/bit_converter.h>
#include <system/smart_ptr.h>

using namespace System;

template <typename T>
void Print(T arg)
{
  std::cout << arg << ' ';

  for (const auto byte: BitConverter::GetBytes(arg))
  {
    std::cout << std::hex << static_cast<int>(byte);
  }

  std::cout << std::endl;
}

int main()
{
  // 创建要打印的值。
  int anInt = 1234567890;
  double aDouble = 0.123456789;

  // 打印值及其字节。
  Print(anInt);
  Print(aDouble);

  return 0;
}
/*
This code example produces the following output:
1234567890 d229649
0.123457 5f633937dd9abf3f
*/
```

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
