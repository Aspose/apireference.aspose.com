---
title: "System::Security::SecureString 类"
linktitle: "SecureString"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::SecureString 类。安全字符串，表示应保密的文本。此类 DON''T ENCRYPTING 内部数据。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给函数（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.security/securestring/
---
## SecureString class


安全字符串，表示应保密的文本。此类 DON'T ENCRYPTING 内部数据。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SecureString : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AppendChar](./appendchar/)(char16_t) | 在字符串末尾追加一个字符。 |
| [Clear](./clear/)() | 删除当前安全字符串中的所有字符。 |
| [Copy](./copy/)() const | 创建此安全字符串的副本。 |
| [Dispose](./dispose/)() override | 释放当前对象使用的所有资源。 |
| [get_Length](./get_length/)() const | 获取此安全字符串中的字符数。 |
| [InsertAt](./insertat/)(int32_t, char16_t) | 在指定索引处插入一个字符。 |
| [IsReadOnly](./isreadonly/)() const | 获取指示此对象是否标记为只读的标志。 |
| [MakeReadOnly](./makereadonly/)() | 将此安全字符串设为只读。 |
| [operator=](./operator=/)(const SecureString\&) |  |
| [RemoveAt](./removeat/)(int32_t) | 移除指定位置的字符。 |
| [SecureString](./securestring/)() | RTTI 信息。 |
| [SecureString](./securestring/)(const char16_t *, int32_t) | 构造函数。 |
| [SecureString](./securestring/)(const SecureString\&) |  |
| [SetAt](./setat/)(int32_t, char16_t) | 替换指定位置的现有字符。 |
| [ToUnsecureString](./tounsecurestring/)() const | 将此安全字符串的内容复制到不安全的 [String](../../system/string/) 对象中。请谨慎使用。 |
| [~SecureString](./~securestring/)() | 析构函数。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security](../)
* Library [Aspose.Font for C++](../../)
