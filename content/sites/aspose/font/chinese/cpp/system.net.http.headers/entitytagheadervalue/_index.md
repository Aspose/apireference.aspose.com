---
title: "System::Net::Http::Headers::EntityTagHeaderValue 类"
linktitle: "EntityTagHeaderValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::EntityTagHeaderValue 类。表示 ''Entity-Tag'' 头的值。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 500
url: /zh/cpp/system.net.http.headers/entitytagheadervalue/
---
## EntityTagHeaderValue class


表示 'Entity-Tag' 头的值。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class EntityTagHeaderValue : public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String) | 构造一个新实例。 |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String, bool) | 构造一个新实例。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| static [get_Any](./get_any/)() | 获取 'ETag' 头的值。 |
| [get_IsWeak](./get_isweak/)() | 获取一个值，用于指示当前实例是否为弱验证器。 |
| [get_Tag](./get_tag/)() | RTTI 信息。 |
| static [GetEntityTagLength](./getentitytaglength/)(String, int32_t, System::SharedPtr\<EntityTagHeaderValue\>\&) | 将传入的字符串从指定索引转换为 [EntityTagHeaderValue](./) 类的实例。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| static [Parse](./parse/)(String) | 将传入的字符串转换为 [EntityTagHeaderValue](./) 类的实例。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<EntityTagHeaderValue\>\&) | 尝试将传入的字符串转换为 [EntityTagHeaderValue](./) 类的实例。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
