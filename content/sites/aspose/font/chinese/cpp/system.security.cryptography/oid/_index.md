---
title: "System::Security::Cryptography::Oid 类"
linktitle: "Oid"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::Oid 类。加密对象标识符。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2500
url: /zh/cpp/system.security.cryptography/oid/
---
## Oid class


加密对象标识符。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Oid : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | 从指定的 OID 友好名称创建 OID 对象。 |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | 从指定的 OID 值创建 OID 对象。 |
| [get_FriendlyName](./get_friendlyname/)() const | 获取对象的用户友好名称。 |
| [get_Value](./get_value/)() const | 获取对象标识符字符串。 |
| [Oid](./oid/)() | RTTI 信息。 |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | 拷贝构造函数。 |
| [Oid](./oid/)(const String\&) | 构造函数。 |
| [Oid](./oid/)(const String\&, const String\&) | 构造函数。 |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | 设置对象的用户友好名称。 |
| [set_Value](./set_value/)(const String\&) | 设置对象标识符字符串。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
