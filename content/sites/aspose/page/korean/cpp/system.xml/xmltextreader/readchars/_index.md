---
title: "System::Xml::XmlTextReader::ReadChars 메서드"
linktitle: "ReadChars"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlTextReader::ReadChars 메서드. 요소의 텍스트 내용을 문자 버퍼에 읽어들입니다. 이 메서드는 C++에서 연속적으로 호출하여 삽입된 대용량 텍스트 스트림을 읽도록 설계되었습니다."
type: docs
weight: 4600
url: /ko/cpp/system.xml/xmltextreader/readchars/
---
## XmlTextReader::ReadChars method


요소의 텍스트 내용을 문자 버퍼에 읽어들입니다. 이 메서드는 연속적으로 호출하여 큰 규모의 삽입 텍스트 스트림을 읽도록 설계되었습니다.

```cpp
int32_t System::Xml::XmlTextReader::ReadChars(const ArrayPtr<char16_t> &buffer, int32_t index, int32_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<char16_t\>\& | 텍스트 내용이 기록되는 버퍼 역할을 하는 문자 배열. |
| index | int32_t | 메서드가 텍스트 내용을 쓰기 시작할 수 있는 **buffer** 내의 위치. |
| count | int32_t | **buffer**에 기록할 문자 수. |

### ReturnValue

읽은 문자 수. 리더가 요소에 위치하지 않거나 현재 컨텍스트에서 반환할 텍스트 내용이 더 이상 없을 경우 0이 될 수 있습니다.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
