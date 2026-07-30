---
title: "System::Drawing::ColorTranslator 类"
linktitle: "ColorTranslator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::ColorTranslator 类。执行颜色转换。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 600
url: /zh/cpp/system.drawing/colortranslator/
---
## ColorTranslator class


执行颜色转换。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ColorTranslator
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [FromHtml](./fromhtml/)(const System::String\&) | 将指定的 HTML 颜色表示转换为等效的 [Color](../color/) 对象。 |
| static [FromWin32](./fromwin32/)(int) | 将指定的 [Windows](../../system.windows/) 颜色转换为等效的 [Color](../color/) 对象。 |
| static [ToHtml](./tohtml/)(const Color\&) | 将指定的 [Color](../color/) 对象转换为等效 HTML 颜色的字符串表示。 |
## 另见

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
