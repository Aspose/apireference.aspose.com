---
title: "System::Net::Http::Headers::HttpHeaderValueCollection class"
linktitle: "HttpHeaderValueCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::HttpHeaderValueCollection 类。表示标头值的集合。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 800
url: /zh/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


表示标头值的集合。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T>class HttpHeaderValueCollection : public System::Collections::Generic::ICollection<T>
```


| 参数 | 描述 |
| --- | --- |
| 该 | 集合中表示的标头值的类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const T\&) override | 向集合中添加元素。 |
| [Clear](./clear/)() override | 删除集合中的所有元素。 |
| [Contains](./contains/)(const T\&) const override | 检查集合中是否存在该元素。 |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int32_t) override | 将所有集合元素复制到现有数组元素中。 |
| [get_Count](./get_count/)() const override | RTTI 信息。 |
| [get_IsReadOnly](./get_isreadonly/)() | 获取一个值，指示当前集合是否为只读。 |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() | 获取一个值，指示当前集合是否包含 "特殊值"。 |
| [GetEnumerator](./getenumerator/)() override | 获取枚举器。 |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() | 返回当前集合的字符串表示，不包含 "特殊值"。 |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) | 构造一个新实例。 |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | 构造一个新实例。 |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T) | 构造一个新实例。 |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | 构造一个新实例。 |
| [ParseAdd](./parseadd/)(String) | 解析标头字符串表示并将其添加到当前集合。 |
| [Remove](./remove/)(const T\&) override | 从集合中删除元素。 |
| [RemoveSpecialValue](./removespecialvalue/)() | 移除 "特殊值"。 |
| [SetSpecialValue](./setspecialvalue/)() | 设置 "特殊值"。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 将第 n 个模板参数设置为弱指针（而不是共享指针）。允许在容器中将指针切换为弱模式。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| [TryParseAdd](./tryparseadd/)(String) | 尝试解析标头字符串表示并将其添加到当前集合。 |

## 另见

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
