---
title: "System::Security::Cryptography::SHA256 类"
linktitle: "SHA256"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::SHA256 类。计算输入数据的 SHA256 哈希。在 C++ 中，SHA256 不是抽象类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 4300
url: /zh/cpp/system.security.cryptography/sha256/
---
## SHA256 class


计算 [SHA256](./) 哈希用于输入数据。在 C++ 中，[SHA256](./) 不是抽象类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SHA256 : public System::Security::Cryptography::HashAlgorithm
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Create](./create/)() | 创建哈希算法实例。 |
| static [Create](./create/)(const String\&) | 创建哈希算法实例。 |
## 另见

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
