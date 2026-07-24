---
title: "System::Xml::Schema::XmlSchemaContentProcessing 열거형"
linktitle: "XmlSchemaContentProcessing"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaContentProcessing 열거형. C++에서 any 및 anyAttribute 요소 교체의 검증 모드에 대한 정보를 제공합니다."
type: docs
weight: 7300
url: /ko/cpp/system.xml.schema/xmlschemacontentprocessing/
---
## XmlSchemaContentProcessing enum


**any** 및 **anyAttribute** 요소 대체에 대한 검증 모드 정보를 제공합니다.

```cpp
enum class XmlSchemaContentProcessing
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| None | 0 | 문서 항목은 검증되지 않습니다. |
| 건너뛰기 | 1 | 문서 항목은 올바르게 형성된 XML로 구성되어야 하며 스키마에 의해 검증되지 않습니다. |
| 느슨함 | 2 | 연관된 스키마가 발견되면 문서 항목이 검증됩니다. 그렇지 않으면 오류가 발생하지 않습니다. |
| 엄격함 | 3 | 스키마 프로세서는 문서 항목을 검증하기 위해 지정된 네임스페이스와 연결된 스키마를 찾아야 합니다. |

## 또 보기

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
