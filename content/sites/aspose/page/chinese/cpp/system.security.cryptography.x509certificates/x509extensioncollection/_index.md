---
title: "System::Security::Cryptography::X509Certificates::X509ExtensionCollection 类"
linktitle: "X509ExtensionCollection"
second_title: "Aspose.Page 适用于 C++"
description: "System::Security::Cryptography::X509Certificates::X509ExtensionCollection 类。扩展对象的集合。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 1300
url: /zh/cpp/system.security.cryptography.x509certificates/x509extensioncollection/
---
## X509ExtensionCollection class


扩展对象的集合。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class X509ExtensionCollection : public System::Collections::Generic::List<SharedPtr<X509Extension>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [idx_get](./idx_get/)(const String\&) const | 访问器。未实现。 |
| [idx_get](./idx_get/)(int) const override | RTTI 数据。 |
| [X509ExtensionCollection](./x509extensioncollection/)() | 构造空集合。 |
## 另见

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
