---
title: "System::Net::Cache::HttpRequestCachePolicy 类"
linktitle: "HttpRequestCachePolicy"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Cache::HttpRequestCachePolicy 类。表达 RFC2616 HTTP 缓存语义的 HTTP 缓存策略。该类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 100
url: /zh/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


表达 RFC2616 HTTP 缓存语义的 HTTP 缓存策略。该类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | 获取缓存中存储的资源必须重新验证的时间。 |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | 获取以 UTC 格式表示的缓存中存储的资源必须重新验证的时间。仅供内部使用。 |
| [get_Level](./get_level/)() const | RTTI 信息。 |
| [get_MaxAge](./get_maxage/)() const | 获取资源允许的最大年龄。 |
| [get_MaxStale](./get_maxstale/)() const | 获取资源允许的最大陈旧度值。 |
| [get_MinFresh](./get_minfresh/)() const | 获取资源允许的最小年龄。 |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)() | 构造一个新实例。 |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpRequestCacheLevel) | 构造一个新实例。 |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan) | 构造一个新实例。 |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan) | 构造一个新实例。 |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(DateTime) | 构造一个新实例。 |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan, DateTime) | 构造一个新实例。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
## 另见

* Class [RequestCachePolicy](../requestcachepolicy/)
* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
