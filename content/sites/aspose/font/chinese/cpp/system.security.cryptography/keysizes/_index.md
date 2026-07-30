---
title: "System::Security::Cryptography::KeySizes 类"
linktitle: "KeySizes"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::KeySizes 类。对称算法接受的密钥大小集合。该类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2200
url: /zh/cpp/system.security.cryptography/keysizes/
---
## KeySizes class


对称算法接受的密钥大小集合。该类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class KeySizes : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_MaxSize](./get_maxsize/)() const | 获取最大有效密钥大小。 |
| [get_MinSize](./get_minsize/)() const | 获取最小有效密钥大小。 |
| [get_SkipSize](./get_skipsize/)() const | 获取有效密钥大小步长。 |
| [KeySizes](./keysizes/)(int, int, int) | RTTI 信息。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
