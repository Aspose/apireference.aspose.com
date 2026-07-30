---
title: "System::Net::Http::HttpMethod 类"
linktitle: "HttpMethod"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::HttpMethod 类。表示 HTTP 方法。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 700
url: /zh/cpp/system.net.http/httpmethod/
---
## HttpMethod class


表示 HTTP 方法。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpMethod : public System::IEquatable<System::SharedPtr<System::Net::Http::HttpMethod>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<HttpMethod\>) override | 确定当前对象和指定对象是否相等。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| static [get_Delete](./get_delete/)() | 返回 'DELETE' HTTP 方法。 |
| static [get_Get](./get_get/)() | 返回 'GET' HTTP 方法。 |
| static [get_Head](./get_head/)() | 返回 'HEAD' HTTP 方法。 |
| [get_Method](./get_method/)() | 返回 HTTP 方法的字符串表示形式。 |
| static [get_Options](./get_options/)() | 返回 'OPTIONS' HTTP 方法。 |
| static [get_Post](./get_post/)() | 返回 'POST' HTTP 方法。 |
| static [get_Put](./get_put/)() | 返回 'PUT' HTTP 方法。 |
| static [get_Trace](./get_trace/)() | 返回 'TRACE' HTTP 方法。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| [HttpMethod](./httpmethod/)(String) | 构造一个新实例。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
## 另见

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
