---
title: "System::Net::CookieContainer 类"
linktitle: "CookieContainer"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::CookieContainer 类。提供用于存放 CookieCollection 类实例的容器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 400
url: /zh/cpp/system.net/cookiecontainer/
---
## CookieContainer class


提供用于存放 CookieCollection 类实例的容器。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数参数中传递。

```cpp
class CookieContainer : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Cookie\>) | 向集合中添加 cookie。 |
| [Add](./add/)(System::SharedPtr\<Cookie\>, bool) | 向集合中添加 cookie。 |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | 将 cookie 从指定的集合复制到当前集合。 |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<Cookie\>) | 为指定的 URI 添加 cookie。 |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<CookieCollection\>) | 将指定 URI 的指定集合中的 cookie 复制到当前集合。 |
| [CookieContainer](./cookiecontainer/)() | 构造一个新实例。 |
| [CookieContainer](./cookiecontainer/)(int32_t) | 构造一个新实例。 |
| [CookieContainer](./cookiecontainer/)(int32_t, int32_t, int32_t) | 构造一个新实例。 |
| [CookieCutter](./cookiecutter/)(System::SharedPtr\<Uri\>, String, String, bool) | 将指定 URI 的指定 HTTP 标头中的 cookie 复制。 |
| [get_Capacity](./get_capacity/)() | 获取集合容量。 |
| [get_Count](./get_count/)() | 返回集合中项目的数量。 |
| [get_MaxCookieSize](./get_maxcookiesize/)() | 获取最大 cookie 大小。 |
| [get_PerDomainCapacity](./get_perdomaincapacity/)() | 获取每个域的集合容量。 |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>) | 返回包含与指定 URI 关联的 cookie 的 HTTP 标头。 |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>, String\&) | 返回包含与指定 URI 关联的 cookie 的 HTTP 标头。 |
| [GetCookies](./getcookies/)(System::SharedPtr\<Uri\>) | 返回与指定 URI 关联的 cookie 集合。 |
| [InternalGetCookies](./internalgetcookies/)(System::SharedPtr\<Uri\>) | 返回与指定 URI 关联的 cookie 集合。 |
| [IsLocalDomain](./islocaldomain/)(String) | 检查指定的域是否为 localhost。 |
| [set_Capacity](./set_capacity/)(int32_t) | 设置集合容量。 |
| [set_MaxCookieSize](./set_maxcookiesize/)(int32_t) | 设置最大 cookie 大小。 |
| [set_PerDomainCapacity](./set_perdomaincapacity/)(int32_t) | 设置每个域的集合容量。 |
| [SetCookies](./setcookies/)(System::SharedPtr\<Uri\>, String) | 将指定标头中的 cookie 复制到集合，并将其与指定 URI 关联。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [DefaultCookieLengthLimit](./defaultcookielengthlimit/) | 最大 cookie 大小。 |
| static [DefaultCookieLimit](./defaultcookielimit/) | RTTI 信息。 |
| static [DefaultPerDomainCookieLimit](./defaultperdomaincookielimit/) | 每个域的最大集合项目数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
