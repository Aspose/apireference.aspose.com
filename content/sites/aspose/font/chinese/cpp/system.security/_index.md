---
title: "System::Security 命名空间"
linktitle: "System::Security"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Security 命名空间。"
type: docs
weight: 5800
url: /zh/cpp/system.security/
---



## 类

| 类 | 描述 |
| --- | --- |
| [SecureString](./securestring/) | 安全字符串，表示应保密的文本。此类不对内部数据进行加密。该类的对象只能通过使用 [System::MakeObject()](../system/makeobject/) 函数来分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [SecureStringMarshal](./securestringmarshal/) | 用于分配和复制非托管内存块的方法集合。 |
| [SecurityElement](./securityelement/) | 用于编码安全对象的 XML 对象模型。未实现。该类的对象只能通过使用 [System::MakeObject()](../system/makeobject/) 函数来分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [SecureStringPtr](./securestringptr/) | [SecureString](./securestring/) 指针类型。 |
