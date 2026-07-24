---
title: "System::Xml::XmlCharacterData 클래스"
linktitle: "XmlCharacterData"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlCharacterData 클래스. C++에서 여러 클래스가 사용하는 텍스트 조작 메서드를 제공합니다."
type: docs
weight: 900
url: /ko/cpp/system.xml/xmlcharacterdata/
---
## XmlCharacterData class


여러 클래스에서 사용하는 텍스트 조작 메서드를 제공합니다.

```cpp
class XmlCharacterData : public System::Xml::XmlLinkedNode
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [AppendData](./appenddata/)(String) | 지정된 문자열을 노드의 문자 데이터 끝에 추가합니다. |
| virtual [DeleteData](./deletedata/)(int32_t, int32_t) | 노드에서 문자 범위를 제거합니다. |
| virtual [get_Data](./get_data/)() | 노드의 데이터를 반환합니다. |
| [get_InnerText](./get_innertext/)() override | 노드와 해당 노드의 모든 자식 노드의 연결된 값을 반환합니다. |
| virtual [get_Length](./get_length/)() | 데이터의 길이를 문자 단위로 반환합니다. |
| [get_Value](./get_value/)() override | 노드의 값을 반환합니다. |
| virtual [InsertData](./insertdata/)(int32_t, String) | 지정된 문자 오프셋에 지정된 문자열을 삽입합니다. |
| virtual [ReplaceData](./replacedata/)(int32_t, int32_t, String) | 지정된 오프셋에서 시작하는 지정된 수의 문자를 지정된 문자열로 교체합니다. |
| virtual [set_Data](./set_data/)(String) | 노드의 데이터를 설정합니다. |
| [set_InnerText](./set_innertext/)(String) override | 노드와 해당 노드의 모든 자식 노드의 연결된 값을 설정합니다. |
| [set_Value](./set_value/)(String) override | 노드의 값을 설정합니다. |
| virtual [Substring](./substring/)(int32_t, int32_t) | 지정된 범위에서 전체 문자열의 부분 문자열을 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
