---
title: "System::Text::RegularExpressions::RegexOptions 열거형"
linktitle: "RegexOptions"
second_title: "C++용 Aspose.Page"
description: "System::Text::RegularExpressions::RegexOptions 열거형. C++의 정규식 옵션입니다."
type: docs
weight: 900
url: /ko/cpp/system.text.regularexpressions/regexoptions/
---
## RegexOptions enum


[Regex](../regex/) options.

```cpp
enum class RegexOptions
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| None | 0 | 기본 동작. |
| Compiled | 1 | 성능을 위해 정규식을 컴파일합니다. 기본적으로 항상 수행됩니다. |
| CultureInvariant | 2 | 문화에 구애받지 않는 매칭을 사용합니다. 무시됩니다. |
| ECMAScript | 4 | ECMAScript 구문을 사용합니다. 무시됨. |
| ExplicitCapture | 8 | 명시적 캡처만 허용합니다. 무시됨. |
| IgnoreCase | 16 | 매칭 시 대소문자를 무시합니다. |
| IgnorePatternWhitespace | 32 | 패턴에서 공백을 무시합니다. 지원되지 않음. |
| Multiline | 64 | '^'와 '$'를 문자열 전체가 아니라 줄의 시작과 끝으로 간주합니다. |
| RightToLeft | 128 | 오른쪽에서 왼쪽으로 매칭합니다. 지원되지 않음. |
| Singleline | 256 | '.'가 예외 없이 모든 문자를 매치하도록 합니다 (보통 새줄 문자는 매치되지 않음). |

## 또 보기

* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
