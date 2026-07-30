---
title: "System::ComponentModel::PropertyChangedEventArgs 类"
linktitle: "PropertyChangedEventArgs"
second_title: "Aspose.Font 适用于 C++"
description: "System::ComponentModel::PropertyChangedEventArgs 类。PropertyChanged 事件的参数。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1200
url: /zh/cpp/system.componentmodel/propertychangedeventargs/
---
## PropertyChangedEventArgs class


PropertyChanged 事件的参数。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class PropertyChangedEventArgs : public System::EventArgs
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_PropertyName](./get_propertyname/)() | RTTI 信息。 |
| [PropertyChangedEventArgs](./propertychangedeventargs/)(const String\&) | 初始化 PropertyChanged 事件参数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 一个静态成员，表示一个 "empty" [EventArgs](../../system/eventargs/) 共享指针（空指针）。 |
## 另见

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
