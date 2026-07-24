---
title: "System::Xml::Schema::XmlSchemaSet 클래스"
linktitle: "XmlSchemaSet"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSet 클래스. C++에서 XML 스키마 정의 언어 (XSD) 스키마의 캐시를 포함합니다."
type: docs
weight: 5800
url: /ko/cpp/system.xml.schema/xmlschemaset/
---
## XmlSchemaSet class


XML [Schema](../) 정의 언어 (XSD) 스키마의 캐시를 포함합니다.

```cpp
class XmlSchemaSet : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(String, const String\&) | 지정된 URL에 있는 XML [Schema](../) 정의 언어 (XSD) 스키마를 [XmlSchemaSet](./)에 추가합니다. |
| [Add](./add/)(String, const SharedPtr\<XmlReader\>\&) | [XmlReader](../../system.xml/xmlreader/)에 포함된 XML [Schema](../) 정의 언어 (XSD) 스키마를 [XmlSchemaSet](./)에 추가합니다. |
| [Add](./add/)(const SharedPtr\<XmlSchemaSet\>\&) | 주어진 [XmlSchemaSet](./)에 있는 모든 XML [Schema](../) 정의 언어 (XSD) 스키마를 [XmlSchemaSet](./)에 추가합니다. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | 주어진 [XmlSchema](../xmlschema/)를 [XmlSchemaSet](./)에 추가합니다. |
| [Compile](./compile/)() | [XmlSchemaSet](./)에 추가된 XML [Schema](../) 정의 언어 (XSD) 스키마를 하나의 논리 스키마로 컴파일합니다. |
| [Contains](./contains/)(String) | 지정된 대상 네임스페이스 URI를 가진 XML [Schema](../) 정의 언어 (XSD) 스키마가 [XmlSchemaSet](./)에 있는지 여부를 나타냅니다. |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | 지정된 XML [Schema](../) 정의 언어 (XSD) [XmlSchema](../xmlschema/) 객체가 [XmlSchemaSet](./)에 있는지 여부를 나타냅니다. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | [XmlSchemaSet](./)에서 모든 [XmlSchema](../xmlschema/) 객체를 지정된 인덱스부터 주어진 배열에 복사합니다. |
| [get_CompilationSettings](./get_compilationsettings/)() | XML 스키마 컴파일 설정인 [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/)을 [XmlSchemaSet](./)에 대해 반환합니다. |
| [get_Count](./get_count/)() | XML [Schema](../) 정의 언어 (XSD) 스키마의 논리적 개수를 [XmlSchemaSet](./)에서 반환합니다. |
| [get_GlobalAttributes](./get_globalattributes/)() | XML [Schema](../) 정의 언어 (XSD) 스키마에 포함된 모든 전역 속성을 [XmlSchemaSet](./)에서 반환합니다. |
| [get_GlobalElements](./get_globalelements/)() | XML [Schema](../) 정의 언어 (XSD) 스키마에 포함된 모든 전역 요소를 [XmlSchemaSet](./)에서 반환합니다. |
| [get_GlobalTypes](./get_globaltypes/)() | XML [Schema](../) 정의 언어 (XSD) 스키마에 포함된 모든 전역 단순 및 복합 유형을 [XmlSchemaSet](./)에서 반환합니다. |
| [get_IsCompiled](./get_iscompiled/)() | XML [Schema](../) 정의 언어 (XSD) 스키마가 [XmlSchemaSet](./)에서 컴파일되었는지 여부를 나타내는 값을 반환합니다. |
| [get_NameTable](./get_nametable/)() | 새 XML [Schema](../) 정의 언어 (XSD) 스키마를 로드할 때 [XmlSchemaSet](./)에서 사용하는 기본 [XmlNameTable](../../system.xml/xmlnametable/)을 반환합니다. |
| [Remove](./remove/)(const SharedPtr\<XmlSchema\>\&) | 지정된 XML [Schema](../) 정의 언어 (XSD) 스키마를 [XmlSchemaSet](./)에서 제거합니다. |
| [RemoveRecursive](./removerecursive/)(const SharedPtr\<XmlSchema\>\&) | 지정된 XML [Schema](../) 정의 언어 (XSD) 스키마와 해당 스키마가 가져오는 모든 스키마를 [XmlSchemaSet](./)에서 제거합니다. |
| [Reprocess](./reprocess/)(SharedPtr\<XmlSchema\>) | 이미 [XmlSchemaSet](./)에 존재하는 XML [Schema](../) 정의 언어 (XSD) 스키마를 다시 처리합니다. |
| [Schemas](./schemas/)() | XML [Schema](../) 정의 언어 (XSD) 스키마 전체를 포함하는 컬렉션을 [XmlSchemaSet](./)에서 반환합니다. |
| [Schemas](./schemas/)(String) | 주어진 네임스페이스에 속하는 XML [Schema](../) 정의 언어 (XSD) 스키마 전체를 포함하는 컬렉션을 [XmlSchemaSet](./)에서 반환합니다. |
| [set_CompilationSettings](./set_compilationsettings/)(const SharedPtr\<XmlSchemaCompilationSettings\>\&) | [XmlSchemaSet](./)에 대한 [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/)을 설정합니다. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | 스키마의 include 및 import 요소에서 참조된 네임스페이스 또는 위치를 해결하는 데 사용되는 [XmlResolver](../../system.xml/xmlresolver/)을 설정합니다. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | XML [Schema](../) 정의 언어 (XSD) 스키마 검증 오류에 대한 정보를 받기 위한 이벤트 핸들러를 추가합니다. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | XML [Schema](../) 정의 언어 (XSD) 스키마 검증 오류에 대한 정보를 받기 위한 이벤트 핸들러를 제거합니다. |
| [XmlSchemaSet](./xmlschemaset/)() | [XmlSchemaSet](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlSchemaSet](./xmlschemaset/)(const SharedPtr\<XmlNameTable\>\&) | 지정된 [XmlNameTable](../../system.xml/xmlnametable/)을 사용하여 [XmlSchemaSet](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
