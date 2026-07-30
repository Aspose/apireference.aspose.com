---
title: "System::Net::Http::Headers::CacheControlHeaderValue 类"
linktitle: "CacheControlHeaderValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::CacheControlHeaderValue 类。表示 ''Cache-Control'' 头的值。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 200
url: /zh/cpp/system.net.http.headers/cachecontrolheadervalue/
---
## CacheControlHeaderValue class


表示 'Cache-Control' 头的值。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class CacheControlHeaderValue : public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CacheControlHeaderValue](./cachecontrolheadervalue/)() | 构造一个新实例。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| [get_Extensions](./get_extensions/)() | 返回 cache-extension 标记的集合。 |
| [get_MaxAge](./get_maxage/)() | 获取以秒为单位的最大年龄值，该值决定客户端接受响应的时间段。 |
| [get_MaxStale](./get_maxstale/)() | 获取一个值，用于确定客户端是否接受已过期的响应。 |
| [get_MaxStaleLimit](./get_maxstalelimit/)() | 获取以秒为单位的值，决定客户端接受已过期响应的时间段。 |
| [get_MinFresh](./get_minfresh/)() | 获取决定新鲜度生命周期的值。 |
| [get_MustRevalidate](./get_mustrevalidate/)() | 获取确定服务器在缓存条目变为陈旧时是否需要重新验证的值。 |
| [get_NoCache](./get_nocache/)() | RTTI 信息。 |
| [get_NoCacheHeaders](./get_nocacheheaders/)() | 获取‘Cache-Control’头中‘no-cache’指令的字段名称集合。 |
| [get_NoStore](./get_nostore/)() | 获取确定缓存是否必须不存储任何 HTTP 请求或响应部分的值。 |
| [get_NoTransform](./get_notransform/)() | 获取确定缓存或代理是否必须不更改实体主体任何部分的值。 |
| [get_OnlyIfCached](./get_onlyifcached/)() | 获取确定客户端是否必须仅使用缓存条目的值。 |
| [get_Private](./get_private/)() | 获取确定 HTTP 响应消息或其部分是否针对单个用户且必须不被共享缓存缓存的值。 |
| [get_PrivateHeaders](./get_privateheaders/)() | 获取‘Cache-Control’头中‘private’指令的字段名称集合。 |
| [get_ProxyRevalidate](./get_proxyrevalidate/)() | 获取确定服务器在共享用户代理缓存中缓存条目变为陈旧时是否需要重新验证的值。 |
| [get_Public](./get_public/)() | 获取确定 HTTP 响应是否可以被任何缓存缓存的值。 |
| [get_SharedMaxAge](./get_sharedmaxage/)() | 获取共享最大年龄（秒）值，该值会覆盖共享缓存中 ‘Cache-Control’ 的 ‘max-age’ 指令或 ‘Expires’ 头。 |
| static [GetCacheControlLength](./getcachecontrollength/)(String, int32_t, System::SharedPtr\<CacheControlHeaderValue\>, System::SharedPtr\<CacheControlHeaderValue\>\&) | 将传入的字符串从指定索引转换为 [CacheControlHeaderValue](./) 类的实例。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| static [Parse](./parse/)(String) | 将传入的字符串转换为 [CacheControlHeaderValue](./) 类的实例。 |
| [set_MaxAge](./set_maxage/)(Nullable\<TimeSpan\>) | 设置以秒为单位的最大年龄值，以确定客户端接受响应的时间段。 |
| [set_MaxStale](./set_maxstale/)(bool) | 设置确定客户端是否接受已过期响应的值。 |
| [set_MaxStaleLimit](./set_maxstalelimit/)(Nullable\<TimeSpan\>) | 设置以秒为单位的值，以确定客户端接受已过期响应的时间段。 |
| [set_MinFresh](./set_minfresh/)(Nullable\<TimeSpan\>) | 设置确定新鲜度生命周期的值。 |
| [set_MustRevalidate](./set_mustrevalidate/)(bool) | 设置确定服务器在缓存条目变为陈旧时是否需要重新验证的值。 |
| [set_NoCache](./set_nocache/)(bool) | 设置确定客户端是否接受缓存响应的值。 |
| [set_NoStore](./set_nostore/)(bool) | 设置确定缓存是否必须不存储任何 HTTP 请求或响应部分的值。 |
| [set_NoTransform](./set_notransform/)(bool) | 设置确定缓存或代理是否必须不更改实体主体任何部分的值。 |
| [set_OnlyIfCached](./set_onlyifcached/)(bool) | 设置确定客户端是否必须仅使用缓存条目的值。 |
| [set_Private](./set_private/)(bool) | 设置确定 HTTP 响应消息或其部分是否针对单个用户且必须不被共享缓存缓存的值。 |
| [set_ProxyRevalidate](./set_proxyrevalidate/)(bool) | 设置确定服务器在共享用户代理缓存中缓存条目变为陈旧时是否需要重新验证的值。 |
| [set_Public](./set_public/)(bool) | 设置确定 HTTP 响应是否可以被任何缓存缓存的值。 |
| [set_SharedMaxAge](./set_sharedmaxage/)(Nullable\<TimeSpan\>) | 设置共享最大年龄（秒）值，该值会覆盖共享缓存中 ‘Cache-Control’ 的 ‘max-age’ 指令或 ‘Expires’ 头。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<CacheControlHeaderValue\>\&) | 尝试将传入的字符串转换为 [CacheControlHeaderValue](./) 类的实例。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
