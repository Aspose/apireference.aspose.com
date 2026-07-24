---
title: "System::Xml::XmlReader::ReadElementContentAsObject 메서드"
linktitle: "ReadElementContentAsObject"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::ReadElementContentAsObject 메서드. C++에서 현재 요소를 읽고 내용을 Object로 반환합니다."
type: docs
weight: 6200
url: /ko/cpp/system.xml/xmlreader/readelementcontentasobject/
---
## XmlReader::ReadElementContentAsObject() method


현재 요소를 읽고 내용을 [Object](../../../system/object/)로 반환합니다.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject()
```


### ReturnValue

가장 적절한 유형의 박싱된 객체입니다. [XmlReader::get_ValueType](../get_valuetype/) 값이 적절한 유형을 결정합니다. 내용이 리스트 유형으로 지정된 경우, 이 메서드는 적절한 유형의 박싱된 객체 배열을 반환합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAsObject(String, String) method


지정된 로컬 이름과 네임스페이스 URI가 현재 요소와 일치하는지 확인한 다음, 현재 요소를 읽고 내용을 [Object](../../../system/object/)로 반환합니다.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 요소의 로컬 이름입니다. |
| namespaceURI | String | 요소의 네임스페이스 URI. |

### ReturnValue

가장 적절한 유형의 박싱된 객체입니다. [XmlReader::get_ValueType](../get_valuetype/) 값이 적절한 유형을 결정합니다. 내용이 리스트 유형으로 지정된 경우, 이 메서드는 적절한 유형의 박싱된 객체 배열을 반환합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
