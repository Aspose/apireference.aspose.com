---
title: "System::Net::ICredentials class"
linktitle: "ICredentials"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::ICredentials 类。提供身份验证接口。此类的对象应仅通过 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2200
url: /zh/cpp/system.net/icredentials/
---
## ICredentials class


提供身份验证接口。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ICredentials : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) | RTTI 信息。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
