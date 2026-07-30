---
title: "System::Security::Cryptography::AsnEncodedData class"
linktitle: "AsnEncodedData"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::AsnEncodedData 类。ASN.1 编码数据。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 100
url: /zh/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


ASN.1 编码数据。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class AsnEncodedData : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI 信息。 |
| [AsnEncodedData](./asnencodeddata/)(const ByteArrayPtr\&) | 构造函数。 |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&) | 构造函数。 |
| [AsnEncodedData](./asnencodeddata/)(const String\&, const ByteArrayPtr\&) | 构造函数。 |
| virtual [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) | 从不同的对象复制数据。 |
| virtual [Format](./format/)(bool) const | 以人类可读的形式格式化数据。 |
| [get_Oid](./get_oid/)() const | 获取已编码数据的对象标识符。 |
| [get_RawData](./get_rawdata/)() const | 获取原始编码数据。 |
| [set_Oid](./set_oid/)(const SharedPtr\<Oid\>\&) | 设置已编码数据的对象标识符。 |
| [set_RawData](./set_rawdata/)(const ByteArrayPtr\&) | 设置原始编码数据。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
