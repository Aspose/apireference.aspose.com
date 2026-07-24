---
title: "System::Xml::XmlWriter::WriteStartElement method"
linktitle: "WriteStartElement"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlWriter::WriteStartElement 메서드. 파생 클래스에서 재정의될 경우, 지정된 로컬 이름으로 시작 태그를 출력합니다(C++)."
type: docs
weight: 3200
url: /ko/cpp/system.xml/xmlwriter/writestartelement/
---
## XmlWriter::WriteStartElement(const String\&) method


파생 클래스에서 재정의될 때, 지정된 로컬 이름을 가진 시작 태그를 출력합니다.

```cpp
void System::Xml::XmlWriter::WriteStartElement(const String &localName)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | const String\& | 요소의 로컬 이름입니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteStartElement(const String\&, const String\&) method


파생 클래스에서 재정의될 때, 지정된 시작 태그를 작성하고 해당 네임스페이스와 연결합니다.

```cpp
void System::Xml::XmlWriter::WriteStartElement(const String &localName, const String &ns)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | const String\& | 요소의 로컬 이름입니다. |
| ns | const String\& | 요소와 연결할 네임스페이스 URI입니다. 이 네임스페이스가 이미 범위에 존재하고 연결된 접두사가 있는 경우, 작성기가 해당 접두사도 자동으로 출력합니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteStartElement(const String\&, const String\&, const String\&) method


파생 클래스에서 재정의될 때, 지정된 시작 태그를 작성하고 주어진 네임스페이스와 접두사와 연결합니다.

```cpp
virtual void System::Xml::XmlWriter::WriteStartElement(const String &prefix, const String &localName, const String &ns)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 접두사 | const String\& | 요소의 네임스페이스 접두사입니다. |
| localName | const String\& | 요소의 로컬 이름입니다. |
| ns | const String\& | 요소와 연결할 네임스페이스 URI입니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
