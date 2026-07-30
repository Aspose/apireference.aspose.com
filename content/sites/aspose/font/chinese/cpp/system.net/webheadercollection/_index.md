---
title: "System::Net::WebHeaderCollection 类"
linktitle: "WebHeaderCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::WebHeaderCollection 类。表示协议头的集合。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 3600
url: /zh/cpp/system.net/webheadercollection/
---
## WebHeaderCollection class


表示协议头的集合。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class WebHeaderCollection : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(String, String) | 向集合中添加指定的标题名称和值对。 |
| [Add](./add/)(HttpResponseHeader, String) | 向集合中添加指定的标题及其值对。 |
| [Add](./add/)(HttpRequestHeader, String) | 向集合中添加指定的标题及其值对。 |
| [AllKeys](./allkeys/)() | 返回存储在集合中的标题名称集合。 |
| [get_Count](./get_count/)() const | 返回集合中的元素数量。 |
| [get_Keys](./get_keys/)() | 返回存储在集合中的标题名称集合。 |
| [GetKey](./getkey/)(int) | 返回指定索引处的键。 |
| [GetValues](./getvalues/)(String) | 返回标题值的集合。 |
| [idx_get](./idx_get/)(HttpRequestHeader) | 使用指定请求的标题获取标题值。 |
| [idx_get](./idx_get/)(HttpResponseHeader) | 使用指定响应的标题获取标题值。 |
| [idx_get](./idx_get/)(String) | 使用指定的标题名称获取标题值。 |
| [idx_set](./idx_set/)(HttpRequestHeader, String) | 设置指定标题的标题值。 |
| [idx_set](./idx_set/)(HttpResponseHeader, String) | 使用指定响应的标头设置标头值。 |
| [idx_set](./idx_set/)(String, String) | 使用指定的标头名称设置标头值。 |
| static [IsRestricted](./isrestricted/)(const String\&) | 测试是否可以为请求设置指定的 HTTP 标头。 |
| [Remove](./remove/)(String) | 通过指定的标头名称移除标头。 |
| [Remove](./remove/)(HttpResponseHeader) | 移除指定响应的标头。 |
| [Remove](./remove/)(HttpRequestHeader) | 移除指定请求的标头。 |
| [Set](./set/)(String, String) | 设置指定标头的值。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| [WebHeaderCollection](./webheadercollection/)() | 构造一个新实例。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
