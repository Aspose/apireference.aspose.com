---
title: "System::Net::Http::Headers::MediaTypeHeaderValue 类"
linktitle: "MediaTypeHeaderValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue 类。表示 ''Content-Type'' 标头值中的 MIME 类型。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1200
url: /zh/cpp/system.net.http.headers/mediatypeheadervalue/
---
## MediaTypeHeaderValue class


表示 'Content-Type' 标头值中的 MIME 类型。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class MediaTypeHeaderValue : public virtual System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| [get_CharSet](./get_charset/)() | RTTI 信息。 |
| [get_MediaType](./get_mediatype/)() | 获取媒体类型标头的值。 |
| [get_Parameters](./get_parameters/)() | 返回媒体类型标头的值参数。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| static [GetMediaTypeLength](./getmediatypelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\>, System::SharedPtr\<MediaTypeHeaderValue\>\&) | 将传入的字符串从指定索引转换为 [MediaTypeHeaderValue](./) 类的实例。 |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)() | 构造一个新实例。 |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)(String) | 构造一个新实例。 |
| static [Parse](./parse/)(String) | 将传入的字符串转换为 [MediaTypeHeaderValue](./) 类的实例。 |
| [set_CharSet](./set_charset/)(String) | 设置字符集。 |
| [set_MediaType](./set_mediatype/)(String) | 设置媒体类型标头的值。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeHeaderValue\>\&) | 尝试将传入的字符串转换为 [MediaTypeHeaderValue](./) 类的实例。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
