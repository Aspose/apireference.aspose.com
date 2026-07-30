---
title: "System::Text::RegularExpressions 命名空间"
linktitle: "System::Text::RegularExpressions"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Text::RegularExpressions 命名空间。"
type: docs
weight: 6800
url: /zh/cpp/system.text.regularexpressions/
---



## 类

| 类 | 描述 |
| --- | --- |
| [Capture](./capture/) | 单子表达式匹配的结果。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [CaptureCollection](./capturecollection/) | 单捕获组完成的捕获列表。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Group](./group/) | 单捕获组完成的匹配结果。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [GroupCollection](./groupcollection/) | 单次匹配中的捕获组列表。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [GroupCollectionPtr](./groupcollectionptr/) | [Group](./group/) 集合指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值或 const 引用方式传递给函数。 |
| [Match](./match/) | [Single](../system/single/) 对字符串的正则表达式匹配。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [MatchCollection](./matchcollection/) | 通过反复对字符串应用正则表达式完成的匹配集合。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Regex](./regex/) | 遵循 C# 类似语法的正则表达式。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
## Enums

| 枚举 | 描述 |
| --- | --- |
| [RegexOptions](./regexoptions/) | [Regex](./regex/) 选项。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [CaptureCollectionPtr](./capturecollectionptr/) | 指向捕获集合的指针。 |
| [CapturePtr](./captureptr/) | 指向单个捕获对象的指针。 |
| [GroupPtr](./groupptr/) | 指向组的指针。 |
| [MatchCollectionPtr](./matchcollectionptr/) | [Match](./match/) 集合指针。 |
| [MatchEvaluator](./matchevaluator/) | 用于评估匹配的委托类型。 |
| [MatchPtr](./matchptr/) | [Match](./match/) 指针。 |
| [RegexPtr](./regexptr/) | [Regex](./regex/) 指针。 |
| [UStringPtr](./ustringptr/) | 共享 UnicodeString 以避免复制。 |
