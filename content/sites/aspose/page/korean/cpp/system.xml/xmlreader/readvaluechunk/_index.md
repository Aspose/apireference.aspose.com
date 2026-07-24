---
title: "System::Xml::XmlReader::ReadValueChunk 메서드"
linktitle: "ReadValueChunk"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::ReadValueChunk 메서드. C++에서 XML 문서에 포함된 큰 텍스트 스트림을 읽습니다."
type: docs
weight: 7400
url: /ko/cpp/system.xml/xmlreader/readvaluechunk/
---
## XmlReader::ReadValueChunk method


XML 문서에 포함된 큰 텍스트 스트림을 읽습니다.

```cpp
virtual int32_t System::Xml::XmlReader::ReadValueChunk(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | ArrayPtr\<char16_t\> | 텍스트 내용이 기록되는 버퍼 역할을 하는 문자 배열입니다. 이 값은 **nullptr**일 수 없습니다. |
| index | int32_t | [XmlReader](../)가 결과를 복사하기 시작할 수 있는 버퍼 내 오프셋입니다. |
| count | int32_t | 버퍼에 복사할 최대 문자 수입니다. 실제 복사된 문자 수는 이 메서드의 반환값으로 제공됩니다. |

### ReturnValue

버퍼에 읽힌 문자 수입니다. 더 이상 텍스트 내용이 없을 경우 값 0이 반환됩니다.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
