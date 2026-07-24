---
title: "System::Text::RegularExpressions::Regex 클래스"
linktitle: "Regex"
second_title: "C++용 Aspose.Page"
description: "System::Text::RegularExpressions::Regex 클래스. C#와 유사한 구문을 따르는 정규식입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 800
url: /ko/cpp/system.text.regularexpressions/regex/
---
## Regex class


C#와 유사한 구문을 따르는 정규식입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수에 인수로 전달하십시오.

```cpp
class Regex : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Escape](./escape/)(const String\&) | 패턴의 일부로 문자열을 사용하기 위해 특수 문자를 이스케이프합니다. |
| [get_MatchTimeout](./get_matchtimeout/)() | 매칭 제한 시간을 가져옵니다. |
| [get_Options](./get_options/)() | 정규식 옵션을 가져옵니다. |
| [get_RightToLeft](./get_righttoleft/)() | 매칭이 오른쪽에서 왼쪽으로 수행되는지 확인합니다. |
| [IsMatch](./ismatch/)(const String\&, int) | 정규식을 문자열에 매치합니다. |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | 문자열이 패턴과 일치하는지 확인합니다. |
| [Match](./match/)(const String\&) | 정규식을 문자열에 매치합니다. |
| [Match](./match/)(const String\&, int, int) | 정규식을 문자열에 매치합니다. |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | 문자열과 패턴을 매치합니다. |
| [Matches](./matches/)(const String\&, int) | 주어진 문자열에서 정규식을 반복 매칭하여 모든 매치를 가져옵니다. |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | 문자열과 패턴 사이의 모든 매치를 가져옵니다. |
| [Regex](./regex/)() | 빈 정규식을 생성합니다. |
| [Regex](./regex/)(const String\&) | 생성자. |
| [Regex](./regex/)(const String\&, RegexOptions) | 생성자. |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | 생성자. |
| [Replace](./replace/)(const String\&, const String\&) | 문자열에서 정규식의 모든 매치를 교체 문자열로 바꿉니다. |
| [Replace](./replace/)(const String\&, const char_t *) | 문자열에서 정규식의 모든 매치를 교체 문자열로 바꿉니다. |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | 문자열에서 정규식의 모든 매치를 교체 문자열로 바꿉니다. |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | 문자열에서 정규식의 모든 매치를 교체 문자열로 바꿉니다. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | 문자열의 모든 일치를 대리자에서 생성된 교체 문자열로 바꿉니다. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | 문자열의 모든 일치를 대리자에서 생성된 교체 문자열로 바꿉니다. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | 문자열의 모든 일치를 대리자에서 생성된 교체 문자열로 바꿉니다. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | 문자열의 모든 일치를 대리자에서 생성된 교체 문자열로 바꿉니다 (정적 함수). |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | 문자열에서 정규식의 모든 매치를 교체 문자열로 바꿉니다. |
| [Replace](./replace/)(const String\&, const String\&, int) | 문자열의 하위 문자열을 교체합니다. 구현되지 않음. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | 문자열의 하위 문자열을 교체합니다. 구현되지 않음. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | 정규식 일치를 교체합니다. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | 정규식 일치를 교체합니다. |
| [Split](./split/)(const String\&) | 정규식 일치를 기준으로 문자열을 분할합니다. |
| [Split](./split/)(const String\&, int) | 정규식 일치를 기준으로 문자열을 분할합니다. |
| [Split](./split/)(const String\&, int, int) | 입력 문자열을 지정된 최대 횟수만큼 하위 문자열 배열로 분할합니다. 분할 위치는 [Regex](./) 생성자에 지정된 정규식에 의해 정의됩니다. 정규식 패턴 검색은 입력 문자열의 지정된 문자 위치에서 시작합니다. |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | 정규식으로 문자열을 분할합니다. |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | 정규식으로 문자열을 분할합니다. |
| [ToString](./tostring/)() const override | 정규식을 문자열로 변환합니다. |
| static [Unescape](./unescape/)(const String\&) | 패턴의 일부로 사용되는 문자열에서 특수 문자의 이스케이프를 해제합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | 시간 초과에 의한 매치 중단을 비활성화하기 위한 특수 시간 초과 값입니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
