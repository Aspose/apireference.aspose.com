---
title: "System::Xml::XmlWriterSettings 클래스"
linktitle: "XmlWriterSettings"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlWriterSettings 클래스. C++에서 XmlWriter::Create 메서드로 생성된 XmlWriter 객체가 지원하도록 하는 기능 집합을 지정합니다."
type: docs
weight: 4500
url: /ko/cpp/system.xml/xmlwritersettings/
---
## XmlWriterSettings class


[XmlWriter](../xmlwriter/) 객체가 [XmlWriter::Create](../xmlwriter/create/) 메서드에 의해 생성될 때 지원하도록 하는 기능 집합을 지정합니다.

```cpp
class XmlWriterSettings : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() | [XmlWriterSettings](./) 인스턴스의 복사본을 생성합니다. |
| [get_CheckCharacters](./get_checkcharacters/)() | 문서의 모든 문자가 W3C [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets)의 "2.2 Characters" 섹션에 부합하는지 확인하도록 XML 작성기가 검사해야 하는지를 나타내는 값을 반환합니다. |
| [get_CloseOutput](./get_closeoutput/)() | [XmlWriter](../xmlwriter/)가 [XmlWriter::Close](../xmlwriter/close/) 메서드가 호출될 때 기본 스트림이나 TextWriter도 닫아야 하는지를 나타내는 값을 반환합니다. |
| [get_ConformanceLevel](./get_conformancelevel/)() | XML 작성기가 XML 출력에 대해 검사하는 호환성 수준을 반환합니다. |
| [get_DoNotEscapeUriAttributes](./get_donotescapeuriattributes/)() | [XmlWriter](../xmlwriter/)가 URI 속성을 이스케이프하지 않는지를 나타내는 값을 반환합니다. |
| [get_Encoding](./get_encoding/)() | 사용할 텍스트 인코딩 유형을 반환합니다. |
| [get_Indent](./get_indent/)() | 요소를 들여쓰기할지 여부를 나타내는 값을 반환합니다. |
| [get_IndentChars](./get_indentchars/)() | 들여쓰기 시 사용할 문자열을 반환합니다. 이 설정은 [XmlWriterSettings::set_Indent](./set_indent/) 값이 **true** 로 설정된 경우에 사용됩니다. |
| [get_NamespaceHandling](./get_namespacehandling/)() | [XmlWriter](../xmlwriter/)가 XML 콘텐츠를 작성할 때 중복 네임스페이스 선언을 제거해야 하는지를 나타내는 값을 반환합니다. 기본 동작은 작성기가 자신의 네임스페이스 해결기에 존재하는 모든 네임스페이스 선언을 출력하는 것입니다. |
| [get_NewLineChars](./get_newlinechars/)() | 줄 바꿈에 사용할 문자열을 반환합니다. |
| [get_NewLineHandling](./get_newlinehandling/)() | 출력에서 줄 바꿈을 정규화할지 여부를 나타내는 값을 반환합니다. |
| [get_NewLineOnAttributes](./get_newlineonattributes/)() | 속성을 새 줄에 쓸지 여부를 나타내는 값을 반환합니다. |
| [get_OmitXmlDeclaration](./get_omitxmldeclaration/)() | XML 선언을 생략할지 여부를 나타내는 값을 반환합니다. |
| [get_OutputMethod](./get_outputmethod/)() | [XmlWriter](../xmlwriter/) 출력물을 직렬화하는 데 사용되는 방법을 반환합니다. |
| [get_WriteEndDocumentOnClose](./get_writeenddocumentonclose/)() | [XmlWriter](../xmlwriter/)가 [XmlWriter::Close](../xmlwriter/close/) 메서드가 호출될 때 닫히지 않은 모든 요소 태그에 닫는 태그를 추가할지 여부를 나타내는 값을 반환합니다. |
| [Reset](./reset/)() | 설정 클래스의 멤버를 기본값으로 재설정합니다. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | XML 작성기가 문서의 모든 문자가 W3C [XML 1.0 Recommendation](https://...)의 "2.2 Characters" 섹션에 부합하는지 확인하도록 하는 값을 설정합니다. |
| [set_CloseOutput](./set_closeoutput/)(bool) | [XmlWriter](../xmlwriter/)가 [XmlWriter::Close](../xmlwriter/close/) 메서드가 호출될 때 기본 스트림이나 TextWriter도 닫아야 하는지를 나타내는 값을 설정합니다. |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | XML 작성기가 XML 출력에 대해 검사하는 호환성 수준을 설정합니다. |
| [set_DoNotEscapeUriAttributes](./set_donotescapeuriattributes/)(bool) | [XmlWriter](../xmlwriter/)가 URI 속성을 이스케이프하지 않는지를 나타내는 값을 설정합니다. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | 사용할 텍스트 인코딩 유형을 설정합니다. |
| [set_Indent](./set_indent/)(bool) | 요소를 들여쓰기할지 여부를 나타내는 값을 설정합니다. |
| [set_IndentChars](./set_indentchars/)(const String\&) | 들여쓰기할 때 사용할 문자열을 설정합니다. 이 설정은 [XmlWriterSettings::set_Indent](./set_indent/) 값이 **true** 로 설정된 경우에 사용됩니다. |
| [set_NamespaceHandling](./set_namespacehandling/)(System::Xml::NamespaceHandling) | [XmlWriter](../xmlwriter/)가 XML 콘텐츠를 쓸 때 중복 네임스페이스 선언을 제거해야 하는지를 나타내는 값을 설정합니다. 기본 동작은 라이터가 라이터의 네임스페이스 해결기에 존재하는 모든 네임스페이스 선언을 출력하는 것입니다. |
| [set_NewLineChars](./set_newlinechars/)(const String\&) | 줄 바꿈에 사용할 문자열을 설정합니다. |
| [set_NewLineHandling](./set_newlinehandling/)(System::Xml::NewLineHandling) | 출력에서 줄 바꿈을 정규화할지 여부를 나타내는 값을 설정합니다. |
| [set_NewLineOnAttributes](./set_newlineonattributes/)(bool) | 속성을 새 줄에 쓸지 여부를 나타내는 값을 설정합니다. |
| [set_OmitXmlDeclaration](./set_omitxmldeclaration/)(bool) | XML 선언을 생략할지 여부를 나타내는 값을 설정합니다. |
| [set_WriteEndDocumentOnClose](./set_writeenddocumentonclose/)(bool) | [XmlWriter](../xmlwriter/)가 [XmlWriter::Close](../xmlwriter/close/) 메서드가 호출될 때 닫히지 않은 모든 요소 태그에 닫는 태그를 추가할지 여부를 나타내는 값을 설정합니다. |
| [XmlWriterSettings](./xmlwritersettings/)() | [XmlWriterSettings](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
