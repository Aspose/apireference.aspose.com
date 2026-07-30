---
title: "System::Security::Cryptography::X509Certificates::X509ExtensionEnumerator 类"
linktitle: "X509ExtensionEnumerator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::X509Certificates::X509ExtensionEnumerator 类。用于遍历扩展集合的枚举器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1500
url: /zh/cpp/system.security.cryptography.x509certificates/x509extensionenumerator/
---
## X509ExtensionEnumerator class


用于遍历扩展集合的枚举器。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class X509ExtensionEnumerator : public System::Collections::Generic::SimpleEnumerator<X509ExtensionCollection::vector_t>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [X509ExtensionEnumerator](./x509extensionenumerator/)(const SharedPtr\<X509ExtensionCollection\>\&) | 创建枚举器。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [BaseType](./basetype/) | 父类型。 |
| [ThisType](./thistype/) | 此类型。 |
## 另见

* Class [SimpleEnumerator](../../system.collections.generic/simpleenumerator/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
