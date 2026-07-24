---
title: "System::Xml::DtdProcessing 열거형"
linktitle: "DtdProcessing"
second_title: "C++용 Aspose.Page"
description: "System::Xml::DtdProcessing 열거형. DTD 처리 옵션을 지정합니다. DtdProcessing 열거형은 C++의 XmlReaderSettings 클래스에서 사용됩니다."
type: docs
weight: 4700
url: /ko/cpp/system.xml/dtdprocessing/
---
## DtdProcessing enum


DTD 처리 옵션을 지정합니다. [DtdProcessing](./) 열거형은 [XmlReaderSettings](../xmlreadersettings/) 클래스에서 사용됩니다.

```cpp
enum class DtdProcessing
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| Prohibit | 0 | DTD가 발견되면 [XmlException](../xmlexception/)이 발생하고, DTD가 금지되었다는 메시지를 표시하도록 지정합니다. 이것이 기본 동작입니다. |
| Ignore | 1 | DOCTYPE 요소가 무시되도록 합니다. DTD 처리가 수행되지 않으며, DTD/DOCTYPE은 출력 시 사라집니다. |
| Parse | 2 | DTD를 구문 분석하는 데 사용됩니다. |

## 또 보기

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
