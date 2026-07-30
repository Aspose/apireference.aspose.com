---
title: "System::Text::RegularExpressions::Group class"
linktitle: "Group"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::RegularExpressions::Group class. 匹配结果由单个捕获组产生。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 300
url: /zh/cpp/system.text.regularexpressions/group/
---
## Group class


匹配结果由单个捕获组产生。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Group : public System::Text::RegularExpressions::Capture
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | 向组中添加捕获。 |
| [get_Captures](./get_captures/)() | 获取可用的捕获。 |
| [get_Success](./get_success/)() | 检查此组的捕获是否成功。 |
| [Group](./group/)(const UStringPtr\&, int, int) | 构造函数。 |
| [Group](./group/)() | 空组的构造函数。 |
## 另见

* Class [Capture](../capture/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
