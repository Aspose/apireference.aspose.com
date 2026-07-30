---
title: "System::Net::CookieCollection 类"
linktitle: "CookieCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::CookieCollection 类。表示已排序 cookie 的列表。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 200
url: /zh/cpp/system.net/cookiecollection/
---
## CookieCollection class


表示已排序 cookie 的列表。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数中作为参数传递。

```cpp
class CookieCollection : public System::Collections::Generic::ICollection<System::SharedPtr<System::Net::Cookie>>
```

## Enums

| 枚举 | 描述 |
| --- | --- |
| [Stamp](./stamp/) | RTTI 信息。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Cookie\>\&) override | 向集合中添加一个 Cookie。 |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | 将指定集合中的 cookie 添加到当前集合中。 |
| [Clear](./clear/)() override | 从集合中移除所有 cookie。 |
| [Contains](./contains/)(const System::SharedPtr\<Cookie\>\&) const override | 检查集合是否包含指定的 cookie。 |
| [CookieCollection](./cookiecollection/)() | 构造一个新实例。 |
| [get_Count](./get_count/)() const override | 获取集合中的元素数量。 |
| [get_IsOtherVersionSeen](./get_isotherversionseen/)() | 返回一个值，指示集合中是否包含版本不等于 [Cookie::MaxSupportedVersion](../cookie/maxsupportedversion/) 的 cookie。 |
| [GetEnumerator](./getenumerator/)() override | 获取枚举器。 |
| [idx_get](./idx_get/)(int32_t) | 返回位于指定索引的 cookie 集合中的 cookie。 |
| [idx_get](./idx_get/)(String) | 根据指定名称返回 cookie 集合中的 cookie。 |
| [IndexOf](./indexof/)(System::SharedPtr\<Cookie\>) | 返回指定 cookie 的索引。 |
| [InternalAdd](./internaladd/)(System::SharedPtr\<Cookie\>, bool) | 将指定的 cookie 添加到集合中。 |
| [Remove](./remove/)(const System::SharedPtr\<Cookie\>\&) override | 从集合中移除指定的 cookie。 |
| [RemoveAt](./removeat/)(int32_t) | 移除位于指定索引的 cookie。 |
| [TimeStamp](./timestamp/)(CookieCollection::Stamp) | 根据指定场景更新时间戳并返回新值。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
## 另见

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
