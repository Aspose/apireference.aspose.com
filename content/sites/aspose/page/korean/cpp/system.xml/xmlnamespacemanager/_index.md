---
title: "System::Xml::XmlNamespaceManager 클래스"
linktitle: "XmlNamespaceManager"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNamespaceManager 클래스. 컬렉션에 네임스페이스를 해결하고 추가 및 제거하며, C++에서 이러한 네임스페이스에 대한 범위 관리를 제공합니다."
type: docs
weight: 2300
url: /ko/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


컬렉션에 네임스페이스를 해결, 추가 및 제거하고, 이러한 네임스페이스에 대한 범위 관리를 제공합니다.

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | 주어진 네임스페이스를 컬렉션에 추가합니다. |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | 기본 네임스페이스에 대한 네임스페이스 URI를 반환합니다. |
| virtual [get_NameTable](./get_nametable/)() | 이 객체와 연결된 [XmlNameTable](../xmlnametable/)을 반환합니다. |
| [GetEnumerator](./getenumerator/)() override | [XmlNamespaceManager](./)의 네임스페이스를 반복하는 데 사용할 열거자를 반환합니다. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | 현재 범위에 있는 네임스페이스를 열거하는 데 사용할 수 있는 접두사별 키가 있는 네임스페이스 이름 컬렉션을 반환합니다. |
| virtual [HasNamespace](./hasnamespace/)(String) | 제공된 접두사가 현재 푸시된 범위에 대해 정의된 네임스페이스가 있는지 여부를 나타내는 값을 반환합니다. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | 지정된 접두사에 대한 네임스페이스 URI를 반환합니다. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | 주어진 네임스페이스 URI에 선언된 접두사를 찾습니다. |
| virtual [PopScope](./popscope/)() | 스택에서 네임스페이스 범위를 팝합니다. |
| virtual [PushScope](./pushscope/)() | 스택에 네임스페이스 범위를 푸시합니다. |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | 주어진 접두사에 대한 주어진 네임스페이스를 제거합니다. |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | 지정된 [XmlNameTable](../xmlnametable/)을 사용하여 [XmlNamespaceManager](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
