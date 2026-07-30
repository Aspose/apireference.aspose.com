---
title: "System::Net::Http::Headers::HttpHeaders 类"
linktitle: "HttpHeaders"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::HttpHeaders 类。HTTP 标头的集合。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 700
url: /zh/cpp/system.net.http.headers/httpheaders/
---
## HttpHeaders class


HTTP 标头的集合。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpHeaders : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<System::Collections::Generic::IEnumerable<System::String>>>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | 验证新的 name-values 对并将其添加到当前集合中。 |
| [Add](./add/)(String, String) | 验证新的 name-value 对并将其添加到当前集合中。 |
| virtual [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) | 将指定的 HttpHeaders 类实例与当前实例连接。 |
| [AddParsedValue](./addparsedvalue/)(String, System::SharedPtr\<Object\>) | 根据指定的名称获取标头并向标头添加已解析的值。 |
| [Clear](./clear/)() | 从集合中移除所有项。 |
| [Contains](./contains/)(String) |  |
| [ContainsParsedValue](./containsparsedvalue/)(String, System::SharedPtr\<Object\>) | 检查标头是否包含指定的值。 |
| [GetEnumerator](./getenumerator/)() override | 获取枚举器。 |
| [GetHeaderString](./getheaderstring/)(String) | 返回指定标头名称对应的值的字符串表示。 |
| [GetHeaderString](./getheaderstring/)(String, System::SharedPtr\<Object\>) | 返回指定标头名称对应的值的字符串表示。 |
| [GetHeaderStrings](./getheaderstrings/)() | 返回一个包含标头值字符串表示的集合。 |
| [GetParsedValues](./getparsedvalues/)(String) | 返回指定标头名称的已解析值。 |
| [GetValues](./getvalues/)(String) | 返回指定名称对应的值。 |
| static [ParsedValuesAsList](./parsedvaluesaslist/)(const System::SharedPtr\<Object\>) | 将已解析的值转换为列表。 |
| [Remove](./remove/)(String) | 尝试根据指定名称移除项。 |
| [RemoveParsedValue](./removeparsedvalue/)(String, System::SharedPtr\<Object\>) | 根据指定的名称获取标头并从标头中移除已解析的值。 |
| [SetConfiguration](./setconfiguration/)(System::SharedPtr\<Collections::Generic::Dictionary\<String, System::SharedPtr\<HttpHeaderParser\>\>\>, System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) |  |
| [SetOrRemoveParsedValue](./setorremoveparsedvalue/)(String, System::SharedPtr\<Object\>) | 根据指定的名称获取标头并设置或移除其值。当 'value' 参数为 nullptr 时，标头值将被移除；否则将设置已解析的值。 |
| [SetParsedValue](./setparsedvalue/)(String, System::SharedPtr\<Object\>) | 根据指定的名称获取标头并向标头设置已解析的值。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, String) | 尝试向当前集合添加新的名称-值对。 |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | 向当前集合添加一组名称-值对。 |
| [TryGetValues](./trygetvalues/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&) | 尝试根据指定名称获取对应的值。 |
| [TryParseAndAddValue](./tryparseandaddvalue/)(String, String) | 尝试解析指定的值并将其添加到标头值中。 |
## 另见

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
