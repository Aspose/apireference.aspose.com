---
title: "System::Security::Cryptography::SymmetricAlgorithm 类"
linktitle: "SymmetricAlgorithm"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::SymmetricAlgorithm 类。使用相同密钥进行加密和解密的对称算法基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 4900
url: /zh/cpp/system.security.cryptography/symmetricalgorithm/
---
## SymmetricAlgorithm class


使用相同密钥进行加密和解密的对称算法基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SymmetricAlgorithm : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Create](./create/)(const String\&) | 创建算法实例。 |
| virtual [CreateDecryptor](./createdecryptor/)() | 使用与算法对象关联的参数创建解密器。 |
| virtual [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | 使用显式参数创建解密器。 |
| virtual [CreateEncryptor](./createencryptor/)() | 使用与算法对象关联的参数创建加密器。 |
| virtual [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | 使用显式参数创建加密器。 |
| virtual [GenerateIV](./generateiv/)() | 为算法生成随机初始向量。覆盖已有的（如果有）。 |
| virtual [GenerateKey](./generatekey/)() | 为算法生成随机密钥。覆盖已有的（如果有）。 |
| virtual [get_BlockSize](./get_blocksize/)() | 获取加密操作的块大小。 |
| virtual [get_FeedbackSize](./get_feedbacksize/)() | 获取加密操作的反馈大小。 |
| virtual [get_IV](./get_iv/)() | 获取加密操作的初始向量。如果尚未创建则创建新的。 |
| virtual [get_Key](./get_key/)() | 获取加密操作的密钥。如果尚未创建则创建新的。 |
| virtual [get_KeySize](./get_keysize/)() | 获取加密操作的密钥大小。 |
| virtual [get_Mode](./get_mode/)() | 获取加密操作的模式。 |
| virtual [get_Padding](./get_padding/)() | 获取加密操作的填充方式。 |
| virtual [set_BlockSize](./set_blocksize/)(int) | 设置加密操作的块大小。 |
| virtual [set_FeedbackSize](./set_feedbacksize/)(int) | 设置加密操作的反馈大小。 |
| virtual [set_IV](./set_iv/)(System::ArrayPtr\<uint8_t\>) | 设置加密操作的初始向量。 |
| virtual [set_Key](./set_key/)(System::ArrayPtr\<uint8_t\>) | 设置加密操作的密钥。 |
| virtual [set_KeySize](./set_keysize/)(int) | 设置加密操作的密钥大小。 |
| virtual [set_Mode](./set_mode/)(CipherMode) | 设置加密操作的模式。 |
| virtual [set_Padding](./set_padding/)(PaddingMode) | 设置加密操作的填充方式。 |
| [ValidKeySize](./validkeysize/)(int) | 检查密钥大小是否有效。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
