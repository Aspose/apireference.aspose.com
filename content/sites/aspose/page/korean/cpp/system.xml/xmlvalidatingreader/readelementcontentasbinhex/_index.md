---
title: "System::Xml::XmlValidatingReader::ReadElementContentAsBinHex 메서드"
linktitle: "ReadElementContentAsBinHex"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlValidatingReader::ReadElementContentAsBinHex 메서드. C++에서 요소를 읽고 BinHex 콘텐츠를 디코딩합니다."
type: docs
weight: 4400
url: /ko/cpp/system.xml/xmlvalidatingreader/readelementcontentasbinhex/
---
## XmlValidatingReader::ReadElementContentAsBinHex method


요소를 읽고 BinHex 콘텐츠를 디코딩합니다.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadElementContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | ArrayPtr\<uint8_t\> | 결과 텍스트를 복사할 버퍼입니다. 이 값은 **nullptr**일 수 없습니다. |
| index | int32_t | 결과 복사를 시작할 버퍼 내 오프셋입니다. |
| count | int32_t | 버퍼에 복사할 최대 바이트 수입니다. 실제 복사된 바이트 수는 이 메서드에서 반환됩니다. |

### ReturnValue

버퍼에 기록된 바이트 수입니다.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
