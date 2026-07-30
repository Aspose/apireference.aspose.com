---
title: "System::Net::CookieParser 类"
linktitle: "CookieParser"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::CookieParser 类。用于解析 cookie 头部并创建 Cookie 类的实例。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 500
url: /zh/cpp/system.net/cookieparser/
---
## CookieParser class


用于解析 cookie 头部并创建 [Cookie](../cookie/) 类的实例。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class CookieParser : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [CheckQuoted](./checkquoted/)(String) | 检查指定的字符串是否被引号包裹。 |
| [CookieParser](./cookieparser/)(String) | RTTI 信息。 |
| [Get](./get/)() | 根据指定的字符串返回一个实例。 |
| [GetServer](./getserver/)() | 获取服务器 cookie。 |
| [GetString](./getstring/)() | 返回 cookie 头部的字符串表示形式。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
