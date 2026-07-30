---
title: "System::Security::Cryptography::DeriveBytes 类"
linktitle: "DeriveBytes"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::DeriveBytes 类。抽象类，所有派生指定长度字节序列的类均继承自该类。该类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 800
url: /zh/cpp/system.security.cryptography/derivebytes/
---
## DeriveBytes class


抽象类，所有派生指定长度字节序列的类均继承自它。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class DeriveBytes : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [GetBytes](./getbytes/)(int32_t) | RTTI 信息。 |
| virtual [Reset](./reset/)() |  |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
