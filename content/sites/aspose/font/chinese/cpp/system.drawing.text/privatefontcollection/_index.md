---
title: "System::Drawing::Text::PrivateFontCollection 类"
linktitle: "PrivateFontCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Text::PrivateFontCollection 类。表示由客户端应用程序提供的字体族集合。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 300
url: /zh/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


表示由客户端应用程序提供的字体族集合。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | 将指定的字体添加到集合中。 |
| [AddFontFile](./addfontfile/)(const String\&) | 从指定文件中添加字体到集合中。 |
| [get_Families](./get_families/)() override | 返回一个由当前对象表示的字体集合关联的 [FontFamily](../../system.drawing/fontfamily/) 对象数组。 |
## 另见

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Font for C++](../../)
