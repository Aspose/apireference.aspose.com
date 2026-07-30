---
title: "System::Security::Cryptography::RandomNumberGenerator 类"
linktitle: "RandomNumberGenerator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RandomNumberGenerator 类。用于随机数生成器继承的抽象类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2600
url: /zh/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


用于随机数生成器继承的抽象类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Create](./create/)() | 创建一个默认实现的加密随机数生成器实例，可用于生成随机数据。未实现。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | 用随机字节填充现有数组元素。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | 用随机字节填充现有数组切片。 |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | 用随机字节填充现有数组视图元素。 |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | 用随机字节填充现有数组视图切片。 |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | 用随机字节填充现有栈数组元素。 |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | 用随机字节填充现有栈数组切片。 |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | 用随机非零字节填充现有数组元素。 |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | 用随机非零字节填充现有数组视图元素。 |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | 用随机非零字节填充现有栈数组元素。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
