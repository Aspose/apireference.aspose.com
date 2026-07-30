---
title: "System::Text::RegularExpressions::CaptureCollection class"
linktitle: "CaptureCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::RegularExpressions::CaptureCollection 类。由单个捕获组完成的捕获列表。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 200
url: /zh/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


由单个捕获组完成的捕获列表。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | 禁用集合修订。 |
| [AddCapture](./addcapture/)(const CapturePtr\&) | 用于向集合中添加捕获的服务方法。 |
| [Clear](./clear/)() override | 禁用清理集合。 |
| [get_Count](./get_count/)() const override | 获取捕获的数量。 |
| [get_IsReadOnly](./get_isreadonly/)() const override | 将集合标记为只读。 |
| [get_IsSynchronized](./get_issynchronized/)() const | 将集合标记为未同步。 |
| [idx_get](./idx_get/)(int) const override | [Capture](../capture/) 访问器。 |
| [operator[]](./operator[]/)(int) | [Capture](../capture/) 访问器。 |
| [operator[]](./operator[]/)(int) const | [Capture](../capture/) 访问器。 |
| [Remove](./remove/)(const CapturePtr\&) override | 禁用集合修订。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Base](./base/) | [Base](./base/) 类型。 |
## 另见

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
