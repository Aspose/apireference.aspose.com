---
title: "System::SmartPtrInfo 类"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Page 适用于 C++"
description: "System::SmartPtrInfo 类。用于在不知道最终类型的情况下测试和修改 SmartPtr''s 内容的服务类。用于垃圾回收和循环引用检测等。可以把它视为 ''pointer to pointer''。我们无法使用 SmartPtr''s 基类型，因为它没有；相反，我们在 C++ 中使用这个 ''info'' 类。"
type: docs
weight: 5600
url: /zh/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


用于在不知道最终类型的情况下测试和修改 [SmartPtr](../smartptr/) 的内容的服务类。用于垃圾回收和循环引用检测等。可以把它视为 'pointer to pointer'。我们无法使用 [SmartPtr](../smartptr/) 的基类型，因为它没有；相反，我们使用这个 'info' 类。

```cpp
class SmartPtrInfo
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | 获取原始对象引用指针指向的对象。 |
| [getObject](./getobject/)() const | 获取对象引用指针指向的对象。 |
| [getOwned](./getowned/)() const | 获取对象拥有的指针。 |
| [operator bool](./operatorbool/)() const | 检查 info 对象是否指向非空指针。 |
| [operator!](./operator!/)() const | 检查 info 对象是否不指向非空指针。 |
| [operator->](./operator-_/)() const | 允许调用由引用指针指向的 [Object](../object/) 的方法。 |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | Less-比较两个信息对象引用的指针的值。 |
| [SmartPtrInfo](./smartptrinfo/)() | 创建空的 [SmartPtrInfo](./) 对象。 |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | 创建带有特定智能指针信息的 [SmartPtrInfo](./) 对象。 |
## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
