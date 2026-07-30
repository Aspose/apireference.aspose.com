---
title: "System::Security::Cryptography::AsymmetricAlgorithm class"
linktitle: "AsymmetricAlgorithm"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::AsymmetricAlgorithm 类。非对称加密算法的抽象基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 200
url: /zh/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


非对称加密算法的抽象基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clear](./clear/)() | 释放所有资源。 |
| static [Create](./create/)() | 创建默认算法。未实现。 |
| static [Create](./create/)(const String\&) | 按名称创建算法。未实现。 |
| [Dispose](./dispose/)() override | 释放当前对象拥有的资源。 |
| virtual [FromXmlString](./fromxmlstring/)(String) | 从 XML 字符串读取算法参数。 |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | 获取要使用的密钥交换算法。 |
| virtual [get_KeySize](./get_keysize/)() | RTTI 信息。 |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | 获取允许的密钥大小数组。 |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | 获取要使用的签名算法。 |
| virtual [set_KeySize](./set_keysize/)(int32_t) | 设置密钥大小。 |
| virtual [ToXmlString](./toxmlstring/)(bool) | 将算法参数写入 XML 字符串。 |
## 另见

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
