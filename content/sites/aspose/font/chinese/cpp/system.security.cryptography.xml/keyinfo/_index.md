---
title: "System::Security::Cryptography::Xml::KeyInfo 类"
linktitle: "KeyInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::Xml::KeyInfo 类。表示 XML 数字签名或 XML 加密的 KeyInfo 元素。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 300
url: /zh/cpp/system.security.cryptography.xml/keyinfo/
---
## KeyInfo class


表示 [KeyInfo](./) 元素，属于 XML 数字签名或 XML 加密。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class KeyInfo : public System::Collections::Generic::IEnumerable<SharedPtr<Xml::KeyInfoClause>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddClause](./addclause/)(SharedPtr\<KeyInfoClause\>) |  |
| [get_Count](./get_count/)() |  |
| [GetEnumerator](./getenumerator/)() override | 获取枚举器。 |
| [KeyInfo](./keyinfo/)() |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
## 另见

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
