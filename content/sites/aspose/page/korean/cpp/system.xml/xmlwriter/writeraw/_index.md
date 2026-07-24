---
title: "System::Xml::XmlWriter::WriteRaw method"
linktitle: "WriteRaw"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlWriter::WriteRaw 메서드. 파생 클래스에서 재정의될 경우, C++에서 문자 버퍼로부터 원시 마크업을 수동으로 씁니다."
type: docs
weight: 2900
url: /ko/cpp/system.xml/xmlwriter/writeraw/
---
## XmlWriter::WriteRaw(ArrayPtr\<char16_t\>, int32_t, int32_t) method


파생 클래스에서 재정의될 때, 문자 버퍼에서 원시 마크업을 수동으로 출력합니다.

```cpp
virtual void System::Xml::XmlWriter::WriteRaw(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | ArrayPtr\<char16_t\> | 작성할 텍스트를 포함하는 문자 배열. |
| index | int32_t | 버퍼 내에서 작성할 텍스트 시작을 나타내는 위치. |
| count | int32_t | 작성할 문자 수. |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteRaw(const String\&) method


파생 클래스에서 재정의될 때, 문자열에서 원시 마크업을 수동으로 출력합니다.

```cpp
virtual void System::Xml::XmlWriter::WriteRaw(const String &data)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| data | const String\& | [String](../../../system/string/) 작성할 텍스트를 포함하는 문자열. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
