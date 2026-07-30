---
title: "System::Collections::BitArray::Enumerator 类"
linktitle: "枚举器"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::BitArray::Enumerator 类。用于迭代的枚举器类型（C++）。"
type: docs
weight: 2900
url: /zh/cpp/system.collections/bitarray/enumerator/
---
## Enumerator class


[Enumerator](./) type for iteration purposes.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<bool>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<BitArray\>\&) | 创建枚举器。 |
| [get_Current](./get_current/)() const override | 获取指定位的布尔值。 |
| [MoveNext](./movenext/)() override | 移动到下一个位。 |
| [Reset](./reset/)() override | 将枚举器重置到第一个元素之前的位置。 |
## 另见

* Class [Object](../../../system/object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [BitArray](../)
* Namespace [System::Collections](../../)
* Library [Aspose.Font for C++](../../../)
