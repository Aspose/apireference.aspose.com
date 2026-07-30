---
title: "System::Text::RegularExpressions::Match 类"
linktitle: "Match"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::RegularExpressions::Match 类。对字符串的正则表达式的单次匹配。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 600
url: /zh/cpp/system.text.regularexpressions/match/
---
## Match class


[Single](../../system/single/) match of regexp over string. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Match : public System::Text::RegularExpressions::Group
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | 向匹配中添加捕获。 |
| [AddGroup](./addgroup/)(const GroupPtr\&) | 向匹配中添加组。 |
| static [get_Empty](./get_empty/)() | 空匹配访问器。 |
| [get_Groups](./get_groups/)() | 获取组列表。 |
| [Match](./match/)(const UStringPtr\&, int, int) | 构造函数。 |
| [NextMatch](./nextmatch/)() | 遍历匹配项。 |
| virtual [Result](./result/)(const String\&) | 通过将子匹配引用替换为其值来格式化字符串。 |
| [SetMappedIndexes](./setmappedindexes/)(const std::vector\<int\>\&) |  |
## 另见

* Class [Group](../group/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
