---
title: "System::Xml::ReadState enum"
linktitle: "ReadState"
second_title: "C++용 Aspose.Page"
description: "System::Xml::ReadState 열거형. C++에서 리더의 상태를 지정합니다."
type: docs
weight: 5300
url: /ko/cpp/system.xml/readstate/
---
## ReadState enum


리더의 상태를 지정합니다.

```cpp
enum class ReadState
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| Initial | 0 | The [XmlReader::Read](../xmlreader/read/) 메서드가 호출되지 않았습니다. |
| Interactive | 1 | The [XmlReader::Read](../xmlreader/read/) 메서드가 호출되었습니다. 추가 메서드를 리더에서 호출할 수 있습니다. |
| 오류 | 2 | 읽기 작업을 계속할 수 없게 하는 오류가 발생했습니다. |
| EndOfFile | 3 | 파일 끝에 성공적으로 도달했습니다. |
| Closed | 4 | The [XmlReader::Close](../xmlreader/close/) 메서드가 호출되었습니다. |

## 또 보기

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
