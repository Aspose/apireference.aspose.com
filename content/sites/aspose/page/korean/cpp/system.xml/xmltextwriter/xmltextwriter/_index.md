---
title: "System::Xml::XmlTextWriter::XmlTextWriter 생성자"
linktitle: "XmlTextWriter"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlTextWriter::XmlTextWriter 생성자. 지정된 스트림과 인코딩을 사용하여 C++에서 XmlTextWriter 클래스를 인스턴스화합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml/xmltextwriter/xmltextwriter/
---
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


지정된 스트림과 인코딩을 사용하여 [XmlTextWriter](../) 클래스의 인스턴스를 생성합니다.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::Stream> &w, const SharedPtr<Text::Encoding> &encoding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| w | const SharedPtr\<IO::Stream\>\& | 작성하려는 스트림입니다. |
| encoding | const SharedPtr\<Text::Encoding\>\& | 생성할 인코딩입니다. 인코딩이 **nullptr**인 경우 스트림을 UTF-8로 쓰고 **ProcessingInstruction**에서 인코딩 속성을 생략합니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::TextWriter\>\&) constructor


지정된 TextWriter를 사용하여 [XmlTextWriter](../) 클래스의 인스턴스를 생성합니다.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::TextWriter> &w)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| w | const SharedPtr\<IO::TextWriter\>\& | 작성할 TextWriter입니다. TextWriter가 이미 올바른 인코딩으로 설정되어 있다고 가정합니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const String\&, const SharedPtr\<Text::Encoding\>\&) constructor


지정된 파일을 사용하여 [XmlTextWriter](../) 클래스의 인스턴스를 생성합니다.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const String &filename, const SharedPtr<Text::Encoding> &encoding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| filename | const String\& | 작성할 파일 이름입니다. 파일이 존재하면 해당 파일을 잘라내고 새 내용으로 덮어씁니다. |
| encoding | const SharedPtr\<Text::Encoding\>\& | 생성할 인코딩입니다. 인코딩이 **nullptr**인 경우 파일을 UTF-8로 쓰고 **ProcessingInstruction**에서 인코딩 속성을 생략합니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
