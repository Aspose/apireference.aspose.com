---
title: "System::Drawing::Text::FontCollection 类"
linktitle: "FontCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Text::FontCollection 类。已安装和私有字体集合的基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 100
url: /zh/cpp/system.drawing.text/fontcollection/
---
## FontCollection class


已安装和私有字体集合的基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class FontCollection : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Dispose](./dispose/)() override | 释放当前对象获取的操作系统资源。 |
| virtual [get_Families](./get_families/)() | 返回一个由当前对象表示的字体集合关联的 [FontFamily](../../system.drawing/fontfamily/) 对象数组。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Font for C++](../../)
