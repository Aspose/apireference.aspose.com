---
title: "System::Object::FastCast 方法"
linktitle: "FastCast"
second_title: "Aspose.Font 适用于 C++"
description: "System::Object::FastCast 方法。仅用于 C++ 的内部实现。"
type: docs
weight: 400
url: /zh/cpp/system/object/fastcast/
---
## Object::FastCast method


仅供内部使用。

```cpp
virtual bool System::Object::FastCast(const Details::FastRttiBase &helper, void **out_ptr) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| helper | const Details::FastRttiBase\& | FastRttiBase 结构体已针对所需类型进行特化。 |
| out_ptr | void ** | 如果可用转换，则指向所需类型的指针。 |

### ReturnValue

如果类支持 FastRTTI 操作，则为 True。

## 另见

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
