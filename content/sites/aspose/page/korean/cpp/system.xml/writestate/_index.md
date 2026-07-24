---
title: "System::Xml::WriteState 열거형"
linktitle: "WriteState"
second_title: "C++용 Aspose.Page"
description: "System::Xml::WriteState 열거형. C++에서 XmlWriter의 상태를 지정합니다."
type: docs
weight: 5700
url: /ko/cpp/system.xml/writestate/
---
## WriteState enum


[XmlWriter](../xmlwriter/)의 상태를 지정합니다.

```cpp
enum class WriteState
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| 시작 | 0 | XmlWriter::Write 메서드가 아직 호출되지 않았음을 나타냅니다. |
| Prolog | 1 | 프로로그가 작성되고 있음을 나타냅니다. |
| Element | 2 | 요소 시작 태그가 작성되고 있음을 나타냅니다. |
| Attribute | 3 | 속성 값이 작성되고 있음을 나타냅니다. |
| Content | 4 | 요소 내용이 작성되고 있음을 나타냅니다. |
| Closed | 5 | [XmlWriter::Close](../xmlwriter/close/) 메서드가 호출되었음을 나타냅니다. |
| Error | 6 | 예외가 발생하여 [XmlWriter](../xmlwriter/)가 잘못된 상태가 되었습니다. [XmlWriter::Close](../xmlwriter/close/) 메서드를 호출하여 [XmlWriter](../xmlwriter/)를 [WriteState::Closed](./) 상태로 전환할 수 있습니다. 다른 [XmlWriter](../xmlwriter/) 메서드 호출은 InvalidOperationException을 발생시킵니다. |

## 또 보기

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
