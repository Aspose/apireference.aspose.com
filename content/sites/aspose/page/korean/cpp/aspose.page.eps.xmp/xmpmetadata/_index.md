---
title: "Aspose::Page::EPS::XMP::XmpMetadata class"
linktitle: "XmpMetadata"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::XMP::XmpMetadata 클래스. C++에서 XMP 메타데이터 스트림에 대한 액세스를 제공합니다."
type: docs
weight: 200
url: /ko/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


[XMP](../) 메타데이터 스트림에 대한 액세스를 제공합니다.

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | 메타데이터에 값을 추가합니다. |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | 메타데이터에 값을 추가합니다. |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | 키와 값 쌍을 사전에 추가합니다. |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | 배열에 값을 추가합니다. 값은 배열의 끝에 추가됩니다. |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | 지정된 인덱스로 배열에 값을 추가합니다. |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | 구조에 이름이 지정된 값을 추가합니다. |
| [Clear](./clear/)() override | 메타데이터를 지웁니다. |
| [Contains](./contains/)(const System::String\&) const | 키가 메타데이터에 포함되어 있는지 확인합니다. |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | 지정된 키-값 쌍이 사전에 포함되어 있는지 확인합니다. |
| [ContainsKey](./containskey/)(const System::String\&) const override | 이 사전이 지정된 키를 포함하고 있는지 확인합니다. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | 컬렉션의 요소를 배열에 복사합니다. |
| [get_Count](./get_count/)() const override | 컬렉션의 요소 개수를 가져옵니다. |
| [get_IsFixedSize](./get_isfixedsize/)() const | 컬렉션이 고정 크기인지 확인합니다. |
| [get_IsReadOnly](./get_isreadonly/)() const override | 컬렉션이 읽기 전용인지 확인합니다. |
| [get_IsSynchronized](./get_issynchronized/)() | 컬렉션이 동기화되어 있는지 확인합니다. |
| [get_Keys](./get_keys/)() const override | 메타데이터 키 컬렉션을 가져옵니다. |
| [get_NamespaceManager](./get_namespacemanager/)() | 네임스페이스 관리자를 가져옵니다. |
| [get_SyncRoot](./get_syncroot/)() const | 컬렉션 동기화 객체를 가져옵니다. |
| [get_Values](./get_values/)() const override | 메타데이터의 값을 가져옵니다. |
| [GetEnumerator](./getenumerator/)() override | 사전 열거자를 반환합니다. |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | 접두사로 네임스페이스 URI를 반환합니다. |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | 네임스페이스 URI에 따라 접두사를 반환합니다. |
| [idx_get](./idx_get/)(const System::String\&) const override | 메타데이터에서 데이터를 가져옵니다. |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | 메타데이터에서 데이터를 설정합니다. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | 네임스페이스 URI를 등록합니다. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | 네임스페이스 URI를 등록합니다. |
| [Remove](./remove/)(const System::String\&) override | 메타데이터에서 항목을 제거합니다. |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | 컬렉션에서 키/값 쌍을 제거합니다. |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | 배열에 값을 설정합니다. 이전 값은 새 값으로 교체됩니다. |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | 구조체에 명명된 값을 설정합니다. 이미 존재하는 경우 이전 명명된 값은 새 값으로 교체됩니다. |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | 사전에서 키를 찾으려고 시도하고, 찾으면 값을 반환합니다. |
## 또 보기

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
