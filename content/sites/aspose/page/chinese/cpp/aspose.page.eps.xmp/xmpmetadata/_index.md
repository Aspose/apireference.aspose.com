---
title: "Aspose::Page::EPS::XMP::XmpMetadata 类"
linktitle: "XmpMetadata"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata 类。提供对 C++ 中 XMP 元数据流的访问。"
type: docs
weight: 200
url: /zh/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


提供对 [XMP](../) 元数据流的访问。

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | 向元数据添加值。 |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | 向元数据添加值。 |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | 向字典中添加键和值对。 |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | 向数组中添加值。该值将被添加到数组的末尾。 |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | 通过指定索引向数组中添加值。 |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | 向结构中添加具名值。 |
| [Clear](./clear/)() override | 清除元数据。 |
| [Contains](./contains/)(const System::String\&) const | 检查键是否包含在元数据中。 |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | 检查指定的键值对是否包含在字典中。 |
| [ContainsKey](./containskey/)(const System::String\&) const override | 确定此字典是否包含指定键。 |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | 将集合的元素复制到数组中。 |
| [get_Count](./get_count/)() const override | 获取集合中元素的数量。 |
| [get_IsFixedSize](./get_isfixedsize/)() const | 检查集合是否具有固定大小。 |
| [get_IsReadOnly](./get_isreadonly/)() const override | 检查集合是否为只读。 |
| [get_IsSynchronized](./get_issynchronized/)() | 检查集合是否已同步。 |
| [get_Keys](./get_keys/)() const override | 获取元数据键的集合。 |
| [get_NamespaceManager](./get_namespacemanager/)() | 获取命名空间管理器。 |
| [get_SyncRoot](./get_syncroot/)() const | 获取集合同步对象。 |
| [get_Values](./get_values/)() const override | 获取元数据中的值。 |
| [GetEnumerator](./getenumerator/)() override | 返回字典枚举器。 |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | 通过前缀返回命名空间 URI。 |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | 返回命名空间 URI 的前缀。 |
| [idx_get](./idx_get/)(const System::String\&) const override | 从元数据获取数据。 |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | 从元数据设置数据。 |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | 注册命名空间 URI。 |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | 注册命名空间 URI。 |
| [Remove](./remove/)(const System::String\&) override | 从元数据中移除条目。 |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | 从集合中移除键/值对。 |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | 在数组中设置值。先前的值将被新值替换。 |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | 在结构体中设置具名值。如果已存在先前的具名值，将被新值替换。 |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | 尝试在字典中查找键，如果找到则检索其值。 |
## 另见

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
