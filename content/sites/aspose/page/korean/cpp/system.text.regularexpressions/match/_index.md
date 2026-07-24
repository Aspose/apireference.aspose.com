---
title: "System::Text::RegularExpressions::Match 클래스"
linktitle: "Match"
second_title: "C++용 Aspose.Page"
description: "System::Text::RegularExpressions::Match 클래스. 문자열에 대한 정규식의 단일 매치입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 이 유형의 인스턴스를 생성하거나 operator new를 사용하지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 600
url: /ko/cpp/system.text.regularexpressions/match/
---
## Match class


[Single](../../system/single/) match of regexp over string. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Match : public System::Text::RegularExpressions::Group
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | 매치에 캡처를 추가합니다. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | 매치에 그룹을 추가합니다. |
| static [get_Empty](./get_empty/)() | 빈 매치 접근자. |
| [get_Groups](./get_groups/)() | 그룹 목록을 가져옵니다. |
| [Match](./match/)(const UStringPtr\&, int, int) | 생성자. |
| [NextMatch](./nextmatch/)() | 매치에 대한 반복. |
| virtual [Result](./result/)(const String\&) | 하위 매치 참조를 해당 값으로 교체하여 문자열을 포맷합니다. |
| [SetMappedIndexes](./setmappedindexes/)(const std::vector\<int\>\&) |  |
## 또 보기

* Class [Group](../group/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
