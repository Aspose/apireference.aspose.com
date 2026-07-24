---
title: "System::Boolean 类"
linktitle: "布尔"
second_title: "Aspose.Page 适用于 C++"
description: "System::Boolean 类。该类在 C++ 中保存 System.Boolean .Net 类型的静态成员。"
type: docs
weight: 600
url: /zh/cpp/system/boolean/
---
## Boolean class


保存 [System.Boolean](./) .[Net](../../system.net/) 类型的静态成员的类。

```cpp
class Boolean
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Parse](./parse/)(const String\&) | 将指定的字符串转换为 bool 类型的值。 |
| static [TryParse](./tryparse/)(const String\&, bool\&) | 将指定的字符串转换为 bool 类型的值。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [FalseString](./falsestring/) | 表示 'false' 布尔值的 [String](../string/) 表示形式。 |
| static [TrueString](./truestring/) | 表示 'true' 布尔值的 [String](../string/) 表示形式。 |
## 备注



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // 创建布尔变量。
  bool isWeekend = false;

  // 解析输入字符串并打印结果。
  if (Boolean::TryParse(u"True", isWeekend))
  {
    std::cout << "Is weekend: " << (isWeekend ? "Yes" : "No");
  }
  else
  {
    std::cerr << "Something went wrong" << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
Is weekend: Yes
*/
```

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
