---
title: "System::Xml::XmlTextReader::ReadBase64 메서드"
linktitle: "ReadBase64"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlTextReader::ReadBase64 메서드. Base64를 디코딩하고 디코딩된 바이너리 바이트를 C++에서 반환합니다."
type: docs
weight: 4400
url: /ko/cpp/system.xml/xmltextreader/readbase64/
---
## XmlTextReader::ReadBase64 method


Base64을 디코딩하고 디코딩된 바이너리 바이트를 반환합니다.

```cpp
int32_t System::Xml::XmlTextReader::ReadBase64(const ArrayPtr<uint8_t> &array, int32_t offset, int32_t len)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| array | const ArrayPtr\<uint8_t\>\& | 텍스트 내용이 기록되는 버퍼 역할을 하는 문자 배열. |
| offset | int32_t | 메서드가 버퍼에 쓰기를 시작할 수 있는 위치를 지정하는 배열의 0부터 시작하는 인덱스입니다. |
| len | int32_t | 버퍼에 쓸 바이트 수입니다. |

### ReturnValue

버퍼에 기록된 바이트 수입니다.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
