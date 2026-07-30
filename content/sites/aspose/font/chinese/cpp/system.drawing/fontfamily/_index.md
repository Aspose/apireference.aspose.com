---
title: "System::Drawing::FontFamily 类"
linktitle: "FontFamily"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::FontFamily 类。表示一组共享相似基本设计的字体族。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 900
url: /zh/cpp/system.drawing/fontfamily/
---
## FontFamily class


表示一组共享相似基本设计的字体族。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class FontFamily : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() | 返回当前 [FontFamily](./) 对象的副本。 |
| [Dispose](./dispose/)() | 释放当前对象获取的所有操作系统资源。 |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 确定当前对象和指定对象是否相同。 |
| [FontFamily](./fontfamily/)(const String\&) | 构造一个新的 [FontFamily](./) 类实例，该实例表示具有指定名称的字体族。 |
| [FontFamily](./fontfamily/)(const String\&, const SharedPtr\<Text::FontCollection\>\&) | 在指定的 FontCollection 中构造一个新的 [FontFamily](./) 实例，使用指定的名称。 |
| [FontFamily](./fontfamily/)(Text::GenericFontFamilies) | 从指定的通用字体族构造一个新的 [FontFamily](./) 实例。 |
| static [get_Families](./get_families/)() | 返回一个数组，包含与当前图形上下文关联的所有 [FontFamily](./) 对象。 |
| static [get_GenericMonospace](./get_genericmonospace/)() | 返回一个表示通用等宽字体族的 [FontFamily](./) 对象。 |
| static [get_GenericSansSerif](./get_genericsansserif/)() | 返回一个表示通用无衬线字体族的 [FontFamily](./) 对象。 |
| static [get_GenericSerif](./get_genericserif/)() | 返回一个表示通用衬线字体族的 [FontFamily](./) 对象。 |
| [get_Name](./get_name/)() const | 返回当前对象所表示的字体族的名称。 |
| [GetCellAscent](./getcellascent/)(FontStyle) | 返回当前对象所表示的字体族在指定字体样式下的单元上升度。 |
| [GetCellDescent](./getcelldescent/)(FontStyle) | 返回当前对象所表示的字体族在指定字体样式下的单元下降度。 |
| [GetEmHeight](./getemheight/)(FontStyle) | 返回指定样式下以字体设计单位计的 em 方块高度。 |
| [GetLineSpacing](./getlinespacing/)(FontStyle) | 返回当前对象所表示的字体族在指定字体样式下的行间距。 |
| [GetName](./getname/)(int) const | 返回当前对象所表示的字体族的名称。 |
| [IsStyleAvailable](./isstyleavailable/)(FontStyle) | 确定指定的字体样式是否可用。 |
| virtual [~FontFamily](./~fontfamily/)() | 析构函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
