---
title: "System::Xml::XmlNamespaceManager 类"
linktitle: "XmlNamespaceManager"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNamespaceManager 类。解析、添加和移除集合中的命名空间，并在 C++ 中提供这些命名空间的作用域管理。"
type: docs
weight: 2300
url: /zh/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


解析、添加和移除集合中的命名空间，并提供这些命名空间的作用域管理。

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | 将给定的命名空间添加到集合中。 |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | 返回默认命名空间的 URI。 |
| virtual [get_NameTable](./get_nametable/)() | 返回与此对象关联的 [XmlNameTable](../xmlnametable/)。 |
| [GetEnumerator](./getenumerator/)() override | 返回用于遍历 [XmlNamespaceManager](./) 中命名空间的枚举器。 |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | 返回一个以前缀为键的命名空间名称集合，可用于枚举当前作用域中的命名空间。 |
| virtual [HasNamespace](./hasnamespace/)(String) | 返回一个值，指示提供的前缀在当前推送的作用域中是否已定义命名空间。 |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | 返回指定前缀的命名空间 URI。 |
| [LookupPrefix](./lookupprefix/)(const String\&) override | 查找给定命名空间 URI 声明的前缀。 |
| virtual [PopScope](./popscope/)() | 从堆栈弹出一个命名空间作用域。 |
| virtual [PushScope](./pushscope/)() | 将命名空间作用域压入堆栈。 |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | 删除给定前缀的指定命名空间。 |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | 使用指定的 [XmlNameTable](../xmlnametable/) 初始化 [XmlNamespaceManager](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
