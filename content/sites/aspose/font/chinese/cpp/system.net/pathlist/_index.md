---
title: "System::Net::PathList 类"
linktitle: "PathList"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::PathList 类。表示 CookieCollection 类实例的列表。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 3000
url: /zh/cpp/system.net/pathlist/
---
## PathList class


表示 [CookieCollection](../cookiecollection/) 类实例的列表。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数中作为参数传递。

```cpp
class PathList : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Create](./create/)() | 创建一个新实例。 |
| [get_Count](./get_count/)() const | 返回项目的数量。 |
| [get_SyncRoot](./get_syncroot/)() const | 返回用于同步集合的对象。 |
| [GetCookiesCount](./getcookiescount/)() | 返回所有集合项的 cookie 数量。 |
| [GetEnumerator](./getenumerator/)() | 返回当前集合的枚举器。 |
| [idx_get](./idx_get/)(String) | 根据指定路径获取 cookie 集合。 |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | 根据指定路径设置 cookie 集合。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
