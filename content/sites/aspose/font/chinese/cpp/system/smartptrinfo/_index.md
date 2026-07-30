---
title: "System::SmartPtrInfo class"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::SmartPtrInfo class。用于在不知道最终类型的情况下测试和修改 SmartPtr'' 的内容的服务类。用于垃圾回收和循环引用检测等。可以将其视为 ''pointer to pointer''。我们无法使用 SmartPtr'' 的基类型，因为它没有；相反，我们在 C++ 中使用这个 ''info'' 类。"
type: docs
weight: 5600
url: /zh/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


用于在不知道最终类型的情况下测试和修改 [SmartPtr](../smartptr/)'s 内容的服务类。用于垃圾回收和循环引用检测等。可以将其视为 'pointer to pointer'。我们无法使用 [SmartPtr](../smartptr/)'s 基类型，因为它没有；相反，我们使用这个 'info' 类。

```cpp
class SmartPtrInfo
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | 获取原始对象引用指针所指向的对象。 |
| [getObject](./getobject/)() const | 获取对象引用指针所指向的对象。 |
| [getOwned](./getowned/)() const | 获取对象拥有的指针。 |
| [operator bool](./operatorbool/)() const | 检查 info 对象是否指向非空指针。 |
| [operator!](./operator!/)() const | 检查 info 对象是否指向空指针。 |
| [operator->](./operator-_/)() const | 允许调用由引用指针指向的 [Object](../object/) 的方法。 |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | 对两个 info 对象所引用的指针值进行小于比较。 |
| [SmartPtrInfo](./smartptrinfo/)() | 创建空的 [SmartPtrInfo](./) 对象。 |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | 创建包含特定智能指针信息的 [SmartPtrInfo](./) 对象。 |
## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
