---
title: "System::Drawing 命名空间"
linktitle: "System::Drawing"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Drawing 命名空间。"
type: docs
weight: 3700
url: /zh/cpp/system.drawing/
---



## 类

| 类 | 描述 |
| --- | --- |
| [Bitmap](./bitmap/) | 表示 GDI+ 位图图像。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Brush](./brush/) | 用于表示填充图形形状内部的填充器的基类。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Brushes](./brushes/) | 提供一组预创建的 [SolidBrush](./solidbrush/) 对象。这是一个没有实例服务的静态类型。任何方式都不应创建其实例。 |
| [CharacterRange](./characterrange/) | 表示字符串中字符位置范围的类型。此类型应在栈上分配，并以值或引用方式传递给函数。切勿使用 [System::SmartPtr](../system/smartptr/) 类来管理此类型的对象。 |
| [Color](./color/) | 表示颜色的类型。此类型应在栈上分配，并以值或引用方式传递给函数。切勿使用 [System::SmartPtr](../system/smartptr/) 类来管理此类型的对象。 |
| [ColorTranslator](./colortranslator/) | 执行颜色转换。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Font](./font/) | 表示文本的特定格式，包括字体、大小和样式。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [FontConverter](./fontconverter/) | 将 [Font](./font/) 对象从一种数据类型转换为另一种数据类型。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [FontFamily](./fontfamily/) | 表示一组共享相似基本设计的字体族。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Graphics](./graphics/) | 表示绘图表面。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Icon](./icon/) | 表示一个 [Windows](../system.windows/) 图标。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Image](./image/) | 是 [System::Drawing::Bitmap](./bitmap/) 和 System::Drawing::Metafile 类的基类，提供基本功能。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [ImageConverter](./imageconverter/) | 将 [Image](./image/) 对象从一种数据类型转换为另一种数据类型。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [ImageFormatConverter](./imageformatconverter/) | 将 ImageFormat 对象从一种数据类型转换为另一种数据类型。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Pen](./pen/) | 表示正在绘制的线条和曲线的属性，例如颜色、宽度等。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Pens](./pens/) | 提供一组预创建的 [Pen](./pen/) 对象。这是一个没有实例服务的静态类型。绝不应以任何方式创建其实例。 |
| [Point](./point/) | 表示二维平面上点的整数 X、Y 坐标对。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../system/smartptr/) 类来管理此类型的对象。 |
| [PointF](./pointf/) | 表示二维平面上点的单精度浮点 X、Y 坐标对。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../system/smartptr/) 类来管理此类型的对象。 |
| [Rectangle](./rectangle/) | 表示图像的矩形区域，由左上角的整数 X、Y 坐标以及宽度和高度定义。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../system/smartptr/) 类来管理此类型的对象。 |
| [RectangleF](./rectanglef/) | 表示图像的矩形区域，由左上角的单精度浮点 X、Y 坐标以及宽度和高度定义。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../system/smartptr/) 类来管理此类型的对象。 |
| [Region](./region/) | 表示图形形状的内部。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Size](./size/) | 表示图像宽度和高度的整数值对。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../system/smartptr/) 类来管理此类型的对象。 |
| [SizeF](./sizef/) | 表示图像宽度和高度的单精度浮点值对。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../system/smartptr/) 类来管理此类型的对象。 |
| [SolidBrush](./solidbrush/) | 表示单色画刷。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [StringFormat](./stringformat/) | 封装文本布局信息、显示操作和 OpenType 特性。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [SystemColors](./systemcolors/) | 提供一组预创建的 [Color](./color/) 对象，表示 [Windows](../system.windows/) 显示元素的颜色。这是一个没有实例服务的静态类型。绝不应以任何方式创建其实例。 |
| [SystemFonts](./systemfonts/) | 提供一组预创建的 [Font](./font/) 对象，表示用于在 [Windows](../system.windows/) 显示元素中显示文本的字体。这是一个没有实例服务的静态类型。绝不应以任何方式创建其实例。 |
| [TextureBrush](./texturebrush/) | 表示使用图像填充形状内部的画刷。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
## Enums

| 枚举 | 描述 |
| --- | --- |
| [ContentAlignment](./contentalignment/) | 指定内容对齐方式。 |
| [CopyPixelOperation](./copypixeloperation/) | 指定像素复制操作中源颜色如何与目标颜色合并，以产生最终颜色。 |
| [FontStyle](./fontstyle/) | 表示一种字体样式。 |
| [GraphicsUnit](./graphicsunit/) | 表示一种计量单位。 |
| [KnownColor](./knowncolor/) | 指定已知的系统颜色。 |
| [RotateFlipType](./rotatefliptype/) | 指定旋转和/或翻转操作的类型。 |
| [StringAlignment](./stringalignment/) | 指定字符串相对于其布局矩形的对齐方式。 |
| [StringDigitSubstitute](./stringdigitsubstitute/) | 指定根据区域设置或语言对字符串中的数字进行替换的方式。 |
| [StringFormatFlags](./stringformatflags/) | 指定文本字符串的显示和布局信息。 |
| [StringTrimming](./stringtrimming/) | 指定当字符串不适合布局形状时应如何修剪字符。 |
## Functions

| 函数 | 描述 |
| --- | --- |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
