---
title: "System::Security::Cryptography::MD5 类"
linktitle: "MD5"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::MD5 类。MD5 哈希算法。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 2300
url: /zh/cpp/system.security.cryptography/md5/
---
## MD5 class


[MD5](./) hashing algorithm. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class MD5 : public System::Security::Cryptography::HashAlgorithm
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Create](./create/)() | 创建 [MD5](./) 算法。 |
| static [Create](./create/)(const String\&) | 创建 [MD5](./) 算法。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ptr](./ptr/) | RTTI 信息。 |
## 另见

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
