---
title: "System::Windows::Forms::IButtonControl 类"
linktitle: "IButtonControl"
second_title: "Aspose.Font 适用于 C++"
description: "System::Windows::Forms::IButtonControl 类。虚拟类，用于使使用 IButtonControl 接口的翻译代码能够编译。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 300
url: /zh/cpp/system.windows.forms/ibuttoncontrol/
---
## IButtonControl class


虚拟类，用于使使用 [IButtonControl](./) 接口的翻译代码能够编译。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class IButtonControl : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_DialogResult](./get_dialogresult/)() | RTTI 信息。 |
| virtual [NotifyDefault](./notifydefault/)(bool) | 将控件设为默认或非默认。 |
| virtual [PerformClick](./performclick/)() | 对按钮执行单击操作。 |
| virtual [set_DialogResult](./set_dialogresult/)(DialogResult) | 设置与按钮关联的对话框结果。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Windows::Forms](../)
* Library [Aspose.Font for C++](../../)
