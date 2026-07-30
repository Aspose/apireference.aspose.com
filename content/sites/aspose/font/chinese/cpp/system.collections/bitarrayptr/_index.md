---
title: "System::Collections::BitArrayPtr class"
linktitle: "BitArrayPtr"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::BitArrayPtr 类。指向 BitArray 的指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并在 C++ 中以值或 const 引用方式传递给函数。"
type: docs
weight: 200
url: /zh/cpp/system.collections/bitarrayptr/
---
## BitArrayPtr class


指向 [BitArray](../bitarray/) 的指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值或 const 引用方式传递给函数。

```cpp
class BitArrayPtr : public System::SmartPtr<T0>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [BitArrayPtr](./bitarrayptr/)() | 初始化空指针。 |
| [BitArrayPtr](./bitarrayptr/)(const SharedPtr\<BitArray\>\&) | 转换构造函数。 |
| [IsNull](./isnull/)() const | 检查特定值是否为空。 |
| [operator[]](./operator[]/)(int) const | 位访问器。 |
## 另见

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
