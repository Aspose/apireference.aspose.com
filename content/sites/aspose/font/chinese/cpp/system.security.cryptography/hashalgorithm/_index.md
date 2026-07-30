---
title: "System::Security::Cryptography::HashAlgorithm 类"
linktitle: "HashAlgorithm"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::HashAlgorithm 类。哈希算法的基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 1600
url: /zh/cpp/system.security.cryptography/hashalgorithm/
---
## HashAlgorithm class


哈希算法的基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HashAlgorithm : public System::Security::Cryptography::ICryptoTransform
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | 对缓冲区进行哈希。 |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&, int, int) | 对缓冲区切片进行哈希。 |
| [ComputeHash](./computehash/)(SharedPtr\<IO::Stream\> const\&) | 读取流直至结束并计算读取数据的哈希。 |
| static [Create](./create/)(const String\&) | 根据名称创建哈希算法。 |
| virtual [get_Hash](./get_hash/)() | 获取已计算哈希码的值。 |
| virtual [get_HashSize](./get_hashsize/)() | 获取已计算哈希值的字节大小。 |
| [get_InputBlockSize](./get_inputblocksize/)() override | 输入块大小。 |
| [get_OutputBlockSize](./get_outputblocksize/)() override | 输出块大小。 |
| virtual [Initialize](./initialize/)() | 将哈希器重置为初始状态。 |
| [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | 处理数据块并将数据复制到输出数组。 |
| [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) override | 处理最后一个数据块并计算哈希。 |
| virtual [~HashAlgorithm](./~hashalgorithm/)() | 析构函数。 |
## 另见

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
