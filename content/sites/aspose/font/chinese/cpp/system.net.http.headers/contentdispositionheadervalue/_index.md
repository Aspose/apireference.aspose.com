---
title: "System::Net::Http::Headers::ContentDispositionHeaderValue 类"
linktitle: "ContentDispositionHeaderValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::ContentDispositionHeaderValue 类。表示 ''Content-Disposition'' 头部的值。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 300
url: /zh/cpp/system.net.http.headers/contentdispositionheadervalue/
---
## ContentDispositionHeaderValue class


表示 'Content-Disposition' 头部的值。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ContentDispositionHeaderValue : public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)() | 构造一个新实例。 |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)(String) | 构造一个新实例。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| [get_CreationDate](./get_creationdate/)() | 获取文件创建日期。 |
| [get_DispositionType](./get_dispositiontype/)() | RTTI 信息。 |
| [get_FileName](./get_filename/)() | 获取一个值，用于确定如何构建用于存储消息负载的文件名。当实体被分离并存储在单独的文件中时使用此值。 |
| [get_FileNameStar](./get_filenamestar/)() | 获取一个值，用于确定如何构建用于存储消息负载的文件名。该值在实体被分离并存储在单独的文件中时使用。 |
| [get_ModificationDate](./get_modificationdate/)() | 获取文件的修改日期。 |
| [get_Name](./get_name/)() | 获取内容主体某部分的名称。 |
| [get_Parameters](./get_parameters/)() | 返回 'Content-Disposition' 头的参数集合。 |
| [get_ReadDate](./get_readdate/)() | 获取文件上次读取的日期。 |
| [get_Size](./get_size/)() | 获取文件的大致大小。 |
| static [GetDispositionTypeLength](./getdispositiontypelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 将传入的字符串从指定索引转换为 [ContentDispositionHeaderValue](./) 类的实例。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| static [Parse](./parse/)(String) | 将传入的字符串转换为 [ContentDispositionHeaderValue](./) 类的实例。 |
| [set_CreationDate](./set_creationdate/)(Nullable\<DateTimeOffset\>) | 设置文件的创建日期。 |
| [set_DispositionType](./set_dispositiontype/)(String) | 设置处置类型。 |
| [set_FileName](./set_filename/)(String) | 设置一个值，用于确定如何构建用于存储消息负载的文件名。该值在实体被分离并存储在单独的文件中时使用。 |
| [set_FileNameStar](./set_filenamestar/)(String) | 设置一个值，用于确定如何构建用于存储消息负载的文件名。该值在实体被分离并存储在单独的文件中时使用。 |
| [set_ModificationDate](./set_modificationdate/)(Nullable\<DateTimeOffset\>) | 设置文件的修改日期。 |
| [set_Name](./set_name/)(String) | 设置内容主体某部分的名称。 |
| [set_ReadDate](./set_readdate/)(Nullable\<DateTimeOffset\>) | 设置文件上次读取的日期。 |
| [set_Size](./set_size/)(Nullable\<int64_t\>) | 设置文件的大致大小。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentDispositionHeaderValue\>\&) | 尝试将传入的字符串转换为 [ContentDispositionHeaderValue](./) 类的实例。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
