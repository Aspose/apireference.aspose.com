---
title: "System::Globalization::DateTimeStyles enum"
linktitle: "DateTimeStyles"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::DateTimeStyles enum. 날짜 및 시간 형식 옵션을 정의합니다. C++에서 비트 플래그."
type: docs
weight: 3500
url: /ko/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


날짜 및 시간 서식 옵션을 정의합니다. 비트 플래그.

```cpp
enum class DateTimeStyles : int32_t
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| None | 0 | 기본값. |
| AllowLeadingWhite | 1 | 선행 공백을 무시합니다. |
| AllowTrailingWhite | 2 | 후행 공백을 무시합니다. |
| AllowInnerWhite | 4 | 내부 공백을 무시합니다. |
| AllowWhiteSpaces | n/a | 모든 공백을 무시합니다. |
| NoCurrentDateDefault | 8 | 날짜/시간 문자열을 구문 분석할 때, 연도/월/일이 모두 누락된 경우 현재 연도/월/일 대신 기본 날짜를 0001/1/1로 설정합니다. |
| AdjustToUniversal | 16 | 날짜/시간 문자열을 구문 분석할 때, 시간대 지정자("GMT","Z","+xxxx","-xxxx")가 존재하면, 파싱된 시간을 GMT 기준으로 조정합니다. |
| AssumeLocal | 32 | 시간대가 지정되지 않은 경우, 로컬 시간대를 사용합니다. |
| AssumeUniversal | 64 | 시간대가 지정되지 않은 경우, UTC를 사용합니다. |
| RoundtripKind | 128 | 입력이 지정되지 않았는지, 로컬인지, UTC인지 여부를 보존하려고 시도합니다. |

## 또 보기

* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
