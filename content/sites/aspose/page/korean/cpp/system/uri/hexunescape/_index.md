---
title: "System::Uri::HexUnescape 메서드"
linktitle: "HexUnescape"
second_title: "C++용 Aspose.Page"
description: "System::Uri::HexUnescape 메서드. 지정된 16진수 문자 표현을 문자로 변환합니다 (C++)."
type: docs
weight: 4000
url: /ko/cpp/system/uri/hexunescape/
---
## Uri::HexUnescape method


지정된 문자의 16진수 표현을 문자로 변환합니다.

```cpp
static char16_t System::Uri::HexUnescape(const String &pattern, int32_t &index)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 패턴 | const String\& | 문자에 대한 16진수 표현을 포함하는 문자열 |
| index | int32_t\& | 문자의 16진수 표현이 시작되는 **pattern** 내 위치 |

### ReturnValue

**index** 위치에 있는 16진수 인코딩으로 표현된 문자입니다. **index** 위치의 문자가 16진수 인코딩되지 않은 경우 해당 위치의 문자를 그대로 반환합니다. 반환된 문자 다음의 문자를 가리키도록 **index** 값이 증가합니다.

## 또 보기

* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
